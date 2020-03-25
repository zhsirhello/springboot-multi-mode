package com.zjj.zjjmybatisgenerater.mappers;

import org.apache.ibatis.annotations.Param;
import pojo.RandomCode;
import pojo.RandomCodeExample;

import java.util.List;

public interface RandomCodeMapper {
    int countByExample(RandomCodeExample example);

    int deleteByExample(RandomCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RandomCode record);

    int insertSelective(RandomCode record);

    List<RandomCode> selectByExample(RandomCodeExample example);

    RandomCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RandomCode record, @Param("example") RandomCodeExample example);

    int updateByExample(@Param("record") RandomCode record, @Param("example") RandomCodeExample example);

    int updateByPrimaryKeySelective(RandomCode record);

    int updateByPrimaryKey(RandomCode record);
}