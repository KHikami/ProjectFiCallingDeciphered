package defpackage;

import android.content.Context;

/* renamed from: ftt */
final class ftt extends jgc {
    private final int a;
    private final jmq b;

    public ftt(Context context, int i) {
        super(context, "Babel_Sign_out");
        this.a = i;
        this.b = (jmq) jyn.a(context, jmq.class);
    }

    protected jgz c() {
        this.b.a(this.a);
        jgz jgz = new jgz(true);
        jgz.d().putInt("account_id", this.a);
        return jgz;
    }
}
