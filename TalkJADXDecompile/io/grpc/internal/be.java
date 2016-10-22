package io.grpc.internal;

import bm;
import okw;
import olv;

final class be extends cl {
    private boolean b;
    private final olv c;

    public be(olv olv) {
        bm.a(!olv.d(), (Object) "error must not be OK");
        this.c = olv;
    }

    public void a(db dbVar) {
        bm.b(!this.b, (Object) "already started");
        this.b = true;
        dbVar.b(this.c, new okw());
    }
}
