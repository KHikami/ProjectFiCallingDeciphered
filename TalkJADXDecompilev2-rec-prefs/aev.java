package p000;

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

final class aev extends Drawable {
    private float f458a;
    private final Paint f459b;
    private final RectF f460c;
    private final Rect f461d;
    private float f462e;
    private boolean f463f = false;
    private boolean f464g = true;
    private ColorStateList f465h;
    private PorterDuffColorFilter f466i;
    private ColorStateList f467j;
    private Mode f468k = Mode.SRC_IN;

    public aev(ColorStateList colorStateList, float f) {
        this.f458a = f;
        this.f459b = new Paint(5);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f465h = colorStateList;
        this.f459b.setColor(this.f465h.getColorForState(getState(), this.f465h.getDefaultColor()));
        this.f460c = new RectF();
        this.f461d = new Rect();
    }

    void m891a(float f, boolean z, boolean z2) {
        if (f != this.f462e || this.f463f != z || this.f464g != z2) {
            this.f462e = f;
            this.f463f = z;
            this.f464g = z2;
            m889a(null);
            invalidateSelf();
        }
    }

    float m890a() {
        return this.f462e;
    }

    public void draw(Canvas canvas) {
        Object obj;
        Paint paint = this.f459b;
        if (this.f466i == null || paint.getColorFilter() != null) {
            obj = null;
        } else {
            paint.setColorFilter(this.f466i);
            obj = 1;
        }
        canvas.drawRoundRect(this.f460c, this.f458a, this.f458a, paint);
        if (obj != null) {
            paint.setColorFilter(null);
        }
    }

    private void m889a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f460c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f461d.set(rect);
        if (this.f463f) {
            float a = aew.m893a(this.f462e, this.f458a, this.f464g);
            this.f461d.inset((int) Math.ceil((double) aew.m896b(this.f462e, this.f458a, this.f464g)), (int) Math.ceil((double) a));
            this.f460c.set(this.f461d);
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m889a(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f461d, this.f458a);
    }

    public void setAlpha(int i) {
        this.f459b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f459b.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return -3;
    }

    public float m892b() {
        return this.f458a;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f467j = colorStateList;
        this.f466i = m888a(this.f467j, this.f468k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f468k = mode;
        this.f466i = m888a(this.f467j, this.f468k);
        invalidateSelf();
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f465h.getColorForState(iArr, this.f465h.getDefaultColor());
        boolean z = colorForState != this.f459b.getColor();
        if (z) {
            this.f459b.setColor(colorForState);
        }
        if (this.f467j == null || this.f468k == null) {
            return z;
        }
        this.f466i = m888a(this.f467j, this.f468k);
        return true;
    }

    public boolean isStateful() {
        return (this.f467j != null && this.f467j.isStateful()) || ((this.f465h != null && this.f465h.isStateful()) || super.isStateful());
    }

    private PorterDuffColorFilter m888a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
