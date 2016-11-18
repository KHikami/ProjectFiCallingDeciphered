package p000;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class asm extends ThreadPoolExecutor {
    public static final long f2287a = TimeUnit.SECONDS.toMillis(10);
    private final boolean f2288b;

    public static asm m3940a() {
        return new asm(1, "disk-cache", asq.f2298d, true, false);
    }

    public asm(int i, String str, asq asq, boolean z, boolean z2) {
        this(i, i, 0, str, asq, z, false);
    }

    private asm(int i, int i2, long j, String str, asq asq, boolean z, boolean z2) {
        this(i, i2, 0, str, asq, z, z2, new PriorityBlockingQueue());
    }

    public asm(int i, int i2, long j, String str, asq asq, boolean z, boolean z2, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, TimeUnit.MILLISECONDS, blockingQueue, new aso(str, asq, z));
        this.f2288b = z2;
    }

    public void execute(Runnable runnable) {
        if (this.f2288b) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }

    public Future<?> submit(Runnable runnable) {
        return m3941a(super.submit(runnable));
    }

    private <T> Future<T> m3941a(Future<T> future) {
        if (this.f2288b) {
            Object obj = null;
            while (!future.isDone()) {
                try {
                    future.get();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e2) {
                    obj = 1;
                } catch (Throwable th) {
                    if (obj != null) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (obj != null) {
                Thread.currentThread().interrupt();
            }
        }
        return future;
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return m3941a(super.submit(runnable, t));
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return m3941a(super.submit(callable));
    }

    public static int m3942b() {
        File[] listFiles;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            listFiles = new File("/sys/devices/system/cpu/").listFiles(new asn(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        return Math.min(4, Math.max(Math.max(1, Runtime.getRuntime().availableProcessors()), listFiles != null ? listFiles.length : 0));
    }
}
