package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ajb {
    public static C0000a f988a;
    public static final Pattern f989b = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    private static String f990c;
    private static TelephonyManager f991d;
    private static final char[] f992e = new char[]{'-', '.', ',', '(', ')', ' ', '/', '\\', '*', '#', '+'};
    private static HashSet f993f = new HashSet(f992e.length);

    static {
        for (char valueOf : f992e) {
            f993f.add(Character.valueOf(valueOf));
        }
    }

    private ajb() {
    }

    private static TelephonyManager m2601b(Context context) {
        synchronized (ajb.class) {
            if (f991d == null) {
                f991d = (TelephonyManager) context.getSystemService("phone");
            }
        }
        return f991d;
    }

    public static String m2599a(Context context) {
        if (f990c == null) {
            f990c = ajb.m2601b(context).getLine1Number();
        }
        return f990c;
    }

    public static String m2600a(String str) {
        Matcher matcher = f989b.matcher(str);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        return str;
    }

    public static boolean m2602b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(ajb.m2600a(str)).matches();
    }
}
