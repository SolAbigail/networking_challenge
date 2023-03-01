package com.example.android.networkconnect.domain.usecase;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.NetworkingRepository;
import com.example.android.networkconnect.domain.model.CharacterModel;

import java.util.List;

import javax.inject.Inject;

public class GetCharactersUseCase implements UseCase<Integer, List<CharacterModel>>{

    private final NetworkingRepository repository;

    @Inject
    public GetCharactersUseCase(NetworkingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void perform(MutableLiveData<Result<List<CharacterModel>>> result, Integer page) {
        repository.getCharacter(result, page);
    }
}
