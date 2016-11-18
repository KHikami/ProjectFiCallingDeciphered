package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class lgl extends msw implements mtm {
    final mtm a;
    private final mtl b;

    public /* synthetic */ ExecutorService b() {
        return a();
    }

    public /* synthetic */ Object c() {
        return a();
    }

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return a(runnable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return a(callable, j, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a(runnable, j, j2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return b(runnable, j, j2, timeUnit);
    }

    lgl(mtl mtl, mtm mtm) {
        this.b = mtl;
        this.a = mtm;
    }

    public mtk<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor lhg = new lhg(this);
        mti mtt = new mtt();
        return new lgs(mtt, this.a.a(new lgo(this, lhg, runnable, mtt), j, j2, timeUnit));
    }

    public mtl a() {
        return this.b;
    }

    public mtk<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        mti mtj = new mtj(runnable, null);
        return new lgs(mtj, this.a.a(new lgm(this, mtj), j, timeUnit));
    }

    public <V> mtk<V> a(Callable<V> callable, long j, TimeUnit timeUnit) {
        mti mtj = new mtj(callable);
        return new lgs(mtj, this.a.a(new lgn(this, mtj), j, timeUnit));
    }

    public mtk<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object mtt = new mtt();
        mtk lgs = new lgs(mtt, null);
        lgs.a = this.a.a(new lgq(this, runnable, mtt, lgs, j2, timeUnit), j, timeUnit);
        return lgs;
    }
}
