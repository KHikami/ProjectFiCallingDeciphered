package defpackage;

import android.view.View;

final class zj implements Runnable {
    final /* synthetic */ zh a;
    private zm b;

    public zj(zh zhVar, zm zmVar) {
        this.a = zhVar;
        this.b = zmVar;
    }

    public void run() {
        if (this.a.c != null) {
            this.a.c.f();
        }
        View view = (View) this.a.f;
        if (!(view == null || view.getWindowToken() == null || !this.b.c())) {
            this.a.h = this.b;
        }
        this.a.j = null;
    }
}
