package p000;

import java.util.concurrent.Semaphore;

public final class ggj extends fip {
    final /* synthetic */ int f15234a;
    final /* synthetic */ exc[] f15235b;
    final /* synthetic */ Semaphore f15236c;
    final /* synthetic */ gbz f15237d;

    public ggj(gbz gbz, int i, exc[] excArr, Semaphore semaphore) {
        this.f15237d = gbz;
        this.f15234a = i;
        this.f15235b = excArr;
        this.f15236c = semaphore;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        if (this.f15234a == i) {
            exc exc = (exc) fiu.m15392c();
            if (exc != null) {
                this.f15235b[0] = exc;
            } else {
                glk.m17982e("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, response could not be decoded", new Object[0]);
            }
            this.f15236c.release();
        }
    }
}
