package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public class wn extends Drawable implements Callback {
    private Drawable f35537a;

    public wn(Drawable drawable) {
        m41200a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f35537a.draw(canvas);
    }

    public void onBoundsChange(Rect rect) {
        this.f35537a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f35537a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f35537a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f35537a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f35537a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f35537a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35537a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f35537a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f35537a.setState(iArr);
    }

    public int[] getState() {
        return this.f35537a.getState();
    }

    public void jumpToCurrentState() {
        jb.a(this.f35537a);
    }

    public Drawable getCurrent() {
        return this.f35537a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f35537a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f35537a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f35537a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f35537a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f35537a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f35537a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f35537a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f35537a.getPadding(rect);
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
        return this.f35537a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        jb.a(this.f35537a, z);
    }

    public boolean isAutoMirrored() {
        return jb.b(this.f35537a);
    }

    public void setTint(int i) {
        jb.a(this.f35537a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        jb.a(this.f35537a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        jb.a(this.f35537a, mode);
    }

    public void setHotspot(float f, float f2) {
        jb.a(this.f35537a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        jb.a(this.f35537a, i, i2, i3, i4);
    }

    public Drawable m41199a() {
        return this.f35537a;
    }

    public void m41200a(Drawable drawable) {
        if (this.f35537a != null) {
            this.f35537a.setCallback(null);
        }
        this.f35537a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
