package com.example.bm_pc.new_cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BM-PC on 2018/1/3.
 */

public class Now {

    @SerializedName("tmp")
    public  String  temperature;

    @SerializedName("cond")
    public  More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
