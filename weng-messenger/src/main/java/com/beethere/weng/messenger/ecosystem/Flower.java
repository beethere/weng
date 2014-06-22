/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.ecosystem;

import javax.annotation.concurrent.Immutable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Jian TANG
 */
@Immutable
public class Flower {

    private final String name;

    private final Garden garden;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (garden != flower.garden) return false;
        if (!name.equals(flower.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + garden.hashCode();
        return result;
    }

    public Flower(String name, Garden garden) {
        checkNotNull(name, "name");
        checkNotNull(garden, "garden");
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
