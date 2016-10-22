package defpackage;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: glv */
public final class glv {
    static final boolean a;
    static final glx b;
    static Map<String, gma> c;
    static Runnable d;
    private static final boolean e;

    static {
        kae kae = glk.t;
        e = false;
        kae = glk.x;
        a = false;
        if (VERSION.SDK_INT < 18 || !e) {
            b = new glz();
        } else {
            b = new gly();
        }
        c = new HashMap(20);
        d = null;
    }

    static gma a(String str) {
        gma gma;
        synchronized (c) {
            gma = (gma) c.get(str);
            if (gma == null) {
                gma = new gma(str);
                c.put(str, gma);
            }
        }
        return gma;
    }

    public static Map<String, Long> a() {
        List arrayList;
        synchronized (c) {
            d = null;
            arrayList = new ArrayList(c.size());
            for (String a : c.keySet()) {
                arrayList.add(glv.a(a));
            }
        }
        Map<String, Long> hashMap = new HashMap();
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            gma gma = (gma) obj;
            if (gma.a()) {
                gmc b = gma.b();
                hashMap.put(b.a, Long.valueOf(b.b));
            }
        }
        return a ? hashMap : null;
    }
}
