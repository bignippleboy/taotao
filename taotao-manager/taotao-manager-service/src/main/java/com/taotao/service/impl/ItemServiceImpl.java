package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * User: huangken
 * Date: 24/6/17
 * Time: PM5:36
 */
@Service
public class ItemServiceImpl implements ItemService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private TbItemMapper tbItemMapper;


    public EUDataGridResult getItemList(int page, int rows) {

        TbItemExample tbItemExample = new TbItemExample();
        //分页处理
        PageHelper.startPage(page, rows);
        List<TbItem> items = tbItemMapper.selectByExample(tbItemExample);

        EUDataGridResult result = new EUDataGridResult();
        result.setRows(items);

        //取记录总条数
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(items);
        result.setTotal(pageInfo.getTotal());

        return result;
    }

    public TaotaoResult createItem(TbItem item, String desc, String itemParam) {

        Long itemId = IDUtils.genItemId();
        item.setId(itemId);
        //1-正常，2-下架，3-删除
        item.setStatus((byte)1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        tbItemMapper.insert(item);

        //添加商品描述信息
//        TaotaoResult result = insertItemDesc()

        //添加规格参数

        return TaotaoResult.ok();
    }
}
