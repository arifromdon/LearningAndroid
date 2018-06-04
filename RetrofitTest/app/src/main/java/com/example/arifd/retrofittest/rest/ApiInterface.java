package com.example.arifd.retrofittest.rest;

import com.example.arifd.retrofittest.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET ("movie/top_rated")
    Call<Movie> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET ("movie/{id}")
    Call<Movie> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
