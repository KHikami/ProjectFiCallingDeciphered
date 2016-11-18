package p000;

import android.os.Build.VERSION;

public final class cm {
    public static final cn f5615a;

    static {
        if (VERSION.SDK_INT >= 12) {
            f5615a = new cp();
        } else {
            f5615a = new co();
        }
    }
}
