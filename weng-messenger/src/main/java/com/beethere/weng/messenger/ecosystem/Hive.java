/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.routing.ActorRefRoutee;
import akka.routing.RoundRobinRoutingLogic;
import akka.routing.Routee;
import akka.routing.Router;
import com.beethere.weng.messenger.ecosystem.protocol.BeeIn;
import com.beethere.weng.messenger.ecosystem.protocol.BeeOut;
import com.beethere.weng.messenger.message.HoneyMail;
import com.beethere.weng.messenger.message.api.IHoneyMessage;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.lang.Runtime.getRuntime;

/**
 * Hive!!
 * @author Jian TANG
 */
public class Hive extends UntypedActor{

    private final String id;

    private final List<String> bees;

    private final Router messengerRouter;

    public Hive(String id) {
        this.id = id;
        this.bees = newArrayList();
        List<Routee> messengerBees = newArrayList();
        for (int i = 0; i < getRuntime().availableProcessors(); i++) {
            ActorRef r = getContext().actorOf(Props.create(MessengerBee.class));
            getContext().watch(r);
            messengerBees.add(new ActorRefRoutee(r));
        }
        this.messengerRouter = new Router(new RoundRobinRoutingLogic(), messengerBees);
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof BeeIn) {
            BeeIn beeIn = (BeeIn)message;
            bees.add(beeIn.bee());
        } else if(message instanceof BeeOut) {
            BeeOut beeOut = (BeeOut)message;
            bees.remove(beeOut.bee());
        } else if(message instanceof IHoneyMessage) {
            IHoneyMessage honeyMessage = (IHoneyMessage) message;
            for(String receiver : bees) {
                HoneyMail mail = new HoneyMail(honeyMessage.creator(), receiver, honeyMessage);
                messengerRouter.route(mail, sender());
            }
        }
    }
}
