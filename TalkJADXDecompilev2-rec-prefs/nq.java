package p000;

import android.os.Build.VERSION;

public final class nq {
    public static final nt f30469a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f30469a = new ns();
        } else {
            f30469a = new nr();
        }
    }
}
