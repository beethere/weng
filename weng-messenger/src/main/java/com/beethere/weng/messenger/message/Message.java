/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message;

import javax.annotation.concurrent.Immutable;

/**
 * Bee love message.
 *
 * @author Jian TANG
 */
@Immutable
public class Message {
    private final String beeID;

    private final String message;

    private final long timestamp;
    public Message(String beeID, String message, long timestamp) {
        this.beeID = beeID;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String beeID(){
        return this.beeID;
    }

    public String message() {
        return message;
    }

    public long timestamp(){
        return timestamp;
    }

}
