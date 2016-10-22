import android.os.Build.VERSION;
import android.view.VelocityTracker;

/* compiled from: PG */
public final class kj {
    private static km a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new kl();
        } else {
            a = new kk();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return a.b(velocityTracker, i);
    }
}
