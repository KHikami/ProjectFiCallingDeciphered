package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: anb */
final class anb implements ThreadFactory {
    anb() {
    }

    public synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
