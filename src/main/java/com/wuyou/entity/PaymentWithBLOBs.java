package com.wuyou.entity;

public class PaymentWithBLOBs extends Payment {
    private String payDesc;

    private String payConfig;

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    public String getPayConfig() {
        return payConfig;
    }

    public void setPayConfig(String payConfig) {
        this.payConfig = payConfig;
    }
}