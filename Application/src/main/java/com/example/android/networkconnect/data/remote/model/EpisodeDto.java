package com.example.android.networkconnect.data.remote.model;

import com.google.gson.annotations.SerializedName;

public class EpisodeDto {

    private final Integer id;
    private final String name;
    @SerializedName("air_date")
    private final String airDate;
    private final String episode;

    public EpisodeDto(Integer id, String name, String airDate, String episode) {
        this.id = id;
        this.name = name;
        this.airDate = airDate;
        this.episode = episode;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getEpisode() {
        return episode;
    }
}
