// Generated by view binder compiler. Do not edit!
package dgtic.unam.modulosieta.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dgtic.unam.modulosieta.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardViewHolderBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView initial;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final TextView nameTarjeta;

  private CardViewHolderBinding(@NonNull CardView rootView, @NonNull CardView cardLayout,
      @NonNull ImageView imageView, @NonNull TextView initial, @NonNull LinearLayout linear,
      @NonNull TextView nameTarjeta) {
    this.rootView = rootView;
    this.cardLayout = cardLayout;
    this.imageView = imageView;
    this.initial = initial;
    this.linear = linear;
    this.nameTarjeta = nameTarjeta;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CardViewHolderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardViewHolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_view_holder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardViewHolderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardLayout = (CardView) rootView;

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.initial;
      TextView initial = ViewBindings.findChildViewById(rootView, id);
      if (initial == null) {
        break missingId;
      }

      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.name_tarjeta;
      TextView nameTarjeta = ViewBindings.findChildViewById(rootView, id);
      if (nameTarjeta == null) {
        break missingId;
      }

      return new CardViewHolderBinding((CardView) rootView, cardLayout, imageView, initial, linear,
          nameTarjeta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}