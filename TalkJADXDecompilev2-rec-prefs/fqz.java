package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class fqz {
    public static Object f13790a = new Object();
    public static String f13791b;
    private static Map<String, fra> f13792c;
    private static List<fra> f13793d;

    private static void m16014c() {
        synchronized (f13790a) {
            if (f13792c != null) {
                return;
            }
            f13792c = new ky();
            jar b = jar.m23675b();
            for (String str : b.m23690a()) {
                f13792c.put(str, new fra(str, Integer.toString(b.m23707e(str))));
            }
        }
    }

    public static void m16010a() {
        synchronized (f13790a) {
            if (f13792c == null) {
                fqz.m16014c();
            }
            List arrayList = new ArrayList(f13792c.values());
            f13793d = arrayList;
            Collections.sort(arrayList, fra.f13801a);
            if (!TextUtils.isEmpty(f13791b)) {
                fra fra = (fra) f13792c.get(f13791b);
                if (fra != null) {
                    f13793d.add(0, fra);
                }
            }
        }
    }

    public static void m16011a(String str) {
        synchronized (f13790a) {
            if (TextUtils.equals(str, f13791b)) {
                return;
            }
            f13791b = str;
            fqz.m16010a();
        }
    }

    public static fra m16012b(String str) {
        fra fra;
        synchronized (f13790a) {
            if (f13792c == null) {
                fqz.m16014c();
            }
            fra = (fra) f13792c.get(str);
        }
        return fra;
    }

    public static List<fra> m16013b() {
        List<fra> list;
        synchronized (f13790a) {
            if (f13793d == null) {
                fqz.m16010a();
            }
            list = f13793d;
        }
        return list;
    }
}
