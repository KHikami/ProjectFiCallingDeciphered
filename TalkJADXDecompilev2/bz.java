package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

abstract class bz extends Drawable implements js {
    Drawable b;

    bz() {
    }

    static TypedArray a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.b != null) {
            this.b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.b == null) {
            return null;
        }
        return jb.a.g(this.b);
    }

    protected boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.b != null) {
            jb.a(this.b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b != null) {
            jb.a(this.b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.b != null) {
            this.b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.b != null) {
            jb.a(this.b);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            jb.a(this.b, z);
        }
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            jb.b(this.b);
        }
        return false;
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            jb.a(this.b, theme);
        }
    }

    public int getLayoutDirection() {
        if (this.b != null) {
            jb.g(this.b);
        }
        return 0;
    }

    public void clearColorFilter() {
        if (this.b != null) {
            this.b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.b != null) {
            return this.b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.b != null) {
            return this.b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.b != null) {
            return this.b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.b != null) {
            return this.b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.b != null) {
            return this.b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.b != null) {
            return this.b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.b != null) {
            this.b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
