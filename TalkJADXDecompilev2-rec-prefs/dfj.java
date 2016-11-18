package p000;

import android.content.Context;

public final class dfj implements dey {
    private static final iic f9609b = new iic().m21856b().m21858d();
    private static final iic f9610c = new iic(f9609b).m21854a();
    private static final anw<iic> f9611d = anw.m3521a("com.google.android.apps.hangouts.glide.impl.FifeUrlOptions", f9609b);
    private final Context f9612a;
    private azl f9613e;
    private azl f9614f;
    private azl f9615g;
    private azl f9616h;
    private azl f9617i;
    private azl f9618j;

    dfj(Context context) {
        this.f9612a = context;
    }

    public azl mo1512a() {
        if (this.f9617i == null) {
            this.f9617i = (azl) ((azl) mo1518c(1024).m4438c(this.f9612a)).m4430a((azh) (azl) new azl().m4425a(anr.PREFER_ARGB_8888));
        }
        return this.f9617i;
    }

    public azl mo1513a(int i) {
        if (this.f9618j == null || this.f9618j.f2596j != i) {
            this.f9618j = (azl) azl.m4455b(i, i).m4427a(f9611d, (Object) f9609b);
        }
        return this.f9618j;
    }

    public azl mo1514a(int i, int i2) {
        return (azl) new azl().m4424a(this.f9612a, new dez(this.f9612a, i, i2));
    }

    public azl mo1516b(int i) {
        if (this.f9613e == null || this.f9613e.f2595i != i) {
            this.f9613e = (azl) mo1518c(i).m4440e(this.f9612a);
        }
        return this.f9613e;
    }

    public azl mo1518c(int i) {
        if (this.f9614f == null || this.f9614f.f2595i != i) {
            this.f9614f = azl.m4455b(i, i);
        }
        return this.f9614f;
    }

    public azl mo1517b(int i, int i2) {
        if (!(this.f9615g != null && this.f9615g.f2595i == i2 && this.f9615g.f2596j == i)) {
            this.f9615g = azl.m4455b(i, i2);
        }
        return this.f9615g;
    }

    public azl mo1519d(int i) {
        if (this.f9616h == null || this.f9616h.f2595i != i) {
            this.f9616h = (azl) ((azl) ((azl) mo1518c(i).m4434b()).m4437c()).m4427a(f9611d, (Object) f9610c);
        }
        return this.f9616h;
    }

    public anw<iic> mo1515b() {
        return f9611d;
    }
}
