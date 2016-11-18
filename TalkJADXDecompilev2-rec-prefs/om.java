package p000;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class om {
    static final op f33191a;

    static {
        if (VERSION.SDK_INT >= 14) {
            f33191a = new oo();
        } else if (VERSION.SDK_INT >= 11) {
            f33191a = new on();
        } else {
            f33191a = new op();
        }
    }

    public static boolean m38703a(ViewConfiguration viewConfiguration) {
        return f33191a.mo4184a(viewConfiguration);
    }
}
