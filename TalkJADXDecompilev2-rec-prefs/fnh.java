package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

final class fnh {
    private final SharedPreferences f13496a;
    private final Context f13497b;
    private fni f13498c;

    fnh(Context context) {
        this.f13496a = context.getSharedPreferences("gcm", 0);
        long j = this.f13496a.getLong("gcm_android_id", -1);
        long j2 = this.f13496a.getLong("gcm_registration_timestamp", 0);
        Object string = this.f13496a.getString("gcm_registration_id", null);
        if (!(j == 0 || TextUtils.isEmpty(string) || j2 <= 0)) {
            this.f13498c = new fni(string, j, j2);
        }
        this.f13497b = context;
    }

    boolean m15706a() {
        if (this.f13498c == null) {
            return true;
        }
        boolean z;
        long a = glj.m17956a();
        if (a - this.f13498c.f13500b > TimeUnit.MILLISECONDS.convert(gwb.m1519a(this.f13497b, "babel_ac_registration_renew_window_seconds", fls.f13424a), TimeUnit.SECONDS)) {
            z = true;
        } else {
            z = false;
        }
        a = giw.m17752a();
        if (z || a != this.f13498c.f13499a) {
            return true;
        }
        return false;
    }

    void m15705a(String str, long j) {
        boolean z = true;
        ba.m4578a(!TextUtils.isEmpty(str), (Object) "RegistrationId cannot be empty");
        if (j == 0) {
            z = false;
        }
        ba.m4578a(z, (Object) "Must provide valid Android ID");
        long a = glj.m17956a();
        Editor edit = this.f13496a.edit();
        edit.putString("gcm_registration_id", str);
        edit.putLong("gcm_registration_timestamp", a);
        edit.putLong("gcm_android_id", j);
        edit.apply();
        this.f13498c = new fni(str, j, a);
        new StringBuilder(String.valueOf(str).length() + 122).append("Gcm Registration updated, RegistrationId: ").append(str).append(", Registration timestamp: ").append(a).append(", Android Id: ").append(j);
    }

    String m15707b() {
        return this.f13498c != null ? this.f13498c.f13501c : null;
    }

    boolean m15708c() {
        return this.f13498c != null;
    }
}
