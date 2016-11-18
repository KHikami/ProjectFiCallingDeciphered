package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

final class uv implements tu {
    final /* synthetic */ ut a;

    uv(ut utVar) {
        this.a = utVar;
    }

    public Drawable a() {
        afp a = afp.a(b(), null, new int[]{gwb.S});
        Drawable a2 = a.a(0);
        a.a();
        return a2;
    }

    public Context b() {
        return this.a.m();
    }

    public boolean c() {
        tp a = this.a.a();
        return (a == null || (a.b() & 4) == 0) ? false : true;
    }

    public void a(Drawable drawable, int i) {
        tp a = this.a.a();
        if (a != null) {
            a.b(drawable);
            a.c(i);
        }
    }

    public void a(int i) {
        tp a = this.a.a();
        if (a != null) {
            a.c(i);
        }
    }
}
