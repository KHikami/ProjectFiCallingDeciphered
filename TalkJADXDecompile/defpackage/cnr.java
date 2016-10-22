package defpackage;

import android.content.Context;

/* renamed from: cnr */
final class cnr implements cnk {
    final /* synthetic */ Context a;
    final /* synthetic */ cnq b;

    cnr(cnq cnq, Context context) {
        this.b = cnq;
        this.a = context;
    }

    public boolean a(bko bko, cgr cgr) {
        if (!fdq.a(this.a, bko.g())) {
            return false;
        }
        if (cgr != null) {
            return cgr.a(cnl.class);
        }
        return true;
    }

    public int a() {
        return gwb.nv;
    }

    public chz b() {
        return new chz(2658, "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public Class<cnm> c() {
        return cnm.class;
    }
}
