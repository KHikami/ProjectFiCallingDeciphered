package p000;

import android.os.Build.VERSION;

public final class pj {
    static final pl f34989a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f34989a = new pm();
        } else if (i >= 19) {
            f34989a = new pk((byte) 0);
        } else if (i >= 14) {
            f34989a = new pk();
        } else {
            f34989a = new pl();
        }
    }
}
