package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;

/* renamed from: fkh */
public class fkh implements bhf, bhj, bhm {
    private final int a;

    public fkh(int i) {
        this.a = i;
    }

    public int a(Context context, bhb bhb) {
        bko e = fde.e(this.a);
        Object h = fde.h(this.a);
        if (e == null || TextUtils.isEmpty(h)) {
            return bhn.d;
        }
        ((bhl) jyn.a(context, bhl.class)).a(new feg(new evk(h, false, gwb.a(context, "babel_ac_renew_cycle_seconds", (int) HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES), true), this.a));
        return bhn.a;
    }

    public bhr a() {
        return null;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        return getClass().getName();
    }

    public bhk c() {
        return bhk.USE_OLD;
    }
}
