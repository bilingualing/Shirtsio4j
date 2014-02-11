package com.shirts.io.Quote;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jamaaltaylor
 * Date: 2/7/14
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuoteRequest {

    private List<Garment> garments;
    private List<Print> prints;
    private String print_type;
    private String personalization;
    private int address_count;
    private String ship_type;
    private String extra_screens;
    private List<String> international_garments;

    public QuoteRequest()
    {
        super();
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
        return print_type;
    }

    public void setPrintType(String printType) {
        this.print_type = printType;
    }

    public String getPersonalization() {
        return personalization;
    }

    public void setPersonalization(String personalization) {
        this.personalization = personalization;
    }

    public int getAddressCount() {
        return address_count;
    }

    public void setAddressCount(int addressCount) {
        this.address_count = addressCount;
    }

    public String getShipType() {
        return ship_type;
    }

    public void setShipType(String shipType) {
        this.ship_type = shipType;
    }

    public String getExtra_screens() {
        return extra_screens;
    }

    public void setExtra_screens(String extra_screens) {
        this.extra_screens = extra_screens;
    }

    public List<String> getInternational_garments() {
        return international_garments;
    }

    public void setInternational_garments(List<String> international_garments) {
        this.international_garments = international_garments;
    }
}
