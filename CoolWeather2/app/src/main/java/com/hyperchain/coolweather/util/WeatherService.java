package com.hyperchain.coolweather.util;

import com.hyperchain.coolweather.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by Newcon on 2016/11/4.
 */
public interface WeatherService {
    @GET("data/cityinfo/{weatherId}.html")
    Call<Weather> getWeather(@Path("weatherId") String weatherId);
}
