package p000;

import android.view.View;

final class zj implements Runnable {
    final /* synthetic */ zh f35906a;
    private zm f35907b;

    public zj(zh zhVar, zm zmVar) {
        this.f35906a = zhVar;
        this.f35907b = zmVar;
    }

    public void run() {
        if (this.f35906a.c != null) {
            this.f35906a.c.m41435f();
        }
        View view = (View) this.f35906a.f;
        if (!(view == null || view.getWindowToken() == null || !this.f35907b.m41517c())) {
            this.f35906a.f35886h = this.f35907b;
        }
        this.f35906a.f35888j = null;
    }
}
