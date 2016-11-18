package p000;

public final class etf extends esx {
    private static final long serialVersionUID = 1;
    private final String f12224c;
    private final String f12225d;
    private final String f12226e;

    public etf(String str, String str2, String str3) {
        this.f12224c = str;
        this.f12225d = str2;
        this.f12226e = str3;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf oig = new oig();
        oig.d = new oif();
        oig.d.a = this.f12224c;
        oig.d.b = this.f12225d;
        String str2 = this.f12224c;
        String str3 = this.f12225d;
        oig.a = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(":").append(str3).toString();
        oig.b = new ohu();
        oig.b.a = this.f12226e;
        oig.c = Integer.valueOf((int) gwb.m1519a(gwb.m1400H(), "babel_handoff_unknown_source_window_millis", fls.f13444u));
        return oig;
    }

    public boolean mo1950k() {
        return true;
    }

    public String mo1947g() {
        return "handoffnumbers/update";
    }
}
