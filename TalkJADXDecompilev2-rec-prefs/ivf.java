package p000;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.common.proguard.UsedByReflection;

public final class ivf extends Drawable implements ive {
    private static final LinearInterpolator f19099c = new LinearInterpolator();
    boolean f19100a;
    Runnable f19101b;
    private final ValueAnimator f19102d;
    private final ValueAnimator f19103e;
    private float f19104f;
    private final RectF f19105g = new RectF();
    private final Rect f19106h = new Rect();
    private int f19107i;
    private final Paint f19108j;
    private int f19109k;
    private int f19110l;
    private float f19111m;
    private final iuq f19112n;
    private final ius f19113o;
    private float f19114p;
    private int f19115q = 255;

    public ivf(float f, int i, int i2, int i3) {
        this.f19109k = i;
        this.f19111m = -1.0f;
        this.f19110l = i2;
        this.f19107i = i3;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(f19099c);
        this.f19102d = ofFloat;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new ivh(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(f19099c);
        this.f19103e = ofFloat;
        this.f19108j = new Paint();
        this.f19108j.setStyle(Style.STROKE);
        this.f19108j.setStrokeCap(Cap.SQUARE);
        this.f19108j.setAntiAlias(true);
        this.f19100a = isVisible();
        this.f19114p = (float) (getLevel() / 10000);
        this.f19112n = new iuq(100.0d, 18.0d);
        this.f19112n.m23320a(((double) getLevel()) / 10000.0d).m23323b((double) m23348c()).m23322a(true).m23321a(new ivg(this));
        this.f19113o = new ius(this.f19112n);
    }

    void m23353b() {
        m23349d();
        this.f19102d.cancel();
        this.f19103e.cancel();
    }

    public int getIntrinsicWidth() {
        if (this.f19111m != -1.0f) {
            return (int) (2.0f * this.f19111m);
        }
        return super.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.f19111m != -1.0f) {
            return (int) (2.0f * this.f19111m);
        }
        return super.getIntrinsicHeight();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f19100a;
        if (!z3 && !z2) {
            return false;
        }
        this.f19100a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f19103e.isRunning()) {
                this.f19102d.setCurrentPlayTime(750 - this.f19103e.getCurrentPlayTime());
                this.f19103e.cancel();
            }
            if (z2) {
                m23353b();
            }
            this.f19102d.start();
            this.f19101b = null;
        } else if (z3) {
            if (this.f19102d.isRunning()) {
                this.f19103e.setCurrentPlayTime(750 - this.f19102d.getCurrentPlayTime());
                this.f19102d.cancel();
            }
            this.f19103e.start();
        } else {
            m23353b();
        }
        return z3;
    }

    private boolean m23347a(boolean z) {
        this.f19100a = false;
        boolean visible = super.setVisible(false, false);
        if (visible) {
            if (this.f19101b != null) {
                this.f19101b.run();
            }
            m23349d();
        }
        this.f19101b = null;
        return visible;
    }

    public void mo3406a(Runnable runnable) {
        this.f19101b = runnable;
        setVisible(false, false);
    }

    public void mo3405a() {
        m23347a(false);
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            Rect bounds;
            if (this.f19111m == -1.0f) {
                bounds = getBounds();
            } else {
                bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.f19106h.left = centerX - (getIntrinsicWidth() / 2);
                this.f19106h.right = centerX + (getIntrinsicWidth() / 2);
                this.f19106h.top = centerY - (getIntrinsicHeight() / 2);
                this.f19106h.bottom = centerY + (getIntrinsicHeight() / 2);
                bounds = this.f19106h;
            }
            float f = ((float) this.f19109k) * this.f19104f;
            int i = (int) (((float) this.f19115q) * this.f19104f);
            float f2 = ((float) (this.f19110l + this.f19109k)) - (f / 2.0f);
            this.f19108j.setStrokeWidth(f);
            this.f19105g.set(bounds);
            this.f19105g.inset(f2, f2);
            float width = (float) ((3.141592653589793d * ((double) ((this.f19105g.width() / 2.0f) - f))) / ((double) (180.0f * f)));
            f = this.f19114p * 360.0f;
            this.f19108j.setColor(this.f19107i);
            this.f19108j.setAlpha((int) (((float) i) * 0.2f));
            canvas.drawOval(this.f19105g, this.f19108j);
            this.f19108j.setAlpha(i);
            f2 = Math.max(f, width);
            if (f2 >= 5.0f) {
                canvas.drawArc(this.f19105g, -90.0f, f2, false, this.f19108j);
            }
        }
    }

    protected boolean onLevelChange(int i) {
        this.f19112n.m23323b(((double) i) / 10000.0d);
        this.f19113o.m23327a();
        return true;
    }

    public void setAlpha(int i) {
        if (i != this.f19115q) {
            this.f19115q = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19108j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void m23351a(float f) {
        this.f19114p = f;
        invalidateSelf();
    }

    private float m23348c() {
        return this.f19114p;
    }

    private void m23349d() {
        this.f19112n.m23320a(((double) getLevel()) / 10000.0d);
        this.f19113o.m23328b();
    }

    @UsedByReflection
    public void setAlphaFraction(float f) {
        this.f19104f = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getAlphaFraction() {
        return this.f19104f;
    }
}
