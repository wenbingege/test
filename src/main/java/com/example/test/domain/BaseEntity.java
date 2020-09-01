package com.example.test.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 作为javabeen的父类，与javabeen无关的属性请在此类中定义
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /* 分页参数 当前页 */
    @JsonIgnore
    private Integer pageNum;
    /* 分页参数 获取的数量 */
    @JsonIgnore
    private Integer pageSize;

    public int getPageNum() {
        return pageNum == null?1:pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize== null?10:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
