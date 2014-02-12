package com.shirts.io.Quote;

public class GarmentBreakdown {

    private double subtotal;
    private double price_per_shirt;
    private int num_shirts;

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
        return price_per_shirt;
    }

    public void setPricePerShirt(double pricePerShirt) {
        this.price_per_shirt = pricePerShirt;
    }

    public int getNumOfShirts() {
        return num_shirts;
    }

    public void setNumOfShirts(int numOfShirts) {
        this.num_shirts = numOfShirts;
    }
}
