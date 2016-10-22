public final class agc {
    public static ll<agc> d;
    int a;
    aed b;
    aed c;

    static {
        d = new lm(20);
    }

    private agc() {
    }

    static agc a() {
        agc agc = (agc) d.a();
        return agc == null ? new agc() : agc;
    }

    static void a(agc agc) {
        agc.a = 0;
        agc.b = null;
        agc.c = null;
        d.a(agc);
    }
}
