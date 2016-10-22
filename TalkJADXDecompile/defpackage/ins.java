package defpackage;

import com.google.android.libraries.hangouts.video.internal.Renderer;

/* renamed from: ins */
final class ins implements Runnable {
    final /* synthetic */ inj a;

    ins(inj inj) {
        this.a = inj;
    }

    public void run() {
        Renderer renderer;
        int i = (this.a.b == null || this.a.b.f() == -1 || !this.a.b.h()) ? 0 : 1;
        if (this.a.e == this.a.d && i != 0) {
            renderer = this.a.c;
            this.a.m.c(this.a);
            this.a.m.a(new int(this));
        } else if (this.a.e == this.a.c && i == 0) {
            renderer = this.a.d;
            inj inj = this.a;
            inj.b.e().post(new inm(inj, new inu(this)));
        } else {
            return;
        }
        itx.a(3, "vclib", "%s: Switching from %s to %s", this.a.f(), this.a.e.getClass().getSimpleName(), renderer.getClass().getSimpleName());
        this.a.e = renderer;
    }
}
