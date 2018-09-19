package com.wuyou.entity;

public class TeamFollow {
    private Integer followId;

    private Integer followUserId;

    private String followUserNickname;

    private String followUserHeadPic;

    private Integer followTime;

    private Integer orderId;

    private Integer foundId;

    private Integer foundUserId;

    private Integer teamId;

    private Boolean status;

    private Boolean isWin;

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Integer followUserId) {
        this.followUserId = followUserId;
    }

    public String getFollowUserNickname() {
        return followUserNickname;
    }

    public void setFollowUserNickname(String followUserNickname) {
        this.followUserNickname = followUserNickname;
    }

    public String getFollowUserHeadPic() {
        return followUserHeadPic;
    }

    public void setFollowUserHeadPic(String followUserHeadPic) {
        this.followUserHeadPic = followUserHeadPic;
    }

    public Integer getFollowTime() {
        return followTime;
    }

    public void setFollowTime(Integer followTime) {
        this.followTime = followTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoundId() {
        return foundId;
    }

    public void setFoundId(Integer foundId) {
        this.foundId = foundId;
    }

    public Integer getFoundUserId() {
        return foundUserId;
    }

    public void setFoundUserId(Integer foundUserId) {
        this.foundUserId = foundUserId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsWin() {
        return isWin;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }
}