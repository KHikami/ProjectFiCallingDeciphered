package p000;

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

public final class ivp extends Drawable implements Animatable, ive {
    final AnimatorSet f19169a;
    boolean f19170b = isVisible();
    Runnable f19171c;
    Runnable f19172d;
    private final int f19173e;
    private final boolean f19174f;
    private int f19175g;
    private int f19176h;
    private int f19177i;
    private final Paint f19178j = new Paint();
    private final ObjectAnimator f19179k;
    private final ObjectAnimator f19180l;
    private final float f19181m;
    private float f19182n;
    private float f19183o = 1.0f;
    private float f19184p;
    private float f19185q;
    private float f19186r;
    private float f19187s;
    private float f19188t;
    private Rect f19189u;

    public ivp(int i, int i2, float f, boolean z, int i3) {
        float f2;
        this.f19175g = i;
        this.f19176h = i2;
        this.f19173e = Math.round(255.0f * f);
        this.f19174f = z;
        this.f19177i = i3;
        this.f19178j.setStyle(Style.FILL);
        this.f19178j.setAntiAlias(true);
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
        boolean z2 = ivv.f19247a;
        if (!ivv.f19248b) {
            iug.m23306a(animatorSet, null);
        }
        this.f19169a = animatorSet;
        this.f19181m = 1.0f;
        if (i3 != 2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        this.f19182n = f2;
        this.f19179k = gwb.m1973b((Object) this, "growScale");
        ObjectAnimator c = gwb.m2076c((Object) this, "growScale");
        c.addListener(new ivr(this));
        this.f19180l = c;
        this.f19189u = new Rect();
        m23375b();
    }

    void m23375b() {
        this.f19179k.cancel();
        this.f19180l.cancel();
        this.f19169a.cancel();
        this.f19184p = 0.1f;
        this.f19185q = -522.6f;
        this.f19186r = 0.1f;
        this.f19187s = -197.6f;
        this.f19188t = this.f19182n;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f19170b;
        if (!z3 && !z2) {
            return false;
        }
        this.f19170b = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                m23375b();
            }
            this.f19180l.cancel();
            this.f19179k.setFloatValues(new float[]{this.f19181m});
            this.f19179k.start();
            if (!this.f19169a.isStarted()) {
                this.f19169a.start();
            }
            this.f19172d = null;
        } else if (z3) {
            this.f19179k.cancel();
            this.f19180l.setFloatValues(new float[]{this.f19182n});
            this.f19180l.start();
        }
        return z3;
    }

    public boolean m23374a(boolean z) {
        this.f19170b = false;
        boolean visible = super.setVisible(false, false);
        if (visible) {
            this.f19179k.cancel();
            this.f19180l.cancel();
            this.f19169a.cancel();
            if (this.f19172d != null) {
                this.f19172d.run();
            }
        }
        this.f19172d = null;
        return visible;
    }

    public void mo3406a(Runnable runnable) {
        this.f19172d = runnable;
        stop();
    }

    public void mo3405a() {
        m23374a(false);
    }

    public void m23376b(Runnable runnable) {
        this.f19171c = runnable;
    }

    public boolean m23377c() {
        return this.f19180l.isRunning();
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getIntrinsicHeight() {
        return this.f19175g;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f19189u)) {
            canvas.save();
            float height = (float) this.f19189u.height();
            if (height > ((float) this.f19175g)) {
                canvas.translate(0.0f, (height - ((float) this.f19175g)) / 2.0f);
            }
            canvas.scale(((float) this.f19189u.width()) / 360.0f, ((float) this.f19175g) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.f19188t < 1.0f) {
                if (this.f19177i == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (4.0f * (this.f19188t - 1.0f)) * 0.5f);
                canvas.scale(1.0f, this.f19188t);
            }
            this.f19178j.setColor(this.f19176h);
            this.f19178j.setAlpha((int) (this.f19183o * ((float) this.f19173e)));
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.f19178j);
            this.f19178j.setColor(this.f19176h);
            if (this.f19174f) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.f19178j.setAlpha((int) (this.f19183o * 255.0f));
            canvas.save();
            canvas.translate(this.f19185q, 0.0f);
            canvas.scale(this.f19184p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f19178j);
            canvas.restore();
            canvas.save();
            canvas.translate(this.f19187s, 0.0f);
            canvas.scale(this.f19186r, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f19178j);
            canvas.restore();
            canvas.restore();
        }
    }

    @UsedByReflection
    public void setRect1ScaleX(float f) {
        this.f19184p = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect1ScaleX() {
        return this.f19184p;
    }

    @UsedByReflection
    public void setRect1TranslationX(float f) {
        this.f19185q = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect1TranslationX() {
        return this.f19185q;
    }

    @UsedByReflection
    public void setRect2ScaleX(float f) {
        this.f19186r = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect2ScaleX() {
        return this.f19186r;
    }

    @UsedByReflection
    public void setRect2TranslationX(float f) {
        this.f19187s = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getRect2TranslationX() {
        return this.f19187s;
    }

    @UsedByReflection
    public void setGrowScale(float f) {
        this.f19188t = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getGrowScale() {
        return this.f19188t;
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
        this.f19183o = (float) i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19178j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }
}
