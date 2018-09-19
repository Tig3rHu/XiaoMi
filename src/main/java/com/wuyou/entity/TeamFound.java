package com.wuyou.entity;

import java.math.BigDecimal;

public class TeamFound {
    private Integer foundId;

    private Integer foundTime;

    private Integer foundEndTime;

    private Integer userId;

    private Integer teamId;

    private String nickname;

    private String headPic;

    private Integer orderId;

    private Integer join;

    private Integer need;

    private BigDecimal price;

    private BigDecimal goodsPrice;

    private Boolean status;

    private Boolean bonusStatus;

    public Integer getFoundId() {
        return foundId;
    }

    public void setFoundId(Integer foundId) {
        this.foundId = foundId;
    }

    public Integer getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Integer foundTime) {
        this.foundTime = foundTime;
    }

    public Integer getFoundEndTime() {
        return foundEndTime;
    }

    public void setFoundEndTime(Integer foundEndTime) {
        this.foundEndTime = foundEndTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getJoin() {
        return join;
    }

    public void setJoin(Integer join) {
        this.join = join;
    }

    public Integer getNeed() {
        return need;
    }

    public void setNeed(Integer need) {
        this.need = need;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getBonusStatus() {
        return bonusStatus;
    }

    public void setBonusStatus(Boolean bonusStatus) {
        this.bonusStatus = bonusStatus;
    }
}