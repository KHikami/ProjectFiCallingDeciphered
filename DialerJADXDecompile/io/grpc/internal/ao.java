package io.grpc.internal;

import cob;
import dgr;
import dhn;

/* compiled from: PG */
final class ao extends br {
    private boolean b;
    private final dhn c;

    public ao(dhn dhn) {
        cob.a(!dhn.a(), (Object) "error must not be OK");
        this.c = dhn;
    }

    public final void a(cg cgVar) {
        cob.b(!this.b, (Object) "already started");
        this.b = true;
        cgVar.a(this.c, new dgr());
    }
}
