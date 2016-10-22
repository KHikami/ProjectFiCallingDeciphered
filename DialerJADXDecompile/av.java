import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

/* compiled from: PG */
final class av extends ar {
    private ValueAnimator a;

    av() {
        this.a = new ValueAnimator();
    }

    public final void a() {
        this.a.start();
    }

    public final boolean b() {
        return this.a.isRunning();
    }

    public final void a(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }

    public final void a(as asVar) {
        this.a.addUpdateListener(new aw(this, asVar));
    }

    public final void a(int i, int i2) {
        this.a.setIntValues(new int[]{i, i2});
    }

    public final int c() {
        return ((Integer) this.a.getAnimatedValue()).intValue();
    }

    public final void a(long j) {
        this.a.setDuration(j);
    }

    public final void d() {
        this.a.cancel();
    }
}
