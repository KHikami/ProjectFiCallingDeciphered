package defpackage;

import io.grpc.internal.bg;
import io.grpc.internal.ca;
import io.grpc.internal.t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* renamed from: din */
final class din implements t {
    private final Executor a;
    private final boolean b;
    private final SSLSocketFactory c;
    private final dey d;
    private final int e;
    private boolean f;

    din(Executor executor, SSLSocketFactory sSLSocketFactory, dey dey, int i) {
        this.c = sSLSocketFactory;
        this.d = dey;
        this.e = i;
        this.b = executor == null;
        if (this.b) {
            this.a = (Executor) ca.a.a(dik.c);
        } else {
            this.a = executor;
        }
    }

    public final bg a(SocketAddress socketAddress, String str) {
        if (this.f) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new diq((InetSocketAddress) socketAddress, str, this.a, this.c, buf.a(this.d), this.e);
    }

    public final void close() {
        if (!this.f) {
            this.f = true;
            if (this.b) {
                ca.a.a(dik.c, (ExecutorService) this.a);
            }
        }
    }
}
