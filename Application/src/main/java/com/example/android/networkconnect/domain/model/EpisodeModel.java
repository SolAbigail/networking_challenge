package com.example.android.networkconnect.domain.model;

public class EpisodeModel {
    private final Integer id;
    private final String name;
    private final String airDate;
    private final String episode;

    public EpisodeModel(Integer id, String name, String airDate, String episode) {
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
