package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

final class fnp {
    private final SharedPreferences f13529a;
    private final Context f13530b;

    public fnp(Context context) {
        this.f13529a = context.getSharedPreferences("registration_id_prefs", 0);
        this.f13530b = context;
    }

    fnd m15746a(int i) {
        SharedPreferences sharedPreferences = this.f13529a;
        String valueOf = String.valueOf("account_jid_");
        Object string = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        sharedPreferences = this.f13529a;
        valueOf = String.valueOf("account_res_");
        String string2 = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        sharedPreferences = this.f13529a;
        valueOf = String.valueOf("account_upgrade_expl_url_");
        String string3 = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        sharedPreferences = this.f13529a;
        valueOf = String.valueOf("account_desire_inc_pstn_calls_");
        boolean z = sharedPreferences.getBoolean(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), false);
        if (z != fnk.m15716a(this.f13530b, fde.m15018e(i))) {
            m15748b(i);
            return null;
        }
        sharedPreferences = this.f13529a;
        String valueOf2 = String.valueOf("account_upgrade_type_");
        int i2 = sharedPreferences.getInt(new StringBuilder(String.valueOf(valueOf2).length() + 11).append(valueOf2).append(i).toString(), 0);
        sharedPreferences = this.f13529a;
        valueOf2 = String.valueOf("account_timestamp_");
        return new fnd(i, string, string2, i2, string3, z, sharedPreferences.getLong(new StringBuilder(String.valueOf(valueOf2).length() + 11).append(valueOf2).append(i).toString(), 0));
    }

    void m15747a(fnd fnd) {
        if (!TextUtils.isEmpty(fnd.f13485b)) {
            int i = fnd.f13484a;
            Editor edit = this.f13529a.edit();
            String valueOf = String.valueOf("account_res_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13486c);
            valueOf = String.valueOf("account_jid_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13485b);
            valueOf = String.valueOf("account_upgrade_expl_url_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13488e);
            valueOf = String.valueOf("account_desire_inc_pstn_calls_");
            edit = edit.putBoolean(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13489f);
            valueOf = String.valueOf("account_upgrade_type_");
            edit = edit.putInt(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13487d);
            valueOf = String.valueOf("account_timestamp_");
            edit.putLong(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f13490g).apply();
        }
    }

    void m15748b(int i) {
        Editor edit = this.f13529a.edit();
        String valueOf = String.valueOf("account_res_");
        edit = edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
        valueOf = String.valueOf("account_jid_");
        edit = edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
        valueOf = String.valueOf("account_upgrade_expl_url_");
        edit = edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
        valueOf = String.valueOf("account_desire_inc_pstn_calls_");
        edit = edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
        valueOf = String.valueOf("account_upgrade_type_");
        edit = edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
        valueOf = String.valueOf("account_timestamp_");
        edit.remove(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString()).apply();
    }
}
