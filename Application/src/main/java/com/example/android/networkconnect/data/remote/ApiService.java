package com.example.android.networkconnect.data.remote;

import com.example.android.networkconnect.data.remote.model.CharacterDto;
import com.example.android.networkconnect.data.remote.extension.ResponseApi;
import com.example.android.networkconnect.data.remote.model.EpisodeDto;
import com.example.android.networkconnect.data.remote.model.LocationDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("character")
    Call<ResponseApi<List<CharacterDto>>> getCharacters(@Query("page") Integer page);

    @GET("location")
    Call<ResponseApi<List<LocationDto>>> getLocations(@Query("page") Integer page);

    @GET("episode")
    Call<ResponseApi<List<EpisodeDto>>> getEpisodes(@Query("page") Integer page);
}
