package p000;

import com.google.android.libraries.hangouts.video.internal.Renderer;

final class ins implements Runnable {
    final /* synthetic */ inj f18165a;

    ins(inj inj) {
        this.f18165a = inj;
    }

    public void run() {
        Renderer renderer;
        int i = (this.f18165a.f18138b == null || this.f18165a.f18138b.m10382f() == -1 || !this.f18165a.f18138b.m10384h()) ? 0 : 1;
        if (this.f18165a.f18141e == this.f18165a.f18140d && i != 0) {
            renderer = this.f18165a.f18139c;
            this.f18165a.m.m22236c(this.f18165a);
            this.f18165a.m.m22233a(new C0189int(this));
        } else if (this.f18165a.f18141e == this.f18165a.f18139c && i == 0) {
            renderer = this.f18165a.f18140d;
            inj inj = this.f18165a;
            inj.f18138b.m10381e().post(new inm(inj, new inu(this)));
        } else {
            return;
        }
        itx.m23279a(3, "vclib", "%s: Switching from %s to %s", this.f18165a.mo3277f(), this.f18165a.f18141e.getClass().getSimpleName(), renderer.getClass().getSimpleName());
        this.f18165a.f18141e = renderer;
    }
}
