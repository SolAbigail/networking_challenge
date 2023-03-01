package com.example.android.networkconnect.data;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemote;
import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.NetworkingRepository;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.domain.model.EpisodeModel;
import com.example.android.networkconnect.domain.model.LocationModel;

import java.util.List;

import javax.inject.Inject;

public class NetworkingRepositoryImpl implements NetworkingRepository {

    private final NetworkingDataSourceRemote networkingDataSourceRemote;

    @Inject
    public NetworkingRepositoryImpl(NetworkingDataSourceRemote networkingDataSourceRemote) {
        this.networkingDataSourceRemote = networkingDataSourceRemote;
    }

    @Override
    public void getCharacter(MutableLiveData<Result<List<CharacterModel>>> resultMutableLiveData, Integer page) {
        networkingDataSourceRemote.getCharacter(resultMutableLiveData, page);
    }

    @Override
    public void getLocation(MutableLiveData<Result<List<LocationModel>>> resultMutableLiveData, Integer page) {
        networkingDataSourceRemote.getLocation(resultMutableLiveData, page);
    }

    @Override
    public void getEpisode(MutableLiveData<Result<List<EpisodeModel>>> resultMutableLiveData, Integer page) {
        networkingDataSourceRemote.getEpisode(resultMutableLiveData, page);
    }
}
