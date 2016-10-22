import android.os.SystemClock;

public final class izu {
    private final Object a;
    private final int b;
    private int c;
    private long d;

    public izu(int i) {
        this.a = new Object();
        this.c = 0;
        this.d = 0;
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
