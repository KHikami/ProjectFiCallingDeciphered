package p000;

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
    Drawable f4353b;

    bz() {
    }

    static TypedArray m6570a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f4353b != null) {
            this.f4353b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f4353b == null) {
            return null;
        }
        return jb.f19667a.mo3502g(this.f4353b);
    }

    protected boolean onLevelChange(int i) {
        if (this.f4353b != null) {
            return this.f4353b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f4353b != null) {
            this.f4353b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f4353b != null) {
            jb.m23743a(this.f4353b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f4353b != null) {
            jb.m23745a(this.f4353b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f4353b != null) {
            this.f4353b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f4353b != null) {
            jb.m23742a(this.f4353b);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f4353b != null) {
            jb.m23750a(this.f4353b, z);
        }
    }

    public boolean isAutoMirrored() {
        if (this.f4353b != null) {
            jb.m23751b(this.f4353b);
        }
        return false;
    }

    public void applyTheme(Theme theme) {
        if (this.f4353b != null) {
            jb.m23747a(this.f4353b, theme);
        }
    }

    public int getLayoutDirection() {
        if (this.f4353b != null) {
            jb.m23757g(this.f4353b);
        }
        return 0;
    }

    public void clearColorFilter() {
        if (this.f4353b != null) {
            this.f4353b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f4353b != null) {
            return this.f4353b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f4353b != null) {
            return this.f4353b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f4353b != null) {
            return this.f4353b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f4353b != null) {
            return this.f4353b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f4353b != null) {
            return this.f4353b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f4353b != null) {
            return this.f4353b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f4353b != null) {
            this.f4353b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f4353b != null) {
            return this.f4353b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
