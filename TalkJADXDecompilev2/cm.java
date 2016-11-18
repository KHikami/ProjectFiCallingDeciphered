package defpackage;

import android.os.Build.VERSION;

public final class cm {
    public static final cn a;

    static {
        if (VERSION.SDK_INT >= 12) {
            a = new cp();
        } else {
            a = new co();
        }
    }
}
