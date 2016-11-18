package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

public final class glq {
    private static final boolean f15593d = false;
    private static int f15594e = -1;
    private static String f15595f;
    private static String f15596g;
    private static Integer f15597h;
    public final glt f15598a = new glt();
    public final Set<String> f15599b = new HashSet();
    public lo<String, String> f15600c;
    private final ke f15601i = ke.m25637a();
    private final jbc f15602j = jbc.f19671a;
    private final jar f15603k = jar.m23675b();
    private final Pattern f15604l = Pattern.compile("^[\\p{L}\\p{M}].*$");
    private final Pattern f15605m = Pattern.compile("^\\+?[0-9. ()-]{4,30}$");
    private final Pattern f15606n = Pattern.compile(".*\\b[0-9]+\\b.*");

    static {
        kae kae = glk.f15573t;
    }

    glq() {
        if (glk.m17973a("Babel", 3)) {
            glk.m17969a("Babel", "Creating PhoneUtils", new Throwable());
        }
        this.f15600c = new lo();
        this.f15600c.put(Locale.US.getCountry(), "*67");
        this.f15600c.put(Locale.UK.getCountry(), "#31#");
        this.f15600c.put("HK", "133");
        this.f15600c.put("DK", "#31#");
        this.f15600c.put("IT", "#31#");
        this.f15600c.put("SE", "#31#");
        this.f15600c.put("AT", "#31#");
        this.f15600c.put("BG", "#31#");
        this.f15600c.put("NL", "#31#");
        this.f15600c.put("GR", "#31#");
        this.f15600c.put("HR", "#31#");
        this.f15600c.put("LT", "#31#");
        this.f15600c.put("LV", "#31#");
        this.f15600c.put("FI", "#31#");
        this.f15600c.put("SK", "#31#");
        this.f15600c.put("SI", "#31#");
        this.f15600c.put("PT", "#31#");
        this.f15600c.put("FR", "#31#");
        this.f15600c.put("HU", "#31#");
        this.f15600c.put("ES", "#31#");
        this.f15600c.put("DE", "#31#");
        this.f15600c.put("EE", "#31#");
        this.f15600c.put("RO", "#31#");
        this.f15600c.put("PL", "#31#");
        this.f15600c.put("BE", "#31#");
        this.f15600c.put("CZ", "#31#");
        this.f15600c.put("MT", "#31#");
        this.f15600c.put("LU", "#31#");
        this.f15600c.put("ID", "#31#");
        this.f15600c.put("CY", "*31*");
        this.f15600c.put("AU", "1831");
        this.f15600c.put("KR", "*23");
        this.f15600c.put("IL", "#31#");
        this.f15600c.put("IE", "#31#");
    }

    public static void m18005a(String str, Integer num) {
        f15596g = str;
        f15597h = num;
        f15595f = null;
        f15594e = -1;
    }

    public static boolean m18006a(Context context) {
        int phoneType = glq.m18045n(context).getPhoneType();
        glk.m17970a("Babel", "isPhone: phoneType = " + phoneType, new Object[0]);
        if (phoneType != 0) {
            return true;
        }
        return false;
    }

    public static boolean m18010b(Context context) {
        int simState = glq.m18045n(context).getSimState();
        if (f15593d) {
            new StringBuilder(50).append("telephonyManager.getSimState() returns:").append(simState);
        }
        if (simState != 1) {
            return true;
        }
        return false;
    }

    public static boolean m18015c(Context context) {
        if (jyn.m25433b(context, gae.class) != null) {
            return false;
        }
        if (VERSION.SDK_INT >= 21) {
            return glq.m18045n(context).isSmsCapable();
        }
        return glq.m18006a(context);
    }

    public static boolean m18018d(Context context) {
        boolean a = glq.m18006a(context);
        glk.m17970a("Babel", "canSupportPSTNCalls: isPhone = " + a, new Object[0]);
        return a;
    }

    public static boolean m18023e(Context context) {
        return glq.m18015c(context) && glq.m18010b(context);
    }

    public static String m18025f(Context context) {
        String g = glq.m18029g(context);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        return gls.f15608a.m18028f(g, glq.m18039j(context));
    }

    public static String m18029g(Context context) {
        if (glq.m18035h(context)) {
            return glq.m18045n(context).getLine1Number();
        }
        return null;
    }

    public static boolean m18035h(Context context) {
        ehz ehz = (ehz) jyn.m25426a(context, ehz.class);
        return ehz.mo1882a("android.permission.READ_PHONE_STATE") || ehz.mo1882a("android.permission.READ_SMS");
    }

    public static String m18037i(Context context) {
        if (!TextUtils.isEmpty(f15595f)) {
            return f15595f;
        }
        if (glq.m18010b(context)) {
            String j = glq.m18039j(context);
            if (!TextUtils.isEmpty(j)) {
                f15595f = j;
                return j;
            }
        }
        if (!TextUtils.isEmpty(f15596g)) {
            return f15596g;
        }
        if (TextUtils.isEmpty(Locale.getDefault().getCountry())) {
            return "US";
        }
        return Locale.getDefault().getCountry();
    }

    public static String m18039j(Context context) {
        Object simCountryIso = glq.m18045n(context).getSimCountryIso();
        if (TextUtils.isEmpty(simCountryIso)) {
            return null;
        }
        return simCountryIso.toUpperCase(Locale.US);
    }

    public static String m18041k(Context context) {
        return glq.m18045n(context).getSimOperator();
    }

    public String m18046a(String str) {
        String str2 = null;
        try {
            str2 = m17999a(str, null, false).m17998f();
        } catch (jap e) {
            if (f15593d) {
                String str3 = "getCountry: Not able to parse e164 number ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
            }
        }
        return str2;
    }

    private static boolean m18024e(String str, String str2) {
        if (str == null) {
            return false;
        }
        String str3 = (String) gls.f15608a.f15600c.get(str2);
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        return str.startsWith(str3);
    }

    public static boolean m18007a(Context context, String str) {
        if (str == null) {
            return false;
        }
        glq glq = gls.f15608a;
        return glq.m18024e(str, glq.m18037i(context));
    }

    public static String m18003a(String str, String str2) {
        if (str == null || str2 == null) {
            return str;
        }
        String str3 = (String) gls.f15608a.f15600c.get(str2);
        return !TextUtils.isEmpty(str3) ? str.replaceFirst(Pattern.quote(str3), "") : str;
    }

    public String m18048b(String str, String str2) {
        if (glq.m18024e(str, str2)) {
            return str;
        }
        if (!(str == null || str2 == null)) {
            String str3 = (String) this.f15600c.get(str2);
            if (!TextUtils.isEmpty(str3)) {
                str3 = String.valueOf(str3);
                String valueOf = String.valueOf(str);
                return valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            }
        }
        return null;
    }

    public static boolean m18016c(String str) {
        if (!TextUtils.isEmpty(str)) {
            boolean z;
            glq glq = gls.f15608a;
            if (glq.f15606n.matcher(str).matches() && glq.f15605m.matcher(str).matches()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static String m18017d(String str) {
        if (str == null) {
            return null;
        }
        String valueOf = String.valueOf(str.startsWith("+") ? "+" : "");
        String valueOf2 = String.valueOf(str.replaceAll("[^0-9]", ""));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private String m18028f(String str, String str2) {
        String str3;
        try {
            glo a = m17999a(glq.m18003a(str, str2), str2, false);
            if (a.m17996d()) {
                return a.m17990a(jau.f19622a);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.equals(Locale.US.getCountry()) && this.f15602j.m23761a(a.m17995c(), str2)) {
                Object obj;
                String a2 = a.m17990a(jau.f19622a);
                for (String str32 : gls.f15608a.f15599b) {
                    if (a2.startsWith(str32)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    return a.m17990a(jau.f19622a);
                }
            }
            return null;
        } catch (jap e) {
            if (f15593d) {
                str32 = "toValidGvE164Number: Not able to parse phone number ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str32.concat(valueOf);
                } else {
                    valueOf = new String(str32);
                }
            }
            return null;
        }
    }

    public static String m18022e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean m18020d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (PhoneNumberUtils.isEmergencyNumber(str)) {
            return true;
        }
        return gls.f15608a.m18032g(str, str2);
    }

    private String m18040j(Context context, String str) {
        String i = glq.m18037i(context);
        String c = glq.m18014c(str, i);
        if (c != null) {
            return c;
        }
        c = m18034h(str, i);
        if (c != null) {
            return c;
        }
        return str;
    }

    public static String m18030g(Context context, String str) {
        String i = glq.m18037i(context);
        if (str != null) {
            String substring;
            String trim = str.trim();
            if (trim != null && trim.length() >= 3 && trim.charAt(0) == '*' && Character.isDigit(trim.charAt(1)) && Character.isDigit(trim.charAt(2))) {
                substring = trim.substring(0, 3);
            } else {
                substring = "";
            }
            Object trim2 = trim.substring(substring.length()).trim();
            if (!TextUtils.isEmpty(trim2)) {
                return gls.f15608a.m18004a(trim, i, substring, trim2);
            }
            if (!TextUtils.isEmpty(substring)) {
                return substring;
            }
        }
        return null;
    }

    public static String m18027f(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.substring(Math.max(0, stringBuilder.length() - 6));
    }

    public boolean m18047a(Context context, String str, String str2) {
        String i = glq.m18037i(context);
        try {
            glo a = m17999a(str, i, false);
            jat a2 = a.m17989a(m17999a(str2, i, false));
            if (!this.f15602j.m23761a(a.m17995c(), i)) {
                boolean z;
                if (i.equals("US")) {
                    if (str.startsWith("+1")) {
                        z = str.length() == 10;
                    } else if (str.length() == 8) {
                        z = true;
                    }
                    if (!z) {
                        if (a2 != jat.EXACT_MATCH || a2 == jat.NSN_MATCH || a2 == jat.SHORT_NSN_MATCH) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (z) {
                    if (a2 != jat.EXACT_MATCH) {
                    }
                    return true;
                }
            }
            if (a2 == jat.EXACT_MATCH) {
                return true;
            }
            return false;
        } catch (jap e) {
            return false;
        }
    }

    public static String m18002a(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(gwb.wP);
        }
        return gls.f15608a.m18009b(context, str, i);
    }

    private String m18009b(Context context, String str, int i) {
        ke keVar = this.f15601i;
        if (str != null && str.length() >= 6) {
            str = gls.f15608a.m18013c(context, str, i);
        }
        return keVar.m25642a(str, kp.f22600a);
    }

    private String m18013c(Context context, String str, int i) {
        String c = glq.m18012c(context, str);
        if (c == null) {
            return str;
        }
        try {
            int i2;
            glo a = m17999a(c, glq.m18037i(context), false);
            switch (glr.f15607a[i - 1]) {
                case 1:
                    int a2 = a.m17995c().m23719a();
                    if (f15594e > 0) {
                        i2 = f15594e;
                    } else {
                        if (glq.m18010b(context)) {
                            Integer valueOf = Integer.valueOf(gls.f15608a.f15603k.m23707e(glq.m18037i(context)));
                            if (valueOf != null) {
                                f15594e = gwb.m1507a(valueOf);
                                i2 = f15594e;
                            }
                        }
                        if (f15597h != null) {
                            i2 = gwb.m1507a(f15597h);
                        } else {
                            i2 = 1;
                        }
                    }
                    if (a2 != i2) {
                        i2 = jau.f19623b;
                        break;
                    }
                    i2 = jau.f19624c;
                    break;
                case 2:
                    i2 = jau.f19624c;
                    break;
                default:
                    i2 = jau.f19623b;
                    break;
            }
            return a.m17990a(i2);
        } catch (jap e) {
            return c;
        }
    }

    public static String m18033h(Context context, String str) {
        return glq.m18038i(context, str).replaceAll("\\s", "\\ ");
    }

    public static String m18038i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(gwb.wP);
        }
        return gls.f15608a.m18042k(context, str);
    }

    private String m18042k(Context context, String str) {
        if (str != null && this.f15604l.matcher(str).matches()) {
            return str;
        }
        try {
            glo a = gls.f15608a.m17999a(glq.m18021e(context, str), null, glq.m18007a(context, str));
            boolean h = glq.m18036h(str);
            if (a.m17996d() || h) {
                return gls.f15608a.m18001a(context, a);
            }
            return str;
        } catch (jap e) {
            String valueOf = String.valueOf(e.getMessage());
            new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("Failed to parse '").append(str).append("' into PhoneInfo: ").append(valueOf);
            return glq.m18002a(context, str, glu.f15609a);
        }
    }

    public static String m18031g(String str) {
        if (str == null) {
            return null;
        }
        String a = gls.f15608a.m18046a(str);
        if (a != null) {
            return new Locale(Locale.getDefault().getLanguage(), a).getDisplayCountry();
        }
        return null;
    }

    private glo m17999a(String str, String str2, boolean z) {
        if (str == null) {
            throw new jap(jaq.NOT_A_NUMBER, "Number may not be null");
        }
        glo glo = (glo) this.f15598a.m1200a((Object) str);
        if (glo != null && glo.m17992a(str2) && glo.m17994b() == z) {
            return glo;
        }
        glo = new glo(str, str2, z);
        this.f15598a.m1201a((Object) str, (Object) glo);
        return glo;
    }

    private String m18001a(Context context, glo glo) {
        int i;
        if (glo.m17991a(context)) {
            i = jau.f19624c;
        } else {
            i = jau.f19622a;
        }
        String b = m18009b(context, glo.m17990a(i), glu.f15609a);
        if (!glo.m17994b()) {
            return b;
        }
        String str = " ";
        b = String.valueOf(b);
        return glq.m18008b(context, b.length() != 0 ? str.concat(b) : new String(str));
    }

    private static TelephonyManager m18045n(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static boolean m18043l(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && VERSION.SDK_INT >= 18) {
            Object obj;
            if (((ehz) jyn.m25426a(context, ehz.class)).mo1882a("android.permission.ACCESS_COARSE_LOCATION")) {
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo.isRegistered()) {
                            CellSignalStrength cellSignalStrength;
                            if (cellInfo instanceof CellInfoLte) {
                                cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            } else if (cellInfo instanceof CellInfoGsm) {
                                cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                            } else if (cellInfo instanceof CellInfoCdma) {
                                cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                cellSignalStrength = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                            } else {
                                cellSignalStrength = null;
                            }
                            if (cellSignalStrength != null) {
                                if (cellSignalStrength.getLevel() > 0) {
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean m18044m(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static glq m18000a() {
        return gls.f15608a;
    }

    public static boolean m18011b(String str) {
        String a = gls.f15608a.m18046a(str);
        return a == null || a.equals("US") || a.equals("CA");
    }

    public static String m18008b(Context context, String str) {
        return gls.f15608a.m18048b(str, glq.m18037i(context));
    }

    public static String m18012c(Context context, String str) {
        return gls.f15608a.m18028f(str, glq.m18037i(context));
    }

    public static String m18014c(String str, String str2) {
        return gls.f15608a.m18028f(str, str2);
    }

    private static boolean m18036h(String str) {
        for (String startsWith : gls.f15608a.f15599b) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m18019d(Context context, String str) {
        return gls.f15608a.m18032g(str, glq.m18037i(context));
    }

    private boolean m18032g(String str, String str2) {
        String l;
        try {
            glo a = m17999a(str, str2, false);
            l = Long.toString(a.m17995c().m23726b());
            CharSequence f = a.m17998f();
            if (!TextUtils.isEmpty(f)) {
                str2 = f;
            }
            if (this.f15602j.m23760a(l, str2) && this.f15602j.m23762b(l, str2)) {
                return true;
            }
            return false;
        } catch (jap e) {
            if (f15593d) {
                String str3 = "isPotentialEmergencyNumber: Not able to parse phone number ";
                l = String.valueOf(str);
                if (l.length() != 0) {
                    str3.concat(l);
                } else {
                    l = new String(str3);
                }
            }
            return false;
        }
    }

    @Deprecated
    public static String m18021e(Context context, String str) {
        return gls.f15608a.m18040j(context, str);
    }

    public static String m18026f(Context context, String str) {
        return gls.f15608a.m18040j(context, str);
    }

    private String m18004a(String str, String str2, String str3, String str4) {
        String valueOf;
        String valueOf2;
        try {
            glo a = m17999a(str4, str2, false);
            if (a.m17996d()) {
                valueOf2 = String.valueOf(str3);
                valueOf = String.valueOf(a.m17990a(jau.f19622a));
                if (valueOf.length() != 0) {
                    return valueOf2.concat(valueOf);
                }
                return new String(valueOf2);
            }
            if (this.f15602j.m23761a(a.m17995c(), str2)) {
                valueOf2 = String.valueOf(str3);
                valueOf = String.valueOf(a.m17990a(jau.f19624c));
                return valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
            }
            return null;
        } catch (jap e) {
            if (f15593d) {
                valueOf = "Unable to parse phone number ";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
            }
        }
    }

    private String m18034h(String str, String str2) {
        String valueOf;
        try {
            glo a = m17999a(str, str2, false);
            if (a.m17996d()) {
                return a.m17990a(jau.f19622a);
            }
            int length = String.valueOf(a.m17997e()).length();
            if (length < 2 || length > 18) {
                return null;
            }
            return String.format("+%s%s", new Object[]{String.valueOf(a.m17993b(str2)), valueOf});
        } catch (jap e) {
            if (!f15593d) {
                return null;
            }
            String str3 = "Not able to parse phone number ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
                return null;
            }
            valueOf = new String(str3);
            return null;
        }
    }
}
