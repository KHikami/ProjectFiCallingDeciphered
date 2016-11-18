package defpackage;

public final class agc {
    public static ll<agc> d = new lm(20);
    int a;
    aed b;
    aed c;

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
