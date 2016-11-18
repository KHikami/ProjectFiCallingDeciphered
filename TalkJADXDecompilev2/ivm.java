package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.common.proguard.UsedByReflection;

public final class ivm extends Drawable implements ive {
    boolean a;
    Runnable b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private final Paint g;
    private final iuq h;
    private final ius i;
    private final ObjectAnimator j;
    private final ObjectAnimator k;
    private final float l;
    private float m;
    private float n;
    private float o;
    private double p;
    private final iur q = new ivo(this);

    public ivm(int i, int i2, float f, int i3) {
        float f2 = 0.0f;
        this.d = i;
        this.e = i2;
        this.c = Math.round(255.0f * f);
        this.f = i3;
        this.g = new Paint();
        this.g.setStyle(Style.FILL);
        this.g.setAntiAlias(true);
        this.n = 1.0f;
        this.a = isVisible();
        this.o = 0.0f;
        this.p = ((double) getLevel()) / 10000.0d;
        this.l = 1.0f;
        if (i3 == 2) {
            f2 = 1.0f;
        }
        this.m = f2;
        this.h = new iuq(100.0d, 18.0d);
        this.h.a(((double) getLevel()) / 10000.0d).b(d()).a(true).a(this.q);
        this.i = new ius(this.h);
        this.j = gwb.b((Object) this, "growScale");
        ObjectAnimator c = gwb.c((Object) this, "growScale");
        c.addListener(new ivn(this));
        this.k = c;
    }

    private void c() {
        this.k.cancel();
        this.j.setFloatValues(new float[]{this.l});
        this.j.start();
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getIntrinsicHeight() {
        return this.d;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                b();
                this.j.cancel();
                this.k.cancel();
                this.o = this.m;
            }
            c();
            this.b = null;
        } else if (z3) {
            this.j.cancel();
            this.k.setFloatValues(new float[]{this.m});
            this.k.start();
        }
        return z3;
    }

    public boolean a(boolean z) {
        this.a = z;
        boolean visible = super.setVisible(z, false);
        if (visible) {
            if (z) {
                c();
                this.j.end();
                b();
            } else {
                this.j.cancel();
                this.k.cancel();
                b();
                if (this.b != null) {
                    this.b.run();
                }
            }
        }
        this.b = null;
        return visible;
    }

    public void a(Runnable runnable) {
        this.b = runnable;
        setVisible(false, false);
    }

    public void a() {
        a(false);
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            if (height > ((float) this.d)) {
                canvas.translate(0.0f, (height - ((float) this.d)) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.d) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.o < 1.0f) {
                if (this.f == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (4.0f * (this.o - 1.0f)) * 0.5f);
                canvas.scale(1.0f, this.o);
            }
            this.g.setColor(this.e);
            this.g.setAlpha((int) (this.n * ((float) this.c)));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.g);
            this.g.setAlpha((int) (this.n * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.p * 10000.0d)) - 8.687973E-4f, 2.0f, this.g);
            canvas.restore();
        }
    }

    protected boolean onLevelChange(int i) {
        this.h.b(((double) i) / 10000.0d);
        this.i.a();
        return true;
    }

    public void setAlpha(int i) {
        this.n = (float) i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void a(double d) {
        this.p = d;
        invalidateSelf();
    }

    private double d() {
        return this.p;
    }

    public void b() {
        this.h.a(((double) getLevel()) / 10000.0d);
        this.i.b();
    }

    @UsedByReflection
    public void setGrowScale(float f) {
        this.o = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getGrowScale() {
        return this.o;
    }
}
