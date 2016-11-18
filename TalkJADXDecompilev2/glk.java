package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class glk {
    public static volatile boolean A;
    private static final Map<String, String> B = mjx.a("\t", "", "\n", " ==> ", "com.google.android.apps.hangouts", "", ".java", "");
    private static final Pattern C;
    public static final kae a = glk.c("audioplayer");
    public static final kae b = glk.c("callerid");
    public static final kae c = glk.c("clearcut");
    public static final kae d = glk.c("content");
    public static final kae e = glk.c("cve");
    public static final kae f = glk.c("fragment");
    public static final kae g = glk.c("hangout");
    public static final kae h = glk.c("latencytracker");
    public static final kae i = glk.c("network");
    public static final kae j = glk.c("networkqueue");
    public static final kae k = glk.c("phone");
    public static final kae l = glk.c("protocol");
    public static final kae m = glk.c("pstn");
    public static final kae n = glk.c("pstn_meta");
    public static final kae o = glk.c("realtimechat");
    public static final kae p = glk.c("requestwriter");
    public static final kae q = glk.c("service");
    public static final kae r = glk.c("sms");
    public static final kae s = glk.c("telephony");
    public static final kae t = glk.c("util");
    public static final kae u = glk.c("view");
    public static final kae v = glk.c("wear");
    public static final kad w = new kad("pii", true);
    public static final kae x = glk.c("perf_cached");
    public static final kae y = glk.c("tracing");
    public static itz z;

    static {
        Iterable arrayList = new ArrayList();
        for (String quote : B.keySet()) {
            arrayList.add(Pattern.quote(quote));
        }
        C = Pattern.compile(String.format("(%s)", new Object[]{meu.a("|").a(arrayList)}));
    }

    private static kae c(String str) {
        String str2 = "debug.chat.";
        String valueOf = String.valueOf(str);
        return new kae(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (byte) 0);
    }

    public static void a() {
        int i = 2;
        boolean a = gwb.a(gwb.H(), "babel_log_dump", false);
        A = a;
        if (a && z == null) {
            z = new itz(500);
        } else if (!(A || z == null)) {
            z = null;
        }
        itz itz = z;
        String str = "vclib";
        if (!Log.isLoggable(str, 2)) {
            if (Log.isLoggable(str, 3)) {
                i = 3;
            } else if (Log.isLoggable(str, 4)) {
                i = 4;
            } else if (Log.isLoggable(str, 5)) {
                i = 5;
            } else {
                i = 6;
            }
        }
        itx.b = i;
        itx.a = itz;
        i = itx.b;
    }

    public static void a(String str, String str2, Object... objArr) {
        glk.a(false, 3, str, str2, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        glk.a(true, 3, str, str2, objArr);
    }

    public static void a(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        glk.a(false, 3, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void c(String str, String str2, Object... objArr) {
        glk.a(true, 4, str, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        glk.a(true, 4, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void d(String str, String str2, Object... objArr) {
        glk.a(true, 5, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th) {
        glk.a(true, 5, str, str2, new Object[0]);
        glk.a(true, 5, str, Log.getStackTraceString(th), new Object[0]);
    }

    public static void e(String str, String str2, Object... objArr) {
        glk.a(true, 6, str, str2, objArr);
    }

    public static void d(String str, String str2, Throwable th) {
        glk.a(true, 6, str, str2, new Object[0]);
        glk.a(true, 6, str, Log.getStackTraceString(th), new Object[0]);
    }

    private static void a(boolean z, int i, String str, String str2, Object... objArr) {
        String str3 = null;
        Object obj = (objArr == null || objArr.length > 0) ? 1 : null;
        if (z || i >= 4 || Log.isLoggable(str, i)) {
            if (obj != null) {
                str3 = String.format(str2, objArr);
            } else {
                str3 = str2;
            }
            Log.println(i, str, str3);
        }
        if (i >= 4 && "Babel_telephony".equals(str)) {
            if (str3 == null) {
                if (obj != null) {
                    str3 = String.format(str2, objArr);
                } else {
                    str3 = str2;
                }
            }
            inx.b(str3);
        }
        itz itz = z;
        if (itz != null && i >= 3) {
            if (str3 != null) {
                str2 = str3;
            } else if (obj != null) {
                str2 = String.format(str2, objArr);
            }
            itz.a(i, str, str2);
        }
    }

    public static boolean a(String str, int i) {
        boolean z = false;
        if (i == 3) {
            if (z != null) {
                z = true;
            }
        } else if (i == 2) {
        }
        if (z) {
            return z;
        }
        return Log.isLoggable(str, i);
    }

    public static String b(String str) {
        if (Log.isLoggable("Babel", 3)) {
            return str;
        }
        return "Redacted-" + (str == null ? 0 : str.length()) + "-chars";
    }

    public static String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = C.matcher(Log.getStackTraceString(th));
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, (String) B.get(matcher.group(1)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static boolean a(String str) {
        return Log.isLoggable(str, 3);
    }
}
