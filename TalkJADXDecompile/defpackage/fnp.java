package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

/* renamed from: fnp */
final class fnp {
    private final SharedPreferences a;
    private final Context b;

    public fnp(Context context) {
        this.a = context.getSharedPreferences("registration_id_prefs", 0);
        this.b = context;
    }

    fnd a(int i) {
        SharedPreferences sharedPreferences = this.a;
        String valueOf = String.valueOf("account_jid_");
        Object string = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        sharedPreferences = this.a;
        valueOf = String.valueOf("account_res_");
        String string2 = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        sharedPreferences = this.a;
        valueOf = String.valueOf("account_upgrade_expl_url_");
        String string3 = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
        sharedPreferences = this.a;
        valueOf = String.valueOf("account_desire_inc_pstn_calls_");
        boolean z = sharedPreferences.getBoolean(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), false);
        if (z != fnk.a(this.b, fde.e(i))) {
            b(i);
            return null;
        }
        sharedPreferences = this.a;
        String valueOf2 = String.valueOf("account_upgrade_type_");
        int i2 = sharedPreferences.getInt(new StringBuilder(String.valueOf(valueOf2).length() + 11).append(valueOf2).append(i).toString(), 0);
        sharedPreferences = this.a;
        valueOf2 = String.valueOf("account_timestamp_");
        return new fnd(i, string, string2, i2, string3, z, sharedPreferences.getLong(new StringBuilder(String.valueOf(valueOf2).length() + 11).append(valueOf2).append(i).toString(), 0));
    }

    void a(fnd fnd) {
        if (!TextUtils.isEmpty(fnd.b)) {
            int i = fnd.a;
            Editor edit = this.a.edit();
            String valueOf = String.valueOf("account_res_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.c);
            valueOf = String.valueOf("account_jid_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.b);
            valueOf = String.valueOf("account_upgrade_expl_url_");
            edit = edit.putString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.e);
            valueOf = String.valueOf("account_desire_inc_pstn_calls_");
            edit = edit.putBoolean(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.f);
            valueOf = String.valueOf("account_upgrade_type_");
            edit = edit.putInt(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.d);
            valueOf = String.valueOf("account_timestamp_");
            edit.putLong(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), fnd.g).apply();
        }
    }

    void b(int i) {
        Editor edit = this.a.edit();
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
