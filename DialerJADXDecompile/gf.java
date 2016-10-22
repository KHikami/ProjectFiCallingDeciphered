import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

/* compiled from: PG */
public final class gf {
    private static final gg a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            a = new gh((byte) 0);
        } else if (i >= 11) {
            a = new gh();
        } else {
            a = new gg();
        }
    }

    public static Intent a(ComponentName componentName) {
        return a.a(componentName);
    }
}
