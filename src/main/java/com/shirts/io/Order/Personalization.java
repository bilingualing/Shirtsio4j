package com.shirts.io.Order;


public class Personalization
{
    private String size;
    private int batch;
    private int number;
    private int numberSize;
    private String name;
    private int nameSize;

    public Personalization()
    {
        super();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(int numberSize) {
        this.numberSize = numberSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNameSize() {
        return nameSize;
    }

    public void setNameSize(int nameSize) {
        this.nameSize = nameSize;
    }
}
