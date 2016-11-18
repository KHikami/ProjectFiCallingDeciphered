package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class juu implements Executor {
    private final BlockingQueue<Runnable> f21083a = new LinkedBlockingQueue();

    juu() {
    }

    public void execute(Runnable runnable) {
        this.f21083a.add(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m25253a() {
        Runnable runnable;
        Object obj = null;
        while (true) {
            try {
                runnable = (Runnable) this.f21083a.poll(Long.MAX_VALUE, TimeUnit.HOURS);
                break;
            } catch (InterruptedException e) {
                int i = 1;
            }
        }
        runnable.run();
        runnable = (Runnable) this.f21083a.poll();
        if (runnable == null) {
        }
    }
}
