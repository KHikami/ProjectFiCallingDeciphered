package defpackage;

import android.view.View;

final class zl extends acm {
    final /* synthetic */ zh a;
    final /* synthetic */ zk b;

    zl(zk zkVar, View view, zh zhVar) {
        this.b = zkVar;
        this.a = zhVar;
        super(view);
    }

    public ys a() {
        if (this.b.a.h == null) {
            return null;
        }
        return this.b.a.h.b();
    }

    public boolean b() {
        this.b.a.d();
        return true;
    }

    public boolean c() {
        if (this.b.a.j != null) {
            return false;
        }
        this.b.a.e();
        return true;
    }
}
