package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;

final class omt implements Executor {
    private final BlockingQueue<Runnable> f33252a = new LinkedBlockingQueue();

    omt() {
    }

    public void m38765a() {
        Runnable runnable = (Runnable) this.f33252a.take();
        while (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                omr.f33250a.log(Level.WARNING, "Runnable threw exception", th);
            }
            runnable = (Runnable) this.f33252a.poll();
        }
    }

    public void execute(Runnable runnable) {
        this.f33252a.add(runnable);
    }
}
