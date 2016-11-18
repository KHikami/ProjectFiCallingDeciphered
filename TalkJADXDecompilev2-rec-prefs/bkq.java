package p000;

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

public class bkq implements jcl, jnh {
    public static final boolean f3659a = false;
    private final Context f3660b;

    static {
        kae kae = glk.f15557d;
    }

    bkq(Context context) {
        this.f3660b = context;
    }

    public static edo m5661a(Context context, int i) {
        jch a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i);
        if (a != null) {
            String a2 = a.mo3435a("gaia_id", null);
            String a3 = a.mo3435a("chat_id", null);
            if (!(a3 == null && a2 == null)) {
                return new edo(a2, a3);
            }
        }
        return null;
    }

    public static List<Integer> m5662a(Context context) {
        List<Integer> arrayList = new ArrayList();
        for (Entry key : context.getSharedPreferences("accounts", 0).getAll().entrySet()) {
            String str = (String) key.getKey();
            if (str.endsWith(".logged_in")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, str.indexOf(".")))));
            }
        }
        gwb.m2371v(context);
        return arrayList;
    }

    private static Integer[] m5674a(SharedPreferences sharedPreferences) {
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

    private static void m5670a(Context context, Integer[] numArr) {
        if (numArr.length != 0) {
            new Thread(new bkr(numArr, context)).start();
        }
    }

    public void mo545a(Context context, jck jck) {
        if ("SMS".equals(jck.mo3440b("account_name"))) {
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
                    jck.mo3447c("is_sms_account", sharedPreferences.getBoolean(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i2).append(".").append(valueOf).toString(), false));
                    return;
                }
            }
        }
    }

    public void mo546a(List<jcn> list) {
        int i = 0;
        Context context = this.f3660b;
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
        bkq.m5670a(context, (Integer[]) arrayList.toArray(new Integer[arrayList.size()]));
        if (sharedPreferences.contains("active")) {
            sharedPreferences.edit().putInt("key.active-hangouts-account", sharedPreferences.getInt("active", -1)).remove("active").apply();
        }
        Editor edit = sharedPreferences.edit();
        Map all = sharedPreferences.getAll();
        Integer[] a = bkq.m5674a(sharedPreferences);
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
        bkq.m5670a(context, a);
        list.add(new bks(this));
        list.add(new bkt(this));
        list.add(new bku(this));
        list.add(new bkv(this));
        list.add(new bkw(this));
        list.add(new bkx(this));
        list.add(new bky(this));
    }

    public void mo609a(int i) {
        jch a = ((jcf) jyn.m25426a(this.f3660b, jcf.class)).mo3456a(i);
        if (a.mo3448c("logged_out")) {
            ((ect) jyn.m25426a(this.f3660b, ect.class)).mo1832b(i);
            if (!a.mo3448c("sms_only")) {
                glk.m17979c("Babel", "Account update: " + i + " logged off", new Object[0]);
                bmr.m6176b(this.f3660b, i);
                ((jcf) jyn.m25426a(this.f3660b, jcf.class)).mo3464b(i).m23893e(EsProvider.m8255a(3)).m23893e(EsProvider.m8255a(1)).m23893e(EsProvider.m8255a(2)).m23893e(EsProvider.m8255a(5)).m23893e(EsProvider.m8255a(4)).m23893e("last_invite_seen_timestamp").m23893e("last_suggested_contacts_time").m23893e("sms_last_full_sync_time_millis").m23893e("refresh_participants_time").m23893e("last_warm_sync_localtime").m23893e("last_successful_sync_time").m23893e("sms_last_sync_time_millis").m23893e("hash_pinned").m23893e("hash_favorites").m23893e("hash_people_you_hangout_with").m23893e("hash_other_people_on_hangout").m23893e("hash_dismissed_contacts").m23891d();
            }
        } else if (a.mo3448c("logged_in")) {
            bko e = fde.m15018e(i);
            if (e.m5635d()) {
                String str = "Babel";
                String str2 = "activateAccount: ";
                String valueOf = String.valueOf(glk.m17974b(e.m5629a()));
                glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                bmr.m6166a(this.f3660b, e.m5638g()).m6188c();
            }
        }
    }

    public static bko m5660a(Context context, String str) {
        boolean equals = "SMS".equals(str);
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        int b = jcf.mo3461b(str);
        if (equals) {
            jcf.mo3464b(b).m23879b("gaia_id", "_sms_only_account").m23879b("chat_id", "_sms_only_account").m23881b("sms_only", true).m23881b("is_managed_account", true).m23891d();
        }
        return new bko((jcf) jyn.m25426a(context, jcf.class), (bbm) jyn.m25426a(context, bbm.class), (fzw) jyn.m25426a(context, fzw.class), str);
    }

    public static void m5672a(jck jck, edo edo, String str, boolean z, String str2, String str3, Map<String, eqb> map, bkp bkp, boolean z2) {
        if (edo == null || edo.f11244a == null) {
            jck.mo3451i("gaia_id");
        } else {
            jck.mo3445c("gaia_id", edo.f11244a);
        }
        if (edo == null || edo.f11245b == null) {
            jck.mo3451i("chat_id");
        } else {
            jck.mo3445c("chat_id", edo.f11245b);
        }
        jck.mo3445c("display_name", str);
        jck.mo3447c("is_google_plus", z);
        jck.mo3445c("domain_name", str2);
        jck.mo3447c("show_chat_warning", z2);
        jck.mo3451i("plus_page_gaia_ids");
        jck.mo3445c("profile_photo_url", str3);
        if (map != null) {
            Set set;
            String str4 = "phone_verification";
            if (map == null || map.size() == 0) {
                set = null;
            } else {
                HashSet hashSet = new HashSet();
                for (eqb p000_eqb : map.values()) {
                    hashSet.add(p000_eqb.toString());
                }
                Object obj = hashSet;
            }
            jck.mo3446c(str4, set);
        }
        if (bkp != null) {
            jck.mo3447c("allowed_for_domain", bkp.f3639c);
            jck.mo3447c("blocked_for_child", bkp.f3640d);
            jck.mo3447c("can_opt_into_gv_sms_integration", bkp.f3642f);
            jck.mo3447c("chat_archive_enabled", bkp.f3641e);
            jck.mo3447c("gplus_dismissed", bkp.f3638b);
            jck.mo3447c("gv_sms_integration_shown", bkp.f3643g);
            jck.mo3443c("account_age_group", bkp.f3637a);
            jck.mo3447c("is_gv_sms_integration_enabled", bkp.f3644h);
            if (!TextUtils.isEmpty(bkp.f3654r)) {
                jck.mo3445c("default_gmail_phone_region_code", bkp.f3654r);
            }
            if (bkp.f3655s != null) {
                jck.mo3443c("default_gmail_phone_country_code", gwb.m1507a(bkp.f3655s));
            }
            jck.mo3447c("paid_dasher_user", bkp.f3645i);
            jck.mo3447c("is_history_forced", bkp.f3646j);
            jck.mo3447c("is_history_default_on", bkp.f3647k);
            jck.mo3447c("last_seen_promo_shown", bkp.f3648l);
            jck.mo3447c("phone_verification_prompt_shown", bkp.f3649m);
            jck.mo3447c("abuse_reporting_tos_shown", bkp.f3650n);
            jck.mo3447c("gv_can_use_caller_id_feature", bkp.f3651o);
            jck.mo3447c("is_photo_service_enabled", bkp.f3652p);
            jck.mo3447c("invite_notifications_enabled", bkp.f3653q);
        }
    }

    private static jch m5697h(Context context, int i) {
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        if (jcf.mo3467c(i)) {
            return jcf.mo3456a(i);
        }
        return null;
    }

    public static String m5675b(Context context, int i) {
        jch h = bkq.m5697h(context, i);
        if (h == null) {
            return null;
        }
        return h.mo3440b("gaia_id");
    }

    public static edo m5685c(Context context, int i) {
        jch h = bkq.m5697h(context, i);
        if (h == null) {
            return null;
        }
        return new edo(h.mo3440b("gaia_id"), h.mo3440b("chat_id"));
    }

    public static void m5667a(Context context, bko bko, boolean z) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23881b("diagnostics_promo_shown", true).m23891d();
    }

    public static boolean m5673a(Context context, bko bko) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g()).mo3439a("diagnostics_promo_shown", false);
    }

    public static void m5680b(Context context, bko bko, boolean z) {
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(context, fmf.class)).mo2036a(-1), bko.m5638g(), 14, true);
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23881b("gv_sms_integration_shown", true).m23891d();
        bkq.m5688c(context, bko, z);
    }

    public static void m5688c(Context context, bko bko, boolean z) {
        if (f3659a) {
            String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("setGvSmsIntegration: ").append(valueOf).append(" gvEnabled: ").append(z);
        }
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(context, fmf.class)).mo2036a(-1), bko.m5638g(), 13, z);
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23881b("is_gv_sms_integration_enabled", z).m23891d();
        if (!z) {
            ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23881b("can_opt_into_gv_sms_integration", true).m23891d();
        }
    }

    public static void m5691d(Context context, bko bko, boolean z) {
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(context, fmf.class)).mo2036a(-1), bko.m5638g(), 27, true);
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23881b("phone_verification_prompt_shown", true).m23891d();
    }

    public static boolean m5692d(Context context, int i) {
        return !((jcf) jyn.m25426a(context, jcf.class)).mo3469d(i);
    }

    public static boolean m5694e(Context context, int i) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3448c("logged_out");
    }

    public static void m5678b(Context context, bko bko) {
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        for (Integer a : jcf.mo3455a("is_sms_account")) {
            int a2 = gwb.m1507a(a);
            if (a2 != bko.m5638g()) {
                jcf.mo3464b(a2).m23881b("is_sms_account", false).m23891d();
            }
        }
        jcf.mo3464b(bko.m5638g()).m23881b("is_sms_account", true).m23891d();
    }

    @Deprecated
    public static long m5684c(Context context, bko bko) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g()).mo3434a("registration_time", -1);
    }

    @Deprecated
    public static void m5666a(Context context, bko bko, long j) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23878b("registration_time", j).m23891d();
    }

    public static long m5690d(Context context, bko bko) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g()).mo3434a("setting_time", -1);
    }

    public static void m5679b(Context context, bko bko, long j) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23878b("setting_time", -1).m23891d();
    }

    public static long m5693e(Context context, bko bko) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(bko.m5638g()).mo3434a("sticker_cache_time", -1);
    }

    public static void m5687c(Context context, bko bko, long j) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23878b("sticker_cache_time", j).m23891d();
    }

    public static boolean m5695f(Context context, int i) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3439a("contact_permission_banner_shown", false);
    }

    public static void m5665a(Context context, int i, boolean z) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i).m23881b("contact_permission_banner_shown", true).m23891d();
    }

    public static Map<String, eqb> m5663a(jch jch) {
        Set<String> a = jch.mo3436a("phone_verification", null);
        Map<String, eqb> kyVar = new ky();
        if (a == null || a.size() == 0) {
            return kyVar;
        }
        for (String a2 : a) {
            eqb a3 = eqb.m14239a(a2);
            if (a3 != null) {
                kyVar.put(a3.m14240a(), a3);
            }
        }
        return kyVar;
    }

    public static boolean m5696g(Context context, int i) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3439a("invite_notifications_enabled", true);
    }

    public static void m5668a(Context context, fme fme, int i, boolean z) {
        ((fit) jyn.m25426a(context, fit.class)).mo2007a(new bkz(fme.m15674a(), context, i, z));
        RealTimeChatService.m9043a(fme, i, 33, z);
    }

    public static void m5664a(Context context, int i, String str) {
        jci b = ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i);
        b.m23878b(str, 1 + b.mo3434a(str, 0)).m23891d();
    }

    public static void m5676b(Context context, int i, String str) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i).m23893e(str).m23891d();
    }

    public static long m5659a(Context context, int i, String str, long j) {
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3434a(str, j);
    }

    public static void m5677b(Context context, int i, String str, long j) {
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(i).m23878b(str, j).m23891d();
    }

    public static byte[] m5689c(Context context, int i, String str) {
        Object b = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3440b(str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return Base64.decode(b, 0);
    }

    public static void m5671a(jci jci, String str, byte[] bArr) {
        jci.m23879b(str, Base64.encodeToString(bArr, 0));
    }

    public static void m5669a(Context context, boolean z) {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("warning_is_displayed", false).apply();
    }

    public static void m5682b(Context context, boolean z) {
        context.getSharedPreferences("accounts", 0).edit().putBoolean("location_tos_accepted", true).apply();
    }

    public static boolean m5683b(Context context) {
        return context.getSharedPreferences("accounts", 0).getBoolean("location_tos_accepted", false);
    }

    public static void m5681b(Context context, String str) {
        Editor edit = context.getSharedPreferences("accounts", 0).edit();
        edit.putString("referrer_url", str);
        edit.apply();
    }

    public static String m5686c(Context context) {
        return context.getSharedPreferences("accounts", 0).getString("referrer_url", "");
    }
}
