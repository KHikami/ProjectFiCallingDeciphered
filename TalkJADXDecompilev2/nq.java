package defpackage;

import android.os.Build.VERSION;

public final class nq {
    public static final nt a;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new ns();
        } else {
            a = new nr();
        }
    }
}
