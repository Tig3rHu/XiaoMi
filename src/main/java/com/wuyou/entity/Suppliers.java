package com.wuyou.entity;

public class Suppliers {
    private Short suppliersId;

    private String suppliersName;

    private Boolean isCheck;

    private String suppliersContacts;

    private String suppliersPhone;

    private Integer provinceId;

    private Integer cityId;

    private String suppliersDesc;

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public String getSuppliersContacts() {
        return suppliersContacts;
    }

    public void setSuppliersContacts(String suppliersContacts) {
        this.suppliersContacts = suppliersContacts;
    }

    public String getSuppliersPhone() {
        return suppliersPhone;
    }

    public void setSuppliersPhone(String suppliersPhone) {
        this.suppliersPhone = suppliersPhone;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getSuppliersDesc() {
        return suppliersDesc;
    }

    public void setSuppliersDesc(String suppliersDesc) {
        this.suppliersDesc = suppliersDesc;
    }
}