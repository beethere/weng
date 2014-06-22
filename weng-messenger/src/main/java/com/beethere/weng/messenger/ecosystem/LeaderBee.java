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
import com.beethere.weng.messenger.message.api.IHoneyMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Leader bee for detecting flower honey.
 * @author Jian TANG
 */
public class LeaderBee extends UntypedActor{

    private final Hive hive;

    Router router;


    public LeaderBee(Hive hive) {
        this.hive = hive;
        List<Routee> workerBees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ActorRef r = getContext().actorOf(Props.create(WorkerBee.class, hive));
            getContext().watch(r);
            workerBees.add(new ActorRefRoutee(r));
        }
        router = new Router(new RoundRobinRoutingLogic(), workerBees);
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof IHoneyMessage) {
            router.route(message, getSender());
        }
    }


}
