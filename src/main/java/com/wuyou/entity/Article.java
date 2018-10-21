package com.wuyou.entity;

import java.util.Date;

public class Article {
    private Integer articleId;

    private Short catId;

    private String title;

    private String author;

    private String authorEmail;

    private String keywords;

    private Integer articleType;

    private Boolean isOpen;

    private Date addTime;

    private String fileUrl;

    private Boolean openType;

    private String link;

    private Integer click;

    private Date publishTime;

    private String thumb;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Boolean getOpenType() {
        return openType;
    }

    public void setOpenType(Boolean openType) {
        this.openType = openType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}