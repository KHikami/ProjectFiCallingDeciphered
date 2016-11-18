package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fzu implements dpo, fzw {
    private final Context f14509a;
    private final jcf f14510b;
    private final SharedPreferences f14511c;

    public fzu(Context context) {
        this.f14509a = context;
        this.f14510b = (jcf) jyn.m25426a(context, jcf.class);
        biw biw = (biw) jyn.m25426a(context, biw.class);
        this.f14511c = context.getSharedPreferences("smsmms", 0);
        biw.mo563a(new fzv(this));
        m16768b();
    }

    public void mo1455a(Activity activity, Bundle bundle) {
        bundle.putString("merged_sms", Boolean.toString(mo2155d()));
    }

    public int mo2142a() {
        ba.m4609b(glq.m18015c(gwb.m1400H()));
        int b = this.f14510b.mo3462b("SMS", null);
        if (b == -1) {
            return this.f14510b.mo3457a("SMS").m23879b("gaia_id", "_sms_only_account").m23879b("chat_id", "_sms_only_account").m23881b("sms_only", true).m23881b("is_managed_account", true).m23891d();
        }
        return b;
    }

    public boolean mo2146a(int i) {
        return this.f14510b.mo3456a(i).mo3448c("sms_only");
    }

    public boolean mo2148b(int i) {
        return this.f14510b.mo3456a(i).mo3448c("is_sms_account");
    }

    public boolean mo2152c(int i) {
        return fde.m15028i() && mo2148b(i);
    }

    public int mo2153d(int i) {
        if (!mo2152c(i)) {
            return fzx.f14513a;
        }
        if (glq.m18023e(this.f14509a)) {
            return fzx.f14515c;
        }
        return fzx.f14514b;
    }

    private jch m16760t() {
        return this.f14510b.mo3456a(mo2142a());
    }

    private jci m16761u() {
        return this.f14510b.mo3464b(mo2142a());
    }

    void m16768b() {
        if (!mo2151c() && this.f14511c.getInt("merged_version_key", 0) != 1) {
            if (mo2155d()) {
                RealTimeChatService.m9096d();
            } else {
                RealTimeChatService.m9106e();
            }
        }
    }

    public boolean mo2151c() {
        return jyn.m25433b(this.f14509a, fwh.class) != null;
    }

    public boolean mo2155d() {
        return this.f14511c.getBoolean("Enable merged conversations", false);
    }

    public void mo2145a(boolean z) {
        this.f14511c.edit().putBoolean("Enable merged conversations", z).apply();
    }

    public boolean mo2157e() {
        return this.f14511c.getBoolean("unmerge_complete", false);
    }

    public void mo2147b(boolean z) {
        this.f14511c.edit().putBoolean("unmerge_complete", true).apply();
    }

    public boolean mo2158f() {
        return this.f14511c.getBoolean("force_unmerged", false);
    }

    public void mo2150c(boolean z) {
        this.f14511c.edit().putBoolean("force_unmerged", true).apply();
    }

    public void mo2156e(int i) {
        m16761u().m23877b("apns_version", i).m23891d();
    }

    public int mo2159g() {
        return m16760t().mo3433a("apns_version", mo2160h());
    }

    public int mo2160h() {
        return gwb.m1507a(Integer.valueOf(this.f14509a.getResources().getInteger(gwb.uK)));
    }

    public boolean mo2161i() {
        if (jyn.m25433b(this.f14509a, gae.class) == null && this.f14511c.getBoolean("enable_smsmms_key", false)) {
            return true;
        }
        return false;
    }

    public void mo2154d(boolean z) {
        this.f14511c.edit().putBoolean("enable_smsmms_key", z).apply();
    }

    public String mo2162j() {
        return m16760t().mo3435a("sms_send_from_key", "auto");
    }

    public void mo2143a(String str) {
        m16761u().m23879b("sms_send_from_key", str).m23891d();
    }

    public boolean mo2163k() {
        return m16760t().mo3439a("enable_auto_retrieve_key", true);
    }

    public boolean mo2164l() {
        return m16760t().mo3439a("enable_auto_retrieve_in_roaming_key", false);
    }

    public boolean mo2165m() {
        return m16760t().mo3439a("dump_sms_pref_key", false);
    }

    public boolean mo2166n() {
        return m16760t().mo3439a("dump_mms_pref_key", false);
    }

    public boolean mo2167o() {
        return m16760t().mo3439a("sms_delivery_report_key", false);
    }

    public boolean mo2168p() {
        return m16760t().mo3439a("delete_old_messages_key", false);
    }

    public void mo2169q() {
        m16761u().m23881b("delete_old_messages_key", true).m23891d();
    }

    public boolean mo2170r() {
        if (glq.m18015c(gwb.m1400H()) && m16760t().mo3439a("group_mms_key", true)) {
            return true;
        }
        return false;
    }

    public boolean mo2171s() {
        if (fde.m15031k() == null) {
            return true;
        }
        return m16760t().mo3439a("group_mms_key", true);
    }

    public boolean mo2149b(String str) {
        boolean z = true;
        switch (str.hashCode()) {
            case -1839796625:
                if (str.equals("use_local_apn_pref_key")) {
                    z = true;
                    break;
                }
                break;
            case -1748368360:
                if (str.equals("delete_old_messages_key")) {
                    z = true;
                    break;
                }
                break;
            case -1473012178:
                if (str.equals("enable_auto_retrieve_in_roaming_key")) {
                    z = true;
                    break;
                }
                break;
            case -1098086887:
                if (str.equals("sms_delivery_report_key")) {
                    z = true;
                    break;
                }
                break;
            case -446307152:
                if (str.equals("enable_auto_retrieve_key")) {
                    z = true;
                    break;
                }
                break;
            case 754442425:
                if (str.equals("Enable merged conversations")) {
                    z = true;
                    break;
                }
                break;
            case 1234600243:
                if (str.equals("group_mms_key")) {
                    z = false;
                    break;
                }
                break;
            case 1370303130:
                if (str.equals("dump_mms_pref_key")) {
                    z = true;
                    break;
                }
                break;
            case 2144799444:
                if (str.equals("dump_sms_pref_key")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return mo2170r();
            case true:
                return mo2168p();
            case true:
                return mo2167o();
            case true:
                return mo2163k();
            case true:
                return mo2164l();
            case true:
                return m16760t().mo3439a("use_local_apn_pref_key", false);
            case true:
                return mo2165m();
            case true:
                return mo2166n();
            case true:
                return mo2155d();
            default:
                String str2 = "Unexpected key: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                iil.m21870a(valueOf);
                return false;
        }
    }

    public void mo2144a(String str, boolean z) {
        m16761u().m23881b(str, z).m23891d();
    }
}
