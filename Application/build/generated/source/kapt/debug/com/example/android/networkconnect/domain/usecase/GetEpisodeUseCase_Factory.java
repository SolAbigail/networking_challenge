package com.example.android.networkconnect.domain.usecase;

import com.example.android.networkconnect.domain.NetworkingRepository;
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
public final class GetEpisodeUseCase_Factory implements Factory<GetEpisodeUseCase> {
  private final Provider<NetworkingRepository> repositoryProvider;

  public GetEpisodeUseCase_Factory(Provider<NetworkingRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetEpisodeUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetEpisodeUseCase_Factory create(
      Provider<NetworkingRepository> repositoryProvider) {
    return new GetEpisodeUseCase_Factory(repositoryProvider);
  }

  public static GetEpisodeUseCase newInstance(NetworkingRepository repository) {
    return new GetEpisodeUseCase(repository);
  }
}
