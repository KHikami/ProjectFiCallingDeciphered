package defpackage;

import io.grpc.internal.bi;
import io.grpc.internal.c;
import io.grpc.internal.z;
import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

public final class ome extends c<ome> {
    private int c = 4194304;
    private omg d;

    public static ome a(String str, int i, CronetEngine cronetEngine) {
        bm.a(cronetEngine, "cronetEngine");
        return new ome(str, 443, new omg(cronetEngine));
    }

    private ome(String str, int i, omg omg) {
        super(InetSocketAddress.createUnresolved(str, i), bi.a(str, i));
        this.d = (omg) bm.a(omg, "streamFactory");
    }

    protected final z a() {
        return new omf(this.d, gwb.aT(), this.c);
    }

    protected ojh b() {
        return ojh.newBuilder().a(oll.a, Integer.valueOf(443)).a();
    }
}
