package io.grpc.internal;

import ojm;
import ojz;
import okw;
import olh;
import olv;

final class am extends an {
    final ojm a;
    final /* synthetic */ ag b;
    private final olh<?, ?> d;
    private final okw e;
    private final ojz f;

    am(ag agVar, olh<?, ?> olh___, okw okw, ojm ojm) {
        this.b = agVar;
        this.d = olh___;
        this.e = okw;
        this.a = ojm;
        this.f = ojz.a();
    }

    void a(y yVar) {
        ojz b = this.f.b();
        try {
            x a = yVar.a(this.d, this.e, this.a);
            a(a);
        } finally {
            this.f.a(b);
        }
    }

    public void b(olv olv) {
        super.b(olv);
        synchronized (this.b.a) {
            if (this.b.c != null) {
                boolean remove = this.b.c.remove(this);
                if (this.b.c.isEmpty() && remove) {
                    this.b.b.a(false);
                    if (this.b.d) {
                        this.b.c = null;
                        this.b.b.a();
                    }
                }
            }
        }
    }
}
