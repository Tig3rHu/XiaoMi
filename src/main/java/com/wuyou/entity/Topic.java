package com.wuyou.entity;

public class Topic {
    private Integer topicId;

    private String topicTitle;

    private String topicImage;

    private String topicBackgroundColor;

    private String topicBackground;

    private String topicRepeat;

    private Boolean topicState;

    private Byte topicMarginTop;

    private Integer ctime;

    private String topicContent;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicImage() {
        return topicImage;
    }

    public void setTopicImage(String topicImage) {
        this.topicImage = topicImage;
    }

    public String getTopicBackgroundColor() {
        return topicBackgroundColor;
    }

    public void setTopicBackgroundColor(String topicBackgroundColor) {
        this.topicBackgroundColor = topicBackgroundColor;
    }

    public String getTopicBackground() {
        return topicBackground;
    }

    public void setTopicBackground(String topicBackground) {
        this.topicBackground = topicBackground;
    }

    public String getTopicRepeat() {
        return topicRepeat;
    }

    public void setTopicRepeat(String topicRepeat) {
        this.topicRepeat = topicRepeat;
    }

    public Boolean getTopicState() {
        return topicState;
    }

    public void setTopicState(Boolean topicState) {
        this.topicState = topicState;
    }

    public Byte getTopicMarginTop() {
        return topicMarginTop;
    }

    public void setTopicMarginTop(Byte topicMarginTop) {
        this.topicMarginTop = topicMarginTop;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }
}