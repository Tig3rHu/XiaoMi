package com.wuyou.entity;

public class UserCollection {
    private Integer id;

    private String mobile;

    private String contact;

    private String whyDown;

    private Integer addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWhyDown() {
        return whyDown;
    }

    public void setWhyDown(String whyDown) {
        this.whyDown = whyDown;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}