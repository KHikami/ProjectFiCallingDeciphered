package defpackage;

import android.os.Build.VERSION;

/* renamed from: dd */
public final class dd {
    public static final df a;

    static {
        if (VERSION.SDK_INT >= 23) {
            a = new de();
        } else {
            a = new df();
        }
    }
}
