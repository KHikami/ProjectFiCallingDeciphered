package io.grpc.internal;

import a;
import bm;
import gwb;
import iyr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import ojm;
import okw;
import olh;
import olv;

final class ag implements ca {
    final Object a;
    cb b;
    Collection<am> c;
    boolean d;
    private final Executor e;
    private volatile iyr f;
    private Collection<ak> g;
    private olv h;

    ag(Executor executor) {
        this.a = new Object();
        this.c = new LinkedHashSet();
        this.g = new ArrayList();
        this.e = executor;
    }

    public Runnable a(cb cbVar) {
        this.b = (cb) bm.a((Object) cbVar, (Object) "listener");
        return null;
    }

    public x a(olh<?, ?> olh___, okw okw, ojm ojm) {
        iyr iyr = this.f;
        if (iyr == null) {
            synchronized (this.a) {
                iyr = this.f;
                if (iyr != null || this.d) {
                } else if (this.h == null || ojm.g()) {
                    r0 = new am(this, olh___, okw, ojm);
                    this.c.add(r0);
                    if (this.c.size() == 1) {
                        this.b.a(true);
                    }
                    return r0;
                } else {
                    r0 = new be(this.h);
                    return r0;
                }
            }
        }
        if (iyr != null) {
            return ((y) iyr.a()).a(olh___, okw, ojm);
        }
        return new be(olv.q.a("transport shutdown"));
    }

    public void a(a aVar, Executor executor) {
        iyr iyr = this.f;
        if (iyr == null) {
            synchronized (this.a) {
                iyr = this.f;
                if (iyr != null || this.d) {
                } else {
                    this.g.add(new ak(aVar, executor));
                    return;
                }
            }
        }
        if (iyr != null) {
            ((y) iyr.a()).a(aVar, executor);
        } else {
            executor.execute(new ah(this, aVar));
        }
    }

    public void a() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.a(olv.q.a("Channel requested transport to shut down"));
            if (this.c == null || this.c.isEmpty()) {
                this.c = null;
                this.b.a();
            }
        }
    }

    public void a(olv olv) {
        Collection collection = null;
        a();
        synchronized (this.a) {
            if (this.c != null) {
                collection = this.c;
                this.c = null;
            }
        }
        if (r0 != null) {
            for (am b : r0) {
                b.b(olv);
            }
            this.b.a();
        }
    }

    public void a(y yVar) {
        bm.a(this != yVar, (Object) "delayed transport calling setTransport on itself");
        a(gwb.Q((Object) yVar));
    }

    public void a(iyr iyr) {
        synchronized (this.a) {
            if (this.f != null) {
                return;
            }
            bm.b(this.b != null, (Object) "start() not called");
            this.f = (iyr) bm.a((Object) iyr, (Object) "supplier");
            for (ak a : this.g) {
                a.a((y) iyr.a());
            }
            this.g = null;
            if (this.d && this.c != null) {
                this.b.a();
            }
            if (!(this.c == null || this.c.isEmpty())) {
                this.e.execute(new ai(this, this.c, iyr));
            }
            this.c = null;
            if (!this.d) {
                this.b.b();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = (this.c == null || this.c.isEmpty()) ? false : true;
        }
        return z;
    }

    void b(olv olv) {
        synchronized (this.a) {
            bm.b(this.h == null);
            this.h = olv.q.a("Channel in TRANSIENT_FAILURE state").b(olv.e());
            ArrayList arrayList = new ArrayList();
            if (!(this.c == null || this.c.isEmpty())) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    am amVar = (am) it.next();
                    if (!amVar.a.g()) {
                        arrayList.add(amVar);
                        it.remove();
                    }
                }
                this.e.execute(new aj(this, arrayList, olv));
            }
        }
    }

    void d() {
        synchronized (this.a) {
            this.h = null;
        }
    }

    public String c() {
        return bi.a((dl) this);
    }
}
