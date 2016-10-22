import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

final class jsi {
    final jsh a;
    volatile boolean b;
    volatile long c;
    final AtomicLong d;
    final Runnable e;
    private final Executor f;

    jsi(jsh jsh) {
        this(a(), jsh, 0);
    }

    jsi(jsh jsh, long j) {
        this(a(), jsh, j);
    }

    private jsi(Executor executor, jsh jsh, long j) {
        this.b = false;
        this.d = new AtomicLong(0);
        this.e = new jsj(this);
        this.f = executor;
        this.a = jsh;
        this.c = j;
    }

    private static Executor a() {
        if (VERSION.SDK_INT >= 11) {
            return AsyncTask.THREAD_POOL_EXECUTOR;
        }
        return null;
    }

    void a(long j) {
        this.c = j;
    }

    void b(long j) {
        this.d.getAndAdd(j);
        if (this.d.get() == this.c || !this.b) {
            this.b = true;
            if (this.f != null) {
                this.f.execute(this.e);
            } else {
                new jsk(this).execute(new Void[0]);
            }
        }
    }
}
