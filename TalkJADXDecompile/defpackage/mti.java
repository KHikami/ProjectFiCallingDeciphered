package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: mti */
public interface mti<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
