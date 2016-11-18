package p000;

public final class gin implements bnd {
    private static final mks<bnc> f15312a;
    private final bbm f15313b;

    static {
        bnc bnc = bnc.LOCATION_SHARING;
        bnc bnc2 = bnc.GOOGLE_VOICE;
        bnc bnc3 = bnc.CHANGE_INVITE_SETTINGS;
        bnc bnc4 = bnc.HANGOUTS_ON_AIR;
        bnc bnc5 = bnc.GOOGLE_PLUS;
        f15312a = mks.m32257a(5, bnc, bnc2, bnc3, bnc4, bnc5);
    }

    gin(bbm bbm) {
        this.f15313b = bbm;
    }

    public boolean mo615a(int i, bnc bnc) {
        boolean z;
        if (this.f15313b.mo456p(i) && f15312a.contains(bnc)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String valueOf = String.valueOf(bnc);
            glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 25).append("Unicorn blocked feature: ").append(valueOf).toString(), new Object[0]);
        }
        return z;
    }
}
