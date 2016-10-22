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

/* compiled from: PG */
public class csn {
    public static final Uri a;
    static HashMap b;
    static Object c;
    static String[] d;
    private static Uri e;
    private static Pattern f;
    private static Pattern g;
    private static Context h;

    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");
        e = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        g = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        d = new String[0];
        h = null;
    }

    private static void b(ContentResolver contentResolver) {
        if (b == null) {
            b = new HashMap();
            c = new Object();
            new cso("Gservices", contentResolver).start();
        }
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (csn.class) {
            b(contentResolver);
            Object obj = c;
            String str3;
            if (b.containsKey(str)) {
                str3 = (String) b.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                for (String startsWith : d) {
                    if (str.startsWith(startsWith)) {
                        break;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            synchronized (csn.class) {
                                if (obj == c) {
                                    b.put(str, str3);
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
                b.put(str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    public static Map a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(e, null, null, strArr, null);
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

    public static void b(ContentResolver contentResolver, String... strArr) {
        Map a = a(contentResolver, strArr);
        synchronized (csn.class) {
            b(contentResolver);
            d = strArr;
            for (Entry entry : a.entrySet()) {
                b.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        synchronized (csn.class) {
            b(contentResolver);
            obj = c;
        }
        return obj;
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object a = a(contentResolver, str, null);
        if (a == null || a.equals("")) {
            return z;
        }
        if (f.matcher(a).matches()) {
            return true;
        }
        if (g.matcher(a).matches()) {
            return false;
        }
        Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a + "\") as boolean");
        return z;
    }
}
