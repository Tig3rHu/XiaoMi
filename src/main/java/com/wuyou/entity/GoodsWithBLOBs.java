package com.wuyou.entity;

public class GoodsWithBLOBs extends Goods {
    private String priceLadder;

    private String goodsContent;

    public String getPriceLadder() {
        return priceLadder;
    }

    public void setPriceLadder(String priceLadder) {
        this.priceLadder = priceLadder;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
}