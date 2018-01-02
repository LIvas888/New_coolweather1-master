package com.example.bm_pc.new_cool_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by BM-PC on 2018/1/2.
 */

public class Province extends DataSupport {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private   int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private  String provinceName;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private  int  provinceCode;





    }


