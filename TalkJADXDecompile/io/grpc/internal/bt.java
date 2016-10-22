package io.grpc.internal;

import okr;
import olk;
import olm;
import olv;

final class bt implements Runnable {
    final /* synthetic */ okr a;
    final /* synthetic */ olk b;
    final /* synthetic */ br c;

    bt(br brVar, okr okr, olk olk) {
        this.c = brVar;
        this.a = okr;
        this.b = olk;
    }

    public void run() {
        olm olm = new olm(this.c, this.a);
        try {
            this.b.a(olm);
        } catch (Throwable th) {
            olm.a(olv.a(th));
        }
    }
}
