package defpackage;

import android.os.Build.VERSION;
import java.util.List;

public final class qx {
    private static final qy a;
    private final Object b;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new ra();
        } else if (VERSION.SDK_INT >= 16) {
            a = new qz();
        } else {
            a = new qy();
        }
    }

    public qx() {
        this.b = a.a(this);
    }

    public qx(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public static ql b() {
        return null;
    }

    public static boolean c() {
        return false;
    }

    public static List d() {
        return null;
    }

    public static ql e() {
        return null;
    }
}
