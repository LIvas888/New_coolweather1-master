package com.example.bm_pc.gson;

import android.annotation.SuppressLint;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BM-PC on 2018/1/3.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
     public  String  weather;
      public  Update update;


    public class Update {
        @SerializedName("loc")
        public  String updateTime;

    }
}