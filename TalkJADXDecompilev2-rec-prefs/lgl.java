package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class lgl extends msw implements mtm {
    final mtm f24960a;
    private final mtl f24961b;

    public /* synthetic */ ExecutorService mo3696b() {
        return mo3703a();
    }

    public /* synthetic */ Object mo3692c() {
        return mo3703a();
    }

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return mo3701a(runnable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return mo3702a(callable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3700a(runnable, j, j2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo3704b(runnable, j, j2, timeUnit);
    }

    lgl(mtl mtl, mtm mtm) {
        this.f24961b = mtl;
        this.f24960a = mtm;
    }

    public mtk<?> mo3700a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor lhg = new lhg(this);
        mti mtt = new mtt();
        return new lgs(mtt, this.f24960a.mo3700a(new lgo(this, lhg, runnable, mtt), j, j2, timeUnit));
    }

    public mtl mo3703a() {
        return this.f24961b;
    }

    public mtk<?> mo3701a(Runnable runnable, long j, TimeUnit timeUnit) {
        mti mtj = new mtj(runnable, null);
        return new lgs(mtj, this.f24960a.mo3701a(new lgm(this, mtj), j, timeUnit));
    }

    public <V> mtk<V> mo3702a(Callable<V> callable, long j, TimeUnit timeUnit) {
        mti mtj = new mtj(callable);
        return new lgs(mtj, this.f24960a.mo3701a(new lgn(this, mtj), j, timeUnit));
    }

    public mtk<?> mo3704b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mtt = new mtt();
        mtk lgs = new lgs(mtt, null);
        lgs.f24980a = this.f24960a.mo3701a(new lgq(this, runnable, mtt, lgs, j2, timeUnit), j, timeUnit);
        return lgs;
    }
}
