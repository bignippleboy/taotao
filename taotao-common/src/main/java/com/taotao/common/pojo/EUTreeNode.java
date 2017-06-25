package com.taotao.common.pojo;

/**
 * User: huangken
 * Date: 25/6/17
 * Time: AM10:22
 */
public class EUTreeNode {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public EUTreeNode setId(long id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public EUTreeNode setText(String text) {
        this.text = text;
        return this;
    }

    public String getState() {
        return state;
    }

    public EUTreeNode setState(String state) {
        this.state = state;
        return this;
    }
}
