package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: mtm */
public interface mtm extends ScheduledExecutorService, mtl {
    mtk<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    mtk<?> a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> mtk<V> a(Callable<V> callable, long j, TimeUnit timeUnit);

    mtk<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
