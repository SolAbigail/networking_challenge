package com.example.android.networkconnect.domain.usecase;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.NetworkingRepository;
import com.example.android.networkconnect.domain.model.EpisodeModel;

import java.util.List;

import javax.inject.Inject;

public class GetEpisodeUseCase implements UseCase<Integer, List<EpisodeModel>>{

    private final NetworkingRepository repository;

    @Inject
    public GetEpisodeUseCase(NetworkingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void perform(MutableLiveData<Result<List<EpisodeModel>>> result, Integer parameter) {
        repository.getEpisode(result, parameter);
    }
}
