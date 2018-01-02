package com.example.bm_pc.new_cool_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by BM-PC on 2018/1/2.
 */

public class City  extends DataSupport {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private  int id;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProinceId() {
        return proinceId;
    }

    public void setProinceId(int proinceId) {
        this.proinceId = proinceId;
    }

    private  String cityName;
    private  int  proinceId;

}
