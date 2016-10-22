package io.grpc.internal;

import okw;
import olv;

final class b implements Runnable {
    final /* synthetic */ olv a;
    final /* synthetic */ okw b;
    final /* synthetic */ a c;

    b(a aVar, olv olv, okw okw) {
        this.c = aVar;
        this.a = olv;
        this.b = okw;
    }

    public void run() {
        this.c.b(this.a, this.b);
    }
}
