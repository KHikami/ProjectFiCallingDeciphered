package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: gnq */
final class gnq extends azv<Drawable> {
    final /* synthetic */ gno a;

    gnq(gno gno) {
        this.a = gno;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((Drawable) obj);
    }

    private void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            this.a.b(drawable);
            return;
        }
        this.a.a(((BitmapDrawable) drawable).getBitmap());
        this.a.d(0);
    }
}
