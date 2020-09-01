package com.example.test.domain;

import java.util.HashMap;

/**
 * 与前端交互的实体类
 */
public class AjaxResult extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private static final String CODE_TAG = "code";

    private static final String MSG_TAG = "msg";

    private static final String DATA_TAG = "data";


    /**
     * 状态码
     */
    private int code;

    /**
     * 返回内容
     */
    private String msg;

    /**
     * 数据对象
     */
    private transient Object data;

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     * @param code
     * @param msg
     * @param data
     */
    public AjaxResult(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if(data != null){
            super.put(DATA_TAG, data);
        }
    }

    public static AjaxResult success(){
        return AjaxResult.success(null);
    }

    public static AjaxResult success(Object data){
        return new AjaxResult(200,"操作成功",data);
    }

    public static AjaxResult error(){
        return new AjaxResult(301,"操作失败",null);
    }
}
