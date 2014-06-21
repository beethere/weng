/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import javax.annotation.concurrent.Immutable;

/**
 * Honey.
 * @author Jian TANG
 */
@Immutable
public class Honey {
    private final Flower flower;

    public Honey(Flower flower) {
        this.flower = flower;
    }

    public Flower flower(){
        return flower;
    }
}
