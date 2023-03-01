package com.example.android.networkconnect.presenter.viewmodel;

import com.example.android.networkconnect.domain.usecase.GetCharactersUseCase;
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
public final class CharacterViewModel_Factory implements Factory<CharacterViewModel> {
  private final Provider<GetCharactersUseCase> getCharactersUseCaseProvider;

  public CharacterViewModel_Factory(Provider<GetCharactersUseCase> getCharactersUseCaseProvider) {
    this.getCharactersUseCaseProvider = getCharactersUseCaseProvider;
  }

  @Override
  public CharacterViewModel get() {
    return newInstance(getCharactersUseCaseProvider.get());
  }

  public static CharacterViewModel_Factory create(
      Provider<GetCharactersUseCase> getCharactersUseCaseProvider) {
    return new CharacterViewModel_Factory(getCharactersUseCaseProvider);
  }

  public static CharacterViewModel newInstance(GetCharactersUseCase getCharactersUseCase) {
    return new CharacterViewModel(getCharactersUseCase);
  }
}
