package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import r;

/* renamed from: bg */
final class bg extends bd {
    static final Handler a;
    long b;
    boolean c;
    float d;
    long e;
    Interpolator f;
    final Runnable g;
    private final int[] h;
    private final float[] i;
    private ArrayList<be> j;
    private ArrayList<bf> k;

    bg() {
        this.h = new int[2];
        this.i = new float[2];
        this.e = 200;
        this.g = new bh(this);
    }

    static {
        a = new Handler(Looper.getMainLooper());
    }

    public void a() {
        if (!this.c) {
            if (this.f == null) {
                this.f = new AccelerateDecelerateInterpolator();
            }
            this.c = true;
            this.d = 0.0f;
            this.b = SystemClock.uptimeMillis();
            f();
            h();
            a.postDelayed(this.g, 10);
        }
    }

    public boolean b() {
        return this.c;
    }

    public void a(Interpolator interpolator) {
        this.f = interpolator;
    }

    public void a(bf bfVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(bfVar);
    }

    public void a(int i, int i2) {
        this.h[0] = i;
        this.h[1] = i2;
    }

    public int c() {
        return r.a(this.h[0], this.h[1], e());
    }

    public void a(long j) {
        this.e = j;
    }

    public void d() {
        int i = 0;
        this.c = false;
        a.removeCallbacks(this.g);
        if (this.j != null) {
            int size = this.j.size();
            while (i < size) {
                this.j.get(i);
                i++;
            }
        }
        g();
    }

    public float e() {
        return this.d;
    }

    void f() {
        if (this.k != null) {
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                ((bf) this.k.get(i)).a();
            }
        }
    }

    private void h() {
        if (this.j != null) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                this.j.get(i);
            }
        }
    }

    void g() {
        if (this.j != null) {
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                ((be) this.j.get(i)).a();
            }
        }
    }
}
