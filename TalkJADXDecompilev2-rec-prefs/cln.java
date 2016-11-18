package p000;

final class cln implements cli {
    final /* synthetic */ clm f5552a;

    cln(clm clm) {
        this.f5552a = clm;
    }

    public boolean mo985a(bko bko, cgr cgr) {
        if (cgr != null && !cgr.mo939a(clj.class)) {
            return false;
        }
        if (bko != null) {
            return gwb.m1923a(bko, bnc.LOCATION_SHARING);
        }
        return true;
    }

    public int mo984a() {
        return gwb.nd;
    }

    public chz mo986b() {
        return new chz(2661, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public Class<clk> mo987c() {
        return clk.class;
    }
}
