package com.shirts.io.Quote;


import java.util.List;

public class Quote {

    private String apiKey;
    private List<Garment> garments;
    private List<Print> prints;
    private String printType;
    private String personalization;
    private int addressCount;
    private String shipType;
    private List<InternationalGarments> internationalGarments;
    private List<GarmentBreakdown> garmentBreakdowns;
    private double total;
    private double shippingPrice;
    private double salesTax;
    private List<String> warnings;

    public Quote()
    {
        super();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public List<Garment> getGarments() {
        return garments;
    }

    public void setGarments(List<Garment> garments) {
        this.garments = garments;
    }

    public List<Print> getPrints() {
        return prints;
    }

    public void setPrints(List<Print> prints) {
        this.prints = prints;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getPersonalization() {
        return personalization;
    }

    public void setPersonalization(String personalization) {
        this.personalization = personalization;
    }

    public int getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(int addressCount) {
        this.addressCount = addressCount;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public List<InternationalGarments> getInternationalGarments() {
        return internationalGarments;
    }

    public void setInternationalGarments(List<InternationalGarments> internationalGarments) {
        this.internationalGarments = internationalGarments;
    }

    public List<GarmentBreakdown> getGarmentBreakdowns() {
        return garmentBreakdowns;
    }

    public void setGarmentBreakdowns(List<GarmentBreakdown> garmentBreakdowns) {
        this.garmentBreakdowns = garmentBreakdowns;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }
}
