package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: bby */
final class bby extends AccelerateDecelerateInterpolator {
    final /* synthetic */ bbx a;
    private bbv b;

    bby(bbx bbx) {
        this.a = bbx;
        this.b = new bbv(0.8f);
    }

    public float getInterpolation(float f) {
        return super.getInterpolation(this.b.getInterpolation(f));
    }
}
