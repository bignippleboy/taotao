package com.taotao.common.pojo;

/**
 * 自定义消息结构
 * User: huangken
 * Date: 25/6/17
 * Time: PM5:34
 */
public class TaotaoResult {

    private Integer status;

    private String msg;

    private Object data;

    public TaotaoResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public TaotaoResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public TaotaoResult setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public TaotaoResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public TaotaoResult setData(Object data) {
        this.data = data;
        return this;
    }

    public static TaotaoResult ok() {
        return null;
    }
}
