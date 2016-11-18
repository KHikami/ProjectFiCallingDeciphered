package p000;

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
    static final double f469a = Math.cos(Math.toRadians(45.0d));
    static aex f470c;
    final int f471b;
    Paint f472d;
    Paint f473e;
    Paint f474f;
    final RectF f475g;
    float f476h;
    Path f477i;
    float f478j;
    float f479k;
    float f480l;
    float f481m;
    private ColorStateList f482n;
    private boolean f483o = true;
    private final int f484p;
    private final int f485q;
    private boolean f486r = true;
    private boolean f487s = false;

    aew(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f484p = resources.getColor(gwb.cm);
        this.f485q = resources.getColor(gwb.cl);
        this.f471b = resources.getDimensionPixelSize(gwb.cn);
        this.f472d = new Paint(5);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f482n = colorStateList;
        this.f472d.setColor(this.f482n.getColorForState(getState(), this.f482n.getDefaultColor()));
        this.f473e = new Paint(5);
        this.f473e.setStyle(Style.FILL);
        this.f476h = (float) ((int) (0.5f + f));
        this.f475g = new RectF();
        this.f474f = new Paint(this.f473e);
        this.f474f.setAntiAlias(false);
        m895a(f2, f3);
    }

    private static int m894a(float f) {
        int i = (int) (0.5f + f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    public void m899a(boolean z) {
        this.f486r = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f472d.setAlpha(i);
        this.f473e.setAlpha(i);
        this.f474f.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f483o = true;
    }

    private void m895a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float a = (float) aew.m894a(f);
            float a2 = (float) aew.m894a(f2);
            if (a > a2) {
                if (!this.f487s) {
                    this.f487s = true;
                }
                a = a2;
            }
            if (this.f481m != a || this.f479k != a2) {
                this.f481m = a;
                this.f479k = a2;
                this.f480l = (float) ((int) (((a * 1.5f) + ((float) this.f471b)) + 0.5f));
                this.f478j = ((float) this.f471b) + a2;
                this.f483o = true;
                invalidateSelf();
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) aew.m893a(this.f479k, this.f476h, this.f486r));
        int ceil2 = (int) Math.ceil((double) aew.m896b(this.f479k, this.f476h, this.f486r));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float m893a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f469a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    static float m896b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f469a) * ((double) f2)));
        }
        return f;
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f482n.getColorForState(iArr, this.f482n.getDefaultColor());
        if (this.f472d.getColor() == colorForState) {
            return false;
        }
        this.f472d.setColor(colorForState);
        this.f483o = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return (this.f482n != null && this.f482n.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f472d.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        float f;
        int i;
        int i2 = 1;
        if (this.f483o) {
            Rect bounds = getBounds();
            f = this.f479k * 1.5f;
            this.f475g.set(((float) bounds.left) + this.f479k, ((float) bounds.top) + f, ((float) bounds.right) - this.f479k, ((float) bounds.bottom) - f);
            RectF rectF = new RectF(-this.f476h, -this.f476h, this.f476h, this.f476h);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f480l, -this.f480l);
            if (this.f477i == null) {
                this.f477i = new Path();
            } else {
                this.f477i.reset();
            }
            this.f477i.setFillType(FillType.EVEN_ODD);
            this.f477i.moveTo(-this.f476h, 0.0f);
            this.f477i.rLineTo(-this.f480l, 0.0f);
            this.f477i.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f477i.arcTo(rectF, 270.0f, -90.0f, false);
            this.f477i.close();
            f = this.f476h / (this.f476h + this.f480l);
            float[] fArr = new float[]{0.0f, f, 1.0f};
            f = 0.0f;
            this.f473e.setShader(new RadialGradient(0.0f, f, this.f476h + this.f480l, new int[]{this.f484p, this.f484p, this.f485q}, fArr, TileMode.CLAMP));
            float f2 = 0.0f;
            this.f474f.setShader(new LinearGradient(0.0f, (-this.f476h) + this.f480l, f2, (-this.f476h) - this.f480l, new int[]{this.f484p, this.f484p, this.f485q}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f474f.setAntiAlias(false);
            this.f483o = false;
        }
        canvas.translate(0.0f, this.f481m / 2.0f);
        f = (-this.f476h) - this.f480l;
        float f3 = (this.f476h + ((float) this.f471b)) + (this.f481m / 2.0f);
        if (this.f475g.width() - (f3 * 2.0f) > 0.0f) {
            i = 1;
        } else {
            boolean z = false;
        }
        if (this.f475g.height() - (f3 * 2.0f) <= 0.0f) {
            i2 = 0;
        }
        int save = canvas.save();
        canvas.translate(this.f475g.left + f3, this.f475g.top + f3);
        canvas.drawPath(this.f477i, this.f473e);
        if (i != 0) {
            canvas.drawRect(0.0f, f, this.f475g.width() - (f3 * 2.0f), -this.f476h, this.f474f);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.f475g.right - f3, this.f475g.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f477i, this.f473e);
        if (i != 0) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, f, this.f475g.width() - (f3 * 2.0f), this.f480l + (-this.f476h), this.f474f);
        }
        canvas.restoreToCount(save);
        i = canvas.save();
        canvas.translate(this.f475g.left + f3, this.f475g.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f477i, this.f473e);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.f475g.height() - (f3 * 2.0f), -this.f476h, this.f474f);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(this.f475g.right - f3, this.f475g.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f477i, this.f473e);
        if (i2 != 0) {
            canvas.drawRect(0.0f, f, this.f475g.height() - (f3 * 2.0f), -this.f476h, this.f474f);
        }
        canvas.restoreToCount(i);
        canvas.translate(0.0f, (-this.f481m) / 2.0f);
        f470c.mo22a(canvas, this.f475g, this.f476h, this.f472d);
    }

    void m898a(Rect rect) {
        getPadding(rect);
    }

    float m897a() {
        return (Math.max(this.f479k, (this.f476h + ((float) this.f471b)) + (this.f479k / 2.0f)) * 2.0f) + ((this.f479k + ((float) this.f471b)) * 2.0f);
    }

    float m900b() {
        return (Math.max(this.f479k, (this.f476h + ((float) this.f471b)) + ((this.f479k * 1.5f) / 2.0f)) * 2.0f) + (((this.f479k * 1.5f) + ((float) this.f471b)) * 2.0f);
    }
}
