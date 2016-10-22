package io.grpc.internal;

import cob;
import dff;
import dfg;
import dfh;
import dhc;
import java.util.concurrent.Executor;

/* compiled from: PG */
final class bf extends dfg {
    private /* synthetic */ bb a;

    bf(bb bbVar) {
        this.a = bbVar;
    }

    public final String a() {
        return (String) cob.b(this.a.l.a(), (Object) "authority");
    }

    public final dfh a(dhc dhc, dff dff) {
        Executor executor = null;
        if (null == null) {
            executor = this.a.d;
        }
        dfh iVar = new i(dhc, executor, dff, this.a.q, this.a.i);
        iVar.f = this.a.e;
        iVar.g = this.a.g;
        iVar.h = this.a.h;
        return iVar;
    }
}
