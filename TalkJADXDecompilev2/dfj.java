package defpackage;

import android.content.Context;

public final class dfj implements dey {
    private static final iic b = new iic().b().d();
    private static final iic c = new iic(b).a();
    private static final anw<iic> d = anw.a("com.google.android.apps.hangouts.glide.impl.FifeUrlOptions", b);
    private final Context a;
    private azl e;
    private azl f;
    private azl g;
    private azl h;
    private azl i;
    private azl j;

    dfj(Context context) {
        this.a = context;
    }

    public azl a() {
        if (this.i == null) {
            this.i = (azl) ((azl) c(1024).c(this.a)).a((azh) (azl) new azl().a(anr.PREFER_ARGB_8888));
        }
        return this.i;
    }

    public azl a(int i) {
        if (this.j == null || this.j.j != i) {
            this.j = (azl) azl.b(i, i).a(d, (Object) b);
        }
        return this.j;
    }

    public azl a(int i, int i2) {
        return (azl) new azl().a(this.a, new dez(this.a, i, i2));
    }

    public azl b(int i) {
        if (this.e == null || this.e.i != i) {
            this.e = (azl) c(i).e(this.a);
        }
        return this.e;
    }

    public azl c(int i) {
        if (this.f == null || this.f.i != i) {
            this.f = azl.b(i, i);
        }
        return this.f;
    }

    public azl b(int i, int i2) {
        if (!(this.g != null && this.g.i == i2 && this.g.j == i)) {
            this.g = azl.b(i, i2);
        }
        return this.g;
    }

    public azl d(int i) {
        if (this.h == null || this.h.i != i) {
            this.h = (azl) ((azl) ((azl) c(i).b()).c()).a(d, (Object) c);
        }
        return this.h;
    }

    public anw<iic> b() {
        return d;
    }
}
