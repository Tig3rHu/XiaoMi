package com.wuyou.entity;

public class SearchWord {
    private Integer id;

    private String keywords;

    private String pinyinFull;

    private String pinyinSimple;

    private Integer searchNum;

    private Integer goodsNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPinyinFull() {
        return pinyinFull;
    }

    public void setPinyinFull(String pinyinFull) {
        this.pinyinFull = pinyinFull;
    }

    public String getPinyinSimple() {
        return pinyinSimple;
    }

    public void setPinyinSimple(String pinyinSimple) {
        this.pinyinSimple = pinyinSimple;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}