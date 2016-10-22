package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: aba */
final class aba extends abb {
    private static Drawable a;

    aba() {
    }

    public final void a(ImageView imageView, abc abc) {
        if (a == null) {
            a = new ColorDrawable(imageView.getContext().getResources().getColor(buf.cE));
        }
        imageView.setImageDrawable(a);
    }
}
