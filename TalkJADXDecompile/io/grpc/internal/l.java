package io.grpc.internal;

import bm;
import java.net.SocketAddress;
import java.util.concurrent.Executor;

final class l implements z {
    final Executor a;
    private final z b;

    l(z zVar, Executor executor) {
        this.b = (z) bm.a((Object) zVar, (Object) "delegate");
        this.a = (Executor) bm.a((Object) executor, (Object) "appExecutor");
    }

    public ae a(SocketAddress socketAddress, String str, String str2) {
        return new m(this, this.b.a(socketAddress, str, str2), str);
    }

    public void close() {
        this.b.close();
    }
}
