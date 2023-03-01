package com.example.android.networkconnect.data.remote.extension;

import com.example.android.networkconnect.data.remote.model.EpisodeDto;
import com.example.android.networkconnect.domain.model.EpisodeModel;

public class EpisodeMapper {
    public static EpisodeModel episodeDtoToModel(EpisodeDto episodeDto) {
        return new EpisodeModel(
                episodeDto.getId(),
                episodeDto.getName(),
                episodeDto.getAirDate(),
                episodeDto.getEpisode()
        );
    }
}
