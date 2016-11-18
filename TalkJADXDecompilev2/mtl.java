package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface mtl extends ExecutorService {
    mti<?> a(Runnable runnable);

    <T> mti<T> a(Runnable runnable, T t);

    <T> mti<T> a(Callable<T> callable);
}
