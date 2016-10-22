package defpackage;

import android.content.Context;
import android.telecom.PhoneAccountHandle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: awy */
public final class awy {
    private static final Set a;

    static {
        a = new HashSet(Arrays.asList(new String[]{"-1", "-2", "-3"}));
    }

    public static boolean a(CharSequence charSequence, int i) {
        if (i != 1 || TextUtils.isEmpty(charSequence) || awy.b(charSequence)) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context, PhoneAccountHandle phoneAccountHandle, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return axk.a(context, phoneAccountHandle, charSequence.toString());
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence != null && awy.a(charSequence.toString());
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence != null && a.contains(charSequence.toString());
    }

    public static String a(Context context, String str) {
        String str2 = "PhoneNumberHelper.getGeoDescription, ";
        String valueOf = String.valueOf(buf.y((Object) str));
        buf.c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ddo a;
        ddk a2 = ddk.a();
        ddt a3 = ddt.a();
        Locale locale = context.getResources().getConfiguration().locale;
        str2 = awy.a(context, locale);
        try {
            String valueOf2 = String.valueOf(buf.y((Object) str));
            buf.c(new StringBuilder((String.valueOf(valueOf2).length() + 31) + String.valueOf(str2).length()).append("parsing '").append(valueOf2).append("' for countryIso '").append(str2).append("'...").toString(), new Object[0]);
            a = a2.a(str, str2);
            try {
                valueOf2 = "- parsed number: ";
                str2 = String.valueOf(buf.y((Object) a));
                buf.c(str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2), new Object[0]);
            } catch (ddi e) {
                str2 = String.valueOf(buf.y((Object) str));
                buf.b(new StringBuilder(String.valueOf(str2).length() + 62).append("getGeoDescription: NumberParseException for incoming number '").append(str2).append("'").toString(), new Object[0]);
                if (a != null) {
                    return null;
                }
                valueOf = a3.a(a, locale);
                buf.c(new StringBuilder(String.valueOf(valueOf).length() + 21).append("- got description: '").append(valueOf).append("'").toString(), new Object[0]);
                return valueOf;
            }
        } catch (ddi e2) {
            a = null;
            str2 = String.valueOf(buf.y((Object) str));
            buf.b(new StringBuilder(String.valueOf(str2).length() + 62).append("getGeoDescription: NumberParseException for incoming number '").append(str2).append("'").toString(), new Object[0]);
            if (a != null) {
                return null;
            }
            valueOf = a3.a(a, locale);
            buf.c(new StringBuilder(String.valueOf(valueOf).length() + 21).append("- got description: '").append(valueOf).append("'").toString(), new Object[0]);
            return valueOf;
        }
        if (a != null) {
            return null;
        }
        valueOf = a3.a(a, locale);
        buf.c(new StringBuilder(String.valueOf(valueOf).length() + 21).append("- got description: '").append(valueOf).append("'").toString(), new Object[0]);
        return valueOf;
    }

    public static String a(Context context, Locale locale) {
        String toUpperCase = ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso().toUpperCase();
        if (toUpperCase != null) {
            return toUpperCase;
        }
        String country = locale.getCountry();
        String str = "No CountryDetector; falling back to countryIso based on locale: ";
        toUpperCase = String.valueOf(country);
        buf.a(toUpperCase.length() != 0 ? str.concat(toUpperCase) : new String(str), new Object[0]);
        return country;
    }

    public static boolean a(String str) {
        return str != null && (str.contains("@") || str.contains("%40"));
    }

    public static String b(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            indexOf = str.indexOf("%40");
        }
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        String str2 = "getUsernameFromUriNumber: no delimiter found in SIP address: ";
        String valueOf = String.valueOf(buf.y((Object) str));
        buf.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        return str;
    }
}
