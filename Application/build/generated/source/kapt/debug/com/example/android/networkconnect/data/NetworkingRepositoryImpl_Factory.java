package com.example.android.networkconnect.data;

import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemote;
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
public final class NetworkingRepositoryImpl_Factory implements Factory<NetworkingRepositoryImpl> {
  private final Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider;

  public NetworkingRepositoryImpl_Factory(
      Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider) {
    this.networkingDataSourceRemoteProvider = networkingDataSourceRemoteProvider;
  }

  @Override
  public NetworkingRepositoryImpl get() {
    return newInstance(networkingDataSourceRemoteProvider.get());
  }

  public static NetworkingRepositoryImpl_Factory create(
      Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider) {
    return new NetworkingRepositoryImpl_Factory(networkingDataSourceRemoteProvider);
  }

  public static NetworkingRepositoryImpl newInstance(
      NetworkingDataSourceRemote networkingDataSourceRemote) {
    return new NetworkingRepositoryImpl(networkingDataSourceRemote);
  }
}
