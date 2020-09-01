package com.example.test.controller;

import com.example.test.domain.AjaxResult;
import com.example.test.domain.TableDataInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BaseController {

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                ParsePosition pos = new ParsePosition(0);
                setValue(formatter.parse(text, pos));
            }
        });
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({"rawtypes" , "unchecked"})
    protected TableDataInfo getDataTable(List<?> list) {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo<>(list).getTotal());
        return rspData;
    }

    /**
     * 添加、更新、删除操作返回方法
     * @param rows
     * @return
     */
    protected AjaxResult toResult(int rows){
        return rows>0?AjaxResult.success():AjaxResult.error();
    }

}
