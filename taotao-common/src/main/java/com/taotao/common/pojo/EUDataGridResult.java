package com.taotao.common.pojo;

import java.util.List;

/**
 * User: huangken
 * Date: 24/6/17
 * Time: PM5:34
 */
public class EUDataGridResult {

    private long total;

    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public EUDataGridResult setTotal(long total) {
        this.total = total;
        return this;
    }

    public List<?> getRows() {
        return rows;
    }

    public EUDataGridResult setRows(List<?> rows) {
        this.rows = rows;
        return this;
    }
}
