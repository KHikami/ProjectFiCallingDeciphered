package p000;

import android.app.Notification;
import android.os.Bundle;

public class gl {
    fx f14066d;
    CharSequence f14067e;
    CharSequence f14068f;
    boolean f14069g = false;

    public void m16301a(fx fxVar) {
        if (this.f14066d != fxVar) {
            this.f14066d = fxVar;
            if (this.f14066d != null) {
                this.f14066d.m16428a(this);
            }
        }
    }

    public Notification m16299a() {
        if (this.f14066d != null) {
            return this.f14066d.m16433b();
        }
        return null;
    }

    public void mo2176a(Bundle bundle) {
    }
}
