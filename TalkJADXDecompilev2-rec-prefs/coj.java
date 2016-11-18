package p000;

import android.content.Context;

public class coj extends fhb implements bhi, bhj, bhm {
    private final int f5828a;
    private final String f5829b;
    private final String f5830g = blo.m5900i();

    public coj(bko bko, String str, int i) {
        super(bko);
        this.f5828a = i;
        this.f5829b = str;
    }

    public int mo539a(Context context, bhb bhb) {
        blo blo = new blo(context, this.f5736c.f12721a);
        blo.m5958a();
        try {
            new flh(this.f5829b, this.f5736c.f12722b.m5632b(), blo.m5921M(this.f5829b), -1, this.f5830g, null, this.f5828a, fwx.QUEUED).m15635b(blo);
            blo.m6015b();
            t_();
            blf.m5821d(blo, this.f5829b);
            return bhn.f3348a;
        } finally {
            blo.m6028c();
        }
    }

    public String mo542b() {
        return this.f5829b;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    void t_() {
        if (!blo.m5871a(this.f5829b)) {
            this.f5736c.f12723c.m15078a(new coh(this.f5830g, this.f5829b, this.f5828a), -1);
        }
    }
}
