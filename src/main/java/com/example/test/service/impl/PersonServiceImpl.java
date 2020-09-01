package com.example.test.service.impl;

import com.example.test.dao.PersonMapper;
import com.example.test.domain.Person;
import com.example.test.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> selectPerson(Person person) {
        return personMapper.selectPerson(person);
    }

    @Override
    public Integer insertaPerson(Person person) {
        return personMapper.insertPerson(person);
    }
}
