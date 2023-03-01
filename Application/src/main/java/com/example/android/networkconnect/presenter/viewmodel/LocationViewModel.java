package com.example.android.networkconnect.presenter.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.model.LocationModel;
import com.example.android.networkconnect.domain.usecase.GetLocationUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class LocationViewModel extends ViewModel {

    private final GetLocationUseCase getLocationUseCase;

    public MutableLiveData<Result<List<LocationModel>>> mutableLiveData = new MutableLiveData<>();
    MutableLiveData<Integer> page = new MutableLiveData<>();

    @Inject
    public LocationViewModel(GetLocationUseCase getLocationUseCase) {
        this.getLocationUseCase = getLocationUseCase;
    }

    public void getLocations() {
        getLocationUseCase.perform(mutableLiveData, page.getValue());
    }
}
