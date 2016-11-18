package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.api.client.http.ExponentialBackOffPolicy;

public final class wo extends Drawable {
    private static final float f35538b = ((float) Math.toRadians(45.0d));
    private final Paint f35539a = new Paint();
    private float f35540c;
    private float f35541d;
    private float f35542e;
    private float f35543f;
    private boolean f35544g;
    private final Path f35545h = new Path();
    private final int f35546i;
    private boolean f35547j = false;
    private float f35548k;
    private float f35549l;
    private int f35550m = 2;

    public wo(Context context) {
        this.f35539a.setStyle(Style.STROKE);
        this.f35539a.setStrokeJoin(Join.MITER);
        this.f35539a.setStrokeCap(Cap.BUTT);
        this.f35539a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, wi.aO, gwb.P, gwb.cg);
        m41201a(obtainStyledAttributes.getColor(wi.aS, 0));
        m41202b(obtainStyledAttributes.getDimension(wi.aW, 0.0f));
        m41203b(obtainStyledAttributes.getBoolean(wi.aV, true));
        m41204c((float) Math.round(obtainStyledAttributes.getDimension(wi.aU, 0.0f)));
        this.f35546i = obtainStyledAttributes.getDimensionPixelSize(wi.aT, 0);
        this.f35541d = (float) Math.round(obtainStyledAttributes.getDimension(wi.aR, 0.0f));
        this.f35540c = (float) Math.round(obtainStyledAttributes.getDimension(wi.aP, 0.0f));
        this.f35542e = obtainStyledAttributes.getDimension(wi.aQ, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void m41201a(int i) {
        if (i != this.f35539a.getColor()) {
            this.f35539a.setColor(i);
            invalidateSelf();
        }
    }

    private void m41202b(float f) {
        if (this.f35539a.getStrokeWidth() != f) {
            this.f35539a.setStrokeWidth(f);
            this.f35549l = (float) (((double) (f / 2.0f)) * Math.cos((double) f35538b));
            invalidateSelf();
        }
    }

    private void m41204c(float f) {
        if (f != this.f35543f) {
            this.f35543f = f;
            invalidateSelf();
        }
    }

    private void m41203b(boolean z) {
        if (this.f35544g != z) {
            this.f35544g = z;
            invalidateSelf();
        }
    }

    public void m41206a(boolean z) {
        if (this.f35547j != z) {
            this.f35547j = z;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.f35550m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (jb.g(this) != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (jb.g(this) != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float sqrt = (float) Math.sqrt((double) ((this.f35540c * this.f35540c) * 2.0f));
        float f = this.f35541d;
        float f2 = f + ((sqrt - f) * this.f35548k);
        sqrt = this.f35541d;
        float f3 = sqrt + ((this.f35542e - sqrt) * this.f35548k);
        float round = (float) Math.round(0.0f + ((this.f35549l - 0.0f) * this.f35548k));
        float f4 = 0.0f + ((f35538b - 0.0f) * this.f35548k);
        if (i != 0) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (i != 0) {
            sqrt = 180.0f;
        } else {
            sqrt = 0.0f;
        }
        sqrt = ((sqrt - f) * this.f35548k) + f;
        f = (float) Math.round(((double) f2) * Math.cos((double) f4));
        f2 = (float) Math.round(((double) f2) * Math.sin((double) f4));
        this.f35545h.rewind();
        f4 = this.f35543f + this.f35539a.getStrokeWidth();
        f4 += ((-this.f35549l) - f4) * this.f35548k;
        float f5 = (-f3) / 2.0f;
        this.f35545h.moveTo(f5 + round, 0.0f);
        this.f35545h.rLineTo(f3 - (round * 2.0f), 0.0f);
        this.f35545h.moveTo(f5, f4);
        this.f35545h.rLineTo(f, f2);
        this.f35545h.moveTo(f5, -f4);
        this.f35545h.rLineTo(f, -f2);
        this.f35545h.close();
        canvas.save();
        f = this.f35539a.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), (float) (((double) ((float) ((((int) ((((float) bounds.height()) - (3.0f * f)) - (this.f35543f * 2.0f))) / 4) << 1))) + ((((double) f) * ExponentialBackOffPolicy.DEFAULT_MULTIPLIER) + ((double) this.f35543f))));
        if (this.f35544g) {
            canvas.rotate(((float) ((i ^ this.f35547j) != 0 ? -1 : 1)) * sqrt);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f35545h, this.f35539a);
        canvas.restore();
    }

    public void setAlpha(int i) {
        if (i != this.f35539a.getAlpha()) {
            this.f35539a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35539a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f35546i;
    }

    public int getIntrinsicWidth() {
        return this.f35546i;
    }

    public int getOpacity() {
        return -3;
    }

    public void m41205a(float f) {
        if (this.f35548k != f) {
            this.f35548k = f;
            invalidateSelf();
        }
    }
}
