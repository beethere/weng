/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import javax.annotation.concurrent.Immutable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Honey.
 * @author Jian TANG
 */
@Immutable
public class Honey {
    private final Flower flower;

    public Honey(Flower flower) {
        checkNotNull(flower, "flower");
        this.flower = flower;
    }

    public Flower flower(){
        return flower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Honey honey = (Honey) o;

        if (!flower.equals(honey.flower)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return flower.hashCode();
    }
}
