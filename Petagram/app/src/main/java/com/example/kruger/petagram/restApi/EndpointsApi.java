package com.example.kruger.petagram.restApi;

import com.example.kruger.petagram.model.User;
import com.example.kruger.petagram.restApi.model.MediaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_USERS)
    Call<MediaResponse> getUser(@Query("q") String username, @Query("access_token") String accessToken);

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_BY_USER_ID)
    Call<MediaResponse> getRecentMediaByUserId(@Path("user-id") String userId);

}
