package defpackage;

import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: ce */
public final class ce {
    public static final cf a;

    static {
        if (VERSION.SDK_INT >= 12) {
            a = new ch();
        } else {
            a = new cg();
        }
    }
}
