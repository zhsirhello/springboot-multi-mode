package com.zjj.zjjdao.dao;


import com.zjj.zjjentity.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MybatisPeopleDao extends JpaRepository<People,Integer> {
    @Override
    Optional<People> findById(Integer integer);
}
