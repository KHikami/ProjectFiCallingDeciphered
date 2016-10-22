package defpackage;

import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: jm */
public final class jm {
    public static final jn a;

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new jp();
        } else {
            a = new jo();
        }
    }
}
