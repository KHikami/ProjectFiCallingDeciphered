package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ine */
final class ine {
    final ijn a;
    final itg b;
    final ijt c;
    final inh d;
    final List<ini> e;
    final Object f;
    boolean g;
    public final Map<String, ind> h;
    final Set<ind> i;
    final Set<ind> j;
    final Set<ind> k;
    final ind l;
    ind m;
    ind n;
    boolean o;
    boolean p;
    private final Runnable q;

    ine(ijn ijn) {
        this.e = new CopyOnWriteArrayList();
        this.f = new Object();
        this.g = false;
        this.h = new LinkedHashMap();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.q = new inf(this);
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

    void f() {
        synchronized (this.f) {
            if (this.p) {
                return;
            }
            if (!this.g) {
                this.g = true;
                gwb.a(this.q, true);
            }
        }
    }
}
