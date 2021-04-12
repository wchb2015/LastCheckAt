package com.lastcheckat.mapper;

import com.lastcheckat.model.LastCheckAt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LastCheckAtMapper {
    List<LastCheckAt> listLCA();

    void updateLastCheckAt(Long id);
}
