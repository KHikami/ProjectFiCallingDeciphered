package p000;

import io.grpc.internal.ae;
import io.grpc.internal.z;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;

final class omf implements z {
    private final Executor f33199a;
    private final int f33200b;
    private final omg f33201c;

    omf(omg omg, Executor executor, int i) {
        this.f33200b = i;
        this.f33201c = omg;
        this.f33199a = (Executor) bm.a(executor, "executor");
    }

    public ae m38717a(SocketAddress socketAddress, String str, String str2) {
        return new omk(this.f33201c, (InetSocketAddress) socketAddress, str, str2, this.f33199a, this.f33200b);
    }

    public void close() {
    }
}
