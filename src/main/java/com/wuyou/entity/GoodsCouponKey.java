package com.wuyou.entity;

public class GoodsCouponKey {
    private Integer couponId;

    private Integer goodsId;

    private Short goodsCategoryId;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Short goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }
}