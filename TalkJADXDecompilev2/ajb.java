package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ajb {
    public static a a;
    public static final Pattern b = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    private static String c;
    private static TelephonyManager d;
    private static final char[] e = new char[]{'-', '.', ',', '(', ')', ' ', '/', '\\', '*', '#', '+'};
    private static HashSet f = new HashSet(e.length);

    static {
        for (char valueOf : e) {
            f.add(Character.valueOf(valueOf));
        }
    }

    private ajb() {
    }

    private static TelephonyManager b(Context context) {
        synchronized (ajb.class) {
            if (d == null) {
                d = (TelephonyManager) context.getSystemService("phone");
            }
        }
        return d;
    }

    public static String a(Context context) {
        if (c == null) {
            c = ajb.b(context).getLine1Number();
        }
        return c;
    }

    public static String a(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        return str;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(ajb.a(str)).matches();
    }
}
