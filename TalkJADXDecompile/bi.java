import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class bi extends bd {
    private final ValueAnimator a;

    bi() {
        this.a = new ValueAnimator();
    }

    public void a() {
        this.a.start();
    }

    public boolean b() {
        return this.a.isRunning();
    }

    public void a(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }

    public void a(bf bfVar) {
        this.a.addUpdateListener(new bj(this, bfVar));
    }

    public void a(int i, int i2) {
        this.a.setIntValues(new int[]{i, i2});
    }

    public int c() {
        return ((Integer) this.a.getAnimatedValue()).intValue();
    }

    public void a(long j) {
        this.a.setDuration(j);
    }

    public void d() {
        this.a.cancel();
    }
}
