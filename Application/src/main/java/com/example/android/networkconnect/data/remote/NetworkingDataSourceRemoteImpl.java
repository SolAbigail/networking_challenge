package com.example.android.networkconnect.data.remote;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.EpisodeMapper;
import com.example.android.networkconnect.data.remote.extension.LocationMapper;
import com.example.android.networkconnect.data.remote.model.CharacterDto;
import com.example.android.networkconnect.data.remote.extension.CharacterMapper;
import com.example.android.networkconnect.data.remote.extension.ResponseApi;
import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.data.remote.model.EpisodeDto;
import com.example.android.networkconnect.data.remote.model.LocationDto;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.domain.model.EpisodeModel;
import com.example.android.networkconnect.domain.model.LocationModel;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkingDataSourceRemoteImpl implements NetworkingDataSourceRemote {

    private final ApiService apiService;

    @Inject
    public NetworkingDataSourceRemoteImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void getCharacter(MutableLiveData<Result<List<CharacterModel>>> resultMutableLiveData, Integer page) {
        try {
            apiService.getCharacters(page).enqueue(new Callback<ResponseApi<List<CharacterDto>>>() {
                @Override
                public void onResponse(Call<ResponseApi<List<CharacterDto>>> call, Response<ResponseApi<List<CharacterDto>>> response) {
                    if (response.body()!=null && response.body().getData()!=null){
                        resultMutableLiveData.setValue(
                                new Result<List<CharacterModel>>(Result.ResultStatus.SUCCESS).success(
                                        response.body().getData().stream().map(CharacterMapper::characterDtoToModel)
                                                .collect(Collectors.toList()
                                                ))
                        );
                    } else {
                        resultMutableLiveData.setValue(
                                new Result<List<CharacterModel>>(Result.ResultStatus.ERROR).error("No found Data.")
                        );
                    }
                }

                @Override
                public void onFailure(Call<ResponseApi<List<CharacterDto>>> call, Throwable t) {
                    resultMutableLiveData.setValue(
                        new Result<List<CharacterModel>>(Result.ResultStatus.ERROR).error(t.getMessage())
                    );
                }
            });
        } catch (Exception e) {
            resultMutableLiveData.setValue(
                    new Result<List<CharacterModel>>(Result.ResultStatus.ERROR).error(e.getMessage())
            );
        }
    }

    @Override
    public void getLocation(MutableLiveData<Result<List<LocationModel>>> resultMutableLiveData, Integer page) {
        try {
            apiService.getLocations(page).enqueue(new Callback<ResponseApi<List<LocationDto>>>() {
                @Override
                public void onResponse(Call<ResponseApi<List<LocationDto>>> call, Response<ResponseApi<List<LocationDto>>> response) {
                    resultMutableLiveData.setValue(
                            new Result<List<LocationModel>>(Result.ResultStatus.SUCCESS).success(
                                    response.body().getData().stream().map(LocationMapper::locationDtoToModel)
                                            .collect(Collectors.toList())
                            )
                    );
                }

                @Override
                public void onFailure(Call<ResponseApi<List<LocationDto>>> call, Throwable t) {
                    resultMutableLiveData.setValue(
                            new Result<List<LocationModel>>(Result.ResultStatus.ERROR).error(t.getMessage())
                    );
                }
            });
        } catch (Exception e) {
            resultMutableLiveData.setValue(
                    new Result<List<LocationModel>>(Result.ResultStatus.ERROR).error(e.getMessage())
            );
        }
    }

    @Override
    public void getEpisode(MutableLiveData<Result<List<EpisodeModel>>> resultMutableLiveData, Integer page) {
        try {
            apiService.getEpisodes(page).enqueue(new Callback<ResponseApi<List<EpisodeDto>>>() {
                @Override
                public void onResponse(Call<ResponseApi<List<EpisodeDto>>> call, Response<ResponseApi<List<EpisodeDto>>> response) {
                    resultMutableLiveData.setValue(
                            new Result<List<EpisodeModel>>(Result.ResultStatus.SUCCESS).success(
                                    response.body().getData().stream().map(EpisodeMapper::episodeDtoToModel).collect(Collectors.toList())
                            )
                    );
                }

                @Override
                public void onFailure(Call<ResponseApi<List<EpisodeDto>>> call, Throwable t) {
                    resultMutableLiveData.setValue(
                            new Result<List<EpisodeModel>>(Result.ResultStatus.ERROR).error(t.getMessage())
                    );
                }
            });
        } catch (Exception e) {
            resultMutableLiveData.setValue(
                    new Result<List<EpisodeModel>>(Result.ResultStatus.ERROR).error(e.getMessage())
            );
        }
    }
}
