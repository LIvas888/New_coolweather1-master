package com.example.bm_pc.new_cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BM-PC on 2018/1/3.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;
      public  Update update;
    @SerializedName("id")
    public String weatherId;


    public class Update {
        @SerializedName("loc")
        public  String updateTime;

    }
}
