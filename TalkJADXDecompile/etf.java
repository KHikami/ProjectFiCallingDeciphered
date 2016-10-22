public final class etf extends esx {
    private static final long serialVersionUID = 1;
    private final String c;
    private final String d;
    private final String e;

    public etf(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public nzf a(String str, int i, int i2) {
        oig oig = new oig();
        oig.d = new oif();
        oig.d.a = this.c;
        oig.d.b = this.d;
        String str2 = this.c;
        String str3 = this.d;
        oig.a = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(":").append(str3).toString();
        oig.b = new ohu();
        oig.b.a = this.e;
        oig.c = Integer.valueOf((int) gwb.a(gwb.H(), "babel_handoff_unknown_source_window_millis", fls.u));
        return oig;
    }

    public boolean k() {
        return true;
    }

    public String g() {
        return "handoffnumbers/update";
    }
}
