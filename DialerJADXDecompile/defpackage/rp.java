package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* compiled from: PG */
/* renamed from: rp */
public class rp extends Drawable implements Callback {
    public Drawable a;

    public rp(Drawable drawable) {
        if (this.a != null) {
            this.a.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public void jumpToCurrentState() {
        gr.a(this.a);
    }

    public Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
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
        return this.a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        gr.a(this.a, z);
    }

    public boolean isAutoMirrored() {
        return gr.b(this.a);
    }

    public void setTint(int i) {
        gr.a(this.a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        gr.a(this.a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        gr.a(this.a, mode);
    }

    public void setHotspot(float f, float f2) {
        gr.a(this.a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        gr.a(this.a, i, i2, i3, i4);
    }
}
