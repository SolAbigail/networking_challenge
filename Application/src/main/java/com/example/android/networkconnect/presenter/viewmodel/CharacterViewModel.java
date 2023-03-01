package com.example.android.networkconnect.presenter.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.domain.usecase.GetCharactersUseCase;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class CharacterViewModel extends ViewModel {

    private final GetCharactersUseCase getCharactersUseCase;
    private MutableLiveData<Result<List<CharacterModel>>> _resultMutableLiveData = new MutableLiveData<>();
    public LiveData<Result<List<CharacterModel>>> resultLiveData = _resultMutableLiveData;
    public MutableLiveData<Integer> page = new MutableLiveData<>(1);

    @Inject
    public CharacterViewModel(GetCharactersUseCase getCharactersUseCase) {
        this.getCharactersUseCase = getCharactersUseCase;
    }

    public void getCharacters() {
        getCharactersUseCase.perform(_resultMutableLiveData, page.getValue());
    }

    public void setNumberPage() {
        if (page.getValue()!=null)page.setValue(page.getValue()+1);
    }
}
