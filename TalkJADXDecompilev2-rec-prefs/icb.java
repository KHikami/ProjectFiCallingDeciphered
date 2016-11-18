package p000;

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
    public static final Uri f17547a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri f17548b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern f17549c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern f17550d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    static HashMap<String, String> f17551e;
    static Object f17552f;
    static String[] f17553g = new String[0];
    private static Context f17554h = null;

    private static void m21568b(ContentResolver contentResolver) {
        if (f17551e == null) {
            f17551e = new HashMap();
            f17552f = new Object();
            new icc("Gservices", contentResolver).start();
        }
    }

    private static void m21566a() {
        if (f17554h != null) {
            f17554h.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }

    public static String m21564a(ContentResolver contentResolver, String str, String str2) {
        icb.m21566a();
        synchronized (icb.class) {
            icb.m21568b(contentResolver);
            Object obj = f17552f;
            String str3;
            if (f17551e.containsKey(str)) {
                str3 = (String) f17551e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                for (String startsWith : f17553g) {
                    if (str.startsWith(startsWith)) {
                        break;
                    }
                }
                Cursor query = contentResolver.query(f17547a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            synchronized (icb.class) {
                                if (obj == f17552f) {
                                    f17551e.put(str, str3);
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
                f17551e.put(str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    public static String m21563a(ContentResolver contentResolver, String str) {
        return icb.m21564a(contentResolver, str, null);
    }

    public static Map<String, String> m21565a(ContentResolver contentResolver, String... strArr) {
        icb.m21566a();
        Cursor query = contentResolver.query(f17548b, null, null, strArr, null);
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

    public static void m21569b(ContentResolver contentResolver, String... strArr) {
        icb.m21566a();
        Map a = icb.m21565a(contentResolver, strArr);
        synchronized (icb.class) {
            icb.m21568b(contentResolver);
            f17553g = strArr;
            for (Entry entry : a.entrySet()) {
                f17551e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static Object m21562a(ContentResolver contentResolver) {
        Object obj;
        icb.m21566a();
        synchronized (icb.class) {
            icb.m21568b(contentResolver);
            obj = f17552f;
        }
        return obj;
    }

    public static int m21560a(ContentResolver contentResolver, String str, int i) {
        String a = icb.m21564a(contentResolver, str, null);
        if (a != null) {
            try {
                i = Integer.parseInt(a);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public static long m21561a(ContentResolver contentResolver, String str, long j) {
        String a = icb.m21564a(contentResolver, str, null);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static boolean m21567a(ContentResolver contentResolver, String str, boolean z) {
        Object a = icb.m21564a(contentResolver, str, null);
        if (a == null || a.equals("")) {
            return z;
        }
        if (f17549c.matcher(a).matches()) {
            return true;
        }
        if (f17550d.matcher(a).matches()) {
            return false;
        }
        new StringBuilder("attempt to read gservices key ").append(str).append(" (value \"").append(a).append("\") as boolean");
        return z;
    }
}
