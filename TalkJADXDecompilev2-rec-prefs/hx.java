package p000;

import android.os.Build.VERSION;

public final class hx {
    static final hy f17432a;

    static {
        if (VERSION.SDK_INT >= 16) {
            f17432a = new hz();
        } else {
            f17432a = new hy();
        }
    }
}
