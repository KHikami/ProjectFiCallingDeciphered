package p000;

import android.os.Build.VERSION;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class jjw {
    static final Set<jjv<?>> f20318a = Collections.newSetFromMap(new WeakHashMap());

    public static void m24523a(int i) {
        gwb.aJ();
        for (jjv a : f20318a) {
            a.m24520a(i);
        }
    }

    public static void m24522a() {
        gwb.aJ();
        if (VERSION.SDK_INT < 14) {
            jjw.m24523a(80);
        }
    }

    static void m24524a(jjv<?> jjv_) {
        if (gwb.aI()) {
            f20318a.add(jjv_);
        } else {
            gwb.m1863a(new jjx(jjv_));
        }
    }
}
