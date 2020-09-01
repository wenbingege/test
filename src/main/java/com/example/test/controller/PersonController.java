package com.example.test.controller;

import com.example.test.domain.AjaxResult;
import com.example.test.domain.Person;
import com.example.test.domain.TableDataInfo;
import com.example.test.service.IPersonService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 人员信息管理控制类
 * 具有批量分页查询、添加、修改、删除功能
 * @author tangwenbin
 * @date 2020-8-28
 */
@RestController
@RequestMapping("/api/person")
public class PersonController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private IPersonService personService;

    /**
     * 分页查询
     * @param person
     * @return
     */
    @CrossOrigin(value = "http://localhost:8081")
    @PostMapping("/findList")
    public TableDataInfo findPersonList(Person person){
        log.info("@--person/findList:参数person={}",person);
        List<Person> personList = new ArrayList<>();
        try{
            PageHelper.startPage(person.getPageNum(),person.getPageSize());
            personList = personService.selectPerson(person);
            log.info("@--person/findList:personList={}",personList);
        }catch (Exception e){
            log.error("@--person/findList:Exception={}",e);
        }
        return getDataTable(personList);
    }

    /**
     * 添加人员信息
     * @return
     */
    @CrossOrigin(value = "http://localhost:8081")
    @PostMapping("/save")
    public AjaxResult savePerson( Person person){
        log.info("@--person/save:参数person={}",person);
        int result = 0;
        if(person.getPersonName() == null){
            return toResult(result);
        }
        try{
            result = personService.insertaPerson(person);
            log.info("@--person/save:result={}",result);
        }catch (Exception e){
            log.error("@--person/save:Exception",e);
        }
        return toResult(result);
    }
}
