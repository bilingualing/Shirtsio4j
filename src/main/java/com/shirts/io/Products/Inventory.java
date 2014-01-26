package com.shirts.io.Products;

public class Inventory
{
    private String name;
    private int count;

    public Inventory()
    {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
