// Generated by view binder compiler. Do not edit!
package dgtic.unam.modulosieta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import dgtic.unam.modulosieta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BarMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final MaterialToolbar toolbarMain;

  private BarMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull MaterialToolbar toolbarMain) {
    this.rootView = rootView;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BarMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BarMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.bar_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BarMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new BarMainBinding((CoordinatorLayout) rootView, toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}