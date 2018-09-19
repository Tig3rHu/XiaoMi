package com.wuyou.entity;

public class AdminRole {
    private Short roleId;

    private String roleName;

    private String roleDesc;

    private String actList;

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getActList() {
        return actList;
    }

    public void setActList(String actList) {
        this.actList = actList;
    }
}