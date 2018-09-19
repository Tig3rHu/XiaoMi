package com.wuyou.entity;

import java.math.BigDecimal;

public class VrOrderCode {
    private Integer recId;

    private Integer orderId;

    private Integer userId;

    private String vrCode;

    private Byte vrState;

    private Integer vrUsetime;

    private BigDecimal payPrice;

    private Integer vrIndate;

    private Boolean refundLock;

    private Byte vrInvalidRefund;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVrCode() {
        return vrCode;
    }

    public void setVrCode(String vrCode) {
        this.vrCode = vrCode;
    }

    public Byte getVrState() {
        return vrState;
    }

    public void setVrState(Byte vrState) {
        this.vrState = vrState;
    }

    public Integer getVrUsetime() {
        return vrUsetime;
    }

    public void setVrUsetime(Integer vrUsetime) {
        this.vrUsetime = vrUsetime;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getVrIndate() {
        return vrIndate;
    }

    public void setVrIndate(Integer vrIndate) {
        this.vrIndate = vrIndate;
    }

    public Boolean getRefundLock() {
        return refundLock;
    }

    public void setRefundLock(Boolean refundLock) {
        this.refundLock = refundLock;
    }

    public Byte getVrInvalidRefund() {
        return vrInvalidRefund;
    }

    public void setVrInvalidRefund(Byte vrInvalidRefund) {
        this.vrInvalidRefund = vrInvalidRefund;
    }
}