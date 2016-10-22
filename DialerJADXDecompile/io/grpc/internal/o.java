package io.grpc.internal;

import dfr;
import dgr;
import dhn;

final class o extends y {
    private /* synthetic */ dhn a;
    private /* synthetic */ dgr b;
    private /* synthetic */ l c;

    o(l lVar, dfr dfr, dhn dhn, dgr dgr) {
        this.c = lVar;
        this.a = dhn;
        this.b = dgr;
        super(dfr);
    }

    public final void a() {
        try {
            this.c.b = true;
            this.c.c.e = true;
            this.c.a.a(this.a, this.b);
        } finally {
            this.c.c.c.a(this.c.c);
        }
    }
}
