package p000;

import io.grpc.internal.bi;
import io.grpc.internal.c;
import io.grpc.internal.z;
import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

public final class ome extends c<ome> {
    private int f33197c = 4194304;
    private omg f33198d;

    public static ome m38714a(String str, int i, CronetEngine cronetEngine) {
        bm.a(cronetEngine, "cronetEngine");
        return new ome(str, 443, new omg(cronetEngine));
    }

    private ome(String str, int i, omg omg) {
        super(InetSocketAddress.createUnresolved(str, i), bi.a(str, i));
        this.f33198d = (omg) bm.a(omg, "streamFactory");
    }

    protected final z m38715a() {
        return new omf(this.f33198d, gwb.aT(), this.f33197c);
    }

    protected ojh m38716b() {
        return ojh.newBuilder().m38564a(oll.f33167a, Integer.valueOf(443)).m38562a();
    }
}
