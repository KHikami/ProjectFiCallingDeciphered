import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class hl extends Drawable {
    float a;
    final Rect b;
    private Bitmap c;
    private int d;
    private int e;
    private final Paint f;
    private final BitmapShader g;
    private final Matrix h;
    private final RectF i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;

    public final void a(boolean z) {
        this.f.setAntiAlias(true);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f.setDither(z);
        invalidateSelf();
    }

    void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    final void a() {
        if (this.j) {
            a(this.e, this.l, this.m, getBounds(), this.b);
            this.i.set(this.b);
            if (this.g != null) {
                this.h.setTranslate(this.i.left, this.i.top);
                this.h.preScale(this.i.width() / ((float) this.c.getWidth()), this.i.height() / ((float) this.c.getHeight()));
                this.g.setLocalMatrix(this.h);
                this.f.setShader(this.g);
            }
            this.j = false;
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            a();
            if (this.f.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.b, this.f);
            } else {
                canvas.drawRoundRect(this.i, this.a, this.a, this.f);
            }
        }
    }

    public void setAlpha(int i) {
        if (i != this.f.getAlpha()) {
            this.f.setAlpha(i);
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f.getAlpha();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        return this.f.getColorFilter();
    }

    public final void a(float f) {
        if (this.a != f) {
            this.k = false;
            if (b(f)) {
                this.f.setShader(this.g);
            } else {
                this.f.setShader(null);
            }
            this.a = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    public int getIntrinsicWidth() {
        return this.l;
    }

    public int getIntrinsicHeight() {
        return this.m;
    }

    public int getOpacity() {
        if (this.e != 119) {
            return -3;
        }
        Bitmap bitmap = this.c;
        if (bitmap == null || bitmap.hasAlpha() || this.f.getAlpha() < 255 || b(this.a)) {
            return -3;
        }
        return -1;
    }

    hl(Resources resources, Bitmap bitmap) {
        this.d = 160;
        this.e = 119;
        this.f = new Paint(3);
        this.h = new Matrix();
        this.b = new Rect();
        this.i = new RectF();
        this.j = true;
        if (resources != null) {
            this.d = resources.getDisplayMetrics().densityDpi;
        }
        this.c = bitmap;
        if (this.c != null) {
            this.l = this.c.getScaledWidth(this.d);
            this.m = this.c.getScaledHeight(this.d);
            this.g = new BitmapShader(this.c, TileMode.CLAMP, TileMode.CLAMP);
            return;
        }
        this.m = -1;
        this.l = -1;
        this.g = null;
    }

    private static boolean b(float f) {
        return f > 0.05f;
    }
}
