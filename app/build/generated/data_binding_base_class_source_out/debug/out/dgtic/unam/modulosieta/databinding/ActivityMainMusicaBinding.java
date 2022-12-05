// Generated by view binder compiler. Do not edit!
package dgtic.unam.modulosieta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dgtic.unam.modulosieta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainMusicaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView list;

  @NonNull
  public final ImageButton path;

  @NonNull
  public final ImageButton pause;

  @NonNull
  public final ImageView play;

  @NonNull
  public final ImageButton stop;

  private ActivityMainMusicaBinding(@NonNull LinearLayout rootView, @NonNull ListView list,
      @NonNull ImageButton path, @NonNull ImageButton pause, @NonNull ImageView play,
      @NonNull ImageButton stop) {
    this.rootView = rootView;
    this.list = list;
    this.path = path;
    this.pause = pause;
    this.play = play;
    this.stop = stop;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainMusicaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainMusicaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_musica, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainMusicaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list;
      ListView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      id = R.id.path;
      ImageButton path = ViewBindings.findChildViewById(rootView, id);
      if (path == null) {
        break missingId;
      }

      id = R.id.pause;
      ImageButton pause = ViewBindings.findChildViewById(rootView, id);
      if (pause == null) {
        break missingId;
      }

      id = R.id.play;
      ImageView play = ViewBindings.findChildViewById(rootView, id);
      if (play == null) {
        break missingId;
      }

      id = R.id.stop;
      ImageButton stop = ViewBindings.findChildViewById(rootView, id);
      if (stop == null) {
        break missingId;
      }

      return new ActivityMainMusicaBinding((LinearLayout) rootView, list, path, pause, play, stop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}