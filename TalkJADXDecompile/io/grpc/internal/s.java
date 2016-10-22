package io.grpc.internal;

import java.io.InputStream;
import okw;
import olv;

final class s extends af {
    final /* synthetic */ InputStream a;
    final /* synthetic */ q b;

    s(q qVar, InputStream inputStream) {
        this.b = qVar;
        this.a = inputStream;
        super(qVar.c.c);
    }

    public final void a() {
        try {
            if (!this.b.b) {
                this.b.a.a(this.b.c.a.a(this.a));
                this.a.close();
            }
        } catch (Throwable th) {
            olv a = olv.c.b(th).a("Failed to read message.");
            this.b.c.d.b(a);
            this.b.a(a, new okw());
        }
    }
}
