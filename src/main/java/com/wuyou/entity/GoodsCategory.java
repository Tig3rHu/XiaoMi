package com.wuyou.entity;

public class GoodsCategory {
    private Short id;

    private String name;

    private String mobileName;

    private Short parentId;

    private String parentIdPath;

    private Boolean level;

    private Boolean sortOrder;

    private Boolean isShow;

    private String image;

    private Boolean isHot;

    private Boolean catGroup;

    private Boolean commissionRate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getParentIdPath() {
        return parentIdPath;
    }

    public void setParentIdPath(String parentIdPath) {
        this.parentIdPath = parentIdPath;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getCatGroup() {
        return catGroup;
    }

    public void setCatGroup(Boolean catGroup) {
        this.catGroup = catGroup;
    }

    public Boolean getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Boolean commissionRate) {
        this.commissionRate = commissionRate;
    }
}