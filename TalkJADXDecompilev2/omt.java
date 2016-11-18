package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;

final class omt implements Executor {
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();

    omt() {
    }

    public void a() {
        Runnable runnable = (Runnable) this.a.take();
        while (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                omr.a.log(Level.WARNING, "Runnable threw exception", th);
            }
            runnable = (Runnable) this.a.poll();
        }
    }

    public void execute(Runnable runnable) {
        this.a.add(runnable);
    }
}
