package com.example.android.networkconnect.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class NetworkingDataSourceRemoteImpl_Factory implements Factory<NetworkingDataSourceRemoteImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public NetworkingDataSourceRemoteImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public NetworkingDataSourceRemoteImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static NetworkingDataSourceRemoteImpl_Factory create(
      Provider<ApiService> apiServiceProvider) {
    return new NetworkingDataSourceRemoteImpl_Factory(apiServiceProvider);
  }

  public static NetworkingDataSourceRemoteImpl newInstance(ApiService apiService) {
    return new NetworkingDataSourceRemoteImpl(apiService);
  }
}
