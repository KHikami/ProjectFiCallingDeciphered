package defpackage;

import android.os.Build.VERSION;

public final class pj {
    static final pl a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new pm();
        } else if (i >= 19) {
            a = new pk((byte) 0);
        } else if (i >= 14) {
            a = new pk();
        } else {
            a = new pl();
        }
    }
}
