package defpackage;

import android.os.Build.VERSION;

public final class oq {
    public static final os a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new ot((byte) 0);
        } else if (i >= 18) {
            a = new ot();
        } else if (i >= 14) {
            a = new or((byte) 0);
        } else if (i >= 11) {
            a = new or();
        } else {
            a = new os();
        }
    }
}
