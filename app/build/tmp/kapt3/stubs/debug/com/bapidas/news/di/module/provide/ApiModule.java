package com.bapidas.news.di.module.provide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/bapidas/news/di/module/provide/ApiModule;", "", "()V", "provideNewsRepository", "Lcom/bapidas/news/data/repository/NewsRepository;", "retrofit", "Lretrofit2/Retrofit;", "newsArticlesDao", "Lcom/bapidas/news/data/db/dao/NewsArticlesDao;", "newsapp-v1.0.0(1)_debug"})
@dagger.Module()
public final class ApiModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.bapidas.news.data.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    com.bapidas.news.data.db.dao.NewsArticlesDao newsArticlesDao) {
        return null;
    }
    
    public ApiModule() {
        super();
    }
}