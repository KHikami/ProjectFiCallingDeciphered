package io.grpc.internal;

import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import olv;

final class by implements cb {
    final /* synthetic */ br a;
    final /* synthetic */ bx b;

    by(bx bxVar, br brVar) {
        this.b = bxVar;
        this.a = brVar;
    }

    public void a(olv olv) {
    }

    public void a() {
        synchronized (this.b.b.k) {
            this.b.b.u.remove(this.b.a);
            br brVar = this.b.b;
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
        this.b.b.v.a(this.b.a, false);
    }

    public void b() {
    }

    public void a(boolean z) {
        this.b.b.v.a(this.b.a, z);
    }
}
