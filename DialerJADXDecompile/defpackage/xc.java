package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: xc */
final class xc extends xh {
    private /* synthetic */ zk a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ lv d;
    private /* synthetic */ ww e;

    xc(ww wwVar, zk zkVar, int i, int i2, lv lvVar) {
        this.e = wwVar;
        this.a = zkVar;
        this.b = i;
        this.c = i2;
        this.d = lvVar;
    }

    public final void a(View view) {
    }

    public final void c(View view) {
        if (this.b != 0) {
            kn.a(view, 0.0f);
        }
        if (this.c != 0) {
            kn.b(view, 0.0f);
        }
    }

    public final void b(View view) {
        this.d.a(null);
        this.e.e(this.a);
        this.e.e.remove(this.a);
        this.e.c();
    }
}
