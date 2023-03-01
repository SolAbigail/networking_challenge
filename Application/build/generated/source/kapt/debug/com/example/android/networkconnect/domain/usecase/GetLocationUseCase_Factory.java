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
public final class GetLocationUseCase_Factory implements Factory<GetLocationUseCase> {
  private final Provider<NetworkingRepository> repositoryProvider;

  public GetLocationUseCase_Factory(Provider<NetworkingRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetLocationUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetLocationUseCase_Factory create(
      Provider<NetworkingRepository> repositoryProvider) {
    return new GetLocationUseCase_Factory(repositoryProvider);
  }

  public static GetLocationUseCase newInstance(NetworkingRepository repository) {
    return new GetLocationUseCase(repository);
  }
}
