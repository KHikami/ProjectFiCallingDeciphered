package defpackage;

import android.content.Context;

public class coj extends fhb implements bhi, bhj, bhm {
    private final int a;
    private final String b;
    private final String g = blo.i();

    public coj(bko bko, String str, int i) {
        super(bko);
        this.a = i;
        this.b = str;
    }

    public int a(Context context, bhb bhb) {
        blo blo = new blo(context, this.c.a);
        blo.a();
        try {
            new flh(this.b, this.c.b.b(), blo.M(this.b), -1, this.g, null, this.a, fwx.QUEUED).b(blo);
            blo.b();
            t_();
            blf.d(blo, this.b);
            return bhn.a;
        } finally {
            blo.c();
        }
    }

    public String b() {
        return this.b;
    }

    public bhk c() {
        return bhk.NONE;
    }

    void t_() {
        if (!blo.a(this.b)) {
            this.c.c.a(new coh(this.g, this.b, this.a), -1);
        }
    }
}
