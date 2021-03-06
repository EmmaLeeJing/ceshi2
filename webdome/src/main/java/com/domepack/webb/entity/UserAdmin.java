package com.domepack.webb.entity;

import java.util.Date;

public class UserAdmin {
    private Long id;

    private String loginName;

    private String password;

    private Date lastLoginDate;

    private Date cteadTime;

    private Date updateTime;

    private String rank;

    private Integer useFlag;

    private Integer pwdLockCount;

    private String userArea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getCteadTime() {
        return cteadTime;
    }

    public void setCteadTime(Date cteadTime) {
        this.cteadTime = cteadTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Integer getPwdLockCount() {
        return pwdLockCount;
    }

    public void setPwdLockCount(Integer pwdLockCount) {
        this.pwdLockCount = pwdLockCount;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }
}