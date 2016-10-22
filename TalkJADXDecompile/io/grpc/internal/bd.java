package io.grpc.internal;

final class bd implements Runnable {
    final /* synthetic */ bb a;

    bd(bb bbVar) {
        this.a = bbVar;
    }

    public void run() {
        synchronized (this.a) {
            if (!this.a.c) {
                this.a.e.execute(this.a.i);
            }
        }
    }
}
