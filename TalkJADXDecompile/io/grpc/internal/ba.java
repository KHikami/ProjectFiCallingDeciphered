package io.grpc.internal;

import okw;
import olv;

final class ba implements Runnable {
    final /* synthetic */ olv a;
    final /* synthetic */ okw b;
    final /* synthetic */ aw c;

    ba(aw awVar, olv olv, okw okw) {
        this.c = awVar;
        this.a = olv;
        this.b = okw;
    }

    public void run() {
        this.c.a.b(this.a, this.b);
    }
}
