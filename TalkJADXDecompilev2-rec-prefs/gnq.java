package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

final class gnq extends azv<Drawable> {
    final /* synthetic */ gno f15740a;

    gnq(gno gno) {
        this.f15740a = gno;
    }

    public /* bridge */ /* synthetic */ void mo264a(Object obj, bac bac) {
        m18187a((Drawable) obj);
    }

    private void m18187a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            this.f15740a.mo1221b(drawable);
            return;
        }
        this.f15740a.mo1214a(((BitmapDrawable) drawable).getBitmap());
        this.f15740a.mo1229d(0);
    }
}
