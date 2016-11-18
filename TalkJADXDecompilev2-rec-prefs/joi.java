package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class joi implements ThreadFactory {
    joi() {
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("Login Manager Threadpool");
        return newThread;
    }
}
