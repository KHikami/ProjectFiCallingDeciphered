package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: brd */
public final class brd {
    private final Set a;
    private final Set b;
    private String c;
    private String d;
    private final Map e;
    private final Context f;
    private final Map g;
    private int h;
    private Looper i;
    private bqp j;
    private bqz k;
    private final ArrayList l;
    private final ArrayList m;

    public brd(Context context) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.e = new hv();
        this.g = new hv();
        this.h = -1;
        this.j = bqp.c;
        this.k = cny.a;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f = context;
        this.i = context.getMainLooper();
        this.c = context.getPackageName();
        this.d = context.getClass().getName();
    }

    public final brd a(bqy bqy) {
        buf.d((Object) bqy, (Object) "Api must not be null");
        this.g.put(bqy, null);
        bqy.a();
        Collection emptyList = Collections.emptyList();
        this.b.addAll(emptyList);
        this.a.addAll(emptyList);
        return this;
    }

    public final brd a(brf brf) {
        buf.d((Object) brf, (Object) "Listener must not be null");
        this.l.add(brf);
        return this;
    }

    public final brd a(brg brg) {
        buf.d((Object) brg, (Object) "Listener must not be null");
        this.m.add(brg);
        return this;
    }

    public final bue a() {
        coe coe = coe.a;
        if (this.g.containsKey(cny.b)) {
            coe = (coe) this.g.get(cny.b);
        }
        return new bue(null, this.a, this.e, 0, null, this.c, this.d, coe);
    }

    final void a(brs brs, brc brc) {
        int i = this.h;
        buf.d((Object) brc, (Object) "GoogleApiClient instance cannot be null");
        buf.a(brs.Y.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        brs.Y.put(i, new brt(brs, i, brc, null));
        if (brs.a && !brs.W) {
            brc.b();
        }
    }

    public final brc b() {
        buf.b(!this.g.isEmpty(), (Object) "must call addApi() to add at least one API");
        bue a = a();
        Map map = a.d;
        Map hvVar = new hv();
        Map hvVar2 = new hv();
        ArrayList arrayList = new ArrayList();
        for (bqy bqy : this.g.keySet()) {
            Object obj = this.g.get(bqy);
            int i = 0;
            if (map.get(bqy) != null) {
                map.get(bqy);
                i = 2;
            }
            hvVar.put(bqy, Integer.valueOf(i));
            brf bry = new bry(bqy, i);
            arrayList.add(bry);
            hvVar2.put(bqy.b(), bqy.a().a(this.f, this.i, a, obj, bry, bry));
        }
        bue bue = a;
        brc bsq = new bsq(this.f, new ReentrantLock(), this.i, bue, this.j, this.k, hvVar, this.l, this.m, hvVar2, this.h, bsq.a(hvVar2.values(), true), arrayList);
        synchronized (brc.a) {
            brc.a.add(bsq);
        }
        if (this.h >= 0) {
            brs a2 = brs.a(null);
            if (a2 == null) {
                new Handler(this.f.getMainLooper()).post(new bre(this, bsq));
            } else {
                a(a2, bsq);
            }
        }
        return bsq;
    }
}
