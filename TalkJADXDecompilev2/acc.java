package defpackage;

import android.view.View;

final class acc extends ach {
    final /* synthetic */ aer a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ pn d;
    final /* synthetic */ abw e;

    acc(abw abw, aer aer, int i, int i2, pn pnVar) {
        this.e = abw;
        this.a = aer;
        this.b = i;
        this.c = i2;
        this.d = pnVar;
    }

    public void a(View view) {
    }

    public void c(View view) {
        if (this.b != 0) {
            oa.a(view, 0.0f);
        }
        if (this.c != 0) {
            oa.b(view, 0.0f);
        }
    }

    public void b(View view) {
        this.d.a(null);
        this.e.f(this.a);
        this.e.e.remove(this.a);
        this.e.c();
    }
}
