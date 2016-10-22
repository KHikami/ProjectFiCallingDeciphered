package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ajq */
public final class ajq {
    static String a;
    public static int b;
    private static final Map<String, Integer> c;
    private static final Set<Integer> d;

    static {
        a = "v21_generic";
        b = -1073741824;
        Map hashMap = new HashMap();
        c = hashMap;
        hashMap.put(a, Integer.valueOf(-1073741824));
        c.put("v30_generic", Integer.valueOf(-1073741823));
        c.put("v21_europe", Integer.valueOf(-1073741820));
        c.put("v30_europe", Integer.valueOf(-1073741819));
        c.put("v21_japanese_utf8", Integer.valueOf(-1073741816));
        c.put("v30_japanese_utf8", Integer.valueOf(-1073741815));
        c.put("v21_japanese_mobile", Integer.valueOf(402653192));
        c.put("docomo", Integer.valueOf(939524104));
        Set hashSet = new HashSet();
        d = hashSet;
        hashSet.add(Integer.valueOf(-1073741816));
        d.add(Integer.valueOf(-1073741815));
        d.add(Integer.valueOf(402653192));
        d.add(Integer.valueOf(939524104));
    }

    public static int a(String str) {
        String toLowerCase = str.toLowerCase();
        if (c.containsKey(toLowerCase)) {
            return ((Integer) c.get(toLowerCase)).intValue();
        }
        if ("default".equalsIgnoreCase(str)) {
            return b;
        }
        Log.e("vCard", new StringBuilder(String.valueOf(str).length() + 29).append("Unknown vCard type String: \"").append(str).append("\"").toString());
        return b;
    }

    public static boolean a(int i) {
        return (i & 3) == 0;
    }

    public static boolean b(int i) {
        return (i & 3) == 1;
    }

    public static boolean c(int i) {
        return (i & 3) == 2;
    }

    public static int d(int i) {
        return i & 12;
    }

    public static boolean e(int i) {
        return d.contains(Integer.valueOf(i));
    }

    static boolean f(int i) {
        return (33554432 & i) != 0;
    }
}
