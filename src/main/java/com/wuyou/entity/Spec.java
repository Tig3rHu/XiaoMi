package com.wuyou.entity;

public class Spec {
    private Integer id;

    private Integer typeId;

    private String name;

    private Integer order;

    private Boolean searchIndex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(Boolean searchIndex) {
        this.searchIndex = searchIndex;
    }
}