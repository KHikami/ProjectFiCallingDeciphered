package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* renamed from: cvv */
final class cvv implements RejectedExecutionHandler {
    cvv() {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        new StringBuilder(String.valueOf(valueOf).length() + 30).append("Service rejected execution of ").append(valueOf);
    }
}
