package p000;

import android.os.Build.VERSION;

public final class kh {
    static final ki f21676a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f21676a = new kl();
        } else if (i >= 14) {
            f21676a = new kk();
        } else {
            f21676a = new kj();
        }
    }
}
