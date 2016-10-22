package io.grpc.internal;

import java.io.InputStream;

final class aq implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ an b;

    aq(an anVar, InputStream inputStream) {
        this.b = anVar;
        this.a = inputStream;
    }

    public void run() {
        this.b.c.b(this.a);
    }
}
