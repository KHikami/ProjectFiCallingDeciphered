import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

final class aew extends Drawable {
    static final double a;
    static aex c;
    final int b;
    Paint d;
    Paint e;
    Paint f;
    final RectF g;
    float h;
    Path i;
    float j;
    float k;
    float l;
    float m;
    private ColorStateList n;
    private boolean o;
    private final int p;
    private final int q;
    private boolean r;
    private boolean s;

    static {
        a = Math.cos(Math.toRadians(45.0d));
    }

    aew(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.o = true;
        this.r = true;
        this.s = false;
        this.p = resources.getColor(gwb.cm);
        this.q = resources.getColor(gwb.cl);
        this.b = resources.getDimensionPixelSize(gwb.cn);
        this.d = new Paint(5);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.n = colorStateList;
        this.d.setColor(this.n.getColorForState(getState(), this.n.getDefaultColor()));
        this.e = new Paint(5);
        this.e.setStyle(Style.FILL);
        this.h = (float) ((int) (0.5f + f));
        this.g = new RectF();
        this.f = new Paint(this.e);
        this.f.setAntiAlias(false);
        a(f2, f3);
    }

    private static int a(float f) {
        int i = (int) (0.5f + f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    public void a(boolean z) {
        this.r = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.d.setAlpha(i);
        this.e.setAlpha(i);
        this.f.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.o = true;
    }

    private void a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float a = (float) a(f);
            float a2 = (float) a(f2);
            if (a > a2) {
                if (!this.s) {
                    this.s = true;
                }
                a = a2;
            }
            if (this.m != a || this.k != a2) {
                this.m = a;
                this.k = a2;
                this.l = (float) ((int) (((a * 1.5f) + ((float) this.b)) + 0.5f));
                this.j = ((float) this.b) + a2;
                this.o = true;
                invalidateSelf();
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) a(this.k, this.h, this.r));
        int ceil2 = (int) Math.ceil((double) b(this.k, this.h, this.r));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - a) * ((double) f2)));
        }
        return f;
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.n.getColorForState(iArr, this.n.getDefaultColor());
        if (this.d.getColor() == colorForState) {
            return false;
        }
        this.d.setColor(colorForState);
        this.o = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return (this.n != null && this.n.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        float f;
        int i;
        int i2 = 1;
        if (this.o) {
            Rect bounds = getBounds();
            f = this.k * 1.5f;
            this.g.set(((float) bounds.left) + this.k, ((float) bounds.top) + f, ((float) bounds.right) - this.k, ((float) bounds.bottom) - f);
            RectF rectF = new RectF(-this.h, -this.h, this.h, this.h);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.l, -this.l);
            if (this.i == null) {
                this.i = new Path();
            } else {
                this.i.reset();
            }
            this.i.setFillType(FillType.EVEN_ODD);
            this.i.moveTo(-this.h, 0.0f);
            this.i.rLineTo(-this.l, 0.0f);
            this.i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.i.arcTo(rectF, 270.0f, -90.0f, false);
            this.i.close();
            f = this.h / (this.h + this.l);
            float[] fArr = new float[]{0.0f, f, 1.0f};
            f = 0.0f;
            this.e.setShader(new RadialGradient(0.0f, f, this.h + this.l, new int[]{this.p, this.p, this.q}, fArr, TileMode.CLAMP));
            float f2 = 0.0f;
            this.f.setShader(new LinearGradient(0.0f, (-this.h) + this.l, f2, (-this.h) - this.l, new int[]{this.p, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f.setAntiAlias(false);
            this.o = false;
        }
        canvas.translate(0.0f, this.m / 2.0f);
        f = (-this.h) - this.l;
        float f3 = (this.h + ((float) this.b)) + (this.m / 2.0f);
        if (this.g.width() - (f3 * 2.0f) > 0.0f) {
            i = 1;
        } else {
            boolean z = false;
        }
        if (this.g.height() - (f3 * 2.0f) <= 0.0f) {
            i2 = 0;
        }
        int save = canvas.save();
        canvas.translate(this.g.left + f3, this.g.top + f3);
        canvas.drawPath(this.i, this.e);
        if (i != 0) {
            canvas.drawRect(0.0f, f, this.g.width() - (f3 * 2.0f), -this.h, this.f);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.g.right - f3, this.g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.i, this.e);
        if (i != 0) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, f, this.g.width() - (f3 * 2.0f), this.l + (-this.h), this.f);
        }
        canvas.restoreToCount(save);
        i = canvas.save();
        canvas.translate(this.g.left + f3, this.g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.i, this.e);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.g.height() - (f3 * 2.0f), -this.h, this.f);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(this.g.right - f3, this.g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.i, this.e);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.g.height() - (f3 * 2.0f), -this.h, this.f);
        }
        canvas.restoreToCount(i);
        canvas.translate(0.0f, (-this.m) / 2.0f);
        c.a(canvas, this.g, this.h, this.d);
    }

    void a(Rect rect) {
        getPadding(rect);
    }

    float a() {
        return (Math.max(this.k, (this.h + ((float) this.b)) + (this.k / 2.0f)) * 2.0f) + ((this.k + ((float) this.b)) * 2.0f);
    }

    float b() {
        return (Math.max(this.k, (this.h + ((float) this.b)) + ((this.k * 1.5f) / 2.0f)) * 2.0f) + (((this.k * 1.5f) + ((float) this.b)) * 2.0f);
    }
}
