package com.example.test.domain;

public class City extends BaseEntity {

    private int id;
    /* 城市名称 */
    private String cityName;
    /* 城市编号 */
    private String cityNum;
    /* 城市父级编号；一级城市此属性为0 */
    private String cityParentNum;
    /* 城市等级 */
    private String cityLeave;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNum() {
        return cityNum;
    }

    public void setCityNum(String cityNum) {
        this.cityNum = cityNum;
    }

    public String getCityParentNum() {
        return cityParentNum;
    }

    public void setCityParentNum(String cityParentNum) {
        this.cityParentNum = cityParentNum;
    }

    public String getCityLeave() {
        return cityLeave;
    }

    public void setCityLeave(String cityLeave) {
        this.cityLeave = cityLeave;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityNum='" + cityNum + '\'' +
                ", cityParentNum='" + cityParentNum + '\'' +
                ", cityLeave='" + cityLeave + '\'' +
                '}';
    }
}
