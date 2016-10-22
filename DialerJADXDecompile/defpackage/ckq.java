package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: ckq */
public class ckq {
    public static final Uri a;
    public static final Pattern b;
    public static final Pattern c;
    static HashMap d;
    static String[] e;
    private static Uri f;
    private static Object g;
    private static Context h;

    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");
        f = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        e = new String[0];
        h = null;
    }

    public static String a(ContentResolver contentResolver, String str) {
        return ckq.a(contentResolver, str, null);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (ckq.class) {
            ckq.a(contentResolver);
            Object obj = g;
            String str3;
            if (d.containsKey(str)) {
                str3 = (String) d.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                for (String startsWith : e) {
                    if (str.startsWith(startsWith)) {
                        break;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            synchronized (ckq.class) {
                                if (obj == g) {
                                    d.put(str, str3);
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
                d.put(str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    private static void a(ContentResolver contentResolver) {
        if (d == null) {
            d = new HashMap();
            g = new Object();
            new ckr("Gservices", contentResolver).start();
        }
    }

    public static void a(ContentResolver contentResolver, String... strArr) {
        Map b = ckq.b(contentResolver, strArr);
        synchronized (ckq.class) {
            ckq.a(contentResolver);
            e = strArr;
            for (Entry entry : b.entrySet()) {
                d.put(entry.getKey(), entry.getValue());
            }
        }
    }

    private static Map b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f, null, null, strArr, null);
        Map treeMap = new TreeMap();
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

    public static int a(ContentResolver contentResolver, String str, int i) {
        String a = ckq.a(contentResolver, str, null);
        if (a != null) {
            try {
                i = Integer.parseInt(a);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a = ckq.a(contentResolver, str, null);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a = ckq.a(contentResolver, str, null);
        if (a == null || a.equals("")) {
            return z;
        }
        if (b.matcher(a).matches()) {
            return true;
        }
        if (c.matcher(a).matches()) {
            return false;
        }
        Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a + "\") as boolean");
        return z;
    }
}
