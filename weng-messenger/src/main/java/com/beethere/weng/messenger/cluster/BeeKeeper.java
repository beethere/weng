/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.cluster;

import akka.actor.UntypedActor;
import com.beethere.weng.messenger.ecosystem.Hive;
import com.beethere.weng.messenger.ecosystem.Honey;
import com.beethere.weng.messenger.message.BuyHoney;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

/**
 * Bee keeper
 * @author Jian TANG
 */
public class BeeKeeper extends UntypedActor{

    Map<Honey, Hive> hives;

    BeeKeeper(){
        hives = newHashMap();
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof BuyHoney) {
            BuyHoney request = (BuyHoney) message;
            if(hives.containsKey(request.honey())) {

            }
        }

    }
}
