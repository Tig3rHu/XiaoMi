package com.wuyou.entity;

public class AdminWithBLOBs extends Admin {
    private String navList;

    private String todolist;

    public String getNavList() {
        return navList;
    }

    public void setNavList(String navList) {
        this.navList = navList;
    }

    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }
}