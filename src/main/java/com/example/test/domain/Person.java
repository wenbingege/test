package com.example.test.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Person extends BaseEntity{

    /* id */
    private Integer id;
    /* 姓名 */
    private String personName;
    /* 性别 */
    private String personSex;
    /* 年龄 */
    private String personAge;
    /* 入职时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date personDate;
    /* 邮箱 */
    private String personEmail;
    /* 联系方式 */
    private String personPhone;
    /* 个人规划 */
    private String personPlan;
    /* 个人定位 */
    private String personAttr;
    /* 公司所在省 */
    private String province;
    /* 公司所在市 */
    private String city;
    /*  公司所在区 */
    private String regional;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public Date getPersonDate() {
        return personDate;
    }

    public void setPersonDate(Date personDate) {
        this.personDate = personDate;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonPlan() {
        return personPlan;
    }

    public void setPersonPlan(String personPlan) {
        this.personPlan = personPlan;
    }

    public String getPersonAttr() {
        return personAttr;
    }

    public void setPersonAttr(String personAttr) {
        this.personAttr = personAttr;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", personSex='" + personSex + '\'' +
                ", personAge='" + personAge + '\'' +
                ", personDate=" + personDate +
                ", personEmail='" + personEmail + '\'' +
                ", personPhone='" + personPhone + '\'' +
                ", personPlan='" + personPlan + '\'' +
                ", personAttr='" + personAttr + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", regional='" + regional + '\'' +
                '}';
    }
}
