package com.wuyou.entity;

public class OauthUsers {
    private Integer tuId;

    private Integer userId;

    private String openid;

    private String oauth;

    private String unionid;

    private String oauthChild;

    public Integer getTuId() {
        return tuId;
    }

    public void setTuId(Integer tuId) {
        this.tuId = tuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getOauthChild() {
        return oauthChild;
    }

    public void setOauthChild(String oauthChild) {
        this.oauthChild = oauthChild;
    }
}