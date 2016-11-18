package p000;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.common.proguard.UsedByReflection;

public final class ivm extends Drawable implements ive {
    boolean f19150a;
    Runnable f19151b;
    private final int f19152c;
    private int f19153d;
    private int f19154e;
    private int f19155f;
    private final Paint f19156g;
    private final iuq f19157h;
    private final ius f19158i;
    private final ObjectAnimator f19159j;
    private final ObjectAnimator f19160k;
    private final float f19161l;
    private float f19162m;
    private float f19163n;
    private float f19164o;
    private double f19165p;
    private final iur f19166q = new ivo(this);

    public ivm(int i, int i2, float f, int i3) {
        float f2 = 0.0f;
        this.f19153d = i;
        this.f19154e = i2;
        this.f19152c = Math.round(255.0f * f);
        this.f19155f = i3;
        this.f19156g = new Paint();
        this.f19156g.setStyle(Style.FILL);
        this.f19156g.setAntiAlias(true);
        this.f19163n = 1.0f;
        this.f19150a = isVisible();
        this.f19164o = 0.0f;
        this.f19165p = ((double) getLevel()) / 10000.0d;
        this.f19161l = 1.0f;
        if (i3 == 2) {
            f2 = 1.0f;
        }
        this.f19162m = f2;
        this.f19157h = new iuq(100.0d, 18.0d);
        this.f19157h.m23320a(((double) getLevel()) / 10000.0d).m23323b(m23364d()).m23322a(true).m23321a(this.f19166q);
        this.f19158i = new ius(this.f19157h);
        this.f19159j = gwb.m1973b((Object) this, "growScale");
        ObjectAnimator c = gwb.m2076c((Object) this, "growScale");
        c.addListener(new ivn(this));
        this.f19160k = c;
    }

    private void m23363c() {
        this.f19160k.cancel();
        this.f19159j.setFloatValues(new float[]{this.f19161l});
        this.f19159j.start();
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getIntrinsicHeight() {
        return this.f19153d;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f19150a;
        if (!z3 && !z2) {
            return false;
        }
        this.f19150a = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                m23369b();
                this.f19159j.cancel();
                this.f19160k.cancel();
                this.f19164o = this.f19162m;
            }
            m23363c();
            this.f19151b = null;
        } else if (z3) {
            this.f19159j.cancel();
            this.f19160k.setFloatValues(new float[]{this.f19162m});
            this.f19160k.start();
        }
        return z3;
    }

    public boolean m23368a(boolean z) {
        this.f19150a = z;
        boolean visible = super.setVisible(z, false);
        if (visible) {
            if (z) {
                m23363c();
                this.f19159j.end();
                m23369b();
            } else {
                this.f19159j.cancel();
                this.f19160k.cancel();
                m23369b();
                if (this.f19151b != null) {
                    this.f19151b.run();
                }
            }
        }
        this.f19151b = null;
        return visible;
    }

    public void mo3406a(Runnable runnable) {
        this.f19151b = runnable;
        setVisible(false, false);
    }

    public void mo3405a() {
        m23368a(false);
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            if (height > ((float) this.f19153d)) {
                canvas.translate(0.0f, (height - ((float) this.f19153d)) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.f19153d) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.f19164o < 1.0f) {
                if (this.f19155f == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (4.0f * (this.f19164o - 1.0f)) * 0.5f);
                canvas.scale(1.0f, this.f19164o);
            }
            this.f19156g.setColor(this.f19154e);
            this.f19156g.setAlpha((int) (this.f19163n * ((float) this.f19152c)));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.f19156g);
            this.f19156g.setAlpha((int) (this.f19163n * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.f19165p * 10000.0d)) - 8.687973E-4f, 2.0f, this.f19156g);
            canvas.restore();
        }
    }

    protected boolean onLevelChange(int i) {
        this.f19157h.m23323b(((double) i) / 10000.0d);
        this.f19158i.m23327a();
        return true;
    }

    public void setAlpha(int i) {
        this.f19163n = (float) i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19156g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void m23366a(double d) {
        this.f19165p = d;
        invalidateSelf();
    }

    private double m23364d() {
        return this.f19165p;
    }

    public void m23369b() {
        this.f19157h.m23320a(((double) getLevel()) / 10000.0d);
        this.f19158i.m23328b();
    }

    @UsedByReflection
    public void setGrowScale(float f) {
        this.f19164o = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getGrowScale() {
        return this.f19164o;
    }
}
