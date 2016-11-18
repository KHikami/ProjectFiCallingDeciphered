package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class rn implements OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    final ro a = new ro();
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator f = new AccelerateInterpolator();
    private Runnable g;
    private float[] h = new float[]{0.0f, 0.0f};
    private float[] i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int j;
    private int k;
    private float[] l = new float[]{0.0f, 0.0f};
    private float[] m = new float[]{0.0f, 0.0f};
    private float[] n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean o;
    private boolean p;
    private boolean q;

    public abstract void e(int i);

    public abstract boolean f(int i);

    public rn(View view) {
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        a((float) i, (float) i);
        b((float) i2, (float) i2);
        a(1);
        e(Float.MAX_VALUE, Float.MAX_VALUE);
        d(0.2f, 0.2f);
        c(1.0f, 1.0f);
        b(r);
        c(500);
        d(500);
    }

    public rn a(boolean z) {
        if (this.p && !z) {
            b();
        }
        this.p = z;
        return this;
    }

    public rn a(float f, float f2) {
        this.n[0] = f / 1000.0f;
        this.n[1] = f2 / 1000.0f;
        return this;
    }

    public rn b(float f, float f2) {
        this.m[0] = f / 1000.0f;
        this.m[1] = f2 / 1000.0f;
        return this;
    }

    public rn c(float f, float f2) {
        this.l[0] = 0.001f;
        this.l[1] = 0.001f;
        return this;
    }

    public rn a(int i) {
        this.j = 1;
        return this;
    }

    public rn d(float f, float f2) {
        this.h[0] = 0.2f;
        this.h[1] = 0.2f;
        return this;
    }

    public rn e(float f, float f2) {
        this.i[0] = Float.MAX_VALUE;
        this.i[1] = Float.MAX_VALUE;
        return this;
    }

    public rn b(int i) {
        this.k = i;
        return this;
    }

    public rn c(int i) {
        this.a.a(500);
        return this;
    }

    public rn d(int i) {
        this.a.b(500);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        switch (nh.a(motionEvent)) {
            case 0:
                this.d = true;
                this.o = false;
                break;
            case 1:
            case 3:
                b();
                break;
            case 2:
                break;
        }
        this.a.a(a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.b.getWidth()), a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.b.getHeight()));
        if (!this.e && a()) {
            if (this.g == null) {
                this.g = new rp(this);
            }
            this.e = true;
            this.c = true;
            if (this.o || this.k <= 0) {
                this.g.run();
            } else {
                oa.a(this.b, this.g, (long) this.k);
            }
            this.o = true;
        }
        if (this.q && this.e) {
            return true;
        }
        return false;
    }

    boolean a() {
        ro roVar = this.a;
        int f = roVar.f();
        int e = roVar.e();
        if (f != 0 && f(f)) {
            return true;
        }
        if (e != 0) {
        }
        return false;
    }

    private void b() {
        if (this.c) {
            this.e = false;
        } else {
            this.a.b();
        }
    }

    private float a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float a = rn.a(this.h[i] * f2, 0.0f, this.i[i]);
        a = f(f2 - f, a) - f(f, a);
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
                return rn.a(a * f4, f5, f6);
            }
            return -rn.a((-a) * f4, f5, f6);
        }
        a = rn.a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        f4 = this.l[i];
        f5 = this.m[i];
        f6 = this.n[i];
        f4 *= f3;
        if (a <= 0.0f) {
            return -rn.a((-a) * f4, f5, f6);
        }
        return rn.a(a * f4, f5, f6);
    }

    private float f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.j) {
            case 0:
            case 1:
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
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    static int a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
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
