package p000;

import android.view.animation.AccelerateDecelerateInterpolator;

final class bbz extends AccelerateDecelerateInterpolator {
    final /* synthetic */ bbx f2915a;
    private bbv f2916b = new bbv(0.2f);

    bbz(bbx bbx) {
        this.f2915a = bbx;
    }

    public float getInterpolation(float f) {
        return super.getInterpolation(this.f2916b.getInterpolation(f));
    }
}
