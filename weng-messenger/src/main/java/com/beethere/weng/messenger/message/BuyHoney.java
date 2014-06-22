/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message;

import com.beethere.weng.messenger.ecosystem.Honey;

import javax.annotation.concurrent.Immutable;

/**
 * Register for honey request.
 * @author Jian TANG
 */
@Immutable
public class BuyHoney {
    private final String client;
    private final Honey honey;

    public BuyHoney(String client, Honey honey) {
        this.client = client;
        this.honey = honey;
    }

    public String client(){
        return client;
    }

    public Honey honey(){
        return honey;
    }
}

