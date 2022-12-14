// Generated by view binder compiler. Do not edit!
package dgtic.unam.modulosieta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dgtic.unam.modulosieta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCollapsingToolbarLayoutBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout bar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final TextView compania;

  @NonNull
  public final ImageView consolaImagen;

  @NonNull
  public final TextView fecha;

  @NonNull
  public final FloatingActionButton floatingCompra;

  @NonNull
  public final TextView informacion;

  @NonNull
  public final Toolbar toolsbar;

  private ActivityCollapsingToolbarLayoutBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout bar, @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull TextView compania, @NonNull ImageView consolaImagen, @NonNull TextView fecha,
      @NonNull FloatingActionButton floatingCompra, @NonNull TextView informacion,
      @NonNull Toolbar toolsbar) {
    this.rootView = rootView;
    this.bar = bar;
    this.collapsingToolbar = collapsingToolbar;
    this.compania = compania;
    this.consolaImagen = consolaImagen;
    this.fecha = fecha;
    this.floatingCompra = floatingCompra;
    this.informacion = informacion;
    this.toolsbar = toolsbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCollapsingToolbarLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCollapsingToolbarLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_collapsing_toolbar_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCollapsingToolbarLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bar;
      AppBarLayout bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.compania;
      TextView compania = ViewBindings.findChildViewById(rootView, id);
      if (compania == null) {
        break missingId;
      }

      id = R.id.consola_imagen;
      ImageView consolaImagen = ViewBindings.findChildViewById(rootView, id);
      if (consolaImagen == null) {
        break missingId;
      }

      id = R.id.fecha;
      TextView fecha = ViewBindings.findChildViewById(rootView, id);
      if (fecha == null) {
        break missingId;
      }

      id = R.id.floating_compra;
      FloatingActionButton floatingCompra = ViewBindings.findChildViewById(rootView, id);
      if (floatingCompra == null) {
        break missingId;
      }

      id = R.id.informacion;
      TextView informacion = ViewBindings.findChildViewById(rootView, id);
      if (informacion == null) {
        break missingId;
      }

      id = R.id.toolsbar;
      Toolbar toolsbar = ViewBindings.findChildViewById(rootView, id);
      if (toolsbar == null) {
        break missingId;
      }

      return new ActivityCollapsingToolbarLayoutBinding((CoordinatorLayout) rootView, bar,
          collapsingToolbar, compania, consolaImagen, fecha, floatingCompra, informacion, toolsbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
