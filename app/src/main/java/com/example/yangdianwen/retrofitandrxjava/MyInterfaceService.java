package com.example.yangdianwen.retrofitandrxjava;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yangdianwen on 16-6-24.
 */
public interface MyInterfaceService {
    @GET("api/data/Android/10/1")
    Call<ResponseBody> getString();

}
