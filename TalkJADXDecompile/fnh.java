import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

final class fnh {
    private final SharedPreferences a;
    private final Context b;
    private fni c;

    fnh(Context context) {
        this.a = context.getSharedPreferences("gcm", 0);
        long j = this.a.getLong("gcm_android_id", -1);
        long j2 = this.a.getLong("gcm_registration_timestamp", 0);
        Object string = this.a.getString("gcm_registration_id", null);
        if (!(j == 0 || TextUtils.isEmpty(string) || j2 <= 0)) {
            this.c = new fni(string, j, j2);
        }
        this.b = context;
    }

    boolean a() {
        if (this.c == null) {
            return true;
        }
        boolean z;
        long a = glj.a();
        if (a - this.c.b > TimeUnit.MILLISECONDS.convert(gwb.a(this.b, "babel_ac_registration_renew_window_seconds", fls.a), TimeUnit.SECONDS)) {
            z = true;
        } else {
            z = false;
        }
        a = giw.a();
        if (z || a != this.c.a) {
            return true;
        }
        return false;
    }

    void a(String str, long j) {
        boolean z = true;
        ba.a(!TextUtils.isEmpty(str), (Object) "RegistrationId cannot be empty");
        if (j == 0) {
            z = false;
        }
        ba.a(z, (Object) "Must provide valid Android ID");
        long a = glj.a();
        Editor edit = this.a.edit();
        edit.putString("gcm_registration_id", str);
        edit.putLong("gcm_registration_timestamp", a);
        edit.putLong("gcm_android_id", j);
        edit.apply();
        this.c = new fni(str, j, a);
        new StringBuilder(String.valueOf(str).length() + 122).append("Gcm Registration updated, RegistrationId: ").append(str).append(", Registration timestamp: ").append(a).append(", Android Id: ").append(j);
    }

    String b() {
        return this.c != null ? this.c.c : null;
    }

    boolean c() {
        return this.c != null;
    }
}
