package com.wuyou.entity;

public class UserSign {
    private Integer id;

    private Integer userId;

    private Integer signtotal;

    private Integer signcount;

    private String lastsign;

    private Integer cumtrapz;

    private Integer thismonth;

    private String signtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSigntotal() {
        return signtotal;
    }

    public void setSigntotal(Integer signtotal) {
        this.signtotal = signtotal;
    }

    public Integer getSigncount() {
        return signcount;
    }

    public void setSigncount(Integer signcount) {
        this.signcount = signcount;
    }

    public String getLastsign() {
        return lastsign;
    }

    public void setLastsign(String lastsign) {
        this.lastsign = lastsign;
    }

    public Integer getCumtrapz() {
        return cumtrapz;
    }

    public void setCumtrapz(Integer cumtrapz) {
        this.cumtrapz = cumtrapz;
    }

    public Integer getThismonth() {
        return thismonth;
    }

    public void setThismonth(Integer thismonth) {
        this.thismonth = thismonth;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }
}