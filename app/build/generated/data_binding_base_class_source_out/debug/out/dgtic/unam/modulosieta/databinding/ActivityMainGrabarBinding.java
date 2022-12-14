// Generated by view binder compiler. Do not edit!
package dgtic.unam.modulosieta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dgtic.unam.modulosieta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainGrabarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnGrabar;

  @NonNull
  public final VideoView video;

  private ActivityMainGrabarBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnGrabar,
      @NonNull VideoView video) {
    this.rootView = rootView;
    this.btnGrabar = btnGrabar;
    this.video = video;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainGrabarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainGrabarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_grabar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainGrabarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGrabar;
      ImageButton btnGrabar = ViewBindings.findChildViewById(rootView, id);
      if (btnGrabar == null) {
        break missingId;
      }

      id = R.id.video;
      VideoView video = ViewBindings.findChildViewById(rootView, id);
      if (video == null) {
        break missingId;
      }

      return new ActivityMainGrabarBinding((LinearLayout) rootView, btnGrabar, video);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
