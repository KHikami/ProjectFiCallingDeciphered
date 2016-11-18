package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public final class bxb implements bto {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    buc b;
    private final Context c;
    private final gkq<bxh> d;
    private boolean e;
    private wt<btf> f;
    private bos g;
    private final Observer h = new bxc(this);

    public bxb(Context context) {
        this.c = context;
        this.d = new gkq();
    }

    public void a(wt<btf> wtVar, buc buc, gln gln) {
        this.f = wtVar;
        this.b = buc;
        this.e = true;
        a(gln.a());
        gln.addObserver(this.h);
    }

    void a(String str) {
        this.g = ((bor) jyn.a(this.c, bor.class)).a(str);
        ((gie) jyn.a(this.c, gie.class)).a(boq.class, new bxg(this), boq.a(str)).a(fqk.class, new bxe(this), fqk.a(str)).a(fql.class, new bxf(this), fql.a(str));
    }

    public List<edo> a(long j, long j2) {
        ba.b(this.e, (Object) "Must be initialized before using.");
        List<edo> arrayList = new ArrayList();
        for (fqj b : this.g.a(j, j2)) {
            edo b2 = b.b();
            bxh d = d(b2);
            if (!(d.a || d.b)) {
                arrayList.add(b2);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            for (Entry entry : this.d.entrySet()) {
                bxh bxh = (bxh) entry.getValue();
                if (bxh.a || bxh.b) {
                    arrayList.add((edo) entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public boolean a(edo edo) {
        ba.b(this.e, (Object) "Must be initialized before using.");
        return this.d.containsKey(edo) && ((bxh) this.d.get(edo)).a;
    }

    public boolean b(edo edo) {
        ba.b(this.e, (Object) "Must be initialized before using.");
        return this.d.containsKey(edo) && ((bxh) this.d.get(edo)).b;
    }

    public boolean c(edo edo) {
        ba.b(this.e, (Object) "Must be initialized before using.");
        return this.d.containsKey(edo) && (((bxh) this.d.get(edo)).a || ((bxh) this.d.get(edo)).b);
    }

    int a(long j) {
        if (this.f.a() == 0 || j < ((btf) this.f.a(this.f.a() - 1)).g) {
            return -1;
        }
        if (j >= ((btf) this.f.a(0)).g) {
            return 0;
        }
        int a = this.f.a() - 1;
        int i = 0;
        while (i <= a) {
            int i2;
            int i3 = (i + a) >>> 1;
            long j2 = ((btf) this.f.a(i3)).g;
            long j3 = i3 > 0 ? ((btf) this.f.a(i3 - 1)).g : Long.MAX_VALUE;
            if (j2 > j || j >= j3) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0) {
                return i3;
            }
            if (j < ((btf) this.f.a(i3)).g) {
                i = i3 + 1;
            } else {
                a = i3 - 1;
            }
        }
        return -1;
    }

    bxh d(edo edo) {
        if (!this.d.containsKey(edo)) {
            this.d.put(edo, new bxh());
        }
        return (bxh) this.d.get(edo);
    }
}
