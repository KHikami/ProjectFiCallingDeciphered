package defpackage;

import java.util.concurrent.Semaphore;

public final class ggj extends fip {
    final /* synthetic */ int a;
    final /* synthetic */ exc[] b;
    final /* synthetic */ Semaphore c;
    final /* synthetic */ gbz d;

    public ggj(gbz gbz, int i, exc[] excArr, Semaphore semaphore) {
        this.d = gbz;
        this.a = i;
        this.b = excArr;
        this.c = semaphore;
    }

    public void a(int i, bko bko, fiu fiu) {
        if (this.a == i) {
            exc exc = (exc) fiu.c();
            if (exc != null) {
                this.b[0] = exc;
            } else {
                glk.e("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, response could not be decoded", new Object[0]);
            }
            this.c.release();
        }
    }
}
