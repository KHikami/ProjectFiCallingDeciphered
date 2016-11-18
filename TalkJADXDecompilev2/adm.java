package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class adm extends wn {
    private boolean a = true;

    public adm(Drawable drawable) {
        super(drawable);
    }

    void a(boolean z) {
        this.a = z;
    }

    public boolean setState(int[] iArr) {
        if (this.a) {
            return super.setState(iArr);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        if (this.a) {
            super.draw(canvas);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.a) {
            super.setHotspot(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
