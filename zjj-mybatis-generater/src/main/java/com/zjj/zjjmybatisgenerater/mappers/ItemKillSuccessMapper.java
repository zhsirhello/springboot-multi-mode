package com.zjj.zjjmybatisgenerater.mappers;

import org.apache.ibatis.annotations.Param;
import pojo.ItemKillSuccess;
import pojo.ItemKillSuccessExample;

import java.util.List;

public interface ItemKillSuccessMapper {
    int countByExample(ItemKillSuccessExample example);

    int deleteByExample(ItemKillSuccessExample example);

    int deleteByPrimaryKey(String code);

    int insert(ItemKillSuccess record);

    int insertSelective(ItemKillSuccess record);

    List<ItemKillSuccess> selectByExample(ItemKillSuccessExample example);

    ItemKillSuccess selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") ItemKillSuccess record, @Param("example") ItemKillSuccessExample example);

    int updateByExample(@Param("record") ItemKillSuccess record, @Param("example") ItemKillSuccessExample example);

    int updateByPrimaryKeySelective(ItemKillSuccess record);

    int updateByPrimaryKey(ItemKillSuccess record);
}