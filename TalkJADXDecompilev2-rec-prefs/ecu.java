package p000;

import android.content.Context;
import android.os.Bundle;

public final class ecu implements jcc, jza, kcm, kcq {
    private jca f11182a;
    private ect f11183b;

    public ecu(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f11182a = (jca) jyn.m25443a(jca.class);
        this.f11182a.mo2318a(this);
        this.f11183b = (ect) jyn.m25443a(ect.class);
    }

    public void R_() {
        this.f11183b.mo1826a(this.f11182a.mo2317a());
    }

    public void mo1133a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.f11183b.mo1826a(i2);
            this.f11183b.mo1833b(i2, fhe.SILENT, false, mdv.f27537a);
        }
    }
}
