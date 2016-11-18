package p000;

import android.content.Context;

public final class dvn implements iid {
    private static final boolean f10631a = false;
    private gti f10632b;
    private gti f10633c;
    private long f10634d;
    private int f10635e;
    private final Context f10636f;

    static {
        kae kae = glk.f15556c;
    }

    public dvn(Context context, String str, int i) {
        this(dvn.m12810a(context, "HANGOUT_LOG_REQUEST", str), dvn.m12810a(context, "SOCIAL_AFFINITY", str), i, context);
    }

    private dvn(gti gti, gti gti2, int i, Context context) {
        this.f10632b = gti;
        this.f10633c = gti2;
        this.f10635e = i;
        this.f10634d = glj.m17963b();
        this.f10636f = context;
    }

    public void mo1690a() {
        this.f10634d = glj.m17963b();
    }

    public void mo1691a(mdg mdg) {
        gtk a = this.f10632b.m18526a(nzf.m1029a((nzf) mdg));
        if (!(mdg.f27447a == null || mdg.f27447a.f27395j == null || gwb.m1507a(mdg.f27447a.f27395j.f27400a) == 0)) {
            a.m18533a(gwb.m1507a(mdg.f27447a.f27395j.f27400a));
        }
        a.m18534a();
        if (f10631a) {
            mdg.toString();
        }
    }

    public void mo1692a(pbm pbm) {
        this.f10633c.m18526a(nzf.m1029a((nzf) pbm)).m18534a();
        if (f10631a) {
            pbm.toString();
        }
    }

    public iie mo1693b() {
        return new dvo(this);
    }

    public iii mo1694c() {
        return new dvp(this, this.f10636f);
    }

    int m12816d() {
        return this.f10635e;
    }

    Context m12817e() {
        return this.f10636f;
    }

    long m12818f() {
        return this.f10634d;
    }

    private static gti m12810a(Context context, String str, String str2) {
        return new gti(context.getApplicationContext(), str, str2);
    }
}
