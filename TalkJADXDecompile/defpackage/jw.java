package defpackage;

import android.os.Build.VERSION;

/* renamed from: jw */
public final class jw {
    public static final jx a;

    static {
        if (VERSION.SDK_INT >= 24) {
            a = new jz((byte) 0);
        } else if (VERSION.SDK_INT >= 16) {
            a = new jz();
        } else if (VERSION.SDK_INT >= 13) {
            a = new jy();
        } else {
            a = new jx();
        }
    }
}
