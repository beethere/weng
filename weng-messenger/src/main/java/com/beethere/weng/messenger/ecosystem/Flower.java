/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import javax.annotation.concurrent.Immutable;

/**
 * @author Jian TANG
 */
@Immutable
public class Flower {

    private final String name;

    private final Garden garden;

    public Flower(String name, Garden garden) {
        this.name = name;
        this.garden = garden;
    }

    public String name() {
        return name;
    }

    public Garden garden() {
        return garden;
    }
}
