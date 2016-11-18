package p000;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

final class jsi {
    final jsh f20981a;
    volatile boolean f20982b;
    volatile long f20983c;
    final AtomicLong f20984d;
    final Runnable f20985e;
    private final Executor f20986f;

    jsi(jsh jsh) {
        this(jsi.m25163a(), jsh, 0);
    }

    jsi(jsh jsh, long j) {
        this(jsi.m25163a(), jsh, j);
    }

    private jsi(Executor executor, jsh jsh, long j) {
        this.f20982b = false;
        this.f20984d = new AtomicLong(0);
        this.f20985e = new jsj(this);
        this.f20986f = executor;
        this.f20981a = jsh;
        this.f20983c = j;
    }

    private static Executor m25163a() {
        if (VERSION.SDK_INT >= 11) {
            return AsyncTask.THREAD_POOL_EXECUTOR;
        }
        return null;
    }

    void m25164a(long j) {
        this.f20983c = j;
    }

    void m25165b(long j) {
        this.f20984d.getAndAdd(j);
        if (this.f20984d.get() == this.f20983c || !this.f20982b) {
            this.f20982b = true;
            if (this.f20986f != null) {
                this.f20986f.execute(this.f20985e);
            } else {
                new jsk(this).execute(new Void[0]);
            }
        }
    }
}
