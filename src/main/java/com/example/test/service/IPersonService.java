package com.example.test.service;

import com.example.test.domain.Person;

import java.util.List;

public interface IPersonService {

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
    Integer insertaPerson(Person person);
}
