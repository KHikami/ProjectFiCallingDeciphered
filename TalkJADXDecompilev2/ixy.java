package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

final class ixy implements RejectedExecutionHandler {
    ixy() {
    }

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        new StringBuilder(String.valueOf(valueOf).length() + 30).append("Service rejected execution of ").append(valueOf);
    }
}
