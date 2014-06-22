/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import akka.actor.UntypedActor;
import com.beethere.weng.messenger.message.api.IHoneyMessage;

/**
 * Worker Bees for collecting honey.
 * @author Jian TANG
 */
public class WorkerBee extends UntypedActor {


    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof IHoneyMessage){

        }
    }



}
