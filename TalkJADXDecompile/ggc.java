import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ggc {
    public static CopyOnWriteArrayList<gge> a;
    private final Context b;

    static {
        a = new CopyOnWriteArrayList();
    }

    public static ggc a(Context context) {
        return new ggc(context);
    }

    private ggc(Context context) {
        this.b = context.getApplicationContext();
    }

    public static int[] a() {
        iil.a();
        return fde.d();
    }

    public int b() {
        bko a = fde.a(m().getString("account_name_v2", i()));
        return a == null ? -1 : a.g();
    }

    public void a(int i) {
        iil.a();
        a("account_name_v2", fde.a(this.b, i));
    }

    public boolean c() {
        boolean z = false;
        if (!TextUtils.isEmpty(i())) {
            z = true;
        }
        return m().getBoolean("wifi_calling_enabled", z);
    }

    public boolean d() {
        return m().getBoolean("wifi_calling_enabled", false);
    }

    public void a(boolean z) {
        glk.c("Babel_telephony", "TelePreferences.setWifiCallingEnabled, newValue: " + z, new Object[0]);
        m().edit().putBoolean("wifi_calling_enabled", z).apply();
        c("wifi_calling_enabled");
    }

    public boolean e() {
        return m().getBoolean("ask_each_call", false);
    }

    public void b(boolean z) {
        glk.c("Babel_telephony", "TelePreferences.setAskEachCall, newValue: " + z, new Object[0]);
        m().edit().putBoolean("ask_each_call", z).apply();
        c("ask_each_call");
    }

    public int f() {
        bko a = fde.a(i());
        return a == null ? -1 : a.g();
    }

    public long g() {
        int f = f();
        if (f != -1) {
            return ((jcf) jyn.a(this.b, jcf.class)).a(f).a("last_emergency_dialed_time_from_dark_number_in_milliseconds", 0);
        }
        glk.c("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found", new Object[0]);
        return 0;
    }

    public void a(long j) {
        int f = f();
        if (f == -1) {
            glk.c("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found", new Object[0]);
        } else {
            ((jcf) jyn.a(this.b, jcf.class)).b(f).b("last_emergency_dialed_time_from_dark_number_in_milliseconds", j).d();
        }
    }

    public int h() {
        iil.a();
        bko a = fde.a(m().getString("account_name_for_incoming_calls", null));
        return a == null ? -1 : a.g();
    }

    public void b(int i) {
        iil.a();
        a("account_name_for_incoming_calls", fde.a(this.b, i));
    }

    public void a(String str) {
        a("tycho_account_name", str);
    }

    public String i() {
        return m().getString("tycho_account_name", null);
    }

    public boolean j() {
        return m().getBoolean("request_feedback", true);
    }

    public void c(boolean z) {
        m().edit().putBoolean("request_feedback", z).apply();
        c("request_feedback");
    }

    public String c(int i) {
        return ((jcf) jyn.a(this.b, jcf.class)).a(i).a("incoming_wifi_call_invites", null);
    }

    public void a(int i, String str) {
        ((jcf) jyn.a(this.b, jcf.class)).b(i).b("incoming_wifi_call_invites", str).d();
    }

    public String d(int i) {
        return ((jcf) jyn.a(this.b, jcf.class)).a(i).a("dedupe_call_log", null);
    }

    public void b(int i, String str) {
        ((jcf) jyn.a(this.b, jcf.class)).b(i).b("dedupe_call_log", str).d();
    }

    public void b(String str) {
        a("last_seen_network_country_iso", str);
    }

    public String k() {
        return m().getString("last_seen_network_country_iso", null);
    }

    public void b(long j) {
        m().edit().putLong("last_emergency_call_over_lte_millis", j).apply();
        c("last_emergency_call_over_lte_millis");
    }

    public long l() {
        return m().getLong("last_emergency_call_over_lte_millis", 0);
    }

    private void a(String str, String str2) {
        String valueOf = String.valueOf(glk.b(str2));
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(valueOf).length()).append("TelePreferences.updatePrefValue, key: ").append(str).append(", value: ").append(valueOf).toString(), new Object[0]);
        if (TextUtils.isEmpty(str2)) {
            m().edit().remove(str).apply();
        } else {
            m().edit().putString(str, str2).apply();
        }
        c(str);
    }

    private void c(String str) {
        new Handler(this.b.getMainLooper()).post(new ggd(this, str));
    }

    private SharedPreferences m() {
        return this.b.getSharedPreferences("telephony_preference", 0);
    }
}
