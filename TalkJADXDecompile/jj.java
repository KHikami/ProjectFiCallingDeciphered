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
    static final Mode a;
    jk b;
    Drawable c;
    private int d;
    private Mode e;
    private boolean f;
    private boolean g;

    static {
        a = Mode.SRC_IN;
    }

    jj(jk jkVar, Resources resources) {
        this.b = jkVar;
        if (this.b != null && this.b.b != null) {
            a(a(this.b.b, resources));
        }
    }

    public jj(Drawable drawable) {
        this.b = b();
        a(drawable);
    }

    protected Drawable a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.c != null) {
            this.c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return ((this.b != null ? this.b.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!c() || this.b == null) ? null : this.b.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    public int[] getState() {
        return this.c.getState();
    }

    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    public ConstantState getConstantState() {
        if (this.b == null || !this.b.a()) {
            return null;
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.b = b();
            if (this.c != null) {
                this.c.mutate();
            }
            if (this.b != null) {
                this.b.b = this.c != null ? this.c.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    jk b() {
        return new jl(this.b, null);
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
        return this.c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.b.c = colorStateList;
        a(getState());
    }

    public void setTintMode(Mode mode) {
        this.b.d = mode;
        a(getState());
    }

    private boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.b.c;
        Mode mode = this.b.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f && colorForState == this.d && mode == this.e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.d = colorForState;
        this.e = mode;
        this.f = true;
        return true;
    }

    public final Drawable a() {
        return this.c;
    }

    public final void a(Drawable drawable) {
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.b != null) {
                this.b.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }
}
