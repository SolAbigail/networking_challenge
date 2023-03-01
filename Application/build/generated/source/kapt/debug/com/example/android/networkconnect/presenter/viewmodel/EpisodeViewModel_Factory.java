package com.example.android.networkconnect.presenter.viewmodel;

import com.example.android.networkconnect.domain.usecase.GetEpisodeUseCase;
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
public final class EpisodeViewModel_Factory implements Factory<EpisodeViewModel> {
  private final Provider<GetEpisodeUseCase> episodeUseCaseProvider;

  public EpisodeViewModel_Factory(Provider<GetEpisodeUseCase> episodeUseCaseProvider) {
    this.episodeUseCaseProvider = episodeUseCaseProvider;
  }

  @Override
  public EpisodeViewModel get() {
    return newInstance(episodeUseCaseProvider.get());
  }

  public static EpisodeViewModel_Factory create(
      Provider<GetEpisodeUseCase> episodeUseCaseProvider) {
    return new EpisodeViewModel_Factory(episodeUseCaseProvider);
  }

  public static EpisodeViewModel newInstance(GetEpisodeUseCase episodeUseCase) {
    return new EpisodeViewModel(episodeUseCase);
  }
}
