package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bfr */
public final class bfr {
    public static int a;
    private static String b;
    private static final Map c;
    private static final Set d;

    static {
        b = "v21_generic";
        a = -1073741824;
        Map hashMap = new HashMap();
        c = hashMap;
        hashMap.put(b, Integer.valueOf(-1073741824));
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
            return a;
        }
        Log.e("vCard", new StringBuilder(String.valueOf(str).length() + 29).append("Unknown vCard type String: \"").append(str).append("\"").toString());
        return a;
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

    public static boolean d(int i) {
        return !bfr.b(i);
    }

    public static int e(int i) {
        return i & 12;
    }

    public static boolean f(int i) {
        return (oe.INVALID_ID & i) != 0;
    }

    public static boolean g(int i) {
        return (1073741824 & i) != 0;
    }

    public static boolean a() {
        return false;
    }

    public static boolean h(int i) {
        return (bfr.d(i) && (268435456 & i) == 0) ? false : true;
    }

    public static boolean i(int i) {
        return bfr.b(i) || (67108864 & i) != 0;
    }

    public static boolean j(int i) {
        return d.contains(Integer.valueOf(i));
    }

    static boolean k(int i) {
        return (33554432 & i) != 0;
    }

    public static boolean l(int i) {
        return (134217728 & i) != 0;
    }

    public static boolean m(int i) {
        return i == 939524104;
    }

    public static boolean n(int i) {
        return (536870912 & i) != 0;
    }
}
