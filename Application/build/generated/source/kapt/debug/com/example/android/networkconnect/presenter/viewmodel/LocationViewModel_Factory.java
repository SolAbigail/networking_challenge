package com.example.android.networkconnect.presenter.viewmodel;

import com.example.android.networkconnect.domain.usecase.GetLocationUseCase;
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
public final class LocationViewModel_Factory implements Factory<LocationViewModel> {
  private final Provider<GetLocationUseCase> getLocationUseCaseProvider;

  public LocationViewModel_Factory(Provider<GetLocationUseCase> getLocationUseCaseProvider) {
    this.getLocationUseCaseProvider = getLocationUseCaseProvider;
  }

  @Override
  public LocationViewModel get() {
    return newInstance(getLocationUseCaseProvider.get());
  }

  public static LocationViewModel_Factory create(
      Provider<GetLocationUseCase> getLocationUseCaseProvider) {
    return new LocationViewModel_Factory(getLocationUseCaseProvider);
  }

  public static LocationViewModel newInstance(GetLocationUseCase getLocationUseCase) {
    return new LocationViewModel(getLocationUseCase);
  }
}
