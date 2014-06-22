/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message;

import com.beethere.weng.messenger.message.api.IHoneyMessage;

import javax.annotation.concurrent.Immutable;
import java.io.Serializable;

/**
 * Honey Mail
 * @author Jian TANG
 */
@Immutable
public class HoneyMail implements Serializable {

    /**
     * Mail sender Bee ID;
     */
    private final String sender;

    /**
     * Mail receiver Bee ID;
     */
    private final String receiver;
    /**
     * Honey Message
     */
    private final IHoneyMessage message;

    public HoneyMail(String sender, String receiver, IHoneyMessage message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public String sender() {
        return sender;
    }

    public String receiver() {
        return receiver;
    }

    public IHoneyMessage message() {
        return message;
    }
}
