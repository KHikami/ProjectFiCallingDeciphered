import android.content.Context;
import java.util.concurrent.TimeUnit;

public class fnt implements bhf, bhh, bhj, bhm {
    private final bhr a;
    private final bhu b;

    public fnt(Context context) {
        this.a = new bhs().d(TimeUnit.MILLISECONDS.convert(gwb.a(context, "babel_ac_registration_renew_window_seconds", fls.a), TimeUnit.SECONDS)).a();
        this.b = new bhv().a(true).a();
    }

    public bhr a() {
        return this.a;
    }

    public void a(Context context) {
    }

    public bhk c() {
        return bhk.USE_OLD;
    }

    public bhu d() {
        return this.b;
    }

    public int a(Context context, bhb bhb) {
        fnc fnc = (fnc) jyn.a(context, fnc.class);
        for (int a : fde.g()) {
            fnc.a(a);
        }
        return bhn.b;
    }

    public String b() {
        return "account_reg_renewal";
    }
}
