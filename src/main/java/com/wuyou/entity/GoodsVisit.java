package com.wuyou.entity;

public class GoodsVisit extends GoodsVisitKey {
    private Integer visittime;

    private Integer catId;

    private Integer extendCatId;

    public Integer getVisittime() {
        return visittime;
    }

    public void setVisittime(Integer visittime) {
        this.visittime = visittime;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getExtendCatId() {
        return extendCatId;
    }

    public void setExtendCatId(Integer extendCatId) {
        this.extendCatId = extendCatId;
    }
}