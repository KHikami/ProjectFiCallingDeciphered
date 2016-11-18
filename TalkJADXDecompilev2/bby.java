package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

final class bby extends AccelerateDecelerateInterpolator {
    final /* synthetic */ bbx a;
    private bbv b = new bbv(0.8f);

    bby(bbx bbx) {
        this.a = bbx;
    }

    public float getInterpolation(float f) {
        return super.getInterpolation(this.b.getInterpolation(f));
    }
}
