package com.wuyou.entity;

public class GoodsCategory {
    private Short id;

    private String name;

    private String mobileName;

    private Short parentId;

    private String parentIdPath;

    private Integer level;

    private Integer sortOrder;

    private Integer isShow;

    private String image;

    private Integer isHot;

    private Integer catGroup;

    private Integer commissionRate;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getCatGroup() {
        return catGroup;
    }

    public void setCatGroup(Integer catGroup) {
        this.catGroup = catGroup;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }
}