package com.example.test.service;

import com.example.test.domain.City;

import java.util.List;

/**
 * 省市区级联服务类
 * @author tangwenbin
 * @date 2020-8-31
 */
public interface ICityService {

    /**
     * 根据条件获取city集合
     * @param city
     * @return
     */
    List<City> selectPerson(City city);
}
