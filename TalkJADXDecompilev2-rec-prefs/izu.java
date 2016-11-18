package p000;

import android.os.SystemClock;

public final class izu {
    private final Object f19497a = new Object();
    private final int f19498b;
    private int f19499c = 0;
    private long f19500d = 0;

    public izu(int i) {
        this.f19498b = i;
    }

    public boolean m23609a() {
        boolean z = false;
        synchronized (this.f19497a) {
            if (SystemClock.elapsedRealtime() - this.f19500d > 1000) {
            } else if (this.f19499c >= this.f19498b) {
                z = true;
            }
        }
        return z;
    }

    public void m23610b() {
        synchronized (this.f19497a) {
            this.f19499c++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f19500d > 1000) {
                this.f19499c = 0;
                this.f19500d = elapsedRealtime;
            }
        }
    }
}
