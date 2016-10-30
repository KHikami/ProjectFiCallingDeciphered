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
    private static final boolean d;
    private static int e;
    private static String f;
    private static String g;
    private static Integer h;
    public final glt a;
    public final Set<String> b;
    public lo<String, String> c;//maps countries with a string?
    private final ke i;
    private final jbc j;
    private final jar k;
    private final Pattern l;
    private final Pattern m;
    private final Pattern n;

    static {
        kae kae = glk.t;//creates a kae w/ string "debug.chat.util"
        d = false;
        e = -1;
    }

    glq() {
        this.a = new glt();
        this.i = ke.a();
        this.j = jbc.a;
        this.k = jar.b();
        this.l = Pattern.compile("^[\\p{L}\\p{M}].*$");
        this.m = Pattern.compile("^\\+?[0-9. ()-]{4,30}$");
        this.n = Pattern.compile(".*\\b[0-9]+\\b.*");
        this.b = new HashSet();
        if (glk.a("Babel", 3)) {
            glk.a("Babel", "Creating PhoneUtils", new Throwable());
        }
        this.c = new lo();
        this.c.put(Locale.US.getCountry(), "*67");
        this.c.put(Locale.UK.getCountry(), "#31#");
        this.c.put("HK", "133");//hong kong is 133 for something???
        this.c.put("DK", "#31#");
        this.c.put("IT", "#31#");
        this.c.put("SE", "#31#");
        this.c.put("AT", "#31#");
        this.c.put("BG", "#31#");
        this.c.put("NL", "#31#");
        this.c.put("GR", "#31#");
        this.c.put("HR", "#31#");
        this.c.put("LT", "#31#");
        this.c.put("LV", "#31#");
        this.c.put("FI", "#31#");
        this.c.put("SK", "#31#");
        this.c.put("SI", "#31#");
        this.c.put("PT", "#31#");
        this.c.put("FR", "#31#");
        this.c.put("HU", "#31#");
        this.c.put("ES", "#31#");
        this.c.put("DE", "#31#");
        this.c.put("EE", "#31#");
        this.c.put("RO", "#31#");
        this.c.put("PL", "#31#");
        this.c.put("BE", "#31#");
        this.c.put("CZ", "#31#");
        this.c.put("MT", "#31#");
        this.c.put("LU", "#31#");
        this.c.put("ID", "#31#");
        this.c.put("CY", "*31*");
        this.c.put("AU", "1831");
        this.c.put("KR", "*23");
        this.c.put("IL", "#31#");
        this.c.put("IE", "#31#");
    }

    public static void a(String str, Integer num) {
        g = str;
        h = num;
        f = null;
        e = -1;
    }

    public static boolean a(Context context) {
        int phoneType = n(context).getPhoneType();
        glk.a("Babel", "isPhone: phoneType = " + phoneType, new Object[0]);//glk.a(String,String,Object)
        if (phoneType != 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        int simState = n(context).getSimState();
        if (d) {
            new StringBuilder(50).append("telephonyManager.getSimState() returns:").append(simState);
        }
        if (simState != 1) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (jyn.b(context, gae.class) != null) {
            return false;
        }
        if (VERSION.SDK_INT >= 21) {
            return n(context).isSmsCapable();
        }
        return a(context);
    }

    public static boolean d(Context context) {
        boolean a = a(context);
        glk.a("Babel", "canSupportPSTNCalls: isPhone = " + a, new Object[0]);
        return a;
    }

    public static boolean e(Context context) {
        return c(context) && b(context);
    }

    public static String f(Context context) {
        String g = g(context);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        return gls.a.f(g, j(context)); //related glq to gls.f(string, string)
    }

    public static String g(Context context) {
        if (h(context)) {
            return n(context).getLine1Number();
        }
        return null;
    }

    public static boolean h(Context context) {
        ehz ehz = (ehz) jyn.a(context, ehz.class);
        return ehz.a("android.permission.READ_PHONE_STATE") || ehz.a("android.permission.READ_SMS");
    }

    public static String i(Context context) {
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        if (b(context)) {
            String j = j(context);
            if (!TextUtils.isEmpty(j)) {
                f = j;
                return j;
            }
        }
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        if (TextUtils.isEmpty(Locale.getDefault().getCountry())) {
            return "US";
        }
        return Locale.getDefault().getCountry();
    }

    public static String j(Context context) {
        Object simCountryIso = n(context).getSimCountryIso();
        if (TextUtils.isEmpty(simCountryIso)) {
            return null;
        }
        return simCountryIso.toUpperCase(Locale.US);
    }

    public static String k(Context context) {
        return n(context).getSimOperator();
    }

    public String a(String str) {
        String str2 = null;
        try {
            str2 = a(str, null, false).f();
        } catch (jap e) {
            if (d) {
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

    private static boolean e(String str, String str2) {
        if (str == null) {
            return false;
        }
        String str3 = (String) gls.a.c.get(str2);
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        return str.startsWith(str3);
    }

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        glq glq = gls.a;
        return e(str, i(context));
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return str;
        }
        String str3 = (String) gls.a.c.get(str2);
        return !TextUtils.isEmpty(str3) ? str.replaceFirst(Pattern.quote(str3), "") : str;
    }

    public String b(String str, String str2) {
        if (e(str, str2)) {
            return str;
        }
        if (!(str == null || str2 == null)) {
            String str3 = (String) this.c.get(str2);
            if (!TextUtils.isEmpty(str3)) {
                str3 = String.valueOf(str3);
                String valueOf = String.valueOf(str);
                return valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            }
        }
        return null;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            boolean z;
            glq glq = gls.a;
            if (glq.n.matcher(str).matches() && glq.m.matcher(str).matches()) {
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

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        String valueOf = String.valueOf(str.startsWith("+") ? "+" : "");
        String valueOf2 = String.valueOf(str.replaceAll("[^0-9]", ""));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private String f(String str, String str2) {
        String str3;
        try {
            glo a = a(a(str, str2), str2, false);
            if (a.d()) {
                return a.a(jau.a);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.equals(Locale.US.getCountry()) && this.j.a(a.c(), str2)) {
                Object obj;
                String a2 = a.a(jau.a);
                for (String str32 : gls.a.b) {
                    if (a2.startsWith(str32)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj != null) {
                    return a.a(jau.a);
                }
            }
            return null;
        } catch (jap e) {
            if (d) {
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

    public static String e(String str) {
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

    public static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (PhoneNumberUtils.isEmergencyNumber(str)) {
            return true;
        }
        return gls.a.g(str, str2);
    }

    private String j(Context context, String str) {
        String i = i(context);
        String c = c(str, i);
        if (c != null) {
            return c;
        }
        c = h(str, i);
        if (c != null) {
            return c;
        }
        return str;
    }

    public static String g(Context context, String str) {
        String i = i(context);
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
                return gls.a.a(trim, i, substring, trim2);
            }
            if (!TextUtils.isEmpty(substring)) {
                return substring;
            }
        }
        return null;
    }

    public static String f(String str) {
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

    public boolean a(Context context, String str, String str2) {
        String i = i(context);
        try {
            glo a = a(str, i, false);
            jat a2 = a.a(a(str2, i, false));
            if (!this.j.a(a.c(), i)) {
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

    public static String a(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(gwb.wP);
        }
        return gls.a.b(context, str, i);
    }

    private String b(Context context, String str, int i) {
        ke keVar = this.i;
        if (str != null && str.length() >= 6) {
            str = gls.a.c(context, str, i);
        }
        return keVar.a(str, kp.a);
    }

    private String c(Context context, String str, int i) {
        String c = c(context, str);
        if (c == null) {
            return str;
        }
        try {
            int i2;
            glo a = a(c, i(context), false);
            switch (glr.a[i - 1]) {
                case wi.j /*1*/:
                    int a2 = a.c().a();
                    if (e > 0) {
                        i2 = e;
                    } else {
                        if (b(context)) {
                            Integer valueOf = Integer.valueOf(gls.a.k.e(i(context)));
                            if (valueOf != null) {
                                e = gwb.a(valueOf);
                                i2 = e;
                            }
                        }
                        if (h != null) {
                            i2 = gwb.a(h);
                        } else {
                            i2 = 1;
                        }
                    }
                    if (a2 != i2) {
                        i2 = jau.b;
                        break;
                    }
                    i2 = jau.c;
                    break;
                case wi.l /*2*/:
                    i2 = jau.c;
                    break;
                default:
                    i2 = jau.b;
                    break;
            }
            return a.a(i2);
        } catch (jap e) {
            return c;
        }
    }

    public static String h(Context context, String str) {
        return i(context, str).replaceAll("\\s", "\\\u00a0");
    }

    public static String i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(gwb.wP);
        }
        return gls.a.k(context, str);
    }

    private String k(Context context, String str) {
        if (str != null && this.l.matcher(str).matches()) {
            return str;
        }
        try {
            glo a = gls.a.a(e(context, str), null, a(context, str));
            boolean h = h(str);
            if (a.d() || h) {
                return gls.a.a(context, a);
            }
            return str;
        } catch (jap e) {
            String valueOf = String.valueOf(e.getMessage());
            new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("Failed to parse '").append(str).append("' into PhoneInfo: ").append(valueOf);
            return a(context, str, glu.a);
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        String a = gls.a.a(str);
        if (a != null) {
            return new Locale(Locale.getDefault().getLanguage(), a).getDisplayCountry();
        }
        return null;
    }

    private glo a(String str, String str2, boolean z) {
        if (str == null) {
            throw new jap(jaq.NOT_A_NUMBER, "Number may not be null");
        }
        glo glo = (glo) this.a.a((Object) str);
        if (glo != null && glo.a(str2) && glo.b() == z) {
            return glo;
        }
        glo = new glo(str, str2, z);
        this.a.a((Object) str, (Object) glo);
        return glo;
    }

    private String a(Context context, glo glo) {
        int i;
        if (glo.a(context)) {
            i = jau.c;
        } else {
            i = jau.a;
        }
        String b = b(context, glo.a(i), glu.a);
        if (!glo.b()) {
            return b;
        }
        String str = " ";
        b = String.valueOf(b);
        return b(context, b.length() != 0 ? str.concat(b) : new String(str));
    }

    private static TelephonyManager n(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static boolean l(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && VERSION.SDK_INT >= 18) {
            Object obj;
            if (((ehz) jyn.a(context, ehz.class)).a("android.permission.ACCESS_COARSE_LOCATION")) {
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

    public static boolean m(Context context) {
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

    public static glq a() {
        return gls.a;
    } //create new glq

    public static boolean b(String str) {
        String a = gls.a.a(str); //glq.a for related glq to gls
        return a == null || a.equals("US") || a.equals("CA"); //glt.equals("US") or "CA"
    }

    public static String b(Context context, String str) {
        return gls.a.b(str, i(context));
    }

    public static String c(Context context, String str) {
        return gls.a.f(str, i(context));
    }

    public static String c(String str, String str2) {
        return gls.a.f(str, str2);
    }

    private static boolean h(String str) {
        for (String startsWith : gls.a.b) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        return gls.a.g(str, i(context));
    }

    private boolean g(String str, String str2) {
        String l;
        try {
            glo a = a(str, str2, false);
            l = Long.toString(a.c().b());
            CharSequence f = a.f();
            if (!TextUtils.isEmpty(f)) {
                str2 = f;
            }
            if (this.j.a(l, str2) && this.j.b(l, str2)) {
                return true;
            }
            return false;
        } catch (jap e) {
            if (d) {
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
    public static String e(Context context, String str) {
        return gls.a.j(context, str);
    }

    public static String f(Context context, String str) {
        return gls.a.j(context, str);
    }

    private String a(String str, String str2, String str3, String str4) {
        String valueOf;
        String valueOf2;
        try {
            glo a = a(str4, str2, false);
            if (a.d()) {
                valueOf = String.valueOf(str3);
                valueOf2 = String.valueOf(a.a(jau.a));
                if (valueOf2.length() != 0) {
                    return valueOf.concat(valueOf2);
                }
                return new String(valueOf);
            }
            if (this.j.a(a.c(), str2)) {
                valueOf = String.valueOf(str3);
                valueOf2 = String.valueOf(a.a(jau.c));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            return null;
        } catch (jap e) {
            if (d) {
                valueOf2 = "Unable to parse phone number ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf2.concat(valueOf);
                } else {
                    valueOf = new String(valueOf2);
                }
            }
        }
    }

    private String h(String str, String str2) {
        String valueOf;
        try {
            glo a = a(str, str2, false);
            if (a.d()) {
                return a.a(jau.a);
            }
            int length = String.valueOf(a.e()).length();
            if (length < 2 || length > 18) {
                return null;
            }
            return String.format("+%s%s", new Object[]{String.valueOf(a.b(str2)), valueOf});
        } catch (jap e) {
            if (!d) {
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
