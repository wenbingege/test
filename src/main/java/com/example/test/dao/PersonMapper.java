package com.example.test.dao;

import com.example.test.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface PersonMapper {
    /**
     * 根据条件获取person集合
     * @param person
     * @return
     */
    List<Person> selectPerson(Person person);

    /**
     * 添加人员信息
     * @param person
     * @return
     */
    Integer insertPerson(Person person);
}
