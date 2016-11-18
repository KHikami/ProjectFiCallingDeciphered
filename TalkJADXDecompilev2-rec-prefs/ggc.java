package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ggc {
    public static CopyOnWriteArrayList<gge> f15219a = new CopyOnWriteArrayList();
    private final Context f15220b;

    public static ggc m17608a(Context context) {
        return new ggc(context);
    }

    private ggc(Context context) {
        this.f15220b = context.getApplicationContext();
    }

    public static int[] m17610a() {
        iil.m21867a();
        return fde.m15016d();
    }

    public int m17618b() {
        bko a = fde.m14994a(m17612m().getString("account_name_v2", m17633i()));
        return a == null ? -1 : a.m5638g();
    }

    public void m17613a(int i) {
        iil.m21867a();
        m17609a("account_name_v2", fde.m14995a(this.f15220b, i));
    }

    public boolean m17626c() {
        boolean z = false;
        if (!TextUtils.isEmpty(m17633i())) {
            z = true;
        }
        return m17612m().getBoolean("wifi_calling_enabled", z);
    }

    public boolean m17628d() {
        return m17612m().getBoolean("wifi_calling_enabled", false);
    }

    public void m17617a(boolean z) {
        glk.m17979c("Babel_telephony", "TelePreferences.setWifiCallingEnabled, newValue: " + z, new Object[0]);
        m17612m().edit().putBoolean("wifi_calling_enabled", z).apply();
        m17611c("wifi_calling_enabled");
    }

    public boolean m17629e() {
        return m17612m().getBoolean("ask_each_call", false);
    }

    public void m17623b(boolean z) {
        glk.m17979c("Babel_telephony", "TelePreferences.setAskEachCall, newValue: " + z, new Object[0]);
        m17612m().edit().putBoolean("ask_each_call", z).apply();
        m17611c("ask_each_call");
    }

    public int m17630f() {
        bko a = fde.m14994a(m17633i());
        return a == null ? -1 : a.m5638g();
    }

    public long m17631g() {
        int f = m17630f();
        if (f != -1) {
            return ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3456a(f).mo3434a("last_emergency_dialed_time_from_dark_number_in_milliseconds", 0);
        }
        glk.m17979c("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found", new Object[0]);
        return 0;
    }

    public void m17615a(long j) {
        int f = m17630f();
        if (f == -1) {
            glk.m17979c("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found", new Object[0]);
        } else {
            ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3464b(f).m23878b("last_emergency_dialed_time_from_dark_number_in_milliseconds", j).m23891d();
        }
    }

    public int m17632h() {
        iil.m21867a();
        bko a = fde.m14994a(m17612m().getString("account_name_for_incoming_calls", null));
        return a == null ? -1 : a.m5638g();
    }

    public void m17619b(int i) {
        iil.m21867a();
        m17609a("account_name_for_incoming_calls", fde.m14995a(this.f15220b, i));
    }

    public void m17616a(String str) {
        m17609a("tycho_account_name", str);
    }

    public String m17633i() {
        return m17612m().getString("tycho_account_name", null);
    }

    public boolean m17634j() {
        return m17612m().getBoolean("request_feedback", true);
    }

    public void m17625c(boolean z) {
        m17612m().edit().putBoolean("request_feedback", z).apply();
        m17611c("request_feedback");
    }

    public String m17624c(int i) {
        return ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3456a(i).mo3435a("incoming_wifi_call_invites", null);
    }

    public void m17614a(int i, String str) {
        ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3464b(i).m23879b("incoming_wifi_call_invites", str).m23891d();
    }

    public String m17627d(int i) {
        return ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3456a(i).mo3435a("dedupe_call_log", null);
    }

    public void m17620b(int i, String str) {
        ((jcf) jyn.m25426a(this.f15220b, jcf.class)).mo3464b(i).m23879b("dedupe_call_log", str).m23891d();
    }

    public void m17622b(String str) {
        m17609a("last_seen_network_country_iso", str);
    }

    public String m17635k() {
        return m17612m().getString("last_seen_network_country_iso", null);
    }

    public void m17621b(long j) {
        m17612m().edit().putLong("last_emergency_call_over_lte_millis", j).apply();
        m17611c("last_emergency_call_over_lte_millis");
    }

    public long m17636l() {
        return m17612m().getLong("last_emergency_call_over_lte_millis", 0);
    }

    private void m17609a(String str, String str2) {
        String valueOf = String.valueOf(glk.m17974b(str2));
        glk.m17979c("Babel_telephony", new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(valueOf).length()).append("TelePreferences.updatePrefValue, key: ").append(str).append(", value: ").append(valueOf).toString(), new Object[0]);
        if (TextUtils.isEmpty(str2)) {
            m17612m().edit().remove(str).apply();
        } else {
            m17612m().edit().putString(str, str2).apply();
        }
        m17611c(str);
    }

    private void m17611c(String str) {
        new Handler(this.f15220b.getMainLooper()).post(new ggd(this, str));
    }

    private SharedPreferences m17612m() {
        return this.f15220b.getSharedPreferences("telephony_preference", 0);
    }
}
