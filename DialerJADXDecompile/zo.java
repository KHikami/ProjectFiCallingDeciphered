import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
final class zo extends Drawable {
    float a;
    float b;
    boolean c;
    boolean d;
    private final Paint e;
    private final RectF f;
    private final Rect g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private Mode k;

    public zo(ColorStateList colorStateList, float f) {
        this.c = false;
        this.d = true;
        this.k = Mode.SRC_IN;
        this.a = f;
        this.e = new Paint(5);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.e.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
        this.f = new RectF();
        this.g = new Rect();
    }

    public final void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.e;
        if (this.i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.i);
            obj = 1;
        }
        canvas.drawRoundRect(this.f, this.a, this.a, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.g.set(rect);
        if (this.c) {
            float a = zp.a(this.b, this.a, this.d);
            this.g.inset((int) Math.ceil((double) zp.b(this.b, this.a, this.d)), (int) Math.ceil((double) a));
            this.f.set(this.g);
        }
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.h.getColorForState(iArr, this.h.getDefaultColor());
        boolean z = colorForState != this.e.getColor();
        if (z) {
            this.e.setColor(colorForState);
        }
        if (this.j == null || this.k == null) {
            return z;
        }
        this.i = a(this.j, this.k);
        return true;
    }

    public final boolean isStateful() {
        return (this.j != null && this.j.isStateful()) || ((this.h != null && this.h.isStateful()) || super.isStateful());
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
