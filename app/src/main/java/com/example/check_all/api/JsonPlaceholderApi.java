package com.example.check_all.api;

import com.example.check_all.models.QRRequest;
import com.example.check_all.models.UserRequest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface JsonPlaceholderApi {
    @POST("api/auth-tokens")
    Call<ResponseBody> login(@Body UserRequest userRequest);

    @POST("api/android/generalCheck")
    Call<ResponseBody> checkQR(@Body QRRequest qrRequest, @Header("X-Auth-Token") String authorization);
}
