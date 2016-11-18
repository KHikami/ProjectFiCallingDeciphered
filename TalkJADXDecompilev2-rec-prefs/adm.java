package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class adm extends wn {
    private boolean f341a = true;

    public adm(Drawable drawable) {
        super(drawable);
    }

    void m650a(boolean z) {
        this.f341a = z;
    }

    public boolean setState(int[] iArr) {
        if (this.f341a) {
            return super.setState(iArr);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        if (this.f341a) {
            super.draw(canvas);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f341a) {
            super.setHotspot(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f341a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f341a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
