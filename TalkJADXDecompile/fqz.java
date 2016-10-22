import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class fqz {
    public static Object a;
    public static String b;
    private static Map<String, fra> c;
    private static List<fra> d;

    static {
        a = new Object();
    }

    private static void c() {
        synchronized (a) {
            if (c != null) {
                return;
            }
            c = new ky();
            jar b = jar.b();
            for (String str : b.a()) {
                c.put(str, new fra(str, Integer.toString(b.e(str))));
            }
        }
    }

    public static void a() {
        synchronized (a) {
            if (c == null) {
                c();
            }
            List arrayList = new ArrayList(c.values());
            d = arrayList;
            Collections.sort(arrayList, fra.a);
            if (!TextUtils.isEmpty(b)) {
                fra fra = (fra) c.get(b);
                if (fra != null) {
                    d.add(0, fra);
                }
            }
        }
    }

    public static void a(String str) {
        synchronized (a) {
            if (TextUtils.equals(str, b)) {
                return;
            }
            b = str;
            a();
        }
    }

    public static fra b(String str) {
        fra fra;
        synchronized (a) {
            if (c == null) {
                c();
            }
            fra = (fra) c.get(str);
        }
        return fra;
    }

    public static List<fra> b() {
        List<fra> list;
        synchronized (a) {
            if (d == null) {
                a();
            }
            list = d;
        }
        return list;
    }
}
