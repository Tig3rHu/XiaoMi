package com.wuyou.entity;

public class Payment {
    private Byte payId;

    private String payCode;

    private String payName;

    private String payFee;

    private Byte payOrder;

    private Boolean enabled;

    private Boolean isCod;

    private Boolean isOnline;

    public Byte getPayId() {
        return payId;
    }

    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayFee() {
        return payFee;
    }

    public void setPayFee(String payFee) {
        this.payFee = payFee;
    }

    public Byte getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(Byte payOrder) {
        this.payOrder = payOrder;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getIsCod() {
        return isCod;
    }

    public void setIsCod(Boolean isCod) {
        this.isCod = isCod;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }
}