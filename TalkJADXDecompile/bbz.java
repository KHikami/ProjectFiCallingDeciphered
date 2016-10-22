import android.view.animation.AccelerateDecelerateInterpolator;

final class bbz extends AccelerateDecelerateInterpolator {
    final /* synthetic */ bbx a;
    private bbv b;

    bbz(bbx bbx) {
        this.a = bbx;
        this.b = new bbv(0.2f);
    }

    public float getInterpolation(float f) {
        return super.getInterpolation(this.b.getInterpolation(f));
    }
}
