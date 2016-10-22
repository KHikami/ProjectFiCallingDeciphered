import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: PG */
final class at extends ar {
    static final Handler a;
    long b;
    boolean c;
    long d;
    Interpolator e;
    as f;
    float g;
    final Runnable h;
    private final int[] i;
    private final float[] j;

    at() {
        this.i = new int[2];
        this.j = new float[2];
        this.d = 200;
        this.h = new au(this);
    }

    static {
        a = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (!this.c) {
            if (this.e == null) {
                this.e = new AccelerateDecelerateInterpolator();
            }
            this.b = SystemClock.uptimeMillis();
            this.c = true;
            this.g = 0.0f;
            a.postDelayed(this.h, 10);
        }
    }

    public final boolean b() {
        return this.c;
    }

    public final void a(Interpolator interpolator) {
        this.e = interpolator;
    }

    public final void a(as asVar) {
        this.f = asVar;
    }

    public final void a(int i, int i2) {
        this.i[0] = i;
        this.i[1] = i2;
    }

    public final int c() {
        return c.a(this.i[0], this.i[1], this.g);
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void d() {
        this.c = false;
        a.removeCallbacks(this.h);
    }
}
