package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class msw extends mss implements mtl {
    public abstract mtl mo3703a();

    public /* synthetic */ ExecutorService mo3696b() {
        return mo3703a();
    }

    public /* synthetic */ Object mo3692c() {
        return mo3703a();
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return mo3693a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return mo3694a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return mo3695a(callable);
    }

    public <T> mti<T> mo3695a(Callable<T> callable) {
        return mo3703a().mo3695a((Callable) callable);
    }

    public mti<?> mo3693a(Runnable runnable) {
        return mo3703a().mo3693a(runnable);
    }

    public <T> mti<T> mo3694a(Runnable runnable, T t) {
        return mo3703a().mo3694a(runnable, t);
    }
}
