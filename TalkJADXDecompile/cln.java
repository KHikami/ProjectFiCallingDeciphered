final class cln implements cli {
    final /* synthetic */ clm a;

    cln(clm clm) {
        this.a = clm;
    }

    public boolean a(bko bko, cgr cgr) {
        if (cgr != null && !cgr.a(clj.class)) {
            return false;
        }
        if (bko != null) {
            return gwb.a(bko, bnc.LOCATION_SHARING);
        }
        return true;
    }

    public int a() {
        return gwb.nd;
    }

    public chz b() {
        return new chz(2661, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public Class<clk> c() {
        return clk.class;
    }
}
