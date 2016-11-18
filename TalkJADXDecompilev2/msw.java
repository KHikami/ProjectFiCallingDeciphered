package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class msw extends mss implements mtl {
    public abstract mtl a();

    public /* synthetic */ ExecutorService b() {
        return a();
    }

    public /* synthetic */ Object c() {
        return a();
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return a(callable);
    }

    public <T> mti<T> a(Callable<T> callable) {
        return a().a((Callable) callable);
    }

    public mti<?> a(Runnable runnable) {
        return a().a(runnable);
    }

    public <T> mti<T> a(Runnable runnable, T t) {
        return a().a(runnable, t);
    }
}
