import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
public abstract class ns implements OnTouchListener {
    private static final int q;
    final nt a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator f;
    private Runnable g;
    private float[] h;
    private float[] i;
    private int j;
    private int k;
    private float[] l;
    private float[] m;
    private float[] n;
    private boolean o;
    private boolean p;

    public abstract void a(int i);

    public abstract boolean b(int i);

    static {
        q = ViewConfiguration.getTapTimeout();
    }

    public ns(View view) {
        this.a = new nt();
        this.f = new AccelerateInterpolator();
        this.h = new float[]{0.0f, 0.0f};
        this.i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.l = new float[]{0.0f, 0.0f};
        this.m = new float[]{0.0f, 0.0f};
        this.n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        float f2 = (float) i;
        this.n[0] = f / 1000.0f;
        this.n[1] = f2 / 1000.0f;
        f2 = (float) i2;
        float f3 = (float) i2;
        this.m[0] = f2 / 1000.0f;
        this.m[1] = f3 / 1000.0f;
        this.j = 1;
        this.i[0] = Float.MAX_VALUE;
        this.i[1] = Float.MAX_VALUE;
        this.h[0] = 0.2f;
        this.h[1] = 0.2f;
        this.l[0] = 0.001f;
        this.l[1] = 0.001f;
        this.k = q;
        this.a.a = 500;
        this.a.b = 500;
    }

    public final ns a(boolean z) {
        if (this.p && !z) {
            b();
        }
        this.p = z;
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.p) {
            switch (jw.a(motionEvent)) {
                case rl.c /*0*/:
                    this.d = true;
                    this.o = false;
                    break;
                case rq.b /*1*/:
                case rl.e /*3*/:
                    b();
                    break;
                case rq.c /*2*/:
                    break;
                default:
                    break;
            }
            float a = a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.b.getWidth());
            float a2 = a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.b.getHeight());
            nt ntVar = this.a;
            ntVar.c = a;
            ntVar.d = a2;
            if (!this.e && a()) {
                if (this.g == null) {
                    this.g = new nu(this);
                }
                this.e = true;
                this.c = true;
                if (this.o || this.k <= 0) {
                    this.g.run();
                } else {
                    kn.a(this.b, this.g, (long) this.k);
                }
                this.o = true;
            }
        }
        return false;
    }

    final boolean a() {
        nt ntVar = this.a;
        int abs = (int) (ntVar.d / Math.abs(ntVar.d));
        int abs2 = (int) (ntVar.c / Math.abs(ntVar.c));
        if (abs != 0 && b(abs)) {
            return true;
        }
        if (abs2 != 0) {
        }
        return false;
    }

    private final void b() {
        if (this.c) {
            this.e = false;
            return;
        }
        nt ntVar = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - ntVar.e);
        int i2 = ntVar.b;
        if (i <= i2) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
        }
        ntVar.k = i2;
        ntVar.j = ntVar.a(currentAnimationTimeMillis);
        ntVar.i = currentAnimationTimeMillis;
    }

    private final float a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float a = a(this.h[i] * f2, 0.0f, this.i[i]);
        a = a(f2 - f, a) - a(f, a);
        if (a < 0.0f) {
            a = -this.f.getInterpolation(-a);
        } else if (a > 0.0f) {
            a = this.f.getInterpolation(a);
        } else {
            a = 0.0f;
            if (a == 0.0f) {
                return 0.0f;
            }
            f4 = this.l[i];
            f5 = this.m[i];
            f6 = this.n[i];
            f4 *= f3;
            if (a <= 0.0f) {
                return a(a * f4, f5, f6);
            }
            return -a((-a) * f4, f5, f6);
        }
        a = a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        f4 = this.l[i];
        f5 = this.m[i];
        f6 = this.n[i];
        f4 *= f3;
        if (a <= 0.0f) {
            return -a((-a) * f4, f5, f6);
        }
        return a(a * f4, f5, f6);
    }

    private final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.j) {
            case rl.c /*0*/:
            case rq.b /*1*/:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.e && this.j == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case rq.c /*2*/:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }
}
