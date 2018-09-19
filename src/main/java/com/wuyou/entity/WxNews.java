package com.wuyou.entity;

public class WxNews {
    private Integer id;

    private String keyword;

    private String createtime;

    private String uptatetime;

    private String token;

    private String imgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUptatetime() {
        return uptatetime;
    }

    public void setUptatetime(String uptatetime) {
        this.uptatetime = uptatetime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}