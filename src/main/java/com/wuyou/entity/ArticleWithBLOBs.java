package com.wuyou.entity;

public class ArticleWithBLOBs extends Article {
    private String content;

    private String description;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}