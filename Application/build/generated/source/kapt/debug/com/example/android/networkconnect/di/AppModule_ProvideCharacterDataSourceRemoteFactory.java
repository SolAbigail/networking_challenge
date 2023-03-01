package com.example.android.networkconnect.di;

import com.example.android.networkconnect.data.remote.ApiService;
import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemote;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCharacterDataSourceRemoteFactory implements Factory<NetworkingDataSourceRemote> {
  private final Provider<ApiService> apiServiceProvider;

  public AppModule_ProvideCharacterDataSourceRemoteFactory(
      Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public NetworkingDataSourceRemote get() {
    return provideCharacterDataSourceRemote(apiServiceProvider.get());
  }

  public static AppModule_ProvideCharacterDataSourceRemoteFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new AppModule_ProvideCharacterDataSourceRemoteFactory(apiServiceProvider);
  }

  public static NetworkingDataSourceRemote provideCharacterDataSourceRemote(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.provideCharacterDataSourceRemote(apiService));
  }
}
