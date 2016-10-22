package defpackage;

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

/* compiled from: PG */
/* renamed from: zp */
final class zp extends Drawable {
    static zq b;
    private static double f;
    final int a;
    float c;
    float d;
    boolean e;
    private Paint g;
    private Paint h;
    private Paint i;
    private RectF j;
    private Path k;
    private float l;
    private float m;
    private ColorStateList n;
    private boolean o;
    private final int p;
    private final int q;
    private boolean r;

    static {
        f = Math.cos(Math.toRadians(45.0d));
    }

    zp(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.o = true;
        this.e = true;
        this.r = false;
        this.p = resources.getColor(buf.ck);
        this.q = resources.getColor(buf.cj);
        this.a = resources.getDimensionPixelSize(buf.cl);
        this.g = new Paint(5);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.n = colorStateList;
        this.g.setColor(this.n.getColorForState(getState(), this.n.getDefaultColor()));
        this.h = new Paint(5);
        this.h.setStyle(Style.FILL);
        this.c = (float) ((int) (f + 0.5f));
        this.j = new RectF();
        this.i = new Paint(this.h);
        this.i.setAntiAlias(false);
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        } else {
            float a = (float) zp.a(f2);
            float a2 = (float) zp.a(f3);
            if (a > a2) {
                if (!this.r) {
                    this.r = true;
                }
                a = a2;
            }
            if (this.m != a || this.d != a2) {
                this.m = a;
                this.d = a2;
                this.l = (float) ((int) (((a * 1.5f) + ((float) this.a)) + 0.5f));
                this.o = true;
                invalidateSelf();
            }
        }
    }

    private static int a(float f) {
        int i = (int) (0.5f + f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.g.setAlpha(i);
        this.h.setAlpha(i);
        this.i.setAlpha(i);
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.o = true;
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) zp.a(this.d, this.c, this.e));
        int ceil2 = (int) Math.ceil((double) zp.b(this.d, this.c, this.e));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f) * ((double) f2)));
        }
        return 1.5f * f;
    }

    static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f) * ((double) f2)));
        }
        return f;
    }

    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.n.getColorForState(iArr, this.n.getDefaultColor());
        if (this.g.getColor() == colorForState) {
            return false;
        }
        this.g.setColor(colorForState);
        this.o = true;
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        return (this.n != null && this.n.isStateful()) || super.isStateful();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        int i2 = 1;
        if (this.o) {
            Rect bounds = getBounds();
            f = this.d * 1.5f;
            this.j.set(((float) bounds.left) + this.d, ((float) bounds.top) + f, ((float) bounds.right) - this.d, ((float) bounds.bottom) - f);
            RectF rectF = new RectF(-this.c, -this.c, this.c, this.c);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.l, -this.l);
            if (this.k == null) {
                this.k = new Path();
            } else {
                this.k.reset();
            }
            this.k.setFillType(FillType.EVEN_ODD);
            this.k.moveTo(-this.c, 0.0f);
            this.k.rLineTo(-this.l, 0.0f);
            this.k.arcTo(rectF2, 180.0f, 90.0f, false);
            this.k.arcTo(rectF, 270.0f, -90.0f, false);
            this.k.close();
            f = this.c / (this.c + this.l);
            float[] fArr = new float[]{0.0f, f, 1.0f};
            f = 0.0f;
            this.h.setShader(new RadialGradient(0.0f, f, this.c + this.l, new int[]{this.p, this.p, this.q}, fArr, TileMode.CLAMP));
            float f2 = 0.0f;
            this.i.setShader(new LinearGradient(0.0f, (-this.c) + this.l, f2, (-this.c) - this.l, new int[]{this.p, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.i.setAntiAlias(false);
            this.o = false;
        }
        canvas.translate(0.0f, this.m / 2.0f);
        f = (-this.c) - this.l;
        float f3 = (this.c + ((float) this.a)) + (this.m / 2.0f);
        if (this.j.width() - (f3 * 2.0f) > 0.0f) {
            i = 1;
        } else {
            boolean z = false;
        }
        if (this.j.height() - (f3 * 2.0f) <= 0.0f) {
            i2 = 0;
        }
        int save = canvas.save();
        canvas.translate(this.j.left + f3, this.j.top + f3);
        canvas.drawPath(this.k, this.h);
        if (i != 0) {
            canvas.drawRect(0.0f, f, this.j.width() - (f3 * 2.0f), -this.c, this.i);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.j.right - f3, this.j.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.k, this.h);
        if (i != 0) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, f, this.j.width() - (f3 * 2.0f), this.l + (-this.c), this.i);
        }
        canvas.restoreToCount(save);
        i = canvas.save();
        canvas.translate(this.j.left + f3, this.j.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.k, this.h);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.j.height() - (f3 * 2.0f), -this.c, this.i);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(this.j.right - f3, this.j.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.k, this.h);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.j.height() - (f3 * 2.0f), -this.c, this.i);
        }
        canvas.restoreToCount(i);
        canvas.translate(0.0f, (-this.m) / 2.0f);
        b.a(canvas, this.j, this.c, this.g);
    }
}
