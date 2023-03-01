package com.example.android.networkconnect.domain;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.domain.model.EpisodeModel;
import com.example.android.networkconnect.domain.model.LocationModel;

import java.util.List;

public interface NetworkingRepository {
    void getCharacter(MutableLiveData<Result<List<CharacterModel>>> resultMutableLiveData, Integer page);
    void getLocation(MutableLiveData<Result<List<LocationModel>>> resultMutableLiveData, Integer page);
    void getEpisode(MutableLiveData<Result<List<EpisodeModel>>> resultMutableLiveData, Integer page);
}
