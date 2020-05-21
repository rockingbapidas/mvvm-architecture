// Generated by Dagger (https://dagger.dev).
package com.bapidas.news.di.module.provide;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideHttpLoggingInterceptorFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLoggingInterceptor(module);
  }

  public static NetworkModule_ProvideHttpLoggingInterceptorFactory create(NetworkModule module) {
    return new NetworkModule_ProvideHttpLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor provideHttpLoggingInterceptor(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideHttpLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
