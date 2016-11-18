package p000;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class glv {
    static final boolean f15613a = false;
    static final glx f15614b;
    static Map<String, gma> f15615c = new HashMap(20);
    static Runnable f15616d = null;
    private static final boolean f15617e = false;

    static {
        kae kae = glk.f15573t;
        kae = glk.f15577x;
        if (VERSION.SDK_INT < 18 || !f15617e) {
            f15614b = new glz();
        } else {
            f15614b = new gly();
        }
    }

    static gma m18052a(String str) {
        gma gma;
        synchronized (f15615c) {
            gma = (gma) f15615c.get(str);
            if (gma == null) {
                gma = new gma(str);
                f15615c.put(str, gma);
            }
        }
        return gma;
    }

    public static Map<String, Long> m18053a() {
        List arrayList;
        synchronized (f15615c) {
            f15616d = null;
            arrayList = new ArrayList(f15615c.size());
            for (String a : f15615c.keySet()) {
                arrayList.add(glv.m18052a(a));
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
            if (gma.m18076a()) {
                gmc b = gma.m18077b();
                hashMap.put(b.f15640a, Long.valueOf(b.f15641b));
            }
        }
        return f15613a ? hashMap : null;
    }
}
