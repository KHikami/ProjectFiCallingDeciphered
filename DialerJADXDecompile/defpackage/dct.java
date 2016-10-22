package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dct */
public enum dct implements Executor {
    INSTANCE;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
