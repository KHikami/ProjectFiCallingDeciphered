package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

final class ine {
    final ijn a;
    final itg b;
    final ijt c;
    final inh d;
    final List<ini> e = new CopyOnWriteArrayList();
    final Object f = new Object();
    boolean g = false;
    public final Map<String, ind> h = new LinkedHashMap();
    final Set<ind> i = new LinkedHashSet();
    final Set<ind> j = new LinkedHashSet();
    final Set<ind> k = new LinkedHashSet();
    final ind l;
    ind m;
    ind n;
    boolean o;
    boolean p;
    private final Runnable q = new inf(this);

    ine(ijn ijn) {
        this.a = ijn;
        this.b = ijn.k();
        this.c = ijn.e();
        ((ijd) ijn.t().a(ijd.class)).a(new ing(this));
        this.d = new inh(this);
        this.c.a(this.d);
        this.l = new ind(ijn);
    }

    public void a() {
        this.c.b(this.d);
    }

    public void a(ini ini) {
        this.e.add(ini);
    }

    public void b(ini ini) {
        this.e.remove(ini);
    }

    public List<ind> b() {
        return new ArrayList(this.h.values());
    }

    public ind c() {
        return this.n;
    }

    public ind d() {
        return this.l;
    }

    public ind a(String str) {
        return (ind) this.h.get(str);
    }

    public void e() {
        ind ind = this.n;
        this.n = null;
        if (this.m != null && !this.m.d()) {
            this.n = this.m;
        } else if (ind == null || ind.d() || !this.h.containsKey(ind.a())) {
            for (ind ind2 : this.h.values()) {
                if (!ind2.d()) {
                    this.n = ind2;
                    break;
                }
            }
        } else {
            this.n = ind;
        }
        if (this.n == null) {
            this.n = this.l;
        }
        if (ind != this.n) {
            a(ind);
            a(this.n);
            synchronized (this.f) {
                this.o = true;
                f();
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    void a(ind ind) {
        boolean z = true;
        if (ind != null) {
            boolean z2;
            itl b = ind.b();
            if (ind == this.m) {
                z2 = true;
            } else {
                z2 = false;
            }
            b.d(z2);
            if (ind != this.n) {
                z = false;
            }
            b.e(z);
            ind.e();
        }
    }

    void b(ind ind) {
        synchronized (this.f) {
            this.j.add(ind);
            f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void f() {
        /*
        r3 = this;
        r1 = r3.f;
        monitor-enter(r1);
        r0 = r3.p;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r3.g;	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0016;
    L_0x000d:
        r0 = 1;
        r3.g = r0;	 Catch:{ all -> 0x0018 }
        r0 = r3.q;	 Catch:{ all -> 0x0018 }
        r2 = 1;
        defpackage.gwb.a(r0, r2);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x0008;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ine.f():void");
    }
}
