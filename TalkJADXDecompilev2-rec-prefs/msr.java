package p000;

import java.util.concurrent.Executor;

final class msr {
    final Runnable f28272a;
    final Executor f28273b;
    msr f28274c;

    msr(Runnable runnable, Executor executor, msr msr) {
        this.f28272a = runnable;
        this.f28273b = executor;
        this.f28274c = msr;
    }
}
