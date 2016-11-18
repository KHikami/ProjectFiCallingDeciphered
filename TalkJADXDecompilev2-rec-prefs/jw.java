package p000;

import android.os.Build.VERSION;

public final class jw {
    public static final jx f21154a;

    static {
        if (VERSION.SDK_INT >= 24) {
            f21154a = new jz((byte) 0);
        } else if (VERSION.SDK_INT >= 16) {
            f21154a = new jz();
        } else if (VERSION.SDK_INT >= 13) {
            f21154a = new jy();
        } else {
            f21154a = new jx();
        }
    }
}
