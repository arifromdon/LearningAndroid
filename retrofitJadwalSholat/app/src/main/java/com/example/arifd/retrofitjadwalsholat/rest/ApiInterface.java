package com.example.arifd.retrofitjadwalsholat.rest;

import com.example.arifd.retrofitjadwalsholat.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("bandung/{periode}/dayli.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);
}
