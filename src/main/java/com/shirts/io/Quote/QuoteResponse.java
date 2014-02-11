package com.shirts.io.Quote;

import java.util.List;

public class QuoteResponse
{
    private List<GarmentBreakdown> garment_breakdown;
    private double total;
    private double shipping_price;
    private double sales_tax;
    private List<String> warnings;
    private String print_type;

    public QuoteResponse()
    {
        super();
    }

    public List<GarmentBreakdown> getGarmentBreakdowns() {
        return garment_breakdown;
    }

    public void setGarmentBreakdowns(List<GarmentBreakdown> garmentBreakdowns) {
        this.garment_breakdown = garmentBreakdowns;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getShippingPrice() {
        return shipping_price;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shipping_price = shippingPrice;
    }

    public double getShipping_price() {
        return shipping_price;
    }

    public void setShipping_price(double shipping_price) {
        this.shipping_price = shipping_price;
    }

    public double getSalesTax() {
        return sales_tax;
    }

    public void setSalesTax(double salesTax) {
        this.sales_tax = salesTax;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public String getPrint_type() {
        return print_type;
    }

    public void setPrint_type(String print_type) {
        this.print_type = print_type;
    }
}
