package defpackage;

/* renamed from: gin */
public final class gin implements bnd {
    private static final mks<bnc> a;
    private final bbm b;

    static {
        bnc bnc = bnc.LOCATION_SHARING;
        bnc bnc2 = bnc.GOOGLE_VOICE;
        bnc bnc3 = bnc.CHANGE_INVITE_SETTINGS;
        bnc bnc4 = bnc.HANGOUTS_ON_AIR;
        bnc bnc5 = bnc.GOOGLE_PLUS;
        a = mks.a(5, bnc, bnc2, bnc3, bnc4, bnc5);
    }

    gin(bbm bbm) {
        this.b = bbm;
    }

    public boolean a(int i, bnc bnc) {
        boolean z;
        if (this.b.p(i) && a.contains(bnc)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String valueOf = String.valueOf(bnc);
            glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Unicorn blocked feature: ").append(valueOf).toString(), new Object[0]);
        }
        return z;
    }
}
