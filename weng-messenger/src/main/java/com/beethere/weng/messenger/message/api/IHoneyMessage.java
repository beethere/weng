/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message.api;

import com.beethere.weng.messenger.ecosystem.Flower;

import java.io.Serializable;

/**
 * @author Jian TANG
 */
public interface IHoneyMessage extends Serializable {

    public String messageId();

    public long timestamp();

    public String creator();

    public Object body();

    Flower hopeFlower();

    Location location();
}
