package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class izz extends jah {
    final Runnable a;
    final ieb c;
    final iea d;
    final iee<ied> e;
    private final Object f;
    private final Context g;
    private final idd h;
    private final idz i;
    private final ida j;
    private final String k;
    private final iyr<ScheduledExecutorService> l;
    private final AtomicReference<ScheduledFuture<?>> m;
    private idy n;
    private idx o;
    private volatile idc p;

    private izz(Context context, idd idd, idz idz, ida ida, String str, iyr<ScheduledExecutorService> iyr_java_util_concurrent_ScheduledExecutorService) {
        this.f = new Object();
        this.m = new AtomicReference();
        this.a = new jaa(this);
        this.c = new jab(this);
        this.d = new jac(this);
        this.e = new jad(this);
        this.g = context.getApplicationContext();
        this.h = (idd) ba.a((Object) idd);
        this.i = (idz) ba.a((Object) idz);
        this.j = (ida) ba.a((Object) ida);
        this.k = (String) ba.a((Object) str);
        this.l = (iyr) ba.a((Object) iyr_java_util_concurrent_ScheduledExecutorService);
    }

    protected void b(ook ook) {
        if (Log.isLoggable("ClearcutTransmitter", 2)) {
            ook.toString();
        }
        b().a(nzf.a((nzf) ook)).a(c()).a(this.e);
    }

    private idc b() {
        if (this.p == null) {
            synchronized (this.f) {
                if (this.p == null) {
                    this.p = this.h.a(this.g, this.k, null);
                }
            }
        }
        return this.p;
    }

    private idx c() {
        idx idx;
        synchronized (this.f) {
            if (this.o == null) {
                if (this.n == null) {
                    this.n = this.i.newBuilder(this.g);
                }
                this.o = this.n.a(this.j.a()).a();
                this.o.a(this.c);
                this.o.a(this.d);
                this.o.a();
            }
            ScheduledFuture scheduledFuture = (ScheduledFuture) this.m.getAndSet(null);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            idx = this.o;
        }
        return idx;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r3 = this;
        r1 = r3.f;
        monitor-enter(r1);
        r0 = java.lang.Thread.interrupted();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = r3.o;	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x0025;
    L_0x000f:
        r0 = r3.o;	 Catch:{ all -> 0x0027 }
        r0.b();	 Catch:{ all -> 0x0027 }
        r0 = r3.o;	 Catch:{ all -> 0x0027 }
        r2 = r3.d;	 Catch:{ all -> 0x0027 }
        r0.b(r2);	 Catch:{ all -> 0x0027 }
        r0 = r3.o;	 Catch:{ all -> 0x0027 }
        r2 = r3.c;	 Catch:{ all -> 0x0027 }
        r0.b(r2);	 Catch:{ all -> 0x0027 }
        r0 = 0;
        r3.o = r0;	 Catch:{ all -> 0x0027 }
    L_0x0025:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        goto L_0x000a;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: izz.a():void");
    }

    void a(idr idr) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            String valueOf = String.valueOf(idr);
            new StringBuilder(String.valueOf(valueOf).length() + 28).append("onConnectionFailed, result: ").append(valueOf);
        }
        synchronized (this.f) {
            if (this.o != null) {
                this.o.b(this.c);
                this.o.b(this.d);
                this.o = null;
            }
        }
    }

    static void a(int i) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(41).append("onConnectionSuspended, cause: ").append(i);
        }
    }

    public izz(Context context, idd idd, idz idz, ida ida, String str) {
        this(context, idd, idz, ida, str, ixx.c);
    }

    static /* synthetic */ void a(izz izz, ied ied) {
        if (Log.isLoggable("ClearcutTransmitter", 3)) {
            new StringBuilder(24).append("onResult, success: ").append(ied.a());
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) izz.m.getAndSet(((ScheduledExecutorService) izz.l.a()).schedule(izz.a, 15000, TimeUnit.MILLISECONDS));
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
