package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class azy<T extends View, Z> extends azx {
    private static boolean b = false;
    private static Integer d = null;
    public final T a;
    private final azz e;

    public azy(T t) {
        this.a = (View) gwb.I((Object) t);
        this.e = new azz(t);
    }

    public void a(azw azw) {
        this.e.a(azw);
    }

    public void d(Drawable drawable) {
        super.d(drawable);
        this.e.b();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append("Target for: ").append(valueOf).toString();
    }

    public void a(azi azi) {
        if (d == null) {
            b = true;
            this.a.setTag(azi);
            return;
        }
        this.a.setTag(d.intValue(), azi);
    }

    public azi b() {
        Object tag;
        if (d == null) {
            tag = this.a.getTag();
        } else {
            tag = this.a.getTag(d.intValue());
        }
        if (tag == null) {
            return null;
        }
        if (tag instanceof azi) {
            return (azi) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }
}
