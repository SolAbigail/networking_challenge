package com.example.android.networkconnect.domain.usecase;

import androidx.lifecycle.MutableLiveData;

import com.example.android.networkconnect.data.remote.extension.Result;

public interface UseCase<P, R> {
     void perform(MutableLiveData<Result<R>> result, P parameter);
}
