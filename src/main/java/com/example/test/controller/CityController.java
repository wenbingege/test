package com.example.test.controller;

import com.example.test.domain.AjaxResult;
import com.example.test.domain.City;
import com.example.test.service.ICityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 省市区级联接口控制类
 * @author tangwenbin
 * @date 2020-8-31
 */
@RestController
@RequestMapping("/api/city")
public class CityController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private ICityService cityService;

    /**
     * 根据条件获取city集合
     * @param city
     * @return
     */
    @CrossOrigin(value = "http://localhost:8081")
    @GetMapping("/findList")
    public AjaxResult findList(City city){
        log.info("@--city/findList:city={}",city);
        List<City> list = new ArrayList<>();
        try{
            list = cityService.selectPerson(city);
            log.info("@--city/findList:list={}",list);
        }catch (Exception e){
            log.error("@--person/findList:Exception",e);
            AjaxResult.error();
        }
        return AjaxResult.success(list);
    }
}
