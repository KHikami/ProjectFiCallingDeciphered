package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class icb {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    static HashMap<String, String> e;
    static Object f;
    static String[] g = new String[0];
    private static Context h = null;

    private static void b(ContentResolver contentResolver) {
        if (e == null) {
            e = new HashMap();
            f = new Object();
            new icc("Gservices", contentResolver).start();
        }
    }

    private static void a() {
        if (h != null) {
            h.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        icb.a();
        synchronized (icb.class) {
            icb.b(contentResolver);
            Object obj = f;
            String str3;
            if (e.containsKey(str)) {
                str3 = (String) e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                for (String startsWith : g) {
                    if (str.startsWith(startsWith)) {
                        break;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            synchronized (icb.class) {
                                if (obj == f) {
                                    e.put(str, str3);
                                }
                            }
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                e.put(str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    public static String a(ContentResolver contentResolver, String str) {
        return icb.a(contentResolver, str, null);
    }

    public static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        icb.a();
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        icb.a();
        Map a = icb.a(contentResolver, strArr);
        synchronized (icb.class) {
            icb.b(contentResolver);
            g = strArr;
            for (Entry entry : a.entrySet()) {
                e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        icb.a();
        synchronized (icb.class) {
            icb.b(contentResolver);
            obj = f;
        }
        return obj;
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        String a = icb.a(contentResolver, str, null);
        if (a != null) {
            try {
                i = Integer.parseInt(a);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a = icb.a(contentResolver, str, null);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a = icb.a(contentResolver, str, null);
        if (a == null || a.equals("")) {
            return z;
        }
        if (c.matcher(a).matches()) {
            return true;
        }
        if (d.matcher(a).matches()) {
            return false;
        }
        new StringBuilder("attempt to read gservices key ").append(str).append(" (value \"").append(a).append("\") as boolean");
        return z;
    }
}
