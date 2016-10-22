package defpackage;

import android.os.Build.VERSION;

/* renamed from: hx */
public final class hx {
    static final hy a;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new hz();
        } else {
            a = new hy();
        }
    }
}
