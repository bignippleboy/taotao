package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User: huangken
 * Date: 25/6/17
 * Time: AM10:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class ItemCatServiceTest {

    @Autowired
    private ItemCatService itemCatService;

    @Test
    public void getItemCatList() throws Exception {
        Long parentId = 1L;
        List<EUTreeNode> list = itemCatService.getItemCatList(parentId);
        System.out.println(list);
    }

}
