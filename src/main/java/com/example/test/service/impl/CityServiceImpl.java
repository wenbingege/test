package com.example.test.service.impl;

import com.example.test.dao.CityMapper;
import com.example.test.domain.City;
import com.example.test.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> selectPerson(City city) {
        return cityMapper.selectCity(city);
    }
}
