package io.grpc.internal;

import bm;
import java.util.logging.Level;
import okm;
import olv;
import omb;
import omc;

final class bu extends omb<y> {
    final /* synthetic */ br a;

    bu(br brVar) {
        this.a = brVar;
    }

    public /* synthetic */ Object a(okm okm) {
        return b(okm);
    }

    private y b(okm okm) {
        bm.a((Object) okm, (Object) "addressGroup");
        synchronized (this.a.k) {
            y yVar;
            if (this.a.x) {
                yVar = br.c;
                return yVar;
            } else if (this.a.r == null) {
                yVar = br.d;
                return yVar;
            } else {
                dd ddVar = (dd) this.a.s.get(okm);
                if (ddVar == null) {
                    ddVar = new dd(okm, this.a.a(), this.a.p, this.a.r, this.a.o, this.a.h, this.a.n, this.a.D, this.a.i, new bv(this, okm));
                    if (br.a.isLoggable(Level.FINE)) {
                        br.a.log(Level.FINE, "[{0}] {1} created for {2}", new Object[]{this.a.c(), ddVar.c(), okm});
                    }
                    this.a.s.put(okm, ddVar);
                }
                return ddVar.a();
            }
        }
    }

    public omc<y> a() {
        return new bx(this.a);
    }

    public /* synthetic */ Object a(olv olv) {
        return new bf(olv);
    }
}
