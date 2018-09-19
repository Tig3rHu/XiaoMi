package com.wuyou.entity;

public class SmsTemplate {
    private Integer tplId;

    private String smsSign;

    private String smsTplCode;

    private String tplContent;

    private String sendScene;

    private Integer addTime;

    public Integer getTplId() {
        return tplId;
    }

    public void setTplId(Integer tplId) {
        this.tplId = tplId;
    }

    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public String getSmsTplCode() {
        return smsTplCode;
    }

    public void setSmsTplCode(String smsTplCode) {
        this.smsTplCode = smsTplCode;
    }

    public String getTplContent() {
        return tplContent;
    }

    public void setTplContent(String tplContent) {
        this.tplContent = tplContent;
    }

    public String getSendScene() {
        return sendScene;
    }

    public void setSendScene(String sendScene) {
        this.sendScene = sendScene;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}