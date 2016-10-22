package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: bkq */
public class bkq implements jcl, jnh {
    public static final boolean a;
    private final Context b;

    static {
        kae kae = glk.d;
        a = false;
    }

    bkq(Context context) {
        this.b = context;
    }

    public static edo a(Context context, int i) {
        jch a = ((jcf) jyn.a(context, jcf.class)).a(i);
        if (a != null) {
            String a2 = a.a("gaia_id", null);
            String a3 = a.a("chat_id", null);
            if (!(a3 == null && a2 == null)) {
                return new edo(a2, a3);
            }
        }
        return null;
    }

    public static List<Integer> a(Context context) {
        List<Integer> arrayList = new ArrayList();
        for (Entry key : context.getSharedPreferences("accounts", 0).getAll().entrySet()) {
            String str = (String) key.getKey();
            if (str.endsWith(".logged_in")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, str.indexOf(".")))));
            }
        }
        gwb.v(context);
        return arrayList;
    }

    private static Integer[] a(SharedPreferences sharedPreferences) {
        List arrayList = new ArrayList();
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            String str = i2 + ".";
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf("account_name");
            Object string = sharedPreferences.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), sharedPreferences.getString(String.valueOf(str).concat("name"), ""));
            str = String.valueOf(str);
            valueOf2 = String.valueOf("gaia_id");
            valueOf2 = sharedPreferences.getString(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), null);
            if (TextUtils.isEmpty(string) || string.equals(valueOf2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    private static void a(Context context, Integer[] numArr) {
        if (numArr.length != 0) {
            new Thread(new bkr(numArr, context)).start();
        }
    }

    public void a(Context context, jck jck) {
        if ("SMS".equals(jck.b("account_name"))) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("accounts", 0);
            int i = sharedPreferences.getInt("count", 0);
            int i2 = 0;
            while (i2 < i) {
                String valueOf = String.valueOf("account_name");
                valueOf = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i2).append(".").append(valueOf).toString(), null);
                if (valueOf == null || !valueOf.equals("SMS")) {
                    i2++;
                } else {
                    valueOf = String.valueOf("is_sms_account");
                    jck.c("is_sms_account", sharedPreferences.getBoolean(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i2).append(".").append(valueOf).toString(), false));
                    return;
                }
            }
        }
    }

    public void a(List<jcn> list) {
        int i = 0;
        Context context = this.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences("accounts", 0);
        List arrayList = new ArrayList();
        int i2 = sharedPreferences.getInt("count", 0);
        for (int i3 = 0; i3 < i2; i3++) {
            String str = i3 + ".";
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf("account_name");
            valueOf2 = sharedPreferences.getString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), sharedPreferences.getString(String.valueOf(str).concat("name"), ""));
            if (sharedPreferences.getBoolean(i3 + ".logged_off", false) && !"SMS".equals(valueOf2)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        bkq.a(context, (Integer[]) arrayList.toArray(new Integer[arrayList.size()]));
        if (sharedPreferences.contains("active")) {
            sharedPreferences.edit().putInt("key.active-hangouts-account", sharedPreferences.getInt("active", -1)).remove("active").apply();
        }
        Editor edit = sharedPreferences.edit();
        Map all = sharedPreferences.getAll();
        Integer[] a = bkq.a(sharedPreferences);
        i2 = a.length;
        while (i < i2) {
            valueOf2 = String.valueOf(a[i]);
            str = new StringBuilder(String.valueOf(valueOf2).length() + 1).append(valueOf2).append(".").toString();
            for (Entry key : all.entrySet()) {
                valueOf2 = (String) key.getKey();
                if (valueOf2.startsWith(str)) {
                    edit.remove(valueOf2);
                }
            }
            i++;
        }
        edit.apply();
        bkq.a(context, a);
        list.add(new bks(this));
        list.add(new bkt(this));
        list.add(new bku(this));
        list.add(new bkv(this));
        list.add(new bkw(this));
        list.add(new bkx(this));
        list.add(new bky(this));
    }

    public void a(int i) {
        jch a = ((jcf) jyn.a(this.b, jcf.class)).a(i);
        if (a.c("logged_out")) {
            ((ect) jyn.a(this.b, ect.class)).b(i);
            if (!a.c("sms_only")) {
                glk.c("Babel", "Account update: " + i + " logged off", new Object[0]);
                bmr.b(this.b, i);
                ((jcf) jyn.a(this.b, jcf.class)).b(i).e(EsProvider.a(3)).e(EsProvider.a(1)).e(EsProvider.a(2)).e(EsProvider.a(5)).e(EsProvider.a(4)).e("last_invite_seen_timestamp").e("last_suggested_contacts_time").e("sms_last_full_sync_time_millis").e("refresh_participants_time").e("last_warm_sync_localtime").e("last_successful_sync_time").e("sms_last_sync_time_millis").e("hash_pinned").e("hash_favorites").e("hash_people_you_hangout_with").e("hash_other_people_on_hangout").e("hash_dismissed_contacts").d();
            }
        } else if (a.c("logged_in")) {
            bko e = fde.e(i);
            if (e.d()) {
                String str = "Babel";
                String str2 = "activateAccount: ";
                String valueOf = String.valueOf(glk.b(e.a()));
                glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                bmr.a(this.b, e.g()).c();
            }
        }
    }

    public static bko a(Context context, String str) {
        boolean equals = "SMS".equals(str);
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        int b = jcf.b(str);
        if (equals) {
            jcf.b(b).b("gaia_id", "_sms_only_account").b("chat_id", "_sms_only_account").b("sms_only", true).b("is_managed_account", true).d();
        }
        return new bko((jcf) jyn.a(context, jcf.class), (bbm) jyn.a(context, bbm.class), (fzw) jyn.a(context, fzw.class), str);
    }

    public static void a(jck jck, edo edo, String str, boolean z, String str2, String str3, Map<String, eqb> map, bkp bkp, boolean z2) {
        if (edo == null || edo.a == null) {
            jck.i("gaia_id");
        } else {
            jck.c("gaia_id", edo.a);
        }
        if (edo == null || edo.b == null) {
            jck.i("chat_id");
        } else {
            jck.c("chat_id", edo.b);
        }
        jck.c("display_name", str);
        jck.c("is_google_plus", z);
        jck.c("domain_name", str2);
        jck.c("show_chat_warning", z2);
        jck.i("plus_page_gaia_ids");
        jck.c("profile_photo_url", str3);
        if (map != null) {
            Set set;
            String str4 = "phone_verification";
            if (map == null || map.size() == 0) {
                set = null;
            } else {
                HashSet hashSet = new HashSet();
                for (eqb defpackage_eqb : map.values()) {
                    hashSet.add(defpackage_eqb.toString());
                }
                Object obj = hashSet;
            }
            jck.c(str4, set);
        }
        if (bkp != null) {
            jck.c("allowed_for_domain", bkp.c);
            jck.c("blocked_for_child", bkp.d);
            jck.c("can_opt_into_gv_sms_integration", bkp.f);
            jck.c("chat_archive_enabled", bkp.e);
            jck.c("gplus_dismissed", bkp.b);
            jck.c("gv_sms_integration_shown", bkp.g);
            jck.c("account_age_group", bkp.a);
            jck.c("is_gv_sms_integration_enabled", bkp.h);
            if (!TextUtils.isEmpty(bkp.r)) {
                jck.c("default_gmail_phone_region_code", bkp.r);
            }
            if (bkp.s != null) {
                jck.c("default_gmail_phone_country_code", gwb.a(bkp.s));
            }
            jck.c("paid_dasher_user", bkp.i);
            jck.c("is_history_forced", bkp.j);
            jck.c("is_history_default_on", bkp.k);
            jck.c("last_seen_promo_shown", bkp.l);
            jck.c("phone_verification_prompt_shown", bkp.m);
            jck.c("abuse_reporting_tos_shown", bkp.n);
            jck.c("gv_can_use_caller_id_feature", bkp.o);
            jck.c("is_photo_service_enabled", bkp.p);
            jck.c("invite_notifications_enabled", bkp.q);
        }
    }

    private static jch h(Context context, int i) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        if (jcf.c(i)) {
            return jcf.a(i);
        }
        return null;
    }

    public static String b(Context context, int i) {
        jch h = bkq.h(context, i);
        if (h == null) {
            return null;
        }
        return h.b("gaia_id");
    }

    public static edo c(Context context, int i) {
        jch h = bkq.h(context, i);
        if (h == null) {
            return null;
        }
        return new edo(h.b("gaia_id"), h.b("chat_id"));
    }

    public static void a(Context context, bko bko, boolean z) {
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("diagnostics_promo_shown", true).d();
    }

    public static boolean a(Context context, bko bko) {
        return ((jcf) jyn.a(context, jcf.class)).a(bko.g()).a("diagnostics_promo_shown", false);
    }

    public static void b(Context context, bko bko, boolean z) {
        RealTimeChatService.a(((fmf) jyn.a(context, fmf.class)).a(-1), bko.g(), 14, true);
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("gv_sms_integration_shown", true).d();
        bkq.c(context, bko, z);
    }

    public static void c(Context context, bko bko, boolean z) {
        if (a) {
            String valueOf = String.valueOf(glk.b(bko.a()));
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("setGvSmsIntegration: ").append(valueOf).append(" gvEnabled: ").append(z);
        }
        RealTimeChatService.a(((fmf) jyn.a(context, fmf.class)).a(-1), bko.g(), 13, z);
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("is_gv_sms_integration_enabled", z).d();
        if (!z) {
            ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("can_opt_into_gv_sms_integration", true).d();
        }
    }

    public static void d(Context context, bko bko, boolean z) {
        RealTimeChatService.a(((fmf) jyn.a(context, fmf.class)).a(-1), bko.g(), 27, true);
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("phone_verification_prompt_shown", true).d();
    }

    public static boolean d(Context context, int i) {
        return !((jcf) jyn.a(context, jcf.class)).d(i);
    }

    public static boolean e(Context context, int i) {
        return ((jcf) jyn.a(context, jcf.class)).a(i).c("logged_out");
    }

    public static void b(Context context, bko bko) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        for (Integer a : jcf.a("is_sms_account")) {
            int a2 = gwb.a(a);
            if (a2 != bko.g()) {
                jcf.b(a2).b("is_sms_account", false).d();
            }
        }
        jcf.b(bko.g()).b("is_sms_account", true).d();
    }

    @Deprecated
    public static long c(Context context, bko bko) {
        return ((jcf) jyn.a(context, jcf.class)).a(bko.g()).a("registration_time", -1);
    }

    @Deprecated
    public static void a(Context context, bko bko, long j) {
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("registration_time", j).d();
    }

    public static long d(Context context, bko bko) {
        return ((jcf) jyn.a(context, jcf.class)).a(bko.g()).a("setting_time", -1);
    }

    public static void b(Context context, bko bko, long j) {
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("setting_time", -1).d();
    }

    public static long e(Context context, bko bko) {
        return ((jcf) jyn.a(context, jcf.class)).a(bko.g()).a("sticker_cache_time", -1);
    }

    public static void c(Context context, bko bko, long j) {
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("sticker_cache_time", j).d();
    }

    public static boolean f(Context context, int i) {
        return ((jcf) jyn.a(context, jcf.class)).a(i).a("contact_permission_banner_shown", false);
    }

    public static void a(Context context, int i, boolean z) {
        ((jcf) jyn.a(context, jcf.class)).b(i).b("contact_permission_banner_shown", true).d();
    }

    public static Map<String, eqb> a(jch jch) {
        Set<String> a = jch.a("phone_verification", null);
        Map<String, eqb> kyVar = new ky();
        if (a == null || a.size() == 0) {
            return kyVar;
        }
        for (String a2 : a) {
            eqb a3 = eqb.a(a2);
            if (a3 != null) {
                kyVar.put(a3.a(), a3);
            }
        }
        return kyVar;
    }

    public static boolean g(Context context, int i) {
        return ((jcf) jyn.a(context, jcf.class)).a(i).a("invite_notifications_enabled", true);
    }

    public static void a(Context context, fme fme, int i, boolean z) {
        ((fit) jyn.a(context, fit.class)).a(new bkz(fme.a(), context, i, z));
        RealTimeChatService.a(fme, i, 33, z);
    }

    public static void a(Context context, int i, String str) {
        jci b = ((jcf) jyn.a(context, jcf.class)).b(i);
        b.b(str, 1 + b.a(str, 0)).d();
    }

    public static void b(Context context, int i, String str) {
        ((jcf) jyn.a(context, jcf.class)).b(i).e(str).d();
    }

    public static long a(Context context, int i, String str, long j) {
        return ((jcf) jyn.a(context, jcf.class)).a(i).a(str, j);
    }

    public static void b(Context context, int i, String str, long j) {
        ((jcf) jyn.a(context, jcf.class)).b(i).b(str, j).d();
    }

    public static byte[] c(Context context, int i, String str) {
        Object b = ((jcf) jyn.a(context, jcf.class)).a(i).b(str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return Base64.decode(b, 0);
    }

    public static void a(jci jci, String str, byte[] bArr) {
        jci.b(str, Base64.encodeToString(bArr, 0));
    }

    public static void a(Context context, boolean z) {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("warning_is_displayed", false).apply();
    }

    public static void b(Context context, boolean z) {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("location_tos_accepted", true).apply();
    }

    public static boolean b(Context context) {
        return context.getSharedPreferences("accounts", 0).getBoolean("location_tos_accepted", false);
    }

    public static void b(Context context, String str) {
        Editor edit = context.getSharedPreferences("accounts", 0).edit();
        edit.putString("referrer_url", str);
        edit.apply();
    }

    public static String c(Context context) {
        return context.getSharedPreferences("accounts", 0).getString("referrer_url", "");
    }
}
