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
    private static final LinearInterpolator c;
    boolean a;
    Runnable b;
    private final ValueAnimator d;
    private final ValueAnimator e;
    private float f;
    private final RectF g;
    private final Rect h;
    private int i;
    private final Paint j;
    private int k;
    private int l;
    private float m;
    private final iuq n;
    private final ius o;
    private float p;
    private int q;

    static {
        c = new LinearInterpolator();
    }

    public ivf(float f, int i, int i2, int i3) {
        this.g = new RectF();
        this.h = new Rect();
        this.q = 255;
        this.k = i;
        this.m = -1.0f;
        this.l = i2;
        this.i = i3;
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(c);
        this.d = ofFloat;
        ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new ivh(this));
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(c);
        this.e = ofFloat;
        this.j = new Paint();
        this.j.setStyle(Style.STROKE);
        this.j.setStrokeCap(Cap.SQUARE);
        this.j.setAntiAlias(true);
        this.a = isVisible();
        this.p = (float) (getLevel() / 10000);
        this.n = new iuq(100.0d, 18.0d);
        this.n.a(((double) getLevel()) / 10000.0d).b((double) c()).a(true).a(new ivg(this));
        this.o = new ius(this.n);
    }

    void b() {
        d();
        this.d.cancel();
        this.e.cancel();
    }

    public int getIntrinsicWidth() {
        if (this.m != -1.0f) {
            return (int) (2.0f * this.m);
        }
        return super.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.m != -1.0f) {
            return (int) (2.0f * this.m);
        }
        return super.getIntrinsicHeight();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (!z3 && !z2) {
            return false;
        }
        this.a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.e.isRunning()) {
                this.d.setCurrentPlayTime(750 - this.e.getCurrentPlayTime());
                this.e.cancel();
            }
            if (z2) {
                b();
            }
            this.d.start();
            this.b = null;
        } else if (z3) {
            if (this.d.isRunning()) {
                this.e.setCurrentPlayTime(750 - this.d.getCurrentPlayTime());
                this.d.cancel();
            }
            this.e.start();
        } else {
            b();
        }
        return z3;
    }

    private boolean a(boolean z) {
        this.a = false;
        boolean visible = super.setVisible(false, false);
        if (visible) {
            if (this.b != null) {
                this.b.run();
            }
            d();
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
            Rect bounds;
            if (this.m == -1.0f) {
                bounds = getBounds();
            } else {
                bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.h.left = centerX - (getIntrinsicWidth() / 2);
                this.h.right = centerX + (getIntrinsicWidth() / 2);
                this.h.top = centerY - (getIntrinsicHeight() / 2);
                this.h.bottom = centerY + (getIntrinsicHeight() / 2);
                bounds = this.h;
            }
            float f = ((float) this.k) * this.f;
            int i = (int) (((float) this.q) * this.f);
            float f2 = ((float) (this.l + this.k)) - (f / 2.0f);
            this.j.setStrokeWidth(f);
            this.g.set(bounds);
            this.g.inset(f2, f2);
            float width = (float) ((3.141592653589793d * ((double) ((this.g.width() / 2.0f) - f))) / ((double) (180.0f * f)));
            f = this.p * 360.0f;
            this.j.setColor(this.i);
            this.j.setAlpha((int) (((float) i) * 0.2f));
            canvas.drawOval(this.g, this.j);
            this.j.setAlpha(i);
            f2 = Math.max(f, width);
            if (f2 >= 5.0f) {
                canvas.drawArc(this.g, -90.0f, f2, false, this.j);
            }
        }
    }

    protected boolean onLevelChange(int i) {
        this.n.b(((double) i) / 10000.0d);
        this.o.a();
        return true;
    }

    public void setAlpha(int i) {
        if (i != this.q) {
            this.q = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void a(float f) {
        this.p = f;
        invalidateSelf();
    }

    private float c() {
        return this.p;
    }

    private void d() {
        this.n.a(((double) getLevel()) / 10000.0d);
        this.o.b();
    }

    @UsedByReflection
    public void setAlphaFraction(float f) {
        this.f = f;
        invalidateSelf();
    }

    @UsedByReflection
    public float getAlphaFraction() {
        return this.f;
    }
}
