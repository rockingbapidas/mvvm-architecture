// Generated by data binding compiler. Do not edit!
package com.bapidas.news.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bapidas.news.R;
import com.bapidas.news.ui.main.news.detail.NewsDetailViewModel;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityNewsDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageButton imgBack;

  @NonNull
  public final ImageView imgBg;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvSource;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected NewsDetailViewModel mViewModel;

  protected ActivityNewsDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, ImageButton imgBack, ImageView imgBg, TextView tvDate,
      TextView tvDescription, TextView tvSource, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.imgBack = imgBack;
    this.imgBg = imgBg;
    this.tvDate = tvDate;
    this.tvDescription = tvDescription;
    this.tvSource = tvSource;
    this.tvTitle = tvTitle;
  }

  public abstract void setViewModel(@Nullable NewsDetailViewModel viewModel);

  @Nullable
  public NewsDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_news_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityNewsDetailBinding>inflateInternal(inflater, R.layout.activity_news_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_news_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityNewsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityNewsDetailBinding>inflateInternal(inflater, R.layout.activity_news_detail, null, false, component);
  }

  public static ActivityNewsDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityNewsDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityNewsDetailBinding)bind(component, view, R.layout.activity_news_detail);
  }
}