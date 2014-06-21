/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message.api;

/**
 * @author Jian TANG
 */
public interface IHoneyMessage {

    public String messageId();

    public long timestamp();

    public String creator();

    public Object body();
}
