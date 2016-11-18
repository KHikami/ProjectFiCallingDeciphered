package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dvo implements iie {
    private static final Set<Integer> f10637e;
    private final dvn f10638a;
    private final mdg f10639b = new mdg();
    private long f10640c;
    private TimeUnit f10641d;

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
        f10637e = mks.m32257a(obj2.length, obj2);
    }

    dvo(dvn dvn) {
        this.f10638a = dvn;
    }

    public iie mo1695a() {
        gwb.aJ();
        Context e = this.f10638a.m12817e();
        mdg mdg = this.f10639b;
        if (mdg.f27447a == null) {
            mdg.f27447a = new mcv();
        }
        if (mdg.f27447a.f27386a == null) {
            mdg.f27447a.f27386a = new mcu();
        }
        did y = gwb.m2393y();
        if (y == null) {
            ((dlh) jyn.m25426a(e, dlh.class)).mo1411a(mdg.f27447a.f27386a);
        } else {
            y.m11969a(mdg.f27447a.f27386a);
            itl d = dgg.m11692a().m11711d();
            if (d != null) {
                mdg.f27447a.f27386a.f27377d = d.m23229a();
            }
            ith h = dgg.m11692a().m11716h();
            if (h != null) {
                mo1716e(h.m23214f());
            }
        }
        return this;
    }

    public iie mo1709b() {
        mdg mdg = this.f10639b;
        long f = this.f10638a.m12818f();
        if (mdg.f27447a == null) {
            mdg.f27447a = new mcv();
        }
        if (mdg.f27447a.f27396k == null) {
            mdg.f27447a.f27396k = new mct();
        }
        mdg.f27447a.f27396k.f27367a = Long.valueOf(glj.m17963b() - f);
        return this;
    }

    public iie mo1712c() {
        if (this.f10638a.m12816d() != -1) {
            String[] b = fdq.m15092b(this.f10638a.m12816d());
            if (b.length != 0) {
                if (this.f10639b.f27447a == null) {
                    this.f10639b.f27447a = new mcv();
                }
                if (this.f10639b.f27447a.f27396k == null) {
                    this.f10639b.f27447a.f27396k = new mct();
                }
                this.f10639b.f27447a.f27396k.f27368b = b;
            }
        }
        return this;
    }

    public iie mo1699a(String str) {
        if (this.f10639b.f27447a.f27395j.f27402c == null) {
            this.f10639b.f27447a.f27395j.f27402c = new mcx();
        }
        this.f10639b.f27447a.f27395j.f27402c.f27413a = str;
        return this;
    }

    public iie mo1698a(Integer num) {
        if (this.f10639b.f27447a.f27395j.f27402c == null) {
            this.f10639b.f27447a.f27395j.f27402c = new mcx();
        }
        this.f10639b.f27447a.f27395j.f27402c.f27414b = num;
        return this;
    }

    public iie mo1700a(mck mck) {
        this.f10639b.f27447a.f27395j.f27403d = mck;
        return this;
    }

    public iie mo1702a(mcm mcm) {
        this.f10639b.f27447a.f27395j.f27404e = mcm;
        return this;
    }

    public iie mo1711b(String str) {
        if (this.f10639b.f27447a.f27386a == null) {
            this.f10639b.f27447a.f27386a = new mcu();
        }
        this.f10639b.f27447a.f27386a.f27382i = str;
        return this;
    }

    public iie mo1713c(String str) {
        if (this.f10639b.f27447a.f27386a == null) {
            this.f10639b.f27447a.f27386a = new mcu();
        }
        this.f10639b.f27447a.f27386a.f27383j = str;
        return this;
    }

    public iie mo1696a(int i) {
        if (this.f10639b.f27447a.f27395j.f27402c == null) {
            this.f10639b.f27447a.f27395j.f27402c = new mcx();
        }
        if (this.f10639b.f27447a.f27395j.f27402c.f27416d == null) {
            this.f10639b.f27447a.f27395j.f27402c.f27416d = new mcy();
        }
        this.f10639b.f27447a.f27395j.f27402c.f27416d.f27418a = Integer.valueOf(i);
        return this;
    }

    public iie mo1710b(int i) {
        if (this.f10639b.f27447a.f27395j.f27402c == null) {
            this.f10639b.f27447a.f27395j.f27402c = new mcx();
        }
        this.f10639b.f27447a.f27395j.f27402c.f27417e = Integer.valueOf(i);
        return this;
    }

    public iie mo1701a(mcl mcl) {
        this.f10639b.f27447a.f27395j.f27405f = mcl;
        return this;
    }

    public iie mo1707a(mda mda) {
        this.f10639b.f27447a.f27395j.f27406g = mda;
        return this;
    }

    public iie mo1703a(mcn mcn) {
        this.f10639b.f27447a.f27395j.f27407h = mcn;
        return this;
    }

    public iie mo1705a(mcq mcq) {
        this.f10639b.f27447a.f27395j.f27409j = mcq;
        return this;
    }

    public iie mo1708a(mdb mdb) {
        this.f10639b.f27447a.f27395j.f27410k = mdb;
        return this;
    }

    public iie mo1706a(mcr mcr) {
        this.f10639b.f27447a.f27395j.f27411l = mcr;
        return this;
    }

    public iie mo1715d(String str) {
        if (this.f10639b.f27447a == null) {
            this.f10639b.f27447a = new mcv();
        }
        if (this.f10639b.f27447a.f27386a == null) {
            this.f10639b.f27447a.f27386a = new mcu();
        }
        this.f10639b.f27447a.f27386a.f27381h = str;
        return this;
    }

    public iie mo1716e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f10639b.f27447a == null) {
                this.f10639b.f27447a = new mcv();
            }
            if (this.f10639b.f27447a.f27386a == null) {
                this.f10639b.f27447a.f27386a = new mcu();
            }
            this.f10639b.f27447a.f27386a.f27378e = str;
        }
        return this;
    }

    public iie mo1704a(mco mco) {
        this.f10639b.f27447a.f27395j.f27412m = mco;
        return this;
    }

    public iie mo1697a(long j, TimeUnit timeUnit) {
        this.f10640c = 1;
        this.f10641d = timeUnit;
        return this;
    }

    public void mo1714c(int i) {
        this.f10639b.f27447a.f27395j.f27400a = Integer.valueOf(i);
        if (!(this.f10639b.f27447a.f27395j.f27402c == null || this.f10639b.f27447a.f27395j.f27402c.f27413a == null || f10637e.contains(Integer.valueOf(i)))) {
            iil.m21870a("Impression " + i + " is not permitted to transmit extra data.");
        }
        if (this.f10640c <= 0 || ((ful) jyn.m25426a(this.f10638a.m12817e(), ful.class)).m16265a(this.f10638a.m12816d(), i, this.f10641d.toSeconds(this.f10640c))) {
            int i2;
            this.f10639b.f27451e = gwb.m2357t(this.f10638a.m12817e());
            mcv mcv = this.f10639b.f27447a;
            Context e = this.f10638a.m12817e();
            if (mcv.f27394i == null) {
                mcv.f27394i = new llj();
            }
            mcv.f27394i.f25367v = ((gmp) jyn.m25426a(e, gmp.class)).mo2300c();
            mcw mcw = this.f10639b.f27447a.f27395j;
            switch (this.f10638a.m12817e().getResources().getConfiguration().orientation) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (mcw.f27402c == null) {
                    mcw.f27402c = new mcx();
                }
                mcw.f27402c.f27415c = Integer.valueOf(i2);
            }
            mcv mcv2 = this.f10639b.f27447a;
            Context e2 = this.f10638a.m12817e();
            int d = this.f10638a.m12816d();
            if (d != -1) {
                bbm bbm = (bbm) jyn.m25426a(e2, bbm.class);
                if (mcv2.f27386a == null) {
                    mcv2.f27386a = new mcu();
                }
                mcv2.f27386a.f27381h = bbm.mo440a(d);
            }
            this.f10638a.mo1691a(this.f10639b);
            if (glk.m17973a("Babel_RtcImpressions", 3)) {
                glk.m17970a("Babel_RtcImpressions", this.f10639b.toString(), new Object[0]);
                glk.m17970a("Babel_RtcImpressions", "Type: " + i, new Object[0]);
            }
        }
    }
}
