package com.wuyou.entity;

public class Message {
    private Integer messageId;

    private Short adminId;

    private Boolean type;

    private Boolean category;

    private Integer sendTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Short getAdminId() {
        return adminId;
    }

    public void setAdminId(Short adminId) {
        this.adminId = adminId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }
}