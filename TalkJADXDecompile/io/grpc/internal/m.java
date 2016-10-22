package io.grpc.internal;

import bm;
import gwb;
import ojh;
import oji;
import ojk;
import ojl;
import ojm;
import okw;
import olh;
import olu;

final class m extends bh {
    final /* synthetic */ l a;
    private final ae b;
    private final String c;

    m(l lVar, ae aeVar, String str) {
        this.a = lVar;
        this.b = (ae) bm.a((Object) aeVar, (Object) "delegate");
        this.c = (String) bm.a((Object) str, (Object) "authority");
    }

    protected ae d() {
        return this.b;
    }

    public x a(olh<?, ?> olh___, okw okw, ojm ojm) {
        ojk e = ojm.e();
        if (e == null) {
            return this.b.a(olh___, okw, ojm);
        }
        ojl ojl = new ojl(this.b, olh___, okw, ojm);
        oji a = ojh.newBuilder().a(ojk.b, this.c).a(ojk.a, olu.a).a(this.b.b());
        if (ojm.d() != null) {
            a.a(ojk.b, ojm.d());
        }
        a.a();
        gwb.i(ojm.f(), this.a.a);
        e.a();
        return ojl.a();
    }
}
