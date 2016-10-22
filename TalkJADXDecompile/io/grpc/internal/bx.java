package io.grpc.internal;

import bm;
import iyr;
import olv;
import omc;

final class bx implements omc<y> {
    final ag a;
    final /* synthetic */ br b;
    private boolean c;

    public /* synthetic */ Object a() {
        return b();
    }

    bx(br brVar) {
        this.b = brVar;
        this.a = new ag(brVar.i);
        this.a.a(new by(this, brVar));
        synchronized (brVar.k) {
            brVar.u.add(this.a);
            boolean z = brVar.x;
        }
        if (z) {
            this.a.a(br.c);
            this.a.a();
        }
    }

    private y b() {
        bm.b(!this.c, (Object) "already closed");
        return this.a;
    }

    public void a(iyr iyr) {
        this.a.a(iyr);
        this.a.a();
    }

    public void a(olv olv) {
        this.a.a(olv);
    }
}
