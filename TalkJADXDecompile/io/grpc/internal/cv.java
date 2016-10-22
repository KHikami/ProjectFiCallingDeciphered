package io.grpc.internal;

import bm;
import java.util.IdentityHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class cv {
    static final cv a;
    final IdentityHashMap<cy<?>, cx> b;
    ScheduledExecutorService c;
    private final cz d;

    static {
        a = new cv(new cz());
    }

    private cv(cz czVar) {
        this.b = new IdentityHashMap();
        this.d = czVar;
    }

    public static <T> T a(cy<T> cyVar, T t) {
        return a.b(cyVar, t);
    }

    synchronized <T> T a(cy<T> cyVar) {
        cx cxVar;
        cxVar = (cx) this.b.get(cyVar);
        if (cxVar == null) {
            cxVar = new cx(cyVar.a());
            this.b.put(cyVar, cxVar);
        }
        if (cxVar.c != null) {
            cxVar.c.cancel(false);
            cxVar.c = null;
        }
        cxVar.b++;
        return cxVar.a;
    }

    private synchronized <T> T b(cy<T> cyVar, T t) {
        boolean z = true;
        synchronized (this) {
            cx cxVar = (cx) this.b.get(cyVar);
            if (cxVar == null) {
                String valueOf = String.valueOf(cyVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 29).append("No cached instance found for ").append(valueOf).toString());
            }
            boolean z2;
            bm.a(t == cxVar.a, (Object) "Releasing the wrong instance");
            if (cxVar.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bm.b(z2, (Object) "Refcount has already reached zero");
            cxVar.b--;
            if (cxVar.b == 0) {
                if (bi.a) {
                    cyVar.a(t);
                    this.b.remove(cyVar);
                } else {
                    if (cxVar.c != null) {
                        z = false;
                    }
                    bm.b(z, (Object) "Destroy task already scheduled");
                    if (this.c == null) {
                        this.c = this.d.a();
                    }
                    cxVar.c = this.c.schedule(new bq(new cw(this, cxVar, cyVar, t)), 1, TimeUnit.SECONDS);
                }
            }
        }
        return null;
    }
}
