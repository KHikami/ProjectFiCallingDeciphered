package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

final class bg extends bd {
    static final Handler f3244a = new Handler(Looper.getMainLooper());
    long f3245b;
    boolean f3246c;
    float f3247d;
    long f3248e = 200;
    Interpolator f3249f;
    final Runnable f3250g = new bh(this);
    private final int[] f3251h = new int[2];
    private final float[] f3252i = new float[2];
    private ArrayList<be> f3253j;
    private ArrayList<bf> f3254k;

    bg() {
    }

    public void mo518a() {
        if (!this.f3246c) {
            if (this.f3249f == null) {
                this.f3249f = new AccelerateDecelerateInterpolator();
            }
            this.f3246c = true;
            this.f3247d = 0.0f;
            this.f3245b = SystemClock.uptimeMillis();
            m5098f();
            m5088h();
            f3244a.postDelayed(this.f3250g, 10);
        }
    }

    public boolean mo523b() {
        return this.f3246c;
    }

    public void mo521a(Interpolator interpolator) {
        this.f3249f = interpolator;
    }

    public void mo522a(bf bfVar) {
        if (this.f3254k == null) {
            this.f3254k = new ArrayList();
        }
        this.f3254k.add(bfVar);
    }

    public void mo519a(int i, int i2) {
        this.f3251h[0] = i;
        this.f3251h[1] = i2;
    }

    public int mo524c() {
        return r.a(this.f3251h[0], this.f3251h[1], m5097e());
    }

    public void mo520a(long j) {
        this.f3248e = j;
    }

    public void mo525d() {
        int i = 0;
        this.f3246c = false;
        f3244a.removeCallbacks(this.f3250g);
        if (this.f3253j != null) {
            int size = this.f3253j.size();
            while (i < size) {
                this.f3253j.get(i);
                i++;
            }
        }
        m5099g();
    }

    public float m5097e() {
        return this.f3247d;
    }

    void m5098f() {
        if (this.f3254k != null) {
            int size = this.f3254k.size();
            for (int i = 0; i < size; i++) {
                ((bf) this.f3254k.get(i)).m5037a();
            }
        }
    }

    private void m5088h() {
        if (this.f3253j != null) {
            int size = this.f3253j.size();
            for (int i = 0; i < size; i++) {
                this.f3253j.get(i);
            }
        }
    }

    void m5099g() {
        if (this.f3253j != null) {
            int size = this.f3253j.size();
            for (int i = 0; i < size; i++) {
                ((be) this.f3253j.get(i)).m4989a();
            }
        }
    }
}
