package com.example.android.networkconnect.di;

import com.example.android.networkconnect.data.remote.NetworkingDataSourceRemote;
import com.example.android.networkconnect.domain.NetworkingRepository;
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
public final class AppModule_ProvideCharacterRepoFactory implements Factory<NetworkingRepository> {
  private final Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider;

  public AppModule_ProvideCharacterRepoFactory(
      Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider) {
    this.networkingDataSourceRemoteProvider = networkingDataSourceRemoteProvider;
  }

  @Override
  public NetworkingRepository get() {
    return provideCharacterRepo(networkingDataSourceRemoteProvider.get());
  }

  public static AppModule_ProvideCharacterRepoFactory create(
      Provider<NetworkingDataSourceRemote> networkingDataSourceRemoteProvider) {
    return new AppModule_ProvideCharacterRepoFactory(networkingDataSourceRemoteProvider);
  }

  public static NetworkingRepository provideCharacterRepo(
      NetworkingDataSourceRemote networkingDataSourceRemote) {
    return Preconditions.checkNotNullFromProvides(AppModule.provideCharacterRepo(networkingDataSourceRemote));
  }
}
