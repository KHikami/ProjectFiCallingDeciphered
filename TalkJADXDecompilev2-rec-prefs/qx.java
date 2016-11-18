package p000;

import android.os.Build.VERSION;
import java.util.List;

public final class qx {
    private static final qy f35038a;
    private final Object f35039b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f35038a = new ra();
        } else if (VERSION.SDK_INT >= 16) {
            f35038a = new qz();
        } else {
            f35038a = new qy();
        }
    }

    public qx() {
        this.f35039b = f35038a.mo4335a(this);
    }

    public qx(Object obj) {
        this.f35039b = obj;
    }

    public Object m40513a() {
        return this.f35039b;
    }

    public static ql m40509b() {
        return null;
    }

    public static boolean m40510c() {
        return false;
    }

    public static List m40511d() {
        return null;
    }

    public static ql m40512e() {
        return null;
    }
}
