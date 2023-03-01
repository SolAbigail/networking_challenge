package com.example.android.networkconnect.di;


import com.example.android.networkconnect.BuildConfig;
import com.example.android.networkconnect.data.NetworkingRepositoryImpl;
import com.example.android.networkconnect.data.remote.ApiService;
import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemote;
import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemoteImpl;
import com.example.android.networkconnect.domain.NetworkingRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@InstallIn(SingletonComponent.class)
@Module
public class AppModule {

    @Provides
    @Singleton
    public static Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.characters_url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(
                        new OkHttpClient.Builder()
                                .addInterceptor(new HttpLoggingInterceptor()
                                        .setLevel(HttpLoggingInterceptor.Level.BODY)
                                )
                                .build()
                )
                .build();
    }

    @Provides
    @Singleton
    public static ApiService provideCharacterApi(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    public static NetworkingDataSourceRemote provideCharacterDataSourceRemote(ApiService apiService) {
        return new NetworkingDataSourceRemoteImpl(apiService);
    }

    @Provides
    @Singleton
    public static NetworkingRepository provideCharacterRepo(NetworkingDataSourceRemote networkingDataSourceRemote) {
        return new NetworkingRepositoryImpl(networkingDataSourceRemote);
    }

}
