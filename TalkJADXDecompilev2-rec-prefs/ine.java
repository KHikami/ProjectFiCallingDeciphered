package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

final class ine {
    final ijn f18109a;
    final itg f18110b;
    final ijt f18111c;
    final inh f18112d;
    final List<ini> f18113e = new CopyOnWriteArrayList();
    final Object f18114f = new Object();
    boolean f18115g = false;
    public final Map<String, ind> f18116h = new LinkedHashMap();
    final Set<ind> f18117i = new LinkedHashSet();
    final Set<ind> f18118j = new LinkedHashSet();
    final Set<ind> f18119k = new LinkedHashSet();
    final ind f18120l;
    ind f18121m;
    ind f18122n;
    boolean f18123o;
    boolean f18124p;
    private final Runnable f18125q = new inf(this);

    ine(ijn ijn) {
        this.f18109a = ijn;
        this.f18110b = ijn.m21973k();
        this.f18111c = ijn.m21967e();
        ((ijd) ijn.mo3229t().m21926a(ijd.class)).mo3363a(new ing(this));
        this.f18112d = new inh(this);
        this.f18111c.m22037a(this.f18112d);
        this.f18120l = new ind(ijn);
    }

    public void m22339a() {
        this.f18111c.m22056b(this.f18112d);
    }

    public void m22341a(ini ini) {
        this.f18113e.add(ini);
    }

    public void m22344b(ini ini) {
        this.f18113e.remove(ini);
    }

    public List<ind> m22342b() {
        return new ArrayList(this.f18116h.values());
    }

    public ind m22345c() {
        return this.f18122n;
    }

    public ind m22346d() {
        return this.f18120l;
    }

    public ind m22338a(String str) {
        return (ind) this.f18116h.get(str);
    }

    public void m22347e() {
        ind ind = this.f18122n;
        this.f18122n = null;
        if (this.f18121m != null && !this.f18121m.m22336d()) {
            this.f18122n = this.f18121m;
        } else if (ind == null || ind.m22336d() || !this.f18116h.containsKey(ind.m22332a())) {
            for (ind ind2 : this.f18116h.values()) {
                if (!ind2.m22336d()) {
                    this.f18122n = ind2;
                    break;
                }
            }
        } else {
            this.f18122n = ind;
        }
        if (this.f18122n == null) {
            this.f18122n = this.f18120l;
        }
        if (ind != this.f18122n) {
            m22340a(ind);
            m22340a(this.f18122n);
            synchronized (this.f18114f) {
                this.f18123o = true;
                m22348f();
            }
            Iterator it = this.f18113e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    void m22340a(ind ind) {
        boolean z = true;
        if (ind != null) {
            boolean z2;
            itl b = ind.m22334b();
            if (ind == this.f18121m) {
                z2 = true;
            } else {
                z2 = false;
            }
            b.m23237d(z2);
            if (ind != this.f18122n) {
                z = false;
            }
            b.m23239e(z);
            ind.m22337e();
        }
    }

    void m22343b(ind ind) {
        synchronized (this.f18114f) {
            this.f18118j.add(ind);
            m22348f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m22348f() {
        synchronized (this.f18114f) {
            if (this.f18124p) {
            } else if (!this.f18115g) {
                this.f18115g = true;
                gwb.m1865a(this.f18125q, true);
            }
        }
    }
}
