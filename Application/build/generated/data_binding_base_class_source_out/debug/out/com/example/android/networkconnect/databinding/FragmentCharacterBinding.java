// Generated by view binder compiler. Do not edit!
package com.example.android.networkconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.networkconnect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCharacterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressBar progressBarAditional;

  @NonNull
  public final RecyclerView rvContainer;

  private FragmentCharacterBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBarAditional,
      @NonNull RecyclerView rvContainer) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.progressBarAditional = progressBarAditional;
    this.rvContainer = rvContainer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_character, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCharacterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progressBarAditional;
      ProgressBar progressBarAditional = ViewBindings.findChildViewById(rootView, id);
      if (progressBarAditional == null) {
        break missingId;
      }

      id = R.id.rvContainer;
      RecyclerView rvContainer = ViewBindings.findChildViewById(rootView, id);
      if (rvContainer == null) {
        break missingId;
      }

      return new FragmentCharacterBinding((ConstraintLayout) rootView, progressBar,
          progressBarAditional, rvContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
