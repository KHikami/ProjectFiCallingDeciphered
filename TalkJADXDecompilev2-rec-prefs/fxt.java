package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public final class fxt extends ajf {
    static Bundle f14328b = null;
    private static final boolean f14329c = false;
    private static final Map<String, Object> f14330d = new HashMap();
    private static final Map<String, Object> f14331e = new HashMap();
    private static String f14332f = null;
    private static String f14333g = null;

    static {
        kae kae = glk.f15571r;
        f14330d.put("enabledMMS", Boolean.valueOf(true));
        f14330d.put("enabledTransID", Boolean.valueOf(false));
        f14330d.put("enabledNotifyWapMMSC", Boolean.valueOf(false));
        f14330d.put("aliasEnabled", Boolean.valueOf(false));
        f14330d.put("allowAttachAudio", Boolean.valueOf(true));
        f14330d.put("enableMultipartSMS", Boolean.valueOf(true));
        f14330d.put("enableSMSDeliveryReports", Boolean.valueOf(true));
        f14330d.put("enableGroupMms", Boolean.valueOf(true));
        f14330d.put("supportMmsContentDisposition", Boolean.valueOf(true));
        f14330d.put("config_cellBroadcastAppLinks", Boolean.valueOf(true));
        f14330d.put("sendMultipartSmsAsSeparateMessages", Boolean.valueOf(false));
        f14330d.put("enableMMSReadReports", Boolean.valueOf(false));
        f14330d.put("enableMMSDeliveryReports", Boolean.valueOf(false));
        f14330d.put("maxMessageSize", Integer.valueOf(307200));
        f14330d.put("maxImageHeight", Integer.valueOf(480));
        f14330d.put("maxImageWidth", Integer.valueOf(640));
        f14330d.put("recipientLimit", Integer.valueOf(Integer.MAX_VALUE));
        f14330d.put("httpSocketTimeout", Integer.valueOf(ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS));
        f14330d.put("aliasMinChars", Integer.valueOf(2));
        f14330d.put("aliasMaxChars", Integer.valueOf(48));
        f14330d.put("smsToMmsTextThreshold", Integer.valueOf(-1));
        f14330d.put("smsToMmsTextLengthThreshold", Integer.valueOf(-1));
        f14330d.put("maxMessageTextSize", Integer.valueOf(-1));
        f14330d.put("maxSubjectLength", Integer.valueOf(40));
        f14330d.put("mUaProfTagName", "x-wap-profile");
        f14330d.put("httpParams", null);
        f14330d.put("emailGatewayNumber", null);
        f14330d.put("naiSuffix", null);
    }

    public boolean mo2116a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && f14330d.containsKey(str)) {
            Object obj = f14330d.get(str);
            Class cls = obj != null ? obj.getClass() : String.class;
            if ("int".equals(str2)) {
                if (cls == Integer.class) {
                    return true;
                }
                return false;
            } else if ("bool".equals(str2)) {
                return cls == Boolean.class;
            } else {
                if ("string".equals(str2)) {
                    return cls == String.class;
                }
            }
        }
        return false;
    }

    private static String m16515c(String str) {
        Object obj = f14331e.get(str);
        if (obj != null) {
            return (String) obj;
        }
        return null;
    }

    public int mo2117b() {
        return gwb.m1507a((Integer) f14331e.get("smsToMmsTextThreshold"));
    }

    public int mo2119c() {
        return gwb.m1507a((Integer) f14331e.get("smsToMmsTextLengthThreshold"));
    }

    public boolean mo2120d() {
        return gwb.m2061b((Boolean) f14331e.get("enabledMMS"));
    }

    public int mo2121e() {
        return gwb.m1507a((Integer) f14331e.get("maxMessageSize"));
    }

    public boolean mo2122f() {
        return gwb.m2061b((Boolean) f14331e.get("enabledTransID"));
    }

    public String mo2123g() {
        return f14332f;
    }

    public String mo2124h() {
        return fxt.m16515c("mUaProfTagName");
    }

    public String mo2125i() {
        return f14333g;
    }

    public String mo2126j() {
        return fxt.m16515c("httpParams");
    }

    public String mo2127k() {
        return fxt.m16515c("emailGatewayNumber");
    }

    public int mo2128l() {
        return gwb.m1507a((Integer) f14331e.get("maxImageHeight"));
    }

    public int mo2129m() {
        return gwb.m1507a((Integer) f14331e.get("maxImageWidth"));
    }

    public int mo2130n() {
        int a = gwb.m1507a((Integer) f14331e.get("maxMessageTextSize"));
        return a >= 0 ? a : 2000;
    }

    public int mo2131o() {
        return gwb.m1507a((Integer) f14331e.get("httpSocketTimeout"));
    }

    public boolean mo2132p() {
        return gwb.m2061b((Boolean) f14331e.get("enableMultipartSMS"));
    }

    public boolean mo2133q() {
        return gwb.m2061b((Boolean) f14331e.get("sendMultipartSmsAsSeparateMessages"));
    }

    public boolean mo2134r() {
        return gwb.m2061b((Boolean) f14331e.get("enableSMSDeliveryReports"));
    }

    public boolean mo2135s() {
        return gwb.m2061b((Boolean) f14331e.get("enabledNotifyWapMMSC"));
    }

    public boolean mo2136t() {
        return gwb.m2061b((Boolean) f14331e.get("enableGroupMms"));
    }

    public boolean mo2137u() {
        return gwb.m2061b((Boolean) f14331e.get("supportMmsContentDisposition"));
    }

    public boolean mo2138v() {
        return gwb.m2061b((Boolean) f14331e.get("config_cellBroadcastAppLinks"));
    }

    public String mo2139w() {
        return fxt.m16515c("naiSuffix");
    }

    public static void m16513a(String str, String str2, String str3) {
        try {
            if ("int".equals(str3)) {
                f14331e.put(str, Integer.valueOf(Integer.parseInt(str2)));
            } else if ("bool".equals(str3)) {
                f14331e.put(str, Boolean.valueOf(Boolean.parseBoolean(str2)));
            } else if ("string".equals(str3)) {
                f14331e.put(str, str2);
            }
        } catch (NumberFormatException e) {
            glk.m17982e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 28) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("MmsConfig.update: invalid ").append(str).append(",").append(str2).append(",").append(str3).toString(), new Object[0]);
        }
    }

    private static void m16512a(String str, String str2, Bundle bundle, Bundle bundle2) {
        Object obj = f14331e.get(str);
        if (obj == null || (obj instanceof String)) {
            String str3 = (String) obj;
            if (!TextUtils.equals(bundle.getString(str2), str3)) {
                bundle2.putString(str2, str3);
            }
        } else if (obj instanceof Integer) {
            int a = gwb.m1507a((Integer) obj);
            if (bundle.getInt(str2) != a) {
                bundle2.putInt(str2, a);
            }
        } else if (obj instanceof Boolean) {
            boolean b = gwb.m2061b((Boolean) obj);
            if (bundle.getBoolean(str2) != b) {
                bundle2.putBoolean(str2, b);
            }
        }
    }

    public static void m16511a(Context context) {
        String str;
        String str2;
        glk.m17979c("Babel_SMS", "MmsConfig.loadMmsSettings", new Object[0]);
        f14331e.clear();
        f14331e.putAll(f14330d);
        if (VERSION.SDK_INT >= 19) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            f14332f = telephonyManager.getMmsUserAgent();
            f14333g = telephonyManager.getMmsUAProfUrl();
            str = f14332f;
            str2 = f14333g;
            glk.m17979c("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(str2).length()).append("MmsConfig.loadDeviceMmsSettings from API: mUserAgent=").append(str).append(", mUaProfUrl=").append(str2).toString(), new Object[0]);
        }
        if (!fxt.m16514b(context)) {
            glk.m17979c("Babel_SMS", "MmsConfig.loadFromResources", new Object[0]);
            XmlPullParser xml = context.getResources().getXml(gwb.iJ);
            fxk a = fxk.m16470a(xml);
            a.m16477a(new fxv());
            try {
                a.m16478a();
            } finally {
                xml.close();
            }
        } else if (fyi.m16614a(context)) {
            Bundle carrierConfigValues = SmsManager.getDefault().getCarrierConfigValues();
            Bundle bundle = new Bundle();
            fxt.m16512a("enabledMMS", "enabledMMS", carrierConfigValues, bundle);
            fxt.m16512a("enabledTransID", "enabledTransID", carrierConfigValues, bundle);
            fxt.m16512a("enabledNotifyWapMMSC", "enabledNotifyWapMMSC", carrierConfigValues, bundle);
            fxt.m16512a("aliasEnabled", "aliasEnabled", carrierConfigValues, bundle);
            fxt.m16512a("allowAttachAudio", "allowAttachAudio", carrierConfigValues, bundle);
            fxt.m16512a("enableMultipartSMS", "enableMultipartSMS", carrierConfigValues, bundle);
            fxt.m16512a("enableSMSDeliveryReports", "enableSMSDeliveryReports", carrierConfigValues, bundle);
            fxt.m16512a("enableGroupMms", "enableGroupMms", carrierConfigValues, bundle);
            fxt.m16512a("supportMmsContentDisposition", "supportMmsContentDisposition", carrierConfigValues, bundle);
            fxt.m16512a("config_cellBroadcastAppLinks", "config_cellBroadcastAppLinks", carrierConfigValues, bundle);
            fxt.m16512a("sendMultipartSmsAsSeparateMessages", "sendMultipartSmsAsSeparateMessages", carrierConfigValues, bundle);
            fxt.m16512a("enableMMSReadReports", "enableMMSReadReports", carrierConfigValues, bundle);
            fxt.m16512a("enableMMSDeliveryReports", "enableMMSDeliveryReports", carrierConfigValues, bundle);
            fxt.m16512a("maxMessageSize", "maxMessageSize", carrierConfigValues, bundle);
            fxt.m16512a("maxImageHeight", "maxImageWidth", carrierConfigValues, bundle);
            fxt.m16512a("maxImageWidth", "maxImageHeight", carrierConfigValues, bundle);
            fxt.m16512a("recipientLimit", "recipientLimit", carrierConfigValues, bundle);
            fxt.m16512a("httpSocketTimeout", "httpSocketTimeout", carrierConfigValues, bundle);
            fxt.m16512a("aliasMinChars", "aliasMinChars", carrierConfigValues, bundle);
            fxt.m16512a("aliasMaxChars", "aliasMaxChars", carrierConfigValues, bundle);
            fxt.m16512a("smsToMmsTextThreshold", "smsToMmsTextThreshold", carrierConfigValues, bundle);
            fxt.m16512a("smsToMmsTextLengthThreshold", "smsToMmsTextLengthThreshold", carrierConfigValues, bundle);
            fxt.m16512a("maxMessageTextSize", "maxMessageTextSize", carrierConfigValues, bundle);
            fxt.m16512a("maxSubjectLength", "maxSubjectLength", carrierConfigValues, bundle);
            fxt.m16512a("mUaProfTagName", "uaProfTagName", carrierConfigValues, bundle);
            fxt.m16512a("httpParams", "httpParams", carrierConfigValues, bundle);
            fxt.m16512a("emailGatewayNumber", "emailGatewayNumber", carrierConfigValues, bundle);
            fxt.m16512a("naiSuffix", "naiSuffix", carrierConfigValues, bundle);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            f14328b = bundle;
        }
        if (TextUtils.isEmpty(f14332f)) {
            str = String.valueOf("Hangouts/");
            String valueOf = String.valueOf(String.valueOf(((gmp) jyn.m25426a(context, gmp.class)).mo2300c()));
            f14332f = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        if (TextUtils.isEmpty(f14333g)) {
            context.getContentResolver();
            f14333g = gwb.m1998b(gwb.m1400H(), "babel_mms_uaprofurl", "https://ssl.gstatic.com/android/hangouts/hangouts_mms_ua_profile.xml");
        }
        str = f14332f;
        str2 = f14333g;
        glk.m17979c("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str2).length()).append("MmsConfig.loadMmsSettings: mUserAgent=").append(str).append(", mUaProfUrl=").append(str2).toString(), new Object[0]);
        if (f14329c) {
            valueOf = String.valueOf(f14331e);
            new StringBuilder(String.valueOf(valueOf).length() + 25).append("MmsConfig: all values -- ").append(valueOf);
        }
    }

    private static boolean m16514b(Context context) {
        Cursor query;
        Object e;
        Throwable th;
        glk.m17979c("Babel_SMS", "MmsConfig.loadFromDatabase", new Object[0]);
        SQLiteDatabase a = bjs.m5482a(context);
        if (TextUtils.isEmpty(fzo.m16705a(glq.m18041k(gwb.m1400H())))) {
            return false;
        }
        try {
            query = a.query("mmsconfig", bjs.f3546c, "numeric=?", new String[]{fzo.m16705a(glq.m18041k(gwb.m1400H()))}, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        fxt.m16513a(query.getString(0), query.getString(1), query.getString(2));
                    } catch (SQLiteException e2) {
                        e = e2;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return true;
            }
            if (query != null) {
                query.close();
            }
            return false;
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            try {
                String valueOf = String.valueOf(e);
                glk.m17979c("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsConfig: no mmsconfig table ").append(valueOf).toString(), new Object[0]);
                if (query != null) {
                    query.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public String mo2118b(String str) {
        if ("LINE1".equals(str)) {
            return fxt.m16510a(false);
        }
        if ("LINE1WITHCOUNTRYCODE".equals(str)) {
            return fxt.m16510a(true);
        }
        if ("NAI".equals(str)) {
            return fxt.m16516x();
        }
        return null;
    }

    private static String m16510a(boolean z) {
        gwb.m1400H();
        String g = glq.m18029g(gwb.m1400H());
        if (!z || TextUtils.isEmpty(g)) {
            return g;
        }
        g = glq.m18021e(gwb.m1400H(), g);
        if (g.charAt(0) == '+') {
            return g.substring(1);
        }
        return g;
    }

    private static String m16516x() {
        String a = ajp.m2642a("persist.radio.cdma.nai");
        if (TextUtils.isEmpty(a)) {
            return a;
        }
        byte[] encode;
        CharSequence w = ajf.m2609a().mo2139w();
        if (!TextUtils.isEmpty(w)) {
            String valueOf = String.valueOf(a);
            a = String.valueOf(w);
            a = a.length() != 0 ? valueOf.concat(a) : new String(valueOf);
        }
        try {
            encode = Base64.encode(a.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException e) {
            encode = Base64.encode(a.getBytes(), 2);
        }
        try {
            return new String(encode, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            return new String(encode);
        }
    }

    public boolean mo2115a(String str) {
        if (!gwb.m2061b((Boolean) f14331e.get("aliasEnabled"))) {
            return false;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < gwb.m1507a((Integer) f14331e.get("aliasMinChars")) || length > gwb.m1507a((Integer) f14331e.get("aliasMaxChars"))) {
            return false;
        }
        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '.') {
                return false;
            }
        }
        return true;
    }
}
