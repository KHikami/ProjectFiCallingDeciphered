package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

public class C0256p extends acv {
    public boolean f34748a;
    boolean f34749b;
    private Drawable f34750c;
    private final Rect f34751d;
    private final Rect f34752e;
    private int f34753f;

    public C0256p(Context context) {
        this(context, null);
    }

    public C0256p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0256p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34751d = new Rect();
        this.f34752e = new Rect();
        this.f34753f = 119;
        this.f34748a = true;
        this.f34749b = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0223o.f31429T, i, 0);
        this.f34753f = obtainStyledAttributes.getInt(C0223o.f31431V, this.f34753f);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0223o.f31430U);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f34748a = obtainStyledAttributes.getBoolean(C0223o.f31432W, true);
        obtainStyledAttributes.recycle();
    }

    public int getForegroundGravity() {
        return this.f34753f;
    }

    public void setForegroundGravity(int i) {
        if (this.f34753f != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f34753f = i2;
            if (this.f34753f == 119 && this.f34750c != null) {
                this.f34750c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34750c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f34750c != null) {
            this.f34750c.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f34750c != null && this.f34750c.isStateful()) {
            this.f34750c.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f34750c != drawable) {
            if (this.f34750c != null) {
                this.f34750c.setCallback(null);
                unscheduleDrawable(this.f34750c);
            }
            this.f34750c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f34753f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f34750c;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f34749b |= z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f34749b = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f34750c != null) {
            Drawable drawable = this.f34750c;
            if (this.f34749b) {
                this.f34749b = false;
                Rect rect = this.f34751d;
                Rect rect2 = this.f34752e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f34748a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f34753f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f34750c != null) {
            this.f34750c.setHotspot(f, f2);
        }
    }
}
