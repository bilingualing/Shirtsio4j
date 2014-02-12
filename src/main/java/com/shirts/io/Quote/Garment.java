package com.shirts.io.Quote;


import java.util.HashMap;
import java.util.List;

public class Garment
{

    private int productId;
    private String color;
    private List<Size> sizes;
    private HashMap<String,Print> prints;

    public Garment()
    {
        super();
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public HashMap<String,Print> getPrints() {
        return prints;
    }

    public void setPrints(HashMap<String,Print> prints) {
        this.prints = prints;
    }
}
