package com.example.retrofit_demo.network;

import com.example.retrofit_demo.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * The endpoints are defined inside of an interface using special retrofit annotations to encode details about the parameters and request method.
 */
public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
