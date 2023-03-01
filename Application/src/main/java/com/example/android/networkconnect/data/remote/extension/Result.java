package com.example.android.networkconnect.data.remote.extension;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Result<T> {

    @NonNull
    public ResultStatus status;

    @Nullable
    private T data;

    @Nullable
    private String message;

    public Result(@NonNull ResultStatus status) {
        this.status = status;
        this.data = null;
    }

    public Result<T> success(@NonNull T data) {
        this.status = ResultStatus.SUCCESS;
        this.data = data;
        return this;
    }

    public Result<T> error(@Nullable String message) {
        this.status = ResultStatus.ERROR;
        this.data = null;
        this.message = message;
        return this;
    }

    public enum ResultStatus {
        SUCCESS,
        ERROR
    }

    @Nullable
    public T getData() {
        return data;
    }
}
