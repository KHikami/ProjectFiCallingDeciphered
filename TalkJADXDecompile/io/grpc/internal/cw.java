package io.grpc.internal;

final class cw implements Runnable {
    final /* synthetic */ cx a;
    final /* synthetic */ cy b;
    final /* synthetic */ Object c;
    final /* synthetic */ cv d;

    cw(cv cvVar, cx cxVar, cy cyVar, Object obj) {
        this.d = cvVar;
        this.a = cxVar;
        this.b = cyVar;
        this.c = obj;
    }

    public void run() {
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
