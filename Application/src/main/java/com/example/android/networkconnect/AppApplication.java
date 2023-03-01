package com.example.android.networkconnect;

import android.app.Application;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
