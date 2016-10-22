package io.grpc.internal;

import okw;
import olv;

final class r extends af {
    final /* synthetic */ okw a;
    final /* synthetic */ q b;

    r(q qVar, okw okw) {
        this.b = qVar;
        this.a = okw;
        super(qVar.c.c);
    }

    public final void a() {
        try {
            if (!this.b.b) {
                this.b.a.a(this.a);
            }
        } catch (Throwable th) {
            olv a = olv.c.b(th).a("Failed to read headers");
            this.b.c.d.b(a);
            this.b.a(a, new okw());
        }
    }
}
