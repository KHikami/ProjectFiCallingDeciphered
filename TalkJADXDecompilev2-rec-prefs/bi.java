package p000;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class bi extends bd {
    private final ValueAnimator f3416a = new ValueAnimator();

    bi() {
    }

    public void mo518a() {
        this.f3416a.start();
    }

    public boolean mo523b() {
        return this.f3416a.isRunning();
    }

    public void mo521a(Interpolator interpolator) {
        this.f3416a.setInterpolator(interpolator);
    }

    public void mo522a(bf bfVar) {
        this.f3416a.addUpdateListener(new bj(this, bfVar));
    }

    public void mo519a(int i, int i2) {
        this.f3416a.setIntValues(new int[]{i, i2});
    }

    public int mo524c() {
        return ((Integer) this.f3416a.getAnimatedValue()).intValue();
    }

    public void mo520a(long j) {
        this.f3416a.setDuration(j);
    }

    public void mo525d() {
        this.f3416a.cancel();
    }
}
