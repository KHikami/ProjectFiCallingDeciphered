package defpackage;

import java.util.concurrent.Executor;

/* renamed from: mtp */
public enum mtp implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
