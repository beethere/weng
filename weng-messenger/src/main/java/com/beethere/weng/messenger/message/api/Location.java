/**
 * Copyright 2014 BeeThere, Inc.
 */
package com.beethere.weng.messenger.message.api;

import javax.annotation.concurrent.Immutable;
import java.io.Serializable;

/**
 * Location.
 * @author Jian TANG
 */
@Immutable
public class Location implements Serializable{

    private final double latitude;

    private final double longitude;


    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    double latitude(){
        return latitude;
    }

    double longitude(){
        return longitude;
    }
}
