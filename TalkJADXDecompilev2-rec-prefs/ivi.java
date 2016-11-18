package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;

public final class ivi extends Drawable implements Animatable, ive {
    private static final LinearInterpolator f19118l = new LinearInterpolator();
    private long f19119A;
    private long f19120B;
    private long f19121C;
    AnimatorSet f19122a;
    final ValueAnimator f19123b;
    float f19124c;
    float f19125d;
    int f19126e;
    int f19127f;
    int[] f19128g;
    boolean f19129h;
    Runnable f19130i;
    private final RectF f19131j = new RectF();
    private final Rect f19132k = new Rect();
    private final ValueAnimator f19133m;
    private final ValueAnimator f19134n;
    private final ValueAnimator f19135o;
    private final ValueAnimator f19136p;
    private final ValueAnimator f19137q;
    private final ArrayList<ValueAnimator> f19138r;
    private float f19139s;
    private float f19140t;
    private float f19141u;
    private Paint f19142v;
    private int f19143w;
    private int f19144x;
    private int f19145y;
    private float f19146z;

    public ivi(float f, int i, int i2, int[] iArr) {
        this.f19144x = i;
        this.f19146z = -1.0f;
        this.f19145y = i2;
        this.f19128g = iArr;
        this.f19129h = isVisible();
        this.f19138r = new ArrayList();
        ArrayList arrayList = this.f19138r;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1332);
        ofFloat.setInterpolator(f19118l);
        this.f19133m = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.f19138r;
        ofFloat = ObjectAnimator.ofInt(this, "currentColor", new int[]{this.f19128g[this.f19126e], this.f19128g[m23359b()]});
        ofFloat.setEvaluator(iue.f19036a);
        ofFloat.setStartDelay(999);
        ofFloat.setDuration(333);
        ofFloat.setInterpolator(f19118l);
        this.f19127f = this.f19128g[this.f19126e];
        this.f19123b = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.f19138r;
        ofFloat = ObjectAnimator.ofFloat(this, "headFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(gwb.ay());
        this.f19134n = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.f19138r;
        ofFloat = ObjectAnimator.ofFloat(this, "tailFraction", new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(666);
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(gwb.ay());
        this.f19135o = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.f19138r;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.addListener(new ivj(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(f19118l);
        this.f19136p = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.f19138r;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new ivk(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(f19118l);
        this.f19137q = ofFloat;
        arrayList.add(ofFloat);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{this.f19133m, this.f19134n, this.f19135o, this.f19123b});
        boolean z = ivv.f19247a;
        if (!ivv.f19248b) {
            iug.m23306a(animatorSet, new ivl(this));
        }
        this.f19122a = animatorSet;
        this.f19142v = new Paint();
        this.f19142v.setStyle(Style.STROKE);
        this.f19142v.setStrokeCap(Cap.SQUARE);
        this.f19142v.setAntiAlias(true);
        this.f19143w = 255;
        setVisible(false, false);
        m23360c();
    }

    private void m23355a(boolean z) {
        setVisible(z, true);
    }

    public int getIntrinsicWidth() {
        if (this.f19146z != -1.0f) {
            return (int) (2.0f * this.f19146z);
        }
        return super.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.f19146z != -1.0f) {
            return (int) (2.0f * this.f19146z);
        }
        return super.getIntrinsicHeight();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f19129h;
        if (!z3 && !z2) {
            return false;
        }
        this.f19129h = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f19137q.isRunning()) {
                if (this.f19119A == 0) {
                    this.f19136p.setCurrentPlayTime(750 - this.f19137q.getCurrentPlayTime());
                }
                this.f19137q.cancel();
            }
            if (z2) {
                m23360c();
                this.f19136p.setStartDelay(this.f19119A);
                this.f19136p.start();
                this.f19120B = this.f19119A;
                this.f19119A = 0;
            } else {
                this.f19120B = Math.max(0, this.f19120B - (SystemClock.elapsedRealtime() - this.f19121C));
                this.f19136p.setStartDelay(this.f19120B);
                this.f19136p.start();
            }
            this.f19121C = SystemClock.elapsedRealtime();
            this.f19130i = null;
        } else if (z3) {
            if (this.f19136p.isRunning()) {
                this.f19137q.setCurrentPlayTime(750 - this.f19136p.getCurrentPlayTime());
                this.f19136p.cancel();
            }
            this.f19137q.start();
        } else {
            m23360c();
        }
        return z3;
    }

    public void mo3406a(Runnable runnable) {
        this.f19130i = runnable;
        stop();
    }

    public void mo3405a() {
        stop();
        m23360c();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            if (isVisible() || this.f19137q.isRunning()) {
                Rect bounds;
                if (this.f19146z == -1.0f) {
                    bounds = getBounds();
                } else {
                    bounds = getBounds();
                    int centerX = bounds.centerX();
                    int centerY = bounds.centerY();
                    this.f19132k.left = centerX - (getIntrinsicWidth() / 2);
                    this.f19132k.right = centerX + (getIntrinsicWidth() / 2);
                    this.f19132k.top = centerY - (getIntrinsicHeight() / 2);
                    this.f19132k.bottom = centerY + (getIntrinsicHeight() / 2);
                    bounds = this.f19132k;
                }
                float f = ((float) this.f19144x) * this.f19141u;
                int i = (int) (((float) this.f19143w) * this.f19141u);
                float f2 = ((float) (this.f19145y + this.f19144x)) - (f / 2.0f);
                this.f19142v.setColor(this.f19127f);
                this.f19142v.setAlpha(i);
                this.f19142v.setStrokeWidth(f);
                this.f19131j.set(bounds);
                this.f19131j.inset(f2, f2);
                float width = (float) ((3.141592653589793d * ((double) ((this.f19131j.width() / 2.0f) - f))) / ((double) (180.0f * f)));
                f = this.f19125d * 290.0f;
                f2 = Math.max(Math.abs((this.f19140t * 290.0f) - f), width);
                Canvas canvas2 = canvas;
                canvas2.drawArc(this.f19131j, (((286.0f * this.f19139s) + this.f19124c) + f) - 0.049804688f, f2, false, this.f19142v);
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f19143w) {
            this.f19143w = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19142v.setColorFilter(colorFilter);
        invalidateSelf();
    }

    int m23359b() {
        return (this.f19126e + 1) % this.f19128g.length;
    }

    void m23360c() {
        super.setVisible(this.f19129h, false);
        this.f19122a.cancel();
        ArrayList arrayList = this.f19138r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Animator) obj).cancel();
        }
        m23361d();
        this.f19140t = 0.0f;
        this.f19125d = 0.0f;
        this.f19139s = 0.0f;
        this.f19124c = 0.0f;
        this.f19126e = 0;
        this.f19127f = this.f19128g[this.f19126e];
        this.f19123b.setIntValues(new int[]{this.f19128g[this.f19126e], this.f19128g[m23359b()]});
        this.f19141u = 0.0f;
        invalidateSelf();
    }

    void m23361d() {
        this.f19123b.setStartDelay(999);
        this.f19135o.setStartDelay(666);
    }

    public void start() {
        m23355a(true);
    }

    public void stop() {
        m23355a(false);
    }

    public boolean isRunning() {
        return this.f19122a.isRunning() || this.f19136p.isRunning();
    }

    @UsedByReflection
    public void setDetentFraction(float f) {
        this.f19139s = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getDetentFraction() {
        return this.f19139s;
    }

    @UsedByReflection
    public void setHeadFraction(float f) {
        this.f19140t = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getHeadFraction() {
        return this.f19140t;
    }

    @UsedByReflection
    public void setTailFraction(float f) {
        this.f19125d = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getTailFraction() {
        return this.f19125d;
    }

    @UsedByReflection
    public void setAlphaFraction(float f) {
        this.f19141u = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getAlphaFraction() {
        return this.f19141u;
    }

    @UsedByReflection
    public void setCurrentColor(int i) {
        this.f19127f = i;
        invalidateSelf();
    }

    @UsedByReflection
    public int getCurrentColor() {
        return this.f19127f;
    }
}
