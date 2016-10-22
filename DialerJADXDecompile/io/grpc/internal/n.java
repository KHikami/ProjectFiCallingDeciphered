package io.grpc.internal;

import dfi;
import dfr;
import dhc;
import dhn;
import java.io.InputStream;

final class n extends y {
    private /* synthetic */ InputStream a;
    private /* synthetic */ l b;

    n(l lVar, dfr dfr, InputStream inputStream) {
        this.b = lVar;
        this.a = inputStream;
        super(dfr);
    }

    public final void a() {
        try {
            if (!this.b.b) {
                dfi dfi = this.b.a;
                dhc dhc = this.b.c.a;
                dfi.a(dhc.d.a(this.a));
                this.a.close();
            }
        } catch (Throwable th) {
            this.b.c.d.a(dhn.c.b(th).a("Failed to read message."));
        }
    }
}
