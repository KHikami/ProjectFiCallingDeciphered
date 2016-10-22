import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

public class fkd implements bhf, bhj, bhm {
    private final int a;
    private final bhr b;

    public fkd(int i) {
        this.a = i;
        this.b = new bhs().d(0).a();
    }

    public int a(Context context, bhb bhb) {
        bko e = fde.e(this.a);
        Object h = fde.h(this.a);
        if (e == null || TextUtils.isEmpty(h)) {
            return bhn.d;
        }
        this.b.a((long) gwb.a(context, "babel_ac_renew_renew_period_ms", 240000));
        if (!((fkb) jyn.a(context, fkb.class)).a || gwb.V(context)) {
            return bhn.b;
        }
        ((bhl) jyn.a(context, bhl.class)).a(new feg(new evk(h, true, gwb.a(context, "babel_ac_renew_cycle_seconds", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), true), this.a));
        return bhn.b;
    }

    public bhr a() {
        return this.b;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }
}
