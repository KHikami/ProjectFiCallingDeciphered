package defpackage;

import android.os.SystemClock;

public final class izu {
    private final Object a = new Object();
    private final int b;
    private int c = 0;
    private long d = 0;

    public izu(int i) {
        this.b = i;
    }

    public boolean a() {
        boolean z = false;
        synchronized (this.a) {
            if (SystemClock.elapsedRealtime() - this.d > 1000) {
            } else if (this.c >= this.b) {
                z = true;
            }
        }
        return z;
    }

    public void b() {
        synchronized (this.a) {
            this.c++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = elapsedRealtime;
            }
        }
    }
}
