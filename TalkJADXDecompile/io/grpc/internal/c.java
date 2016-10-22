package io.grpc.internal;

import gwb;
import io.grpc.NameResolverProvider;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ojh;
import ojq;
import ojy;
import okj;
import oks;
import okt;
import oll;
import olq;

public abstract class c<T extends c<T>> extends okt<T> {
    static final long a;
    public final List<ojq> b;
    private Executor c;
    private final String d;
    private final SocketAddress e;
    private String f;
    private String g;
    private oll h;
    private oks i;
    private okj j;
    private ojy k;
    private long l;

    public abstract z a();

    static {
        a = TimeUnit.SECONDS.toMillis(1);
    }

    private static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            return new URI("directaddress", "", new StringBuilder(String.valueOf(valueOf).length() + 1).append("/").append(valueOf).toString(), null).toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public c(SocketAddress socketAddress, String str) {
        this.b = new ArrayList();
        this.l = -1;
        this.d = a(socketAddress);
        this.e = socketAddress;
        this.h = new e(socketAddress, str);
    }

    public br c() {
        z dVar;
        z a = a();
        if (this.g != null) {
            dVar = new d(a, this.g);
        } else {
            dVar = a;
        }
        oll oll = this.h;
        if (oll == null) {
            oll = NameResolverProvider.c;
        }
        return new br(this.d, new k(), oll, b(), (oks) gwb.i(this.i, olq.a), dVar, (okj) gwb.i(this.j, okj.b), (ojy) gwb.i(this.k, ojy.a), bi.k, bi.l, this.l, this.c, this.f, this.b);
    }

    public ojh b() {
        return ojh.b;
    }
}
