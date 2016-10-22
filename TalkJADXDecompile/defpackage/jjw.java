package defpackage;

import android.os.Build.VERSION;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: jjw */
public final class jjw {
    static final Set<jjv<?>> a;

    static {
        a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(int i) {
        gwb.aJ();
        for (jjv a : a) {
            a.a(i);
        }
    }

    public static void a() {
        gwb.aJ();
        if (VERSION.SDK_INT < 14) {
            jjw.a(80);
        }
    }

    static void a(jjv<?> jjv_) {
        if (gwb.aI()) {
            a.add(jjv_);
        } else {
            gwb.a(new jjx(jjv_));
        }
    }
}
