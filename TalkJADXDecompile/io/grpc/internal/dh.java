package io.grpc.internal;

import olv;

final class dh implements Runnable {
    final /* synthetic */ ag a;
    final /* synthetic */ olv b;
    final /* synthetic */ dd c;

    dh(dd ddVar, ag agVar, olv olv) {
        this.c = ddVar;
        this.a = agVar;
        this.b = olv;
    }

    public void run() {
        this.a.b(this.b);
    }
}
