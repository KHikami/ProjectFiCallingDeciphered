package io.grpc.internal;

import bm;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import ojh;
import olk;
import oll;
import olm;

final class bb extends olk {
    final String a;
    final int b;
    boolean c;
    ScheduledExecutorService d;
    ExecutorService e;
    ScheduledFuture<?> f;
    boolean g;
    olm h;
    final Runnable i;
    final Runnable j;
    private final String k;
    private final cy<ScheduledExecutorService> l;
    private final cy<ExecutorService> m;

    bb(String str, ojh ojh, cy cyVar, cy cyVar2) {
        this.i = new bc(this);
        this.j = new bd(this);
        this.l = cyVar;
        this.m = cyVar2;
        String str2 = "//";
        String valueOf = String.valueOf(str);
        Object create = URI.create(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.k = (String) bm.a(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.a = (String) bm.a(create.getHost(), (Object) "host");
        if (create.getPort() == -1) {
            Integer num = (Integer) ojh.a(oll.a);
            if (num != null) {
                this.b = num.intValue();
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 69).append("name '").append(str).append("' doesn't contain a port, and default port is not set in params").toString());
        }
        this.b = create.getPort();
    }

    public final String a() {
        return this.k;
    }

    public final synchronized void a(olm olm) {
        bm.b(this.h == null, (Object) "already started");
        this.d = (ScheduledExecutorService) cv.a.a(this.l);
        this.e = (ExecutorService) cv.a.a(this.m);
        this.h = (olm) bm.a((Object) olm, (Object) "listener");
        d();
    }

    public final synchronized void c() {
        bm.b(this.h != null, (Object) "not started");
        d();
    }

    private void d() {
        if (!this.g && !this.c) {
            this.e.execute(this.i);
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            this.c = true;
            if (this.f != null) {
                this.f.cancel(false);
            }
            if (this.d != null) {
                this.d = (ScheduledExecutorService) cv.a(this.l, this.d);
            }
            if (this.e != null) {
                this.e = (ExecutorService) cv.a(this.m, this.e);
            }
        }
    }
}
