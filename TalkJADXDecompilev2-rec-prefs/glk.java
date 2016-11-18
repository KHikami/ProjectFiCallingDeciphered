package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class glk {
    public static volatile boolean f15551A;
    private static final Map<String, String> f15552B = mjx.m32327a("\t", "", "\n", " ==> ", "com.google.android.apps.hangouts", "", ".java", "");
    private static final Pattern f15553C;
    public static final kae f15554a = glk.m17977c("audioplayer");
    public static final kae f15555b = glk.m17977c("callerid");
    public static final kae f15556c = glk.m17977c("clearcut");
    public static final kae f15557d = glk.m17977c("content");
    public static final kae f15558e = glk.m17977c("cve");
    public static final kae f15559f = glk.m17977c("fragment");
    public static final kae f15560g = glk.m17977c("hangout");
    public static final kae f15561h = glk.m17977c("latencytracker");
    public static final kae f15562i = glk.m17977c("network");
    public static final kae f15563j = glk.m17977c("networkqueue");
    public static final kae f15564k = glk.m17977c("phone");
    public static final kae f15565l = glk.m17977c("protocol");
    public static final kae f15566m = glk.m17977c("pstn");
    public static final kae f15567n = glk.m17977c("pstn_meta");
    public static final kae f15568o = glk.m17977c("realtimechat");
    public static final kae f15569p = glk.m17977c("requestwriter");
    public static final kae f15570q = glk.m17977c("service");
    public static final kae f15571r = glk.m17977c("sms");
    public static final kae f15572s = glk.m17977c("telephony");
    public static final kae f15573t = glk.m17977c("util");
    public static final kae f15574u = glk.m17977c("view");
    public static final kae f15575v = glk.m17977c("wear");
    public static final kad f15576w = new kad("pii", true);
    public static final kae f15577x = glk.m17977c("perf_cached");
    public static final kae f15578y = glk.m17977c("tracing");
    public static itz f15579z;

    static {
        Iterable arrayList = new ArrayList();
        for (String quote : f15552B.keySet()) {
            arrayList.add(Pattern.quote(quote));
        }
        f15553C = Pattern.compile(String.format("(%s)", new Object[]{meu.m31960a("|").m31963a(arrayList)}));
    }

    private static kae m17977c(String str) {
        String str2 = "debug.chat.";
        String valueOf = String.valueOf(str);
        return new kae(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (byte) 0);
    }

    public static void m17968a() {
        int i = 2;
        boolean a = gwb.m1906a(gwb.m1400H(), "babel_log_dump", false);
        f15551A = a;
        if (a && f15579z == null) {
            f15579z = new itz(500);
        } else if (!(f15551A || f15579z == null)) {
            f15579z = null;
        }
        itz itz = f15579z;
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
        itx.f19012b = i;
        itx.f19011a = itz;
        i = itx.f19012b;
    }

    public static void m17970a(String str, String str2, Object... objArr) {
        glk.m17971a(false, 3, str, str2, objArr);
    }

    public static void m17976b(String str, String str2, Object... objArr) {
        glk.m17971a(true, 3, str, str2, objArr);
    }

    public static void m17969a(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        glk.m17971a(false, 3, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void m17979c(String str, String str2, Object... objArr) {
        glk.m17971a(true, 4, str, str2, objArr);
    }

    public static void m17975b(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(Log.getStackTraceString(th));
        glk.m17971a(true, 4, str, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("\n").append(valueOf).toString(), new Object[0]);
    }

    public static void m17981d(String str, String str2, Object... objArr) {
        glk.m17971a(true, 5, str, str2, objArr);
    }

    public static void m17978c(String str, String str2, Throwable th) {
        glk.m17971a(true, 5, str, str2, new Object[0]);
        glk.m17971a(true, 5, str, Log.getStackTraceString(th), new Object[0]);
    }

    public static void m17982e(String str, String str2, Object... objArr) {
        glk.m17971a(true, 6, str, str2, objArr);
    }

    public static void m17980d(String str, String str2, Throwable th) {
        glk.m17971a(true, 6, str, str2, new Object[0]);
        glk.m17971a(true, 6, str, Log.getStackTraceString(th), new Object[0]);
    }

    private static void m17971a(boolean z, int i, String str, String str2, Object... objArr) {
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
            inx.m22409b(str3);
        }
        itz itz = f15579z;
        if (itz != null && i >= 3) {
            if (str3 != null) {
                str2 = str3;
            } else if (obj != null) {
                str2 = String.format(str2, objArr);
            }
            itz.m23292a(i, str, str2);
        }
    }

    public static boolean m17973a(String str, int i) {
        boolean z = false;
        if (i == 3) {
            if (f15579z != null) {
                z = true;
            }
        } else if (i == 2) {
        }
        if (z) {
            return z;
        }
        return Log.isLoggable(str, i);
    }

    public static String m17974b(String str) {
        if (Log.isLoggable("Babel", 3)) {
            return str;
        }
        return "Redacted-" + (str == null ? 0 : str.length()) + "-chars";
    }

    public static String m17967a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f15553C.matcher(Log.getStackTraceString(th));
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, (String) f15552B.get(matcher.group(1)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static boolean m17972a(String str) {
        return Log.isLoggable(str, 3);
    }
}
