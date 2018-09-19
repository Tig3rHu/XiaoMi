package com.wuyou.entity;

public class Comment {
    private Integer commentId;

    private Integer goodsId;

    private String email;

    private String username;

    private Integer addTime;

    private String ipAddress;

    private Boolean isShow;

    private Integer parentId;

    private Integer userId;

    private Integer orderId;

    private Boolean deliverRank;

    private Boolean goodsRank;

    private Boolean serviceRank;

    private Integer zanNum;

    private String zanUserid;

    private Boolean isAnonymous;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Boolean getDeliverRank() {
        return deliverRank;
    }

    public void setDeliverRank(Boolean deliverRank) {
        this.deliverRank = deliverRank;
    }

    public Boolean getGoodsRank() {
        return goodsRank;
    }

    public void setGoodsRank(Boolean goodsRank) {
        this.goodsRank = goodsRank;
    }

    public Boolean getServiceRank() {
        return serviceRank;
    }

    public void setServiceRank(Boolean serviceRank) {
        this.serviceRank = serviceRank;
    }

    public Integer getZanNum() {
        return zanNum;
    }

    public void setZanNum(Integer zanNum) {
        this.zanNum = zanNum;
    }

    public String getZanUserid() {
        return zanUserid;
    }

    public void setZanUserid(String zanUserid) {
        this.zanUserid = zanUserid;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }
}