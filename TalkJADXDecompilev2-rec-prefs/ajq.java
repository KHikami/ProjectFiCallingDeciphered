package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ajq {
    static String f1024a = "v21_generic";
    public static int f1025b = -1073741824;
    private static final Map<String, Integer> f1026c;
    private static final Set<Integer> f1027d;

    static {
        Map hashMap = new HashMap();
        f1026c = hashMap;
        hashMap.put(f1024a, Integer.valueOf(-1073741824));
        f1026c.put("v30_generic", Integer.valueOf(-1073741823));
        f1026c.put("v21_europe", Integer.valueOf(-1073741820));
        f1026c.put("v30_europe", Integer.valueOf(-1073741819));
        f1026c.put("v21_japanese_utf8", Integer.valueOf(-1073741816));
        f1026c.put("v30_japanese_utf8", Integer.valueOf(-1073741815));
        f1026c.put("v21_japanese_mobile", Integer.valueOf(402653192));
        f1026c.put("docomo", Integer.valueOf(939524104));
        Set hashSet = new HashSet();
        f1027d = hashSet;
        hashSet.add(Integer.valueOf(-1073741816));
        f1027d.add(Integer.valueOf(-1073741815));
        f1027d.add(Integer.valueOf(402653192));
        f1027d.add(Integer.valueOf(939524104));
    }

    public static int m2643a(String str) {
        String toLowerCase = str.toLowerCase();
        if (f1026c.containsKey(toLowerCase)) {
            return ((Integer) f1026c.get(toLowerCase)).intValue();
        }
        if ("default".equalsIgnoreCase(str)) {
            return f1025b;
        }
        Log.e("vCard", new StringBuilder(String.valueOf(str).length() + 29).append("Unknown vCard type String: \"").append(str).append("\"").toString());
        return f1025b;
    }

    public static boolean m2644a(int i) {
        return (i & 3) == 0;
    }

    public static boolean m2645b(int i) {
        return (i & 3) == 1;
    }

    public static boolean m2646c(int i) {
        return (i & 3) == 2;
    }

    public static int m2647d(int i) {
        return i & 12;
    }

    public static boolean m2648e(int i) {
        return f1027d.contains(Integer.valueOf(i));
    }

    static boolean m2649f(int i) {
        return (33554432 & i) != 0;
    }
}
