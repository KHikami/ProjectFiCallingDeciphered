package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.common.proguard.UsedByReflection;

/* renamed from: ivp */
public final class ivp extends Drawable implements Animatable, ive {
    final AnimatorSet a;
    boolean b;
    Runnable c;
    Runnable d;
    private final int e;
    private final boolean f;
    private int g;
    private int h;
    private int i;
    private final Paint j;
    private final ObjectAnimator k;
    private final ObjectAnimator l;
    private final float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Rect u;

    public ivp(int i, int i2, float f, boolean z, int i3) {
        float f2;
        this.g = i;
        this.h = i2;
        this.e = Math.round(255.0f * f);
        this.f = z;
        this.i = i3;
        this.o = 1.0f;
        this.b = isVisible();
        this.j = new Paint();
        this.j.setStyle(Style.FILL);
        this.j.setAntiAlias(true);
        Animator animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.1f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.8268492f});
        ofFloat2.setInterpolator(new iuy(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.8268492f, 0.1f});
        ofFloat3.setInterpolator(new iuy(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        Animator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", new float[]{-522.6f, 199.6f});
        ofFloat4.setInterpolator(new iuy(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400);
        ofFloat4.setDuration(1600);
        animatorSet.play(ofFloat4);
        ofFloat = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.1f, 0.55f});
        ofFloat.setInterpolator(new iuy(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat.setDuration(352);
        ofFloat2 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.55f, 0.90995026f});
        ofFloat2.setInterpolator(new iuy(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat2.setDuration(532);
        ofFloat3 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.90995026f, 0.1f});
        ofFloat3.setInterpolator(new iuy(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat3.setDuration(1116);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        ofFloat = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{-208.0f, 132.0f});
        ofFloat.setInterpolator(new iuy(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat.setDuration(964);
        ofFloat2 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{132.0f, 422.6f});
        ofFloat2.setInterpolator(new iuy(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat2.setDuration(1036);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new ivq(this));
        boolean z2 = ivv.a;
        if (!ivv.b) {
            iug.a(animatorSet, null);
        }
        this.a = animatorSet;
        this.m = 1.0f;
        if (i3 != 2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        this.n = f2;
        this.k = gwb.b((Object) this, "growScale");
        ObjectAnimator c = gwb.c((Object) this, "growScale");
        c.addListener(new ivr(this));
        this.l = c;
        this.u = new Rect();
        b();
    }

    void b() {
        this.k.cancel();
        this.l.cancel();
        this.a.cancel();
        this.p = 0.1f;
        this.q = -522.6f;
        this.r = 0.1f;
        this.s = -197.6f;
        this.t = this.n;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.b;
        if (!z3 && !z2) {
            return false;
        }
        this.b = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
            }
            this.l.cancel();
            this.k.setFloatValues(new float[]{this.m});
            this.k.start();
            if (!this.a.isStarted()) {
                this.a.start();
            }
            this.d = null;
        } else if (z3) {
            this.k.cancel();
            this.l.setFloatValues(new float[]{this.n});
            this.l.start();
        }
        return z3;
    }

    public boolean a(boolean z) {
        this.b = false;
        boolean visible = super.setVisible(false, false);
        if (visible) {
            this.k.cancel();
            this.l.cancel();
            this.a.cancel();
            if (this.d != null) {
                this.d.run();
            }
        }
        this.d = null;
        return visible;
    }

    public void a(Runnable runnable) {
        this.d = runnable;
        stop();
    }

    public void a() {
        a(false);
    }

    public void b(Runnable runnable) {
        this.c = runnable;
    }

    public boolean c() {
        return this.l.isRunning();
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getIntrinsicHeight() {
        return this.g;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.u)) {
            canvas.save();
            float height = (float) this.u.height();
            if (height > ((float) this.g)) {
                canvas.translate(0.0f, (height - ((float) this.g)) / 2.0f);
            }
            canvas.scale(((float) this.u.width()) / 360.0f, ((float) this.g) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.t < 1.0f) {
                if (this.i == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (4.0f * (this.t - 1.0f)) * 0.5f);
                canvas.scale(1.0f, this.t);
            }
            this.j.setColor(this.h);
            this.j.setAlpha((int) (this.o * ((float) this.e)));
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.j);
            this.j.setColor(this.h);
            if (this.f) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.j.setAlpha((int) (this.o * 255.0f));
            canvas.save();
            canvas.translate(this.q, 0.0f);
            canvas.scale(this.p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.j);
            canvas.restore();
            canvas.save();
            canvas.translate(this.s, 0.0f);
            canvas.scale(this.r, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.j);
            canvas.restore();
            canvas.restore();
        }
    }

    @UsedByReflection
    public void setRect1ScaleX(float f) {
        this.p = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect1ScaleX() {
        return this.p;
    }

    @UsedByReflection
    public void setRect1TranslationX(float f) {
        this.q = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect1TranslationX() {
        return this.q;
    }

    @UsedByReflection
    public void setRect2ScaleX(float f) {
        this.r = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect2ScaleX() {
        return this.r;
    }

    @UsedByReflection
    public void setRect2TranslationX(float f) {
        this.s = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect2TranslationX() {
        return this.s;
    }

    @UsedByReflection
    public void setGrowScale(float f) {
        this.t = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getGrowScale() {
        return this.t;
    }

    public void start() {
        setVisible(true, true);
    }

    public void stop() {
        setVisible(false, false);
    }

    public boolean isRunning() {
        return isVisible();
    }

    public void setAlpha(int i) {
        this.o = (float) i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }
}
