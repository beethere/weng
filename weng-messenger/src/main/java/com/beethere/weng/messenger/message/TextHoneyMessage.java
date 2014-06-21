/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message;

import com.beethere.weng.messenger.message.api.IHoneyMessage;

import javax.annotation.concurrent.Immutable;

/**
 * Simple text honey message.
 *
 * @author Jian TANG
 */
@Immutable
public class TextHoneyMessage implements IHoneyMessage {

    private final String creator;

    private final String messageId;

    private final String message;

    private final long timestamp;

    public TextHoneyMessage(String messageId, String creator, String message, long timestamp) {
        this.messageId = messageId;
        this.message = message;
        this.timestamp = timestamp;
        this.creator = creator;
    }


    @Override
    public String messageId() {
        return messageId;
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

    @Override
    public String creator() {
        return creator;
    }

    @Override
    public Object body() {
        return message;
    }
}
