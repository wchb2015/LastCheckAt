package com.lastcheckat.mapper;

import com.lastcheckat.Application;
import com.lastcheckat.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ItemMapperTest {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void listItem()
    {
        System.out.println(itemMapper.listItem());
    }

    @Test
    public void saveItem()
    {
        itemMapper.saveItem(Item.builder().name("Weibo").build());
    }

    @Test
    public void deleteItem()
    {
        itemMapper.deleteItem(23);
    }

    @Test
    public void updateItem()
    {
        itemMapper.updateItem(Item.builder().name("def").id(21).build());
    }
}
