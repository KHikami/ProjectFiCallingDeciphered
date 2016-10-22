package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: dvo */
public final class dvo implements iie {
    private static final Set<Integer> e;
    private final dvn a;
    private final mdg b;
    private long c;
    private TimeUnit d;

    static {
        Integer valueOf = Integer.valueOf(2018);
        Integer valueOf2 = Integer.valueOf(2019);
        Integer valueOf3 = Integer.valueOf(1939);
        Integer valueOf4 = Integer.valueOf(1934);
        Integer valueOf5 = Integer.valueOf(2518);
        Integer valueOf6 = Integer.valueOf(2519);
        Object obj = new Integer[]{Integer.valueOf(2232), Integer.valueOf(2233), Integer.valueOf(2678), Integer.valueOf(2906), Integer.valueOf(2697), Integer.valueOf(1524), Integer.valueOf(3248)};
        Object obj2 = new Object[(obj.length + 6)];
        obj2[0] = valueOf;
        obj2[1] = valueOf2;
        obj2[2] = valueOf3;
        obj2[3] = valueOf4;
        obj2[4] = valueOf5;
        obj2[5] = valueOf6;
        System.arraycopy(obj, 0, obj2, 6, obj.length);
        e = mks.a(obj2.length, obj2);
    }

    dvo(dvn dvn) {
        this.a = dvn;
        this.b = new mdg();
        this.b.a = new mcv();
        this.b.a.j = new mcw();
    }

    public iie a() {
        gwb.aJ();
        Context e = this.a.e();
        mdg mdg = this.b;
        if (mdg.a == null) {
            mdg.a = new mcv();
        }
        if (mdg.a.a == null) {
            mdg.a.a = new mcu();
        }
        did y = gwb.y();
        if (y == null) {
            ((dlh) jyn.a(e, dlh.class)).a(mdg.a.a);
        } else {
            y.a(mdg.a.a);
            itl d = dgg.a().d();
            if (d != null) {
                mdg.a.a.d = d.a();
            }
            ith h = dgg.a().h();
            if (h != null) {
                e(h.f());
            }
        }
        return this;
    }

    public iie b() {
        mdg mdg = this.b;
        long f = this.a.f();
        if (mdg.a == null) {
            mdg.a = new mcv();
        }
        if (mdg.a.k == null) {
            mdg.a.k = new mct();
        }
        mdg.a.k.a = Long.valueOf(glj.b() - f);
        return this;
    }

    public iie c() {
        if (this.a.d() != -1) {
            String[] b = fdq.b(this.a.d());
            if (b.length != 0) {
                if (this.b.a == null) {
                    this.b.a = new mcv();
                }
                if (this.b.a.k == null) {
                    this.b.a.k = new mct();
                }
                this.b.a.k.b = b;
            }
        }
        return this;
    }

    public iie a(String str) {
        if (this.b.a.j.c == null) {
            this.b.a.j.c = new mcx();
        }
        this.b.a.j.c.a = str;
        return this;
    }

    public iie a(Integer num) {
        if (this.b.a.j.c == null) {
            this.b.a.j.c = new mcx();
        }
        this.b.a.j.c.b = num;
        return this;
    }

    public iie a(mck mck) {
        this.b.a.j.d = mck;
        return this;
    }

    public iie a(mcm mcm) {
        this.b.a.j.e = mcm;
        return this;
    }

    public iie b(String str) {
        if (this.b.a.a == null) {
            this.b.a.a = new mcu();
        }
        this.b.a.a.i = str;
        return this;
    }

    public iie c(String str) {
        if (this.b.a.a == null) {
            this.b.a.a = new mcu();
        }
        this.b.a.a.j = str;
        return this;
    }

    public iie a(int i) {
        if (this.b.a.j.c == null) {
            this.b.a.j.c = new mcx();
        }
        if (this.b.a.j.c.d == null) {
            this.b.a.j.c.d = new mcy();
        }
        this.b.a.j.c.d.a = Integer.valueOf(i);
        return this;
    }

    public iie b(int i) {
        if (this.b.a.j.c == null) {
            this.b.a.j.c = new mcx();
        }
        this.b.a.j.c.e = Integer.valueOf(i);
        return this;
    }

    public iie a(mcl mcl) {
        this.b.a.j.f = mcl;
        return this;
    }

    public iie a(mda mda) {
        this.b.a.j.g = mda;
        return this;
    }

    public iie a(mcn mcn) {
        this.b.a.j.h = mcn;
        return this;
    }

    public iie a(mcq mcq) {
        this.b.a.j.j = mcq;
        return this;
    }

    public iie a(mdb mdb) {
        this.b.a.j.k = mdb;
        return this;
    }

    public iie a(mcr mcr) {
        this.b.a.j.l = mcr;
        return this;
    }

    public iie d(String str) {
        if (this.b.a == null) {
            this.b.a = new mcv();
        }
        if (this.b.a.a == null) {
            this.b.a.a = new mcu();
        }
        this.b.a.a.h = str;
        return this;
    }

    public iie e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.b.a == null) {
                this.b.a = new mcv();
            }
            if (this.b.a.a == null) {
                this.b.a.a = new mcu();
            }
            this.b.a.a.e = str;
        }
        return this;
    }

    public iie a(mco mco) {
        this.b.a.j.m = mco;
        return this;
    }

    public iie a(long j, TimeUnit timeUnit) {
        this.c = 1;
        this.d = timeUnit;
        return this;
    }

    public void c(int i) {
        this.b.a.j.a = Integer.valueOf(i);
        if (!(this.b.a.j.c == null || this.b.a.j.c.a == null || e.contains(Integer.valueOf(i)))) {
            iil.a("Impression " + i + " is not permitted to transmit extra data.");
        }
        if (this.c <= 0 || ((ful) jyn.a(this.a.e(), ful.class)).a(this.a.d(), i, this.d.toSeconds(this.c))) {
            int i2;
            this.b.e = gwb.t(this.a.e());
            mcv mcv = this.b.a;
            Context e = this.a.e();
            if (mcv.i == null) {
                mcv.i = new llj();
            }
            mcv.i.v = ((gmp) jyn.a(e, gmp.class)).c();
            mcw mcw = this.b.a.j;
            switch (this.a.e().getResources().getConfiguration().orientation) {
                case wi.j /*1*/:
                    i2 = 1;
                    break;
                case wi.l /*2*/:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (mcw.c == null) {
                    mcw.c = new mcx();
                }
                mcw.c.c = Integer.valueOf(i2);
            }
            mcv mcv2 = this.b.a;
            Context e2 = this.a.e();
            int d = this.a.d();
            if (d != -1) {
                bbm bbm = (bbm) jyn.a(e2, bbm.class);
                if (mcv2.a == null) {
                    mcv2.a = new mcu();
                }
                mcv2.a.h = bbm.a(d);
            }
            this.a.a(this.b);
            if (glk.a("Babel_RtcImpressions", 3)) {
                glk.a("Babel_RtcImpressions", this.b.toString(), new Object[0]);
                glk.a("Babel_RtcImpressions", "Type: " + i, new Object[0]);
            }
        }
    }
}
