package com.example.android.networkconnect.data.remote.extension;

import com.example.android.networkconnect.data.remote.model.InfoDto;
import com.google.gson.annotations.SerializedName;

public class ResponseApi<T> {

    InfoDto info;
    @SerializedName("results")
    T data;

    public ResponseApi(InfoDto info, T data) {
        this.info = info;
        this.data = data;
    }

    public InfoDto getInfo() {
        return info;
    }

    public T getData() {
        return data;
    }
}
