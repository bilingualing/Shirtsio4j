package com.shirts.io.Order;

public class OrderResponse
{
    private int order_id;
    private double price;
    private String warnings;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public int getOrderId() {
        return order_id;
    }

    public void setOrderId(int orderId) {
        this.order_id = orderId;
    }
}
