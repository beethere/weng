/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import akka.actor.UntypedActor;
import com.beethere.weng.messenger.message.HoneyMail;

/**
 * Messenger bee for delivering honey message.
 * @author Jian TANG
 */
public class MessengerBee extends UntypedActor{


    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof HoneyMail) {
            
        }
    }
}
