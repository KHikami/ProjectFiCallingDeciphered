package defpackage;

import android.os.Build.VERSION;
import my;
import mz;
import na;

/* renamed from: mx */
public final class mx {
    public static final my a;

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new na();
        } else {
            a = new mz();
        }
    }
}
