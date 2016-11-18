package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface mtm extends ScheduledExecutorService, mtl {
    mtk<?> mo3700a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    mtk<?> mo3701a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> mtk<V> mo3702a(Callable<V> callable, long j, TimeUnit timeUnit);

    mtk<?> mo3704b(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
