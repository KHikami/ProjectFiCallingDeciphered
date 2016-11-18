package p000;

import android.app.Application;

public final class iwk {
    private final iwl f19258a = new iwl();

    public void m23391a(Application application) {
        application.registerActivityLifecycleCallbacks(this.f19258a);
    }

    public void m23393b(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.f19258a);
    }

    public void m23392a(ivz ivz) {
        ba.m4536a((Object) ivz);
        if (ivz instanceof iwa) {
            this.f19258a.f19259a.add((iwa) ivz);
        }
        if (ivz instanceof iwf) {
            this.f19258a.f19260b.add((iwf) ivz);
        }
        if (ivz instanceof iwd) {
            this.f19258a.f19261c.add((iwd) ivz);
        }
        if (ivz instanceof iwc) {
            this.f19258a.f19262d.add((iwc) ivz);
        }
        if (ivz instanceof iwg) {
            this.f19258a.f19263e.add((iwg) ivz);
        }
        if (ivz instanceof iwe) {
            this.f19258a.f19264f.add((iwe) ivz);
        }
        if (ivz instanceof iwb) {
            this.f19258a.f19265g.add((iwb) ivz);
        }
        if (ivz instanceof iwi) {
            this.f19258a.f19266h.add((iwi) ivz);
        }
        if (ivz instanceof iwh) {
            this.f19258a.f19267i.add((iwh) ivz);
        }
    }

    public void m23394b(ivz ivz) {
        ba.m4536a((Object) ivz);
        if (ivz instanceof iwa) {
            this.f19258a.f19259a.remove(ivz);
        }
        if (ivz instanceof iwf) {
            this.f19258a.f19260b.remove(ivz);
        }
        if (ivz instanceof iwd) {
            this.f19258a.f19261c.remove(ivz);
        }
        if (ivz instanceof iwc) {
            this.f19258a.f19262d.remove(ivz);
        }
        if (ivz instanceof iwg) {
            this.f19258a.f19263e.remove(ivz);
        }
        if (ivz instanceof iwe) {
            this.f19258a.f19264f.remove(ivz);
        }
        if (ivz instanceof iwb) {
            this.f19258a.f19265g.remove(ivz);
        }
        if (ivz instanceof iwi) {
            this.f19258a.f19266h.remove(ivz);
        }
        if (ivz instanceof iwh) {
            this.f19258a.f19267i.remove(ivz);
        }
    }
}
