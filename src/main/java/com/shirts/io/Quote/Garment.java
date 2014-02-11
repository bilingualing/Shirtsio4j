package com.shirts.io.Quote;


import java.util.List;

public class Garment
{

    private int productId;
    private String color;
    private List<Size> sizes;
    private List<Print> prints;

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

    public List<Print> getPrints() {
        return prints;
    }

    public void setPrints(List<Print> prints) {
        this.prints = prints;
    }
}
