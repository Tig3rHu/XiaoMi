package com.wuyou.entity;

public class GoodsAttribute {
    private Integer attrId;

    private String attrName;

    private Short typeId;

    private Boolean attrIndex;

    private Boolean attrType;

    private Boolean attrInputType;

    private Byte order;

    private String attrValues;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Short getTypeId() {
        return typeId;
    }

    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    public Boolean getAttrIndex() {
        return attrIndex;
    }

    public void setAttrIndex(Boolean attrIndex) {
        this.attrIndex = attrIndex;
    }

    public Boolean getAttrType() {
        return attrType;
    }

    public void setAttrType(Boolean attrType) {
        this.attrType = attrType;
    }

    public Boolean getAttrInputType() {
        return attrInputType;
    }

    public void setAttrInputType(Boolean attrInputType) {
        this.attrInputType = attrInputType;
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }

    public String getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues;
    }
}