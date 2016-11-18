package defpackage;

import io.grpc.internal.ae;
import io.grpc.internal.bi;
import io.grpc.internal.cb;
import io.grpc.internal.dl;
import io.grpc.internal.x;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class omk implements ae, dl {
    public static boolean a = false;
    final String b;
    cb c;
    final Object d = new Object();
    final Set<omh> e = new HashSet();
    final Executor f;
    final int g;
    boolean h;
    olv i;
    boolean j;
    omg k;
    private final InetSocketAddress l;
    private final String m;
    private boolean n;
    private boolean o;

    public /* bridge */ /* synthetic */ x a(olh olh, okw okw, ojm ojm) {
        return a(olh, okw);
    }

    omk(omg omg, InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, int i) {
        this.l = (InetSocketAddress) bm.a(inetSocketAddress, "address");
        this.m = str;
        this.b = bi.a("cronet", str2);
        this.g = i;
        this.f = (Executor) bm.a(executor, "executor");
        this.k = (omg) bm.a(omg, "streamFactory");
    }

    private omh a(olh olh, okw okw) {
        bm.a(olh, "method");
        bm.a(okw, "headers");
        String str = "/";
        String valueOf = String.valueOf(olh.b());
        valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        str = this.m;
        return new omm(this, new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(valueOf).length()).append("https://").append(str).append(valueOf).toString(), okw, olh).a;
    }

    public Runnable a(cb cbVar) {
        this.c = (cb) bm.a(cbVar, "listener");
        synchronized (this.d) {
            this.j = true;
        }
        return new oml(this);
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        String valueOf2 = String.valueOf(this.l);
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append("(").append(valueOf2).append(")").toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r3 = this;
        r1 = r3.d;
        monitor-enter(r1);
        r0 = r3.h;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
    L_0x0008:
        return;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        r0 = olv.q;
        r1 = "Transport stopped";
        r0 = r0.a(r1);
        r1 = r3.d;
        monitor-enter(r1);
        r2 = r3.n;	 Catch:{ all -> 0x001b }
        if (r2 == 0) goto L_0x0021;
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        throw r0;
    L_0x0021:
        r2 = 1;
        r3.n = r2;	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        r1 = r3.c;
        r1.a(r0);
        r1 = r3.d;
        monitor-enter(r1);
        r2 = 1;
        r3.h = r2;	 Catch:{ all -> 0x0037 }
        r3.i = r0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        r3.d();
        goto L_0x0008;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: omk.a():void");
    }

    public ojh b() {
        return ojh.b;
    }

    public void a(a aVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    public String c() {
        return bi.a(this);
    }

    private void d() {
        synchronized (this.d) {
            if (this.h && this.e.size() == 0 && !this.o) {
                this.o = true;
            }
        }
    }

    void a(omh omh, olv olv) {
        synchronized (this.d) {
            if (this.e.remove(omh)) {
                boolean z = olv.a() == olx.b || olv.a() == olx.e;
                omh.a(olv, z, new okw());
            }
        }
    }
}
