import android.content.res.Resources;
import android.os.Build.VERSION;

public final class ix {
    public static final iy a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            a = new iz();
        } else if (i >= 13) {
            a = new iz();
        } else {
            a = new iy();
        }
    }

    public static int a(Resources resources) {
        return a.a(resources);
    }

    public static int b(Resources resources) {
        return a.b(resources);
    }
}
