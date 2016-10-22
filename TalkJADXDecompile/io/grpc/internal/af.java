package io.grpc.internal;

import ojz;

abstract class af implements Runnable {
    private final ojz a;

    public abstract void a();

    public af(ojz ojz) {
        this.a = ojz;
    }

    public final void run() {
        ojz b = this.a.b();
        try {
            a();
        } finally {
            this.a.a(b);
        }
    }
}
