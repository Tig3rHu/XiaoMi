package com.wuyou.entity;

public class SpecImage {
    private Integer id;

    private Integer goodsId;

    private Integer specImageId;

    private String src;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSpecImageId() {
        return specImageId;
    }

    public void setSpecImageId(Integer specImageId) {
        this.specImageId = specImageId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}