package com.shirts.io.Quote;

public class GarmentBreakdown {

    private double subtotal;
    private double pricePerShirt;
    private int numOfShirts;

    public GarmentBreakdown()
    {
        super();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPricePerShirt() {
        return pricePerShirt;
    }

    public void setPricePerShirt(double pricePerShirt) {
        this.pricePerShirt = pricePerShirt;
    }

    public int getNumOfShirts() {
        return numOfShirts;
    }

    public void setNumOfShirts(int numOfShirts) {
        this.numOfShirts = numOfShirts;
    }
}
