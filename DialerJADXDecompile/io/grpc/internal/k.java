package io.grpc.internal;

import dfi;
import dfr;
import dgr;
import dhn;

final class k extends y {
    private /* synthetic */ dfi a;
    private /* synthetic */ String b;

    k(i iVar, dfr dfr, dfi dfi, String str) {
        this.a = dfi;
        this.b = str;
        super(dfr);
    }

    public final void a() {
        this.a.a(dhn.i.a(String.format("Unable to find compressor by name %s", new Object[]{this.b})), new dgr());
    }
}
