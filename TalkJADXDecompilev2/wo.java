package defpackage;

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
    private static final float b = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h = new Path();
    private final int i;
    private boolean j = false;
    private float k;
    private float l;
    private int m = 2;

    public wo(Context context) {
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeJoin(Join.MITER);
        this.a.setStrokeCap(Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, wi.aO, gwb.P, gwb.cg);
        a(obtainStyledAttributes.getColor(wi.aS, 0));
        b(obtainStyledAttributes.getDimension(wi.aW, 0.0f));
        b(obtainStyledAttributes.getBoolean(wi.aV, true));
        c((float) Math.round(obtainStyledAttributes.getDimension(wi.aU, 0.0f)));
        this.i = obtainStyledAttributes.getDimensionPixelSize(wi.aT, 0);
        this.d = (float) Math.round(obtainStyledAttributes.getDimension(wi.aR, 0.0f));
        this.c = (float) Math.round(obtainStyledAttributes.getDimension(wi.aP, 0.0f));
        this.e = obtainStyledAttributes.getDimension(wi.aQ, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void a(int i) {
        if (i != this.a.getColor()) {
            this.a.setColor(i);
            invalidateSelf();
        }
    }

    private void b(float f) {
        if (this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.l = (float) (((double) (f / 2.0f)) * Math.cos((double) b));
            invalidateSelf();
        }
    }

    private void c(float f) {
        if (f != this.f) {
            this.f = f;
            invalidateSelf();
        }
    }

    private void b(boolean z) {
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.m) {
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
        float sqrt = (float) Math.sqrt((double) ((this.c * this.c) * 2.0f));
        float f = this.d;
        float f2 = f + ((sqrt - f) * this.k);
        sqrt = this.d;
        float f3 = sqrt + ((this.e - sqrt) * this.k);
        float round = (float) Math.round(0.0f + ((this.l - 0.0f) * this.k));
        float f4 = 0.0f + ((b - 0.0f) * this.k);
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
        sqrt = ((sqrt - f) * this.k) + f;
        f = (float) Math.round(((double) f2) * Math.cos((double) f4));
        f2 = (float) Math.round(((double) f2) * Math.sin((double) f4));
        this.h.rewind();
        f4 = this.f + this.a.getStrokeWidth();
        f4 += ((-this.l) - f4) * this.k;
        float f5 = (-f3) / 2.0f;
        this.h.moveTo(f5 + round, 0.0f);
        this.h.rLineTo(f3 - (round * 2.0f), 0.0f);
        this.h.moveTo(f5, f4);
        this.h.rLineTo(f, f2);
        this.h.moveTo(f5, -f4);
        this.h.rLineTo(f, -f2);
        this.h.close();
        canvas.save();
        f = this.a.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), (float) (((double) ((float) ((((int) ((((float) bounds.height()) - (3.0f * f)) - (this.f * 2.0f))) / 4) << 1))) + ((((double) f) * ExponentialBackOffPolicy.DEFAULT_MULTIPLIER) + ((double) this.f))));
        if (this.g) {
            canvas.rotate(((float) ((i ^ this.j) != 0 ? -1 : 1)) * sqrt);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.h, this.a);
        canvas.restore();
    }

    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.i;
    }

    public int getIntrinsicWidth() {
        return this.i;
    }

    public int getOpacity() {
        return -3;
    }

    public void a(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }
}
