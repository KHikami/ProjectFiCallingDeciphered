package io.grpc.internal;

import java.io.InputStream;

final class ax implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ aw b;

    ax(aw awVar, InputStream inputStream) {
        this.b = awVar;
        this.a = inputStream;
    }

    public void run() {
        this.b.a.a(this.a);
    }
}
