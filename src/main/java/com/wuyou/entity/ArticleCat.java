package com.wuyou.entity;

public class ArticleCat {
    private Integer catId;

    private String catName;

    private Short catType;

    private Short parentId;

    private Boolean showInNav;

    private Short sortOrder;

    private String catDesc;

    private String keywords;

    private String catAlias;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Short getCatType() {
        return catType;
    }

    public void setCatType(Short catType) {
        this.catType = catType;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public Boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Boolean showInNav) {
        this.showInNav = showInNav;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatAlias() {
        return catAlias;
    }

    public void setCatAlias(String catAlias) {
        this.catAlias = catAlias;
    }
}