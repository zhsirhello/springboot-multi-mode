package com.zjj.zjjdao.dao;

import com.zjj.zjjentity.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoPeople {
    @Autowired
    private MybatisPeopleDao mybatisPeopleDao;

    public People getById(int i){
        return mybatisPeopleDao.findById(i).get();
    }
}
