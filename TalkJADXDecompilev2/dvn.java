package defpackage;

import android.content.Context;

public final class dvn implements iid {
    private static final boolean a = false;
    private gti b;
    private gti c;
    private long d;
    private int e;
    private final Context f;

    static {
        kae kae = glk.c;
    }

    public dvn(Context context, String str, int i) {
        this(dvn.a(context, "HANGOUT_LOG_REQUEST", str), dvn.a(context, "SOCIAL_AFFINITY", str), i, context);
    }

    private dvn(gti gti, gti gti2, int i, Context context) {
        this.b = gti;
        this.c = gti2;
        this.e = i;
        this.d = glj.b();
        this.f = context;
    }

    public void a() {
        this.d = glj.b();
    }

    public void a(mdg mdg) {
        gtk a = this.b.a(nzf.a((nzf) mdg));
        if (!(mdg.a == null || mdg.a.j == null || gwb.a(mdg.a.j.a) == 0)) {
            a.a(gwb.a(mdg.a.j.a));
        }
        a.a();
        if (a) {
            mdg.toString();
        }
    }

    public void a(pbm pbm) {
        this.c.a(nzf.a((nzf) pbm)).a();
        if (a) {
            pbm.toString();
        }
    }

    public iie b() {
        return new dvo(this);
    }

    public iii c() {
        return new dvp(this, this.f);
    }

    int d() {
        return this.e;
    }

    Context e() {
        return this.f;
    }

    long f() {
        return this.d;
    }

    private static gti a(Context context, String str, String str2) {
        return new gti(context.getApplicationContext(), str, str2);
    }
}
