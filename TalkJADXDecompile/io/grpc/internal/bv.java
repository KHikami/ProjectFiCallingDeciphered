package io.grpc.internal;

import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import okm;

final class bv extends dj {
    final /* synthetic */ okm a;
    final /* synthetic */ bu b;

    bv(bu buVar, okm okm) {
        this.b = buVar;
        this.a = okm;
    }

    public void a(dd ddVar) {
        synchronized (this.b.a.k) {
            this.b.a.s.remove(this.a);
            this.b.a.t.remove(ddVar);
            br brVar = this.b.a;
            if (!brVar.y && brVar.x && brVar.s.isEmpty() && brVar.t.isEmpty() && brVar.u.isEmpty() && brVar.w.isEmpty()) {
                if (br.a.isLoggable(Level.INFO)) {
                    br.a.log(Level.INFO, "[{0}] Terminated", brVar.c());
                }
                brVar.y = true;
                brVar.k.notifyAll();
                if (brVar.j) {
                    cv.a(bi.j, (ExecutorService) brVar.i);
                }
                brVar.h.close();
            }
        }
    }

    public void a() {
        this.b.a.q.c();
    }

    public void b() {
        this.b.a.q.c();
    }

    public void b(dd ddVar) {
        this.b.a.v.a(ddVar, true);
    }

    public void c(dd ddVar) {
        this.b.a.v.a(ddVar, false);
    }
}
