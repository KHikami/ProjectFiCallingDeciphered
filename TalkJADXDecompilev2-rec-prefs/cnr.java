package p000;

import android.content.Context;

final class cnr implements cnk {
    final /* synthetic */ Context f5715a;
    final /* synthetic */ cnq f5716b;

    cnr(cnq cnq, Context context) {
        this.f5716b = cnq;
        this.f5715a = context;
    }

    public boolean mo985a(bko bko, cgr cgr) {
        if (!fdq.m15090a(this.f5715a, bko.m5638g())) {
            return false;
        }
        if (cgr != null) {
            return cgr.mo939a(cnl.class);
        }
        return true;
    }

    public int mo984a() {
        return gwb.nv;
    }

    public chz mo986b() {
        return new chz(2658, "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public Class<cnm> mo987c() {
        return cnm.class;
    }
}
