import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class glk {
    public static volatile boolean A;
    private static final Map<String, String> B;
    private static final Pattern C;
    public static final kae a;
    public static final kae b;
    public static final kae c;
    public static final kae d;
    public static final kae e;
    public static final kae f;
    public static final kae g;
    public static final kae h;
    public static final kae i;
    public static final kae j;
    public static final kae k;
    public static final kae l;
    public static final kae m;
    public static final kae n;
    public static final kae o;
    public static final kae p;
    public static final kae q;
    public static final kae r;
    public static final kae s;
    public static final kae t;
    public static final kae u;
    public static final kae v;
    public static final kad w;
    public static final kae x;
    public static final kae y;
    public static itz z;

    static {
        a = c("audioplayer");
        b = c("callerid");
        c = c("clearcut");
        d = c("content");
        e = c("cve");
        f = c("fragment");
        g = c("hangout");
        h = c("latencytracker");
        i = c("network");
        j = c("networkqueue");
        k = c("phone");
        l = c("protocol");
        m = c("pstn");
        n = c("pstn_meta");
        o = c("realtimechat");
        p = c("requestwriter");
        q = c("service");
        r = c("sms");
        s = c("telephony");
        t = c("util");
        u = c("view");
        v = c("wear");
        w = new kad("pii", true);
        x = c("perf_cached");
        y = c("tracing");
        B = mjx.a("\t", "", "\n", " ==> ", "com.google.android.apps.hangouts", "", ".java", "");
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
            z = new itz(HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
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
        a(false, 3, str, str2, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        a(true, 3, str, str2, objArr);
    }

    public static void a(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        a(false, 3, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void c(String str, String str2, Object... objArr) {
        a(true, 4, str, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        a(true, 4, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void d(String str, String str2, Object... objArr) {
        a(true, 5, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th) {
        a(true, 5, str, str2, new Object[0]);
        a(true, 5, str, Log.getStackTraceString(th), new Object[0]);
    }

    public static void e(String str, String str2, Object... objArr) {
        a(true, 6, str, str2, objArr);
    }

    public static void d(String str, String str2, Throwable th) {
        a(true, 6, str, str2, new Object[0]);
        a(true, 6, str, Log.getStackTraceString(th), new Object[0]);
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
