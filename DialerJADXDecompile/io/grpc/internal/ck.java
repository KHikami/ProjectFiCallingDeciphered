package io.grpc.internal;

import dhn;

/* compiled from: PG */
class ck implements bh {
    public final bg a;
    private /* synthetic */ ci b;

    public ck(ci ciVar, bg bgVar) {
        this.b = ciVar;
        this.a = bgVar;
    }

    public void b() {
    }

    public void a(dhn dhn) {
    }

    public void a() {
        synchronized (this.b.b) {
            this.b.k.remove(this.a);
            ci ciVar = this.b;
        }
    }
}
