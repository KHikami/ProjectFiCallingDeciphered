package p000;

import android.content.Context;

final class ftt extends jgc {
    private final int f13985a;
    private final jmq f13986b;

    public ftt(Context context, int i) {
        super(context, "Babel_Sign_out");
        this.f13985a = i;
        this.f13986b = (jmq) jyn.m25426a(context, jmq.class);
    }

    protected jgz mo2093c() {
        this.f13986b.mo3571a(this.f13985a);
        jgz jgz = new jgz(true);
        jgz.m24192d().putInt("account_id", this.f13985a);
        return jgz;
    }
}
