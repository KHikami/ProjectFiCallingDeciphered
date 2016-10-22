package defpackage;

import android.content.res.Resources;
import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: gn */
public final class gn {
    public static final go a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            a = new gp();
        } else if (i >= 13) {
            a = new gp();
        } else {
            a = new go();
        }
    }

    public static int a(Resources resources) {
        return a.a(resources);
    }

    public static int b(Resources resources) {
        return a.b(resources);
    }
}
