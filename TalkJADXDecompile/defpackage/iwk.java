package defpackage;

import android.app.Application;

/* renamed from: iwk */
public final class iwk {
    private final iwl a;

    public iwk() {
        this.a = new iwl();
    }

    public void a(Application application) {
        application.registerActivityLifecycleCallbacks(this.a);
    }

    public void b(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.a);
    }

    public void a(ivz ivz) {
        ba.a((Object) ivz);
        if (ivz instanceof iwa) {
            this.a.a.add((iwa) ivz);
        }
        if (ivz instanceof iwf) {
            this.a.b.add((iwf) ivz);
        }
        if (ivz instanceof iwd) {
            this.a.c.add((iwd) ivz);
        }
        if (ivz instanceof iwc) {
            this.a.d.add((iwc) ivz);
        }
        if (ivz instanceof iwg) {
            this.a.e.add((iwg) ivz);
        }
        if (ivz instanceof iwe) {
            this.a.f.add((iwe) ivz);
        }
        if (ivz instanceof iwb) {
            this.a.g.add((iwb) ivz);
        }
        if (ivz instanceof iwi) {
            this.a.h.add((iwi) ivz);
        }
        if (ivz instanceof iwh) {
            this.a.i.add((iwh) ivz);
        }
    }

    public void b(ivz ivz) {
        ba.a((Object) ivz);
        if (ivz instanceof iwa) {
            this.a.a.remove(ivz);
        }
        if (ivz instanceof iwf) {
            this.a.b.remove(ivz);
        }
        if (ivz instanceof iwd) {
            this.a.c.remove(ivz);
        }
        if (ivz instanceof iwc) {
            this.a.d.remove(ivz);
        }
        if (ivz instanceof iwg) {
            this.a.e.remove(ivz);
        }
        if (ivz instanceof iwe) {
            this.a.f.remove(ivz);
        }
        if (ivz instanceof iwb) {
            this.a.g.remove(ivz);
        }
        if (ivz instanceof iwi) {
            this.a.h.remove(ivz);
        }
        if (ivz instanceof iwh) {
            this.a.i.remove(ivz);
        }
    }
}
