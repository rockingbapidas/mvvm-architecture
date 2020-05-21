// Generated by Dagger (https://dagger.dev).
package com.bapidas.news;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import timber.log.Timber;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsApplication_MembersInjector implements MembersInjector<NewsApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<Timber.Tree> timberTreeProvider;

  public NewsApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Timber.Tree> timberTreeProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.timberTreeProvider = timberTreeProvider;
  }

  public static MembersInjector<NewsApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Timber.Tree> timberTreeProvider) {
    return new NewsApplication_MembersInjector(androidInjectorProvider, timberTreeProvider);}

  @Override
  public void injectMembers(NewsApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectTimberTree(instance, timberTreeProvider.get());
  }

  @InjectedFieldSignature("com.bapidas.news.NewsApplication.timberTree")
  public static void injectTimberTree(NewsApplication instance, Timber.Tree timberTree) {
    instance.timberTree = timberTree;
  }
}
