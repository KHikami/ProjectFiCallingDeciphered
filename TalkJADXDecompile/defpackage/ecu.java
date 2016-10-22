package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: ecu */
public final class ecu implements jcc, jza, kcm, kcq {
    private jca a;
    private ect b;

    public ecu(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.a.a(this);
        this.b = (ect) jyn.a(ect.class);
    }

    public void R_() {
        this.b.a(this.a.a());
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.b.a(i2);
            this.b.b(i2, fhe.SILENT, false, mdv.a);
        }
    }
}
