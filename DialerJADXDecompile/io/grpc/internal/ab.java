package io.grpc.internal;

import cwm;
import java.util.Collection;

/* compiled from: PG */
final class ab implements Runnable {
    private /* synthetic */ Collection a;
    private /* synthetic */ cwm b;

    ab(z zVar, Collection collection, cwm cwm) {
        this.a = collection;
        this.b = cwm;
    }

    public final void run() {
        for (ae aeVar : this.a) {
            aeVar.a(((s) this.b.b()).a(aeVar.a, aeVar.b));
        }
    }
}
