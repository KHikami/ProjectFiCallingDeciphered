package p000;

import android.view.animation.AccelerateDecelerateInterpolator;

final class bby extends AccelerateDecelerateInterpolator {
    final /* synthetic */ bbx f2913a;
    private bbv f2914b = new bbv(0.8f);

    bby(bbx bbx) {
        this.f2913a = bbx;
    }

    public float getInterpolation(float f) {
        return super.getInterpolation(this.f2914b.getInterpolation(f));
    }
}
