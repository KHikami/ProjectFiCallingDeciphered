import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public final class c {
    public static final Interpolator a;
    static final Interpolator b;
    static final Interpolator c;
    static final Interpolator d;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        a = new np();
        b = new no();
        c = new nq();
        d = new DecelerateInterpolator();
    }

    static int a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }
}
