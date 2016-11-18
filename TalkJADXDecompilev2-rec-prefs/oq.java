package p000;

import android.os.Build.VERSION;

public final class oq {
    public static final os f33666a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f33666a = new ot((byte) 0);
        } else if (i >= 18) {
            f33666a = new ot();
        } else if (i >= 14) {
            f33666a = new or((byte) 0);
        } else if (i >= 11) {
            f33666a = new or();
        } else {
            f33666a = new os();
        }
    }
}
