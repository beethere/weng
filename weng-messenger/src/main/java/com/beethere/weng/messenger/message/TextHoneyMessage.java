/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message;

import com.beethere.weng.messenger.ecosystem.Flower;
import com.beethere.weng.messenger.message.api.IHoneyMessage;
import com.beethere.weng.messenger.message.api.Location;

import javax.annotation.concurrent.Immutable;
import java.util.Date;

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

    private final Location location;

    private final Flower hopeFlower;

    public TextHoneyMessage(String messageId, String creator, String message, Flower hopeFlower, Location location) {
        this.messageId = messageId;
        this.message = message;
        this.timestamp = new Date().getTime();
        this.creator = creator;
        this.hopeFlower = hopeFlower;
        this.location = location;
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

    @Override
    public Flower hopeFlower() {
        return hopeFlower;
    }

    @Override
    public Location location() {
        return location;
    }
}
