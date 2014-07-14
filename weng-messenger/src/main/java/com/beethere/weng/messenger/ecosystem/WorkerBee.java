/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import com.beethere.weng.messenger.message.api.IHoneyMessage;

/**
 * Worker Bees for collecting honey.
 * @author Jian TANG
 */
public class WorkerBee extends UntypedActor {

    private final ActorRef honeyStockService;

    public WorkerBee(ActorRef honeyStockService) {
        this.honeyStockService = honeyStockService;
    }


    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof IHoneyMessage){

        }
    }


    private void collectHoney(IHoneyMessage message) {

    }

    private void stockHoney(IHoneyMessage message) {
        honeyStockService.tell(message, self());
    }

}
