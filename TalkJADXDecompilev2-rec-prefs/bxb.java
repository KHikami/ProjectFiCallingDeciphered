package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public final class bxb implements bto {
    static final long f4711a = TimeUnit.SECONDS.toMillis(30);
    buc f4712b;
    private final Context f4713c;
    private final gkq<bxh> f4714d;
    private boolean f4715e;
    private wt<btf> f4716f;
    private bos f4717g;
    private final Observer f4718h = new bxc(this);

    public bxb(Context context) {
        this.f4713c = context;
        this.f4714d = new gkq();
    }

    public void m6867a(wt<btf> wtVar, buc buc, gln gln) {
        this.f4716f = wtVar;
        this.f4712b = buc;
        this.f4715e = true;
        m6866a(gln.m17986a());
        gln.addObserver(this.f4718h);
    }

    void m6866a(String str) {
        this.f4717g = ((bor) jyn.m25426a(this.f4713c, bor.class)).m6320a(str);
        ((gie) jyn.m25426a(this.f4713c, gie.class)).mo2274a(boq.class, new bxg(this), boq.m6318a(str)).mo2274a(fqk.class, new bxe(this), fqk.m15965a(str)).mo2274a(fql.class, new bxf(this), fql.m15966a(str));
    }

    public List<edo> mo770a(long j, long j2) {
        ba.m4610b(this.f4715e, (Object) "Must be initialized before using.");
        List<edo> arrayList = new ArrayList();
        for (fqj b : this.f4717g.m6323a(j, j2)) {
            edo b2 = b.m15831b();
            bxh d = m6871d(b2);
            if (!(d.f4725a || d.f4726b)) {
                arrayList.add(b2);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            for (Entry entry : this.f4714d.entrySet()) {
                bxh bxh = (bxh) entry.getValue();
                if (bxh.f4725a || bxh.f4726b) {
                    arrayList.add((edo) entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public boolean mo771a(edo edo) {
        ba.m4610b(this.f4715e, (Object) "Must be initialized before using.");
        return this.f4714d.containsKey(edo) && ((bxh) this.f4714d.get(edo)).f4725a;
    }

    public boolean mo772b(edo edo) {
        ba.m4610b(this.f4715e, (Object) "Must be initialized before using.");
        return this.f4714d.containsKey(edo) && ((bxh) this.f4714d.get(edo)).f4726b;
    }

    public boolean mo773c(edo edo) {
        ba.m4610b(this.f4715e, (Object) "Must be initialized before using.");
        return this.f4714d.containsKey(edo) && (((bxh) this.f4714d.get(edo)).f4725a || ((bxh) this.f4714d.get(edo)).f4726b);
    }

    int m6864a(long j) {
        if (this.f4716f.a() == 0 || j < ((btf) this.f4716f.a(this.f4716f.a() - 1)).f4394g) {
            return -1;
        }
        if (j >= ((btf) this.f4716f.a(0)).f4394g) {
            return 0;
        }
        int a = this.f4716f.a() - 1;
        int i = 0;
        while (i <= a) {
            int i2;
            int i3 = (i + a) >>> 1;
            long j2 = ((btf) this.f4716f.a(i3)).f4394g;
            long j3 = i3 > 0 ? ((btf) this.f4716f.a(i3 - 1)).f4394g : Long.MAX_VALUE;
            if (j2 > j || j >= j3) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0) {
                return i3;
            }
            if (j < ((btf) this.f4716f.a(i3)).f4394g) {
                i = i3 + 1;
            } else {
                a = i3 - 1;
            }
        }
        return -1;
    }

    bxh m6871d(edo edo) {
        if (!this.f4714d.containsKey(edo)) {
            this.f4714d.put(edo, new bxh());
        }
        return (bxh) this.f4714d.get(edo);
    }
}
