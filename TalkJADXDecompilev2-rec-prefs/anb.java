package p000;

import java.util.concurrent.ThreadFactory;

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
