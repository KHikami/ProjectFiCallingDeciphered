package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

public abstract class azy<T extends View, Z> extends azx {
    private static boolean f1372b = false;
    private static Integer f1373d = null;
    public final T f1374a;
    private final azz f1375e;

    public azy(T t) {
        this.f1374a = (View) gwb.m1404I((Object) t);
        this.f1375e = new azz(t);
    }

    public void mo263a(azw azw) {
        this.f1375e.m4514a(azw);
    }

    public void mo267d(Drawable drawable) {
        super.mo267d(drawable);
        this.f1375e.m4515b();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f1374a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append("Target for: ").append(valueOf).toString();
    }

    public void mo265a(azi azi) {
        if (f1373d == null) {
            f1372b = true;
            this.f1374a.setTag(azi);
            return;
        }
        this.f1374a.setTag(f1373d.intValue(), azi);
    }

    public azi mo266b() {
        Object tag;
        if (f1373d == null) {
            tag = this.f1374a.getTag();
        } else {
            tag = this.f1374a.getTag(f1373d.intValue());
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
