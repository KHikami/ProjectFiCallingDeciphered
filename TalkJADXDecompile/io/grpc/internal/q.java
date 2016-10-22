package io.grpc.internal;

import bm;
import java.io.InputStream;
import ojp;
import ojw;
import okg;
import oki;
import okw;
import olv;
import olx;

final class q implements db {
    final ojp<RespT> a;
    boolean b;
    final /* synthetic */ n c;

    public q(n nVar, ojp<RespT> ojp_RespT) {
        this.c = nVar;
        this.a = (ojp) bm.a((Object) ojp_RespT, (Object) "observer");
    }

    public void a(okw okw) {
        oki oki = ojw.a;
        if (okw.a(bi.c)) {
            oki a = this.c.f.a((String) okw.b(bi.c));
            if (a == null) {
                this.c.d.b(olv.p.a(String.format("Can't find decompressor for %s", new Object[]{r0})));
                return;
            }
            oki = a;
        }
        this.c.d.a(oki);
        this.c.b.execute(new r(this, okw));
    }

    public void a(InputStream inputStream) {
        this.c.b.execute(new s(this, inputStream));
    }

    void a(olv olv, okw okw) {
        this.b = true;
        this.c.e = true;
        try {
            this.a.a(olv, okw);
        } finally {
            this.c.b();
        }
    }

    public void b(olv olv, okw okw) {
        okg c = this.c.c();
        if (olv.a() == olx.CANCELLED && c != null && c.a()) {
            olv = olv.f;
            okw = new okw();
        }
        this.c.b.execute(new t(this, olv, okw));
    }

    public void a() {
        this.c.b.execute(new u(this));
    }
}
