package com.example.android.networkconnect.presenter.viewmodel;


import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.model.EpisodeModel;
import com.example.android.networkconnect.domain.usecase.GetEpisodeUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class EpisodeViewModel extends ViewModel {

    private final GetEpisodeUseCase episodeUseCase;
    public MutableLiveData<Result<List<EpisodeModel>>> resultMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> page = new MutableLiveData<>(0);

    @Inject
    public EpisodeViewModel(GetEpisodeUseCase episodeUseCase) {
        this.episodeUseCase = episodeUseCase;
    }

    public void getEpisodes() {
        episodeUseCase.perform(resultMutableLiveData, page.getValue());
    }

}
