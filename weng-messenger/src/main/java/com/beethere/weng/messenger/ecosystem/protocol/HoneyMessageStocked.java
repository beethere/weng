/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem.protocol;

import javax.annotation.concurrent.Immutable;

/**
 * Honey message stocked ACK.
 * @author Jian TANG
 */
@Immutable
public class HoneyMessageStocked {

    private final String messageId;


    public HoneyMessageStocked(String messageId) {
        this.messageId = messageId;
    }

    public String messageId(){
        return messageId;
    }

}
