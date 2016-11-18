package defpackage;

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
    private static final LinearInterpolator l = new LinearInterpolator();
    private long A;
    private long B;
    private long C;
    AnimatorSet a;
    final ValueAnimator b;
    float c;
    float d;
    int e;
    int f;
    int[] g;
    boolean h;
    Runnable i;
    private final RectF j = new RectF();
    private final Rect k = new Rect();
    private final ValueAnimator m;
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ValueAnimator q;
    private final ArrayList<ValueAnimator> r;
    private float s;
    private float t;
    private float u;
    private Paint v;
    private int w;
    private int x;
    private int y;
    private float z;

    public ivi(float f, int i, int i2, int[] iArr) {
        this.x = i;
        this.z = -1.0f;
        this.y = i2;
        this.g = iArr;
        this.h = isVisible();
        this.r = new ArrayList();
        ArrayList arrayList = this.r;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1332);
        ofFloat.setInterpolator(l);
        this.m = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.r;
        ofFloat = ObjectAnimator.ofInt(this, "currentColor", new int[]{this.g[this.e], this.g[b()]});
        ofFloat.setEvaluator(iue.a);
        ofFloat.setStartDelay(999);
        ofFloat.setDuration(333);
        ofFloat.setInterpolator(l);
        this.f = this.g[this.e];
        this.b = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.r;
        ofFloat = ObjectAnimator.ofFloat(this, "headFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(gwb.ay());
        this.n = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.r;
        ofFloat = ObjectAnimator.ofFloat(this, "tailFraction", new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(666);
        ofFloat.setDuration(666);
        ofFloat.setInterpolator(gwb.ay());
        this.o = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.r;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.addListener(new ivj(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(l);
        this.p = ofFloat;
        arrayList.add(ofFloat);
        arrayList = this.r;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new ivk(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(l);
        this.q = ofFloat;
        arrayList.add(ofFloat);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{this.m, this.n, this.o, this.b});
        boolean z = ivv.a;
        if (!ivv.b) {
            iug.a(animatorSet, new ivl(this));
        }
        this.a = animatorSet;
        this.v = new Paint();
        this.v.setStyle(Style.STROKE);
        this.v.setStrokeCap(Cap.SQUARE);
        this.v.setAntiAlias(true);
        this.w = 255;
        setVisible(false, false);
        c();
    }

    private void a(boolean z) {
        setVisible(z, true);
    }

    public int getIntrinsicWidth() {
        if (this.z != -1.0f) {
            return (int) (2.0f * this.z);
        }
        return super.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.z != -1.0f) {
            return (int) (2.0f * this.z);
        }
        return super.getIntrinsicHeight();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.h;
        if (!z3 && !z2) {
            return false;
        }
        this.h = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.q.isRunning()) {
                if (this.A == 0) {
                    this.p.setCurrentPlayTime(750 - this.q.getCurrentPlayTime());
                }
                this.q.cancel();
            }
            if (z2) {
                c();
                this.p.setStartDelay(this.A);
                this.p.start();
                this.B = this.A;
                this.A = 0;
            } else {
                this.B = Math.max(0, this.B - (SystemClock.elapsedRealtime() - this.C));
                this.p.setStartDelay(this.B);
                this.p.start();
            }
            this.C = SystemClock.elapsedRealtime();
            this.i = null;
        } else if (z3) {
            if (this.p.isRunning()) {
                this.q.setCurrentPlayTime(750 - this.p.getCurrentPlayTime());
                this.p.cancel();
            }
            this.q.start();
        } else {
            c();
        }
        return z3;
    }

    public void a(Runnable runnable) {
        this.i = runnable;
        stop();
    }

    public void a() {
        stop();
        c();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            if (isVisible() || this.q.isRunning()) {
                Rect bounds;
                if (this.z == -1.0f) {
                    bounds = getBounds();
                } else {
                    bounds = getBounds();
                    int centerX = bounds.centerX();
                    int centerY = bounds.centerY();
                    this.k.left = centerX - (getIntrinsicWidth() / 2);
                    this.k.right = centerX + (getIntrinsicWidth() / 2);
                    this.k.top = centerY - (getIntrinsicHeight() / 2);
                    this.k.bottom = centerY + (getIntrinsicHeight() / 2);
                    bounds = this.k;
                }
                float f = ((float) this.x) * this.u;
                int i = (int) (((float) this.w) * this.u);
                float f2 = ((float) (this.y + this.x)) - (f / 2.0f);
                this.v.setColor(this.f);
                this.v.setAlpha(i);
                this.v.setStrokeWidth(f);
                this.j.set(bounds);
                this.j.inset(f2, f2);
                float width = (float) ((3.141592653589793d * ((double) ((this.j.width() / 2.0f) - f))) / ((double) (180.0f * f)));
                f = this.d * 290.0f;
                f2 = Math.max(Math.abs((this.t * 290.0f) - f), width);
                Canvas canvas2 = canvas;
                canvas2.drawArc(this.j, (((286.0f * this.s) + this.c) + f) - 0.049804688f, f2, false, this.v);
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.w) {
            this.w = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
        invalidateSelf();
    }

    int b() {
        return (this.e + 1) % this.g.length;
    }

    void c() {
        super.setVisible(this.h, false);
        this.a.cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Animator) obj).cancel();
        }
        d();
        this.t = 0.0f;
        this.d = 0.0f;
        this.s = 0.0f;
        this.c = 0.0f;
        this.e = 0;
        this.f = this.g[this.e];
        this.b.setIntValues(new int[]{this.g[this.e], this.g[b()]});
        this.u = 0.0f;
        invalidateSelf();
    }

    void d() {
        this.b.setStartDelay(999);
        this.o.setStartDelay(666);
    }

    public void start() {
        a(true);
    }

    public void stop() {
        a(false);
    }

    public boolean isRunning() {
        return this.a.isRunning() || this.p.isRunning();
    }

    @UsedByReflection
    public void setDetentFraction(float f) {
        this.s = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getDetentFraction() {
        return this.s;
    }

    @UsedByReflection
    public void setHeadFraction(float f) {
        this.t = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getHeadFraction() {
        return this.t;
    }

    @UsedByReflection
    public void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getTailFraction() {
        return this.d;
    }

    @UsedByReflection
    public void setAlphaFraction(float f) {
        this.u = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getAlphaFraction() {
        return this.u;
    }

    @UsedByReflection
    public void setCurrentColor(int i) {
        this.f = i;
        invalidateSelf();
    }

    @UsedByReflection
    public int getCurrentColor() {
        return this.f;
    }
}
