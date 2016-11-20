package com.hyperchain.coolweather.util;


import android.util.Log;

import com.hyperchain.coolweather.model.Weather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Newcon on 2016/11/4.
 */
public class GsonRetrofit {
    public String baseUrl="http://www.weather.com.cn/";
    public String weatherId;

    public GsonRetrofit(String weatherId) {
        this.weatherId = weatherId;
    }
    public void getWeatherInfo(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        Call<Weather> call = weatherService.getWeather(weatherId);
        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Log.i("tag","Retrofit的结果是"+response.toString());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Log.i("tag","Retrofit失败");
            }
        });
        call.cancel();
    }
}
