package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: huangken
 * Date: 24/6/17
 * Time: PM5:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/*.xml"
})
public class ItemServiceTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ItemService itemService;

    @org.junit.Test
    public void getItemList() throws Exception {
        EUDataGridResult result = itemService.getItemList(1, 10);
        System.out.println(result);
    }

}
