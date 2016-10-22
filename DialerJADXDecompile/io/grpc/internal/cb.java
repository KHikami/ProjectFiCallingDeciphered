package io.grpc.internal;

/* compiled from: PG */
final class cb implements Runnable {
    private /* synthetic */ cc a;
    private /* synthetic */ cd b;
    private /* synthetic */ Object c;
    private /* synthetic */ ca d;

    cb(ca caVar, cc ccVar, cd cdVar, Object obj) {
        this.d = caVar;
        this.a = ccVar;
        this.b = cdVar;
        this.c = obj;
    }

    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.a(this.c);
                this.d.b.remove(this.b);
                if (this.d.b.isEmpty()) {
                    this.d.c.shutdown();
                    this.d.c = null;
                }
            }
        }
    }
}
