package defpackage;

import io.grpc.internal.ca;
import io.grpc.internal.cd;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* renamed from: dge */
final class dge extends dhf {
    final String a;
    final int b;
    ScheduledExecutorService c;
    ExecutorService d;
    ScheduledFuture e;
    boolean f;
    dhh g;
    final Runnable h;
    final Runnable i;
    private final String j;
    private final cd k;
    private final cd l;

    dge(String str, dfc dfc, cd cdVar, cd cdVar2) {
        this.h = new dgf(this);
        this.i = new dgg(this);
        this.k = cdVar;
        this.l = cdVar2;
        String str2 = "//";
        String valueOf = String.valueOf(str);
        Object create = URI.create(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.j = (String) cob.a(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.a = (String) cob.b(create.getHost(), (Object) "host");
        if (create.getPort() == -1) {
            Integer num = (Integer) dfc.a.get(dhg.b);
            if (num != null) {
                this.b = num.intValue();
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 69).append("name '").append(str).append("' doesn't contain a port, and default port is not set in params").toString());
        }
        this.b = create.getPort();
    }

    public final String a() {
        return this.j;
    }

    public final synchronized void a(dhh dhh) {
        cob.b(this.g == null, (Object) "already started");
        this.c = (ScheduledExecutorService) ca.a.a(this.k);
        this.d = (ExecutorService) ca.a.a(this.l);
        this.g = (dhh) cob.b((Object) dhh, (Object) "listener");
        c();
    }

    public final synchronized void b() {
        cob.b(this.g != null, (Object) "not started");
        c();
    }

    private final void c() {
        if (!this.f) {
            this.d.execute(this.h);
        }
    }
}
