package com.example.arifd.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserApi {
    @GET ("v2/59b753140f00008e0e7126b4")
    Call<Users> getUsers();

    @GET("/api/v1/auth{id}")
    Call<User> getUser(@Path("id") String user_id);

    @PUT("/api/v1/auth/{id}")
    Call<User> updateUser(@Path("id") int user_id, @Body User user);

    @POST("/api/v1/auth")
    Call<User> saveUser(@Body User user);

    @DELETE("/api/v1/auth/{id}")
    Call<User> deleteUser(@Path("id") String user_id);
}
