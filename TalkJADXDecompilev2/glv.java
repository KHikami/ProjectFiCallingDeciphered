package defpackage;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class glv {
    static final boolean a = false;
    static final glx b;
    static Map<String, gma> c = new HashMap(20);
    static Runnable d = null;
    private static final boolean e = false;

    static {
        kae kae = glk.t;
        kae = glk.x;
        if (VERSION.SDK_INT < 18 || !e) {
            b = new glz();
        } else {
            b = new gly();
        }
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
