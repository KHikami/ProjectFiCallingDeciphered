package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class jrb implements Executor {
    private final BlockingQueue<Runnable> f20823a = new LinkedBlockingQueue();

    jrb() {
    }

    public void execute(Runnable runnable) {
        this.f20823a.add(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m25047a() {
        Runnable runnable;
        Object obj = null;
        while (true) {
            try {
                runnable = (Runnable) this.f20823a.poll(Long.MAX_VALUE, TimeUnit.HOURS);
                break;
            } catch (InterruptedException e) {
                int i = 1;
            }
        }
        runnable.run();
        runnable = (Runnable) this.f20823a.poll();
        if (runnable == null) {
        }
    }
}
