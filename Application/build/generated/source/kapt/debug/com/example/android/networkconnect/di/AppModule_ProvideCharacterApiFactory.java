package com.example.android.networkconnect.di;

import com.example.android.networkconnect.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideCharacterApiFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideCharacterApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideCharacterApi(retrofitProvider.get());
  }

  public static AppModule_ProvideCharacterApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideCharacterApiFactory(retrofitProvider);
  }

  public static ApiService provideCharacterApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.provideCharacterApi(retrofit));
  }
}
