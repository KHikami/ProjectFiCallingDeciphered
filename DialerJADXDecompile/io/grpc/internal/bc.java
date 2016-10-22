package io.grpc.internal;

import cob;
import dgj;
import dhn;
import dht;
import dhu;
import java.util.logging.Level;

/* compiled from: PG */
final class bc extends dht {
    final /* synthetic */ bb a;

    bc(bb bbVar) {
        this.a = bbVar;
    }

    public final /* synthetic */ Object a(dgj dgj) {
        return b(dgj);
    }

    private s b(dgj dgj) {
        ci ciVar;
        cob.b((Object) dgj, (Object) "addressGroup");
        synchronized (this.a.f) {
            bb bbVar = this.a;
            ciVar = (ci) this.a.n.get(dgj);
            if (ciVar == null) {
                ciVar = new ci(dgj, this.a.k.a(), this.a.m, this.a.j, this.a.c, this.a.i, this.a.d, new cl(this, dgj));
                if (bb.a.isLoggable(Level.FINE)) {
                    bb.a.log(Level.FINE, "[{0}] {1} created for {2}", new Object[]{ar.a(this.a), ar.a((cn) ciVar), dgj});
                }
                this.a.n.put(dgj, ciVar);
            }
        }
        return ciVar.a();
    }

    public final dhu a() {
        return new bd(this.a);
    }

    public final /* synthetic */ Object a(dhn dhn) {
        return new ap(dhn);
    }
}
