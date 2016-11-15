import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class icb {//running stats logger (acts as a large cache for stats I've recently querried for from the content provider)
    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    static HashMap<String, String> e;//cache for query results from Content Provider
    static Object f;
    static String[] g;//string array for recent string queries
    private static Context h;

    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");//generates a uri based on this
        //this is an "hierarchical" URI => "[scheme:][//authority][path][?query][#fragment]" definition
        // so that translates to: content scheme, com.google.adroid.gsf.gservices as the authority (registry?)
        //holds cached statistics (varies based on the string argument passed in when calling query)

        b = Uri.parse("content://com.google.android.gsf.gservices/prefix");//generates a different uri based on the content at URL
        c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);    // 2 corresponds to flag CASE_INSENSITIVE
        d = Pattern.compile("^(0|false|f|off|no|n)$", 2);   // 2 corresponds to flag CASE_INSENSITIVE
        g = new String[0];
        h = null;
    }

    private static void b(ContentResolver contentResolver) {
        if (e == null) {//if no existing hashmap, initialize :)
            e = new HashMap();
            f = new Object();
            new icc("Gservices", contentResolver).start(); //new thread object for Gservices
            //start() => run of the thread
        }
    }

    private static void a() {
        if (h != null) {
            h.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        a();
        synchronized (icb.class) {
            b(contentResolver); // call to instantiate e and f if e is null
            Object obj = f;//soft copy f
            String str3;
            if (e.containsKey(str)) {   // If hashmap contains str, store value with that key and eventually return
                str3 = (String) e.get(str);
                if (str3 != null) {
                    str2 = str3;//store string 2 with the content of string 2
                }
            } else {
                for (String startsWith : g) {//if string not in the hashmap, loop over everything in the string
                    //that starts with g
                    if (str.startsWith(startsWith)) {
                        break;
                    }
                }
                //ContentResolver.query(Uri, String[] (null), String (null), String[] selectionArgs (new array wiht just passed string), sortOrder (null))
                //checks if the URI has content for the passed String (e.g. phone information etc.)
                //guess that makes e a buffer for the content info
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                //if result does have output
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {//Cursor does have items (moves pointer to first row of query result)
                            str3 = query.getString(1);//string 3 = first result of list
                            synchronized (icb.class) {
                                if (obj == f) { //if the object still retains the soft copy of f
                                    e.put(str, str3);//map string to string 3 (first result)
                                }
                            }
                            if (str3 != null) { //if result did exist (not a null object)
                                str2 = str3; //set it to be the result
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
                e.put(str, null);//add extra line of string maps to a null object
                //just in case if string 3 was not mapped to string.
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;//default value will be passed string 2 if it was not modified. Otherwise, return modified string 2
    }

    public static String a(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, null);
    }

    //creates hashmap e/fills it up
    public static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        a();
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

    //resets e to remap all the strings stored in g to the new content in the Content resolver
    //called by icc
    public static void b(ContentResolver contentResolver, String... strArr) {
        a();
        Map a = a(contentResolver, strArr);
        synchronized (icb.class) {
            b(contentResolver);//initialize e
            g = strArr;
            for (Entry entry : a.entrySet()) { //for each item in Map generated from a, store it for e
                //basically a hard copy
                e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        a();
        synchronized (icb.class) {
            b(contentResolver);
            obj = f;
        }
        return obj;
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        String a = a(contentResolver, str, null); //grab string associated with str using a(contentResolver, String, String)
        if (a != null) {
            try {
                i = Integer.parseInt(a); //grab the value stored in the map as an integer
            } catch (NumberFormatException e) {
            }
        }
        return i; //otherwise return the given default value
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a = a(contentResolver, str, null);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    // Lookup str in the context hashmap, and return the boolean value found if str is a valid key
    // Otherwise just return default boolean z
    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        // Will return a string with the associated value in hashmap e, if str is a retrievable key
        Object a = a(contentResolver, str, null);
        // If a is null or an empty string, return the default bool
        if (a == null || a.equals("")) {
            return z;
        }
        // Found a true/yes/1
        if (c.matcher(a).matches()) {
            return true;
        }
        // Found a false/no/0
        if (d.matcher(a).matches()) {
            return false;
        }
        new StringBuilder("attempt to read gservices key ").append(str).append(" (value \"").append(a).append("\") as boolean");
        return z;
    }
}
