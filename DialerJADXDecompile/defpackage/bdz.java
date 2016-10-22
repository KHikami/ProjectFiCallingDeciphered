package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: bdz */
public class bdz implements Executor {
    public void execute(Runnable runnable) {
        Executors.newSingleThreadExecutor().execute(runnable);
    }
}
