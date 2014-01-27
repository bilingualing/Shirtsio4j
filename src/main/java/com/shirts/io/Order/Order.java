package com.shirts.io.Order;

import com.shirts.io.Quote.Garment;

import java.util.List;

public class Order
{
    private String apiKey;
    private boolean test;
    private double price;
    private List<Garment> garments;
    private String printType;
    private List<Personalization> personalizations;
    private List<Address> addresses;
    private String extraScreens;
    private String shipType;
    private int orderId;
    private String warnings;

    public Order()
    {
        super();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Garment> getGarments() {
        return garments;
    }

    public void setGarments(List<Garment> garments) {
        this.garments = garments;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public List<Personalization> getPersonalizations() {
        return personalizations;
    }

    public void setPersonalizations(List<Personalization> personalizations) {
        this.personalizations = personalizations;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getExtraScreens() {
        return extraScreens;
    }

    public void setExtraScreens(String extraScreens) {
        this.extraScreens = extraScreens;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
