package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class rn implements OnTouchListener {
    private static final int f35050r = ViewConfiguration.getTapTimeout();
    final ro f35051a = new ro();
    final View f35052b;
    boolean f35053c;
    boolean f35054d;
    boolean f35055e;
    private final Interpolator f35056f = new AccelerateInterpolator();
    private Runnable f35057g;
    private float[] f35058h = new float[]{0.0f, 0.0f};
    private float[] f35059i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int f35060j;
    private int f35061k;
    private float[] f35062l = new float[]{0.0f, 0.0f};
    private float[] f35063m = new float[]{0.0f, 0.0f};
    private float[] f35064n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean f35065o;
    private boolean f35066p;
    private boolean f35067q;

    public abstract void mo4377e(int i);

    public abstract boolean mo4378f(int i);

    public rn(View view) {
        this.f35052b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m40541a((float) i, (float) i);
        m40545b((float) i2, (float) i2);
        m40542a(1);
        m40551e(Float.MAX_VALUE, Float.MAX_VALUE);
        m40549d(0.2f, 0.2f);
        m40547c(1.0f, 1.0f);
        m40546b(f35050r);
        m40548c(500);
        m40550d(500);
    }

    public rn m40543a(boolean z) {
        if (this.f35066p && !z) {
            m40539b();
        }
        this.f35066p = z;
        return this;
    }

    public rn m40541a(float f, float f2) {
        this.f35064n[0] = f / 1000.0f;
        this.f35064n[1] = f2 / 1000.0f;
        return this;
    }

    public rn m40545b(float f, float f2) {
        this.f35063m[0] = f / 1000.0f;
        this.f35063m[1] = f2 / 1000.0f;
        return this;
    }

    public rn m40547c(float f, float f2) {
        this.f35062l[0] = 0.001f;
        this.f35062l[1] = 0.001f;
        return this;
    }

    public rn m40542a(int i) {
        this.f35060j = 1;
        return this;
    }

    public rn m40549d(float f, float f2) {
        this.f35058h[0] = 0.2f;
        this.f35058h[1] = 0.2f;
        return this;
    }

    public rn m40551e(float f, float f2) {
        this.f35059i[0] = Float.MAX_VALUE;
        this.f35059i[1] = Float.MAX_VALUE;
        return this;
    }

    public rn m40546b(int i) {
        this.f35061k = i;
        return this;
    }

    public rn m40548c(int i) {
        this.f35051a.m40557a(500);
        return this;
    }

    public rn m40550d(int i) {
        this.f35051a.m40559b(500);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f35066p) {
            return false;
        }
        switch (nh.m34904a(motionEvent)) {
            case 0:
                this.f35054d = true;
                this.f35065o = false;
                break;
            case 1:
            case 3:
                m40539b();
                break;
            case 2:
                break;
        }
        this.f35051a.m40556a(m40537a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f35052b.getWidth()), m40537a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f35052b.getHeight()));
        if (!this.f35055e && m40544a()) {
            if (this.f35057g == null) {
                this.f35057g = new rp(this);
            }
            this.f35055e = true;
            this.f35053c = true;
            if (this.f35065o || this.f35061k <= 0) {
                this.f35057g.run();
            } else {
                oa.m37337a(this.f35052b, this.f35057g, (long) this.f35061k);
            }
            this.f35065o = true;
        }
        if (this.f35067q && this.f35055e) {
            return true;
        }
        return false;
    }

    boolean m40544a() {
        ro roVar = this.f35051a;
        int f = roVar.m40563f();
        int e = roVar.m40562e();
        if (f != 0 && mo4378f(f)) {
            return true;
        }
        if (e != 0) {
        }
        return false;
    }

    private void m40539b() {
        if (this.f35053c) {
            this.f35055e = false;
        } else {
            this.f35051a.m40558b();
        }
    }

    private float m40537a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float a = rn.m40536a(this.f35058h[i] * f2, 0.0f, this.f35059i[i]);
        a = m40540f(f2 - f, a) - m40540f(f, a);
        if (a < 0.0f) {
            a = -this.f35056f.getInterpolation(-a);
        } else if (a > 0.0f) {
            a = this.f35056f.getInterpolation(a);
        } else {
            a = 0.0f;
            if (a == 0.0f) {
                return 0.0f;
            }
            f4 = this.f35062l[i];
            f5 = this.f35063m[i];
            f6 = this.f35064n[i];
            f4 *= f3;
            if (a <= 0.0f) {
                return rn.m40536a(a * f4, f5, f6);
            }
            return -rn.m40536a((-a) * f4, f5, f6);
        }
        a = rn.m40536a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        f4 = this.f35062l[i];
        f5 = this.f35063m[i];
        f6 = this.f35064n[i];
        f4 *= f3;
        if (a <= 0.0f) {
            return -rn.m40536a((-a) * f4, f5, f6);
        }
        return rn.m40536a(a * f4, f5, f6);
    }

    private float m40540f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f35060j) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f35055e && this.f35060j == 1) {
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

    static int m40538a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    static float m40536a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }
}
