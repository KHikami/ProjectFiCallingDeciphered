package io.grpc.internal;

import cob;
import cwm;
import dhn;
import dhu;
import java.util.Collection;

/* compiled from: PG */
final class bd implements dhu {
    final z a;
    final /* synthetic */ bb b;

    bd(bb bbVar) {
        this.b = bbVar;
        this.a = new z(bbVar.d);
        this.a.a(new be(this, bbVar));
        synchronized (bbVar.f) {
            bbVar.o.add(this.a);
        }
    }

    public final void a(cwm cwm) {
        this.a.a(cwm);
        this.a.a();
    }

    public final void a(dhn dhn) {
        Collection collection = null;
        z zVar = this.a;
        zVar.a();
        synchronized (zVar.a) {
            if (zVar.c != null) {
                collection = zVar.c;
                zVar.c = null;
            }
        }
        if (r0 != null) {
            for (ae a : r0) {
                a.a(dhn);
            }
            zVar.b.a();
        }
    }

    public final /* synthetic */ Object a() {
        cob.b(true, (Object) "already closed");
        return this.a;
    }
}
