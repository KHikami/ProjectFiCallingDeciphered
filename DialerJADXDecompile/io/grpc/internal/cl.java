package io.grpc.internal;

import dgj;

/* compiled from: PG */
class cl {
    final /* synthetic */ dgj a;
    final /* synthetic */ bc b;

    public void a() {
        synchronized (this.b.a.f) {
            this.b.a.n.remove(this.a);
            if (this.b.a.p) {
            }
        }
    }

    public void b() {
        this.b.a.l.b();
    }

    public void c() {
        this.b.a.l.b();
    }

    cl(bc bcVar, dgj dgj) {
        this.b = bcVar;
        this.a = dgj;
    }
}
