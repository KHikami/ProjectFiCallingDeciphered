import android.os.SystemClock;

/* compiled from: PG */
public final class cxa {
    public final Object a;
    public int b;
    public long c;
    private final int d;

    public cxa(int i) {
        this.a = new Object();
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final boolean a() {
        boolean z = false;
        synchronized (this.a) {
            if (SystemClock.elapsedRealtime() - this.c > 1000) {
            } else if (this.b >= this.d) {
                z = true;
            }
        }
        return z;
    }
}
