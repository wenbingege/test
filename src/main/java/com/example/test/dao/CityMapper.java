package com.example.test.dao;

import com.example.test.domain.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

    /**
     * 根据条件获取city集合
     * @param city
     * @return
     */
    List<City> selectCity(City city);
}
