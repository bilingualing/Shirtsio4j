package com.shirts.io.Status;


import java.util.List;

public class Status
{
    private int orderId;
    private String apiKey;
    private String status;
    private List<Tracking> trackingNumbers;
    private String cancelReason;

    public Status()
    {
        super();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Tracking> getTrackingNumbers() {
        return trackingNumbers;
    }

    public void setTrackingNumbers(List<Tracking> trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

}
