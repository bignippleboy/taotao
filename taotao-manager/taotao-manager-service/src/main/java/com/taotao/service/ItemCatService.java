package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * User: huangken
 * Date: 25/6/17
 * Time: AM10:15
 */
public interface ItemCatService {

    public List<EUTreeNode> getItemCatList(Long parentId);

}
