package com.example.a03recyclerview;

/**
 * @author: Donggy
 * @create: 2019-11-01 18:32
 **/
public class Fruit {
    private String name;
    private int imaeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImaeId() {
        return imaeId;
    }

    public void setImaeId(int imaeId) {
        this.imaeId = imaeId;
    }

    public Fruit(String name, int imaeId) {
        this.name = name;
        this.imaeId = imaeId;
    }
}
