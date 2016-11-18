package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class gqv extends Animation {
    final /* synthetic */ gqt f15936a;
    private final boolean f15937b;
    private final int f15938c;

    gqv(gqt gqt, int i, boolean z) {
        this.f15936a = gqt;
        this.f15937b = z;
        this.f15938c = i;
        gqt.f15930b.setVisibility(0);
        if (z) {
            i = 1;
        }
        gqt.m18311a(i);
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        if (f == 1.0f) {
            i = this.f15938c;
        } else {
            if (!this.f15937b) {
                f = 1.0f - f;
            }
            i = (int) (((float) this.f15938c) * f);
            if (i <= 0) {
                i = 1;
            }
        }
        this.f15936a.m18311a(i);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
