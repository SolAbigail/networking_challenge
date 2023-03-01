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
public final class GetCharactersUseCase_Factory implements Factory<GetCharactersUseCase> {
  private final Provider<NetworkingRepository> repositoryProvider;

  public GetCharactersUseCase_Factory(Provider<NetworkingRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCharactersUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCharactersUseCase_Factory create(
      Provider<NetworkingRepository> repositoryProvider) {
    return new GetCharactersUseCase_Factory(repositoryProvider);
  }

  public static GetCharactersUseCase newInstance(NetworkingRepository repository) {
    return new GetCharactersUseCase(repository);
  }
}
