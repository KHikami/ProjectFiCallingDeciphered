package p000;

import android.os.Build.VERSION;

public final class tg {
    public static final tj f35135a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f35135a = new ti((byte) 0);
        } else if (i >= 18) {
            f35135a = new ti();
        } else if (i >= 17) {
            f35135a = new th();
        } else if (i >= 16) {
            f35135a = new tj((byte) 0);
        } else {
            f35135a = new tj();
        }
    }
}
