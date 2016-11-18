package defpackage;

import android.os.Build.VERSION;

public final class tg {
    public static final tj a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new ti((byte) 0);
        } else if (i >= 18) {
            a = new ti();
        } else if (i >= 17) {
            a = new th();
        } else if (i >= 16) {
            a = new tj((byte) 0);
        } else {
            a = new tj();
        }
    }
}
