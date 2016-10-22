import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
public final class aou {
    public aoy a;
    public ValueAnimator b;

    public aou(aoy aoy) {
        this.a = aoy;
    }

    public final void a() {
        if (this.b != null && this.b.isStarted()) {
            this.b.end();
        }
    }

    final View b() {
        return this.a == null ? null : this.a.a();
    }
}
