package com.shirts.io.Order;

import com.shirts.io.Quote.Garment;

import java.util.List;

public class Order
{
    private boolean test;
    private List<Garment> garments;
    private String printType;
    private List<Personalization> personalizations;
    private List<Address> addresses;
    private String extraScreens;
    private String shipType;


    public Order()
    {
        super();
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
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
}
