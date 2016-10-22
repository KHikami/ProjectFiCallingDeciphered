package io.grpc.internal;

import bm;
import java.net.SocketAddress;

final class d implements z {
    final z a;
    final String b;

    d(z zVar, String str) {
        this.a = (z) bm.a((Object) zVar, (Object) "factory should not be null");
        this.b = (String) bm.a((Object) str, (Object) "authorityOverride should not be null");
    }

    public ae a(SocketAddress socketAddress, String str, String str2) {
        return this.a.a(socketAddress, this.b, str2);
    }

    public void close() {
        this.a.close();
    }
}
