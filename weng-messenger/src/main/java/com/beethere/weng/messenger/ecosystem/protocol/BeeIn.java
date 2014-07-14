/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem.protocol;

import javax.annotation.concurrent.Immutable;

/**
 *
 * @author Jian TANG
 */
@Immutable
public class BeeIn {
    private final String bee;

    public BeeIn(String bee) {
        this.bee = bee;
    }

    public String bee(){
        return bee;
    }
}
