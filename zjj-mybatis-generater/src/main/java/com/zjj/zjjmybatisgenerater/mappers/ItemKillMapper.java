package com.zjj.zjjmybatisgenerater.mappers;

import org.apache.ibatis.annotations.Param;
import pojo.ItemKill;
import pojo.ItemKillExample;

import java.util.List;

public interface ItemKillMapper {
    int countByExample(ItemKillExample example);

    int deleteByExample(ItemKillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemKill record);

    int insertSelective(ItemKill record);

    List<ItemKill> selectByExample(ItemKillExample example);

    ItemKill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemKill record, @Param("example") ItemKillExample example);

    int updateByExample(@Param("record") ItemKill record, @Param("example") ItemKillExample example);

    int updateByPrimaryKeySelective(ItemKill record);

    int updateByPrimaryKey(ItemKill record);
}