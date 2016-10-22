package io.grpc.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class bk implements cy<ScheduledExecutorService> {
    bk() {
    }

    public /* synthetic */ Object a() {
        return b();
    }

    public /* synthetic */ void a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    private static ScheduledExecutorService b() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, bi.a("grpc-timer-%d", true));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.valueOf(true)});
        } catch (NoSuchMethodException e) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Throwable e3) {
            throw new RuntimeException(e3);
        }
        return newScheduledThreadPool;
    }
}
