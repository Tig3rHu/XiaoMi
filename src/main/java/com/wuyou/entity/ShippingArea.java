package com.wuyou.entity;

public class ShippingArea {
    private Short shippingAreaId;

    private String shippingAreaName;

    private String shippingCode;

    private Integer updateTime;

    private Boolean isDefault;

    private String config;

    public Short getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Short shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public String getShippingAreaName() {
        return shippingAreaName;
    }

    public void setShippingAreaName(String shippingAreaName) {
        this.shippingAreaName = shippingAreaName;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}