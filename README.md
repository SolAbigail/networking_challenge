# Networking App Android

This application allows you to view the characters, episodes and locations of rickandmorty api. You can see information about images.

## How it looks &#127916;

<image src="resources/img_home.png">

## Specifications &#9989;

**Current version:** 1.0.0

**Minimum OS version:** Android 7 - Nougat (API level 24)

**Maximum OS version:** Android 13 (API level 32)

**Percentage of support devices (based on OS version):** ~94.4%

**Support for landscape:** No

**Dark mode:** No

**Offline support:** No

**Permissions required:** `ACCESS_NETWORK_STATE`, `INTERNET`

## Architecture &#128736;

Following concepts of clean architecture, there 3 packages that represents the data, domain and UI. There's also one package for dependency injection.

<image src="resources/img_clean.png">

- In the data layer, network operations resides inside a `NetworkingDataSourceRemote` and it is accessible through and implementation of `NetworkingRepository`.
  Data models are converted to entities using `mappers`.

- In the domain layer, business logic operations lives in `usecases` and real life objects are represented as `models`. There's also the definition of the `NetworkingRepository`, this, in order to follow the dependency inversion principle.

- In the UI layer, `CharacterViewModel` handles the events from the UI components and interacts with the domain layer through `usecases`, the data is presented to the interface using `LiveData` observables. observables The screens are built using `databinding` instead of the view system (XML).


## Stack &#128221;

This apps was built using this libraries and frameworks:

### UI

[Navigation](https://developer.android.com/guide/navigation?hl=es-419)
, [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel?gclid=CjwKCAiAjPyfBhBMEiwAB2CCIte2SG59kRiaw6od28DD3fliB0GTm-2swZCcBv8NlhY6DZCdZXk9shoCnscQAvD_BwE&gclsrc=aw.ds&hl=es-419)
, [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)

### Image Loading:

[Glide](https://github.com/bumptech/glide)

### Logging:
[OkHttp Logging Interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor)

### Dependency Injection:

[Hilt](https://developer.android.com/training/dependency-injection/hilt-android)

### Serialization:

[Gson](https://github.com/google/gson)

### Networking:

[Retrofit](https://square.github.io/retrofit/)

### Testing:

[MockK](https://mockk.io)
, [JUnit](https://developer.android.com/training/testing/local-tests)

## Testing &#128270;

Due to time reasons, in the domain layer, some methods and logic of the CharacterViewModel are covered with unit tests.

### That's it! Thanks for checking the repo# repository
