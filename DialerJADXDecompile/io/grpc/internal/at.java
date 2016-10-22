package io.grpc.internal;

import dcv;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
final class at implements cd {
    at() {
    }

    public final /* synthetic */ Object a() {
        return b();
    }

    public final /* synthetic */ void a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    private static ScheduledExecutorService b() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new dcv().a(true).a("grpc-timer-%d").a());
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
