package io.grpc.internal;

import iyr;
import java.util.Collection;

final class ai implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ iyr b;
    final /* synthetic */ ag c;

    ai(ag agVar, Collection collection, iyr iyr) {
        this.c = agVar;
        this.a = collection;
        this.b = iyr;
    }

    public void run() {
        for (am a : this.a) {
            a.a((y) this.b.a());
        }
        synchronized (this.c.a) {
            this.c.b.a(false);
        }
    }
}
