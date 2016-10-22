package io.grpc.internal;

import a;
import olv;

final class ah implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ ag b;

    ah(ag agVar, a aVar) {
        this.b = agVar;
        this.a = aVar;
    }

    public void run() {
        olv.q.a("transport shutdown").f();
    }
}
