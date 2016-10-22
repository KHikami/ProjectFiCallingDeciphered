import android.os.Handler;
import android.os.SystemClock;
import java.util.Objects;

/* compiled from: PG */
public final class bab extends Handler {
    long a;
    long b;
    boolean c;
    private Runnable d;
    private Runnable e;

    public bab(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.b = 0;
        this.a = 0;
        this.c = false;
        this.e = runnable;
        this.d = new bac(this);
    }

    public final void a() {
        removeCallbacks(this.d);
        this.c = false;
    }

    final void b() {
        if (this.c) {
            long j = this.a + this.b;
            while (SystemClock.uptimeMillis() >= j) {
                j += this.b;
            }
            postAtTime(this.d, j);
            this.a = j;
            this.e.run();
        }
    }
}
