package defpackage;

import android.os.Build.VERSION;

public final class oty {
    public static final oub a;

    static {
        if (VERSION.SDK_INT >= 22) {
            a = new oua();
        } else {
            a = new otz();
        }
    }
}
