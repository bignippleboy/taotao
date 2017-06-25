package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User: huangken
 * Date: 24/6/17
 * Time: PM4:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TbItemMapperTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private TbItemMapper tbItemMapper;

    @org.junit.Test
    public void selectByExample() throws Exception {
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);
        System.out.println(tbItems);
    }

}
