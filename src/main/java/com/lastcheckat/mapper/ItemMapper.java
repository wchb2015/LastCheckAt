package com.lastcheckat.mapper;

import com.lastcheckat.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

    List<Item> listItem();

    void saveItem(Item item);

    void deleteItem(Integer id);

    void updateItem(Item item);
}
