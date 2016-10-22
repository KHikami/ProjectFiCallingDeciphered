package io.grpc.internal;

import dfr;
import dgr;
import dhn;

final class m extends y {
    private /* synthetic */ dgr a;
    private /* synthetic */ l b;

    m(l lVar, dfr dfr, dgr dgr) {
        this.b = lVar;
        this.a = dgr;
        super(dfr);
    }

    public final void a() {
        try {
            if (!this.b.b) {
            }
        } catch (Throwable th) {
            this.b.c.d.a(dhn.c.b(th).a("Failed to read headers"));
        }
    }
}
