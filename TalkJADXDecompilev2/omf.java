package defpackage;

import io.grpc.internal.ae;
import io.grpc.internal.z;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;

final class omf implements z {
    private final Executor a;
    private final int b;
    private final omg c;

    omf(omg omg, Executor executor, int i) {
        this.b = i;
        this.c = omg;
        this.a = (Executor) bm.a(executor, "executor");
    }

    public ae a(SocketAddress socketAddress, String str, String str2) {
        return new omk(this.c, (InetSocketAddress) socketAddress, str, str2, this.a, this.b);
    }

    public void close() {
    }
}
