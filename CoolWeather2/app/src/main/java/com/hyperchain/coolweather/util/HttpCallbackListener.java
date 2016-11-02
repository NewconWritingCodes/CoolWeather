package com.hyperchain.coolweather.util;

/**
 * Created by Newcon on 2016/11/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
