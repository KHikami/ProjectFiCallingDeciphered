package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

public class jj extends Drawable implements Callback, ji, js {
    static final Mode f20168a = Mode.SRC_IN;
    jk f20169b;
    Drawable f20170c;
    private int f20171d;
    private Mode f20172e;
    private boolean f20173f;
    private boolean f20174g;

    jj(jk jkVar, Resources resources) {
        this.f20169b = jkVar;
        if (this.f20169b != null && this.f20169b.f20324b != null) {
            mo3526a(m24340a(this.f20169b.f20324b, resources));
        }
    }

    public jj(Drawable drawable) {
        this.f20169b = mo3564b();
        mo3526a(drawable);
    }

    protected Drawable m24340a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public void draw(Canvas canvas) {
        this.f20170c.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f20170c != null) {
            this.f20170c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f20170c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return ((this.f20169b != null ? this.f20169b.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.f20170c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f20170c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f20170c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f20170c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f20170c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo3590c() || this.f20169b == null) ? null : this.f20169b.f20325c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f20170c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return m24338a(iArr) || this.f20170c.setState(iArr);
    }

    public int[] getState() {
        return this.f20170c.getState();
    }

    public Drawable getCurrent() {
        return this.f20170c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f20170c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f20170c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f20170c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f20170c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f20170c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f20170c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f20170c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f20170c.getPadding(rect);
    }

    public ConstantState getConstantState() {
        if (this.f20169b == null || !this.f20169b.m24525a()) {
            return null;
        }
        this.f20169b.f20323a = getChangingConfigurations();
        return this.f20169b;
    }

    public Drawable mutate() {
        if (!this.f20174g && super.mutate() == this) {
            this.f20169b = mo3564b();
            if (this.f20170c != null) {
                this.f20170c.mutate();
            }
            if (this.f20169b != null) {
                this.f20169b.f20324b = this.f20170c != null ? this.f20170c.getConstantState() : null;
            }
            this.f20174g = true;
        }
        return this;
    }

    jk mo3564b() {
        return new jl(this.f20169b, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean onLevelChange(int i) {
        return this.f20170c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f20169b.f20325c = colorStateList;
        m24338a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f20169b.f20326d = mode;
        m24338a(getState());
    }

    private boolean m24338a(int[] iArr) {
        if (!mo3590c()) {
            return false;
        }
        ColorStateList colorStateList = this.f20169b.f20325c;
        Mode mode = this.f20169b.f20326d;
        if (colorStateList == null || mode == null) {
            this.f20173f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f20173f && colorForState == this.f20171d && mode == this.f20172e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f20171d = colorForState;
        this.f20172e = mode;
        this.f20173f = true;
        return true;
    }

    public final Drawable mo3525a() {
        return this.f20170c;
    }

    public final void mo3526a(Drawable drawable) {
        if (this.f20170c != null) {
            this.f20170c.setCallback(null);
        }
        this.f20170c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f20169b != null) {
                this.f20169b.f20324b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean mo3590c() {
        return true;
    }
}
