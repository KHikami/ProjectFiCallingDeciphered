package p000;

import android.view.Choreographer.FrameCallback;

public abstract class iuk {
    private Runnable f19042a;
    private FrameCallback f19043b;

    public abstract void mo3399a(long j);

    FrameCallback m23307a() {
        if (this.f19043b == null) {
            this.f19043b = new iul(this);
        }
        return this.f19043b;
    }

    Runnable m23309b() {
        if (this.f19042a == null) {
            this.f19042a = new ium(this);
        }
        return this.f19042a;
    }
}
