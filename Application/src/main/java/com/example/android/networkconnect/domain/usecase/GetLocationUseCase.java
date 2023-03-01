package com.example.android.networkconnect.domain.usecase;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.NetworkingRepository;

import com.example.android.networkconnect.domain.model.LocationModel;

import java.util.List;

import javax.inject.Inject;

public class GetLocationUseCase implements UseCase<Integer, List<LocationModel>> {

    private final NetworkingRepository repository;

    @Inject
    public GetLocationUseCase(NetworkingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void perform(MutableLiveData<Result<List<LocationModel>>> result, Integer parameter) {
        repository.getLocation(result, parameter);
    }
}
