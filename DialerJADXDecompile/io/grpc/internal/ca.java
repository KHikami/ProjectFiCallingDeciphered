package io.grpc.internal;

import cob;
import java.util.IdentityHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class ca {
    public static final ca a;
    final IdentityHashMap b;
    ScheduledExecutorService c;
    private final ce d;

    static {
        a = new ca(new ce());
    }

    private ca(ce ceVar) {
        this.b = new IdentityHashMap();
        this.d = ceVar;
    }

    public final synchronized Object a(cd cdVar) {
        cc ccVar;
        ccVar = (cc) this.b.get(cdVar);
        if (ccVar == null) {
            ccVar = new cc(cdVar.a());
            this.b.put(cdVar, ccVar);
        }
        if (ccVar.c != null) {
            ccVar.c.cancel(false);
            ccVar.c = null;
        }
        ccVar.b++;
        return ccVar.a;
    }

    public final synchronized Object a(cd cdVar, Object obj) {
        boolean z = true;
        synchronized (this) {
            cc ccVar = (cc) this.b.get(cdVar);
            if (ccVar == null) {
                String valueOf = String.valueOf(cdVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 29).append("No cached instance found for ").append(valueOf).toString());
            }
            boolean z2;
            cob.a(obj == ccVar.a, (Object) "Releasing the wrong instance");
            if (ccVar.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            cob.b(z2, (Object) "Refcount has already reached zero");
            ccVar.b--;
            if (ccVar.b == 0) {
                if (ccVar.c != null) {
                    z = false;
                }
                cob.b(z, (Object) "Destroy task already scheduled");
                if (this.c == null) {
                    this.c = this.d.a();
                }
                ccVar.c = this.c.schedule(new cb(this, ccVar, cdVar, obj), 1, TimeUnit.SECONDS);
            }
        }
        return null;
    }
}
