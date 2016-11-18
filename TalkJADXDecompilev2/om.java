package defpackage;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class om {
    static final op a;

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new oo();
        } else if (VERSION.SDK_INT >= 11) {
            a = new on();
        } else {
            a = new op();
        }
    }

    public static boolean a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }
}
