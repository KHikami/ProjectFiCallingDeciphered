package io.grpc.internal;

import cob;
import dfi;
import dfo;
import dfz;
import dgb;
import dgd;
import dgr;
import dhn;
import dhp;
import java.io.InputStream;

final class l implements cg {
    final dfi a;
    boolean b;
    final /* synthetic */ i c;

    public l(i iVar, dfi dfi) {
        this.c = iVar;
        this.a = (dfi) cob.b((Object) dfi, (Object) "observer");
    }

    public final void a(dgr dgr) {
        dgb dgb = dfo.a;
        if (dgr.b.containsKey(ar.b.a)) {
            dgb dgb2;
            dgd dgd = (dgd) this.c.g.b.get((String) dgr.a(ar.b));
            if (dgd != null) {
                dgb2 = dgd.a;
            } else {
                dgb2 = null;
            }
            if (dgb2 == null) {
                this.c.d.a(dhn.i.a(String.format("Can't find decompressor for %s", new Object[]{r0})));
                return;
            }
            dgb = dgb2;
        }
        this.c.d.a(dgb);
        this.c.b.execute(new m(this, this.c.c, dgr));
    }

    public final void a(InputStream inputStream) {
        this.c.b.execute(new n(this, this.c.c, inputStream));
    }

    public final void a(dhn dhn, dgr dgr) {
        dfz e = this.c.c.e();
        if (dhn.m == dhp.CANCELLED && e != null && e.a()) {
            dhn = dhn.e;
            dgr = new dgr();
        }
        this.c.b.execute(new o(this, this.c.c, dhn, dgr));
    }

    public final void a() {
        this.c.b.execute(new p(this, this.c.c));
    }
}
