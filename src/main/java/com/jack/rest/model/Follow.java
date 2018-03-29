package com.jack.rest.model;

import java.io.Serializable;
import java.util.Date;

public class Follow implements Serializable
{
    
    private Long id;

    private Long uid;

    private Long targetId;

    private Integer type;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date updateTime;


    public Follow() {}

    public Follow(Long uid, Long targetId)
    {
        this.uid = uid;
        this.targetId = targetId;
    }

    public Follow(Long id, Long uid, Long targetId, Integer type, String remark, Integer status, Date createTime, Date updateTime)
    {
        this.id = id;
        this.uid = uid;
        this.targetId = targetId;
        this.type = type;
        this.remark = remark;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}