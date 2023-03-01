package com.example.android.networkconnect.data.remote.model;

import com.google.gson.annotations.SerializedName;

public class InfoDto {

    Integer count;
    Integer pages;
    @SerializedName("next")
    String nextPage;
}
