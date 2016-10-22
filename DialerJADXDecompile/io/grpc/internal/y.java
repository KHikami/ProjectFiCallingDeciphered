package io.grpc.internal;

import dfr;

abstract class y implements Runnable {
    private final dfr a;

    public abstract void a();

    public y(dfr dfr) {
        this.a = dfr;
    }

    public final void run() {
        dfr b = this.a.b();
        try {
            a();
        } finally {
            this.a.a(b);
        }
    }
}
