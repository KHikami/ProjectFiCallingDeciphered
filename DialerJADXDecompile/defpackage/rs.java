package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: rs */
public final class rs {
    public Context a;

    public static rs a(Context context) {
        return new rs(context);
    }

    private rs(Context context) {
        this.a = context;
    }

    public final int a() {
        Resources resources = this.a.getResources();
        int b = gn.b(resources);
        int a = gn.a(resources);
        if (gn.a.c(resources) > 600 || b > 600 || ((b > 960 && a > 720) || (b > 720 && a > 960))) {
            return 5;
        }
        if (b >= 500 || ((b > 640 && a > 480) || (b > 480 && a > 640))) {
            return 4;
        }
        if (b >= 360) {
            return 3;
        }
        return 2;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(buf.aa);
    }
}
