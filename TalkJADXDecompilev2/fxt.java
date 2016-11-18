package defpackage;

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
    static Bundle b = null;
    private static final boolean c = false;
    private static final Map<String, Object> d = new HashMap();
    private static final Map<String, Object> e = new HashMap();
    private static String f = null;
    private static String g = null;

    static {
        kae kae = glk.r;
        d.put("enabledMMS", Boolean.valueOf(true));
        d.put("enabledTransID", Boolean.valueOf(false));
        d.put("enabledNotifyWapMMSC", Boolean.valueOf(false));
        d.put("aliasEnabled", Boolean.valueOf(false));
        d.put("allowAttachAudio", Boolean.valueOf(true));
        d.put("enableMultipartSMS", Boolean.valueOf(true));
        d.put("enableSMSDeliveryReports", Boolean.valueOf(true));
        d.put("enableGroupMms", Boolean.valueOf(true));
        d.put("supportMmsContentDisposition", Boolean.valueOf(true));
        d.put("config_cellBroadcastAppLinks", Boolean.valueOf(true));
        d.put("sendMultipartSmsAsSeparateMessages", Boolean.valueOf(false));
        d.put("enableMMSReadReports", Boolean.valueOf(false));
        d.put("enableMMSDeliveryReports", Boolean.valueOf(false));
        d.put("maxMessageSize", Integer.valueOf(307200));
        d.put("maxImageHeight", Integer.valueOf(480));
        d.put("maxImageWidth", Integer.valueOf(640));
        d.put("recipientLimit", Integer.valueOf(Integer.MAX_VALUE));
        d.put("httpSocketTimeout", Integer.valueOf(ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS));
        d.put("aliasMinChars", Integer.valueOf(2));
        d.put("aliasMaxChars", Integer.valueOf(48));
        d.put("smsToMmsTextThreshold", Integer.valueOf(-1));
        d.put("smsToMmsTextLengthThreshold", Integer.valueOf(-1));
        d.put("maxMessageTextSize", Integer.valueOf(-1));
        d.put("maxSubjectLength", Integer.valueOf(40));
        d.put("mUaProfTagName", "x-wap-profile");
        d.put("httpParams", null);
        d.put("emailGatewayNumber", null);
        d.put("naiSuffix", null);
    }

    public boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && d.containsKey(str)) {
            Object obj = d.get(str);
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

    private static String c(String str) {
        Object obj = e.get(str);
        if (obj != null) {
            return (String) obj;
        }
        return null;
    }

    public int b() {
        return gwb.a((Integer) e.get("smsToMmsTextThreshold"));
    }

    public int c() {
        return gwb.a((Integer) e.get("smsToMmsTextLengthThreshold"));
    }

    public boolean d() {
        return gwb.b((Boolean) e.get("enabledMMS"));
    }

    public int e() {
        return gwb.a((Integer) e.get("maxMessageSize"));
    }

    public boolean f() {
        return gwb.b((Boolean) e.get("enabledTransID"));
    }

    public String g() {
        return f;
    }

    public String h() {
        return fxt.c("mUaProfTagName");
    }

    public String i() {
        return g;
    }

    public String j() {
        return fxt.c("httpParams");
    }

    public String k() {
        return fxt.c("emailGatewayNumber");
    }

    public int l() {
        return gwb.a((Integer) e.get("maxImageHeight"));
    }

    public int m() {
        return gwb.a((Integer) e.get("maxImageWidth"));
    }

    public int n() {
        int a = gwb.a((Integer) e.get("maxMessageTextSize"));
        return a >= 0 ? a : 2000;
    }

    public int o() {
        return gwb.a((Integer) e.get("httpSocketTimeout"));
    }

    public boolean p() {
        return gwb.b((Boolean) e.get("enableMultipartSMS"));
    }

    public boolean q() {
        return gwb.b((Boolean) e.get("sendMultipartSmsAsSeparateMessages"));
    }

    public boolean r() {
        return gwb.b((Boolean) e.get("enableSMSDeliveryReports"));
    }

    public boolean s() {
        return gwb.b((Boolean) e.get("enabledNotifyWapMMSC"));
    }

    public boolean t() {
        return gwb.b((Boolean) e.get("enableGroupMms"));
    }

    public boolean u() {
        return gwb.b((Boolean) e.get("supportMmsContentDisposition"));
    }

    public boolean v() {
        return gwb.b((Boolean) e.get("config_cellBroadcastAppLinks"));
    }

    public String w() {
        return fxt.c("naiSuffix");
    }

    public static void a(String str, String str2, String str3) {
        try {
            if ("int".equals(str3)) {
                e.put(str, Integer.valueOf(Integer.parseInt(str2)));
            } else if ("bool".equals(str3)) {
                e.put(str, Boolean.valueOf(Boolean.parseBoolean(str2)));
            } else if ("string".equals(str3)) {
                e.put(str, str2);
            }
        } catch (NumberFormatException e) {
            glk.e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 28) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("MmsConfig.update: invalid ").append(str).append(",").append(str2).append(",").append(str3).toString(), new Object[0]);
        }
    }

    private static void a(String str, String str2, Bundle bundle, Bundle bundle2) {
        Object obj = e.get(str);
        if (obj == null || (obj instanceof String)) {
            String str3 = (String) obj;
            if (!TextUtils.equals(bundle.getString(str2), str3)) {
                bundle2.putString(str2, str3);
            }
        } else if (obj instanceof Integer) {
            int a = gwb.a((Integer) obj);
            if (bundle.getInt(str2) != a) {
                bundle2.putInt(str2, a);
            }
        } else if (obj instanceof Boolean) {
            boolean b = gwb.b((Boolean) obj);
            if (bundle.getBoolean(str2) != b) {
                bundle2.putBoolean(str2, b);
            }
        }
    }

    public static void a(Context context) {
        String str;
        String str2;
        glk.c("Babel_SMS", "MmsConfig.loadMmsSettings", new Object[0]);
        e.clear();
        e.putAll(d);
        if (VERSION.SDK_INT >= 19) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            f = telephonyManager.getMmsUserAgent();
            g = telephonyManager.getMmsUAProfUrl();
            str = f;
            str2 = g;
            glk.c("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(str2).length()).append("MmsConfig.loadDeviceMmsSettings from API: mUserAgent=").append(str).append(", mUaProfUrl=").append(str2).toString(), new Object[0]);
        }
        if (!fxt.b(context)) {
            glk.c("Babel_SMS", "MmsConfig.loadFromResources", new Object[0]);
            XmlPullParser xml = context.getResources().getXml(gwb.iJ);
            fxk a = fxk.a(xml);
            a.a(new fxv());
            try {
                a.a();
            } finally {
                xml.close();
            }
        } else if (fyi.a(context)) {
            Bundle carrierConfigValues = SmsManager.getDefault().getCarrierConfigValues();
            Bundle bundle = new Bundle();
            fxt.a("enabledMMS", "enabledMMS", carrierConfigValues, bundle);
            fxt.a("enabledTransID", "enabledTransID", carrierConfigValues, bundle);
            fxt.a("enabledNotifyWapMMSC", "enabledNotifyWapMMSC", carrierConfigValues, bundle);
            fxt.a("aliasEnabled", "aliasEnabled", carrierConfigValues, bundle);
            fxt.a("allowAttachAudio", "allowAttachAudio", carrierConfigValues, bundle);
            fxt.a("enableMultipartSMS", "enableMultipartSMS", carrierConfigValues, bundle);
            fxt.a("enableSMSDeliveryReports", "enableSMSDeliveryReports", carrierConfigValues, bundle);
            fxt.a("enableGroupMms", "enableGroupMms", carrierConfigValues, bundle);
            fxt.a("supportMmsContentDisposition", "supportMmsContentDisposition", carrierConfigValues, bundle);
            fxt.a("config_cellBroadcastAppLinks", "config_cellBroadcastAppLinks", carrierConfigValues, bundle);
            fxt.a("sendMultipartSmsAsSeparateMessages", "sendMultipartSmsAsSeparateMessages", carrierConfigValues, bundle);
            fxt.a("enableMMSReadReports", "enableMMSReadReports", carrierConfigValues, bundle);
            fxt.a("enableMMSDeliveryReports", "enableMMSDeliveryReports", carrierConfigValues, bundle);
            fxt.a("maxMessageSize", "maxMessageSize", carrierConfigValues, bundle);
            fxt.a("maxImageHeight", "maxImageWidth", carrierConfigValues, bundle);
            fxt.a("maxImageWidth", "maxImageHeight", carrierConfigValues, bundle);
            fxt.a("recipientLimit", "recipientLimit", carrierConfigValues, bundle);
            fxt.a("httpSocketTimeout", "httpSocketTimeout", carrierConfigValues, bundle);
            fxt.a("aliasMinChars", "aliasMinChars", carrierConfigValues, bundle);
            fxt.a("aliasMaxChars", "aliasMaxChars", carrierConfigValues, bundle);
            fxt.a("smsToMmsTextThreshold", "smsToMmsTextThreshold", carrierConfigValues, bundle);
            fxt.a("smsToMmsTextLengthThreshold", "smsToMmsTextLengthThreshold", carrierConfigValues, bundle);
            fxt.a("maxMessageTextSize", "maxMessageTextSize", carrierConfigValues, bundle);
            fxt.a("maxSubjectLength", "maxSubjectLength", carrierConfigValues, bundle);
            fxt.a("mUaProfTagName", "uaProfTagName", carrierConfigValues, bundle);
            fxt.a("httpParams", "httpParams", carrierConfigValues, bundle);
            fxt.a("emailGatewayNumber", "emailGatewayNumber", carrierConfigValues, bundle);
            fxt.a("naiSuffix", "naiSuffix", carrierConfigValues, bundle);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            b = bundle;
        }
        if (TextUtils.isEmpty(f)) {
            str = String.valueOf("Hangouts/");
            String valueOf = String.valueOf(String.valueOf(((gmp) jyn.a(context, gmp.class)).c()));
            f = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        if (TextUtils.isEmpty(g)) {
            context.getContentResolver();
            g = gwb.b(gwb.H(), "babel_mms_uaprofurl", "https://ssl.gstatic.com/android/hangouts/hangouts_mms_ua_profile.xml");
        }
        str = f;
        str2 = g;
        glk.c("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str2).length()).append("MmsConfig.loadMmsSettings: mUserAgent=").append(str).append(", mUaProfUrl=").append(str2).toString(), new Object[0]);
        if (c) {
            valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 25).append("MmsConfig: all values -- ").append(valueOf);
        }
    }

    private static boolean b(Context context) {
        Object e;
        Throwable th;
        glk.c("Babel_SMS", "MmsConfig.loadFromDatabase", new Object[0]);
        SQLiteDatabase a = bjs.a(context);
        if (TextUtils.isEmpty(fzo.a(glq.k(gwb.H())))) {
            return false;
        }
        Cursor query;
        try {
            query = a.query("mmsconfig", bjs.c, "numeric=?", new String[]{fzo.a(glq.k(gwb.H()))}, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        fxt.a(query.getString(0), query.getString(1), query.getString(2));
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
                glk.c("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 30).append("MmsConfig: no mmsconfig table ").append(valueOf).toString(), new Object[0]);
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

    public String b(String str) {
        if ("LINE1".equals(str)) {
            return fxt.a(false);
        }
        if ("LINE1WITHCOUNTRYCODE".equals(str)) {
            return fxt.a(true);
        }
        if ("NAI".equals(str)) {
            return fxt.x();
        }
        return null;
    }

    private static String a(boolean z) {
        gwb.H();
        String g = glq.g(gwb.H());
        if (!z || TextUtils.isEmpty(g)) {
            return g;
        }
        g = glq.e(gwb.H(), g);
        if (g.charAt(0) == '+') {
            return g.substring(1);
        }
        return g;
    }

    private static String x() {
        String a = ajp.a("persist.radio.cdma.nai");
        if (TextUtils.isEmpty(a)) {
            return a;
        }
        byte[] encode;
        CharSequence w = ajf.a().w();
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

    public boolean a(String str) {
        if (!gwb.b((Boolean) e.get("aliasEnabled"))) {
            return false;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < gwb.a((Integer) e.get("aliasMinChars")) || length > gwb.a((Integer) e.get("aliasMaxChars"))) {
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
