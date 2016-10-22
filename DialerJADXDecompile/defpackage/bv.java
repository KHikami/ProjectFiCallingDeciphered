package defpackage;

import android.app.Fragment;
import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: bv */
public final class bv {
    private static bx a;

    static {
        if (buf.c()) {
            a = new cb();
        } else if (VERSION.SDK_INT >= 23) {
            a = new ca();
        } else if (VERSION.SDK_INT >= 15) {
            a = new bz();
        } else if (VERSION.SDK_INT >= 14) {
            a = new by();
        } else {
            a = new bx();
        }
    }

    public static void a(Fragment fragment, boolean z) {
        a.a(fragment, z);
    }

    public static void b(Fragment fragment, boolean z) {
        a.b(fragment, z);
    }

    public static void a(Fragment fragment, String[] strArr, int i) {
        a.a(fragment, strArr, 1);
    }
}
