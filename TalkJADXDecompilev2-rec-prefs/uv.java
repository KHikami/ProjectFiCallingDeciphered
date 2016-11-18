package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;

final class uv implements tu {
    final /* synthetic */ ut f35322a;

    uv(ut utVar) {
        this.f35322a = utVar;
    }

    public Drawable mo4387a() {
        afp a = afp.a(mo4390b(), null, new int[]{gwb.S});
        Drawable a2 = a.a(0);
        a.a();
        return a2;
    }

    public Context mo4390b() {
        return this.f35322a.m40960m();
    }

    public boolean mo4391c() {
        tp a = this.f35322a.mo4394a();
        return (a == null || (a.mo4457b() & 4) == 0) ? false : true;
    }

    public void mo4389a(Drawable drawable, int i) {
        tp a = this.f35322a.mo4394a();
        if (a != null) {
            a.mo4459b(drawable);
            a.mo4464c(i);
        }
    }

    public void mo4388a(int i) {
        tp a = this.f35322a.mo4394a();
        if (a != null) {
            a.mo4464c(i);
        }
    }
}
