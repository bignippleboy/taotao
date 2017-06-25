package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * User: huangken
 * Date: 24/6/17
 * Time: PM5:32
 */
public interface ItemService {

    EUDataGridResult getItemList(int page, int rows);

    /**
     * 新增商品
     */
    public TaotaoResult createItem(TbItem item, String desc, String itemParam);

}
