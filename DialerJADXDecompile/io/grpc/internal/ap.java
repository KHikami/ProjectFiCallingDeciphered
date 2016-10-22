package io.grpc.internal;

import cob;
import dgr;
import dhc;
import dhn;
import i;
import java.util.concurrent.Executor;

/* compiled from: PG */
final class ap implements s {
    final dhn a;

    ap(dhn dhn) {
        cob.a(!dhn.a(), (Object) "error must not be OK");
        this.a = dhn;
    }

    public final r a(dhc dhc, dgr dgr) {
        return new ao(this.a);
    }

    public final void a(i iVar, Executor executor) {
        executor.execute(new aq(this, iVar));
    }
}
