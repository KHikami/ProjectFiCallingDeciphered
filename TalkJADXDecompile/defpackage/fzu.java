package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fzu */
public final class fzu implements dpo, fzw {
    private final Context a;
    private final jcf b;
    private final SharedPreferences c;

    public fzu(Context context) {
        this.a = context;
        this.b = (jcf) jyn.a(context, jcf.class);
        biw biw = (biw) jyn.a(context, biw.class);
        this.c = context.getSharedPreferences("smsmms", 0);
        biw.a(new fzv(this));
        b();
    }

    public void a(Activity activity, Bundle bundle) {
        bundle.putString("merged_sms", Boolean.toString(d()));
    }

    public int a() {
        ba.b(glq.c(gwb.H()));
        int b = this.b.b("SMS", null);
        if (b == -1) {
            return this.b.a("SMS").b("gaia_id", "_sms_only_account").b("chat_id", "_sms_only_account").b("sms_only", true).b("is_managed_account", true).d();
        }
        return b;
    }

    public boolean a(int i) {
        return this.b.a(i).c("sms_only");
    }

    public boolean b(int i) {
        return this.b.a(i).c("is_sms_account");
    }

    public boolean c(int i) {
        return fde.i() && b(i);
    }

    public int d(int i) {
        if (!c(i)) {
            return fzx.a;
        }
        if (glq.e(this.a)) {
            return fzx.c;
        }
        return fzx.b;
    }

    private jch t() {
        return this.b.a(a());
    }

    private jci u() {
        return this.b.b(a());
    }

    void b() {
        if (!c() && this.c.getInt("merged_version_key", 0) != 1) {
            if (d()) {
                RealTimeChatService.d();
            } else {
                RealTimeChatService.e();
            }
        }
    }

    public boolean c() {
        return jyn.b(this.a, fwh.class) != null;
    }

    public boolean d() {
        return this.c.getBoolean("Enable merged conversations", false);
    }

    public void a(boolean z) {
        this.c.edit().putBoolean("Enable merged conversations", z).apply();
    }

    public boolean e() {
        return this.c.getBoolean("unmerge_complete", false);
    }

    public void b(boolean z) {
        this.c.edit().putBoolean("unmerge_complete", true).apply();
    }

    public boolean f() {
        return this.c.getBoolean("force_unmerged", false);
    }

    public void c(boolean z) {
        this.c.edit().putBoolean("force_unmerged", true).apply();
    }

    public void e(int i) {
        u().b("apns_version", i).d();
    }

    public int g() {
        return t().a("apns_version", h());
    }

    public int h() {
        return gwb.a(Integer.valueOf(this.a.getResources().getInteger(gwb.uK)));
    }

    public boolean i() {
        if (jyn.b(this.a, gae.class) == null && this.c.getBoolean("enable_smsmms_key", false)) {
            return true;
        }
        return false;
    }

    public void d(boolean z) {
        this.c.edit().putBoolean("enable_smsmms_key", z).apply();
    }

    public String j() {
        return t().a("sms_send_from_key", "auto");
    }

    public void a(String str) {
        u().b("sms_send_from_key", str).d();
    }

    public boolean k() {
        return t().a("enable_auto_retrieve_key", true);
    }

    public boolean l() {
        return t().a("enable_auto_retrieve_in_roaming_key", false);
    }

    public boolean m() {
        return t().a("dump_sms_pref_key", false);
    }

    public boolean n() {
        return t().a("dump_mms_pref_key", false);
    }

    public boolean o() {
        return t().a("sms_delivery_report_key", false);
    }

    public boolean p() {
        return t().a("delete_old_messages_key", false);
    }

    public void q() {
        u().b("delete_old_messages_key", true).d();
    }

    public boolean r() {
        if (glq.c(gwb.H()) && t().a("group_mms_key", true)) {
            return true;
        }
        return false;
    }

    public boolean s() {
        if (fde.k() == null) {
            return true;
        }
        return t().a("group_mms_key", true);
    }

    public boolean b(String str) {
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
            case wi.w /*0*/:
                return r();
            case wi.j /*1*/:
                return p();
            case wi.l /*2*/:
                return o();
            case wi.z /*3*/:
                return k();
            case wi.h /*4*/:
                return l();
            case wi.p /*5*/:
                return t().a("use_local_apn_pref_key", false);
            case wi.s /*6*/:
                return m();
            case wi.q /*7*/:
                return n();
            case wi.m /*8*/:
                return d();
            default:
                String str2 = "Unexpected key: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                iil.a(valueOf);
                return false;
        }
    }

    public void a(String str, boolean z) {
        u().b(str, z).d();
    }
}
