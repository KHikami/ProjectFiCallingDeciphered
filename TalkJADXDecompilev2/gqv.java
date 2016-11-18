package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class gqv extends Animation {
    final /* synthetic */ gqt a;
    private final boolean b;
    private final int c;

    gqv(gqt gqt, int i, boolean z) {
        this.a = gqt;
        this.b = z;
        this.c = i;
        gqt.b.setVisibility(0);
        if (z) {
            i = 1;
        }
        gqt.a(i);
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        if (f == 1.0f) {
            i = this.c;
        } else {
            if (!this.b) {
                f = 1.0f - f;
            }
            i = (int) (((float) this.c) * f);
            if (i <= 0) {
                i = 1;
            }
        }
        this.a.a(i);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
