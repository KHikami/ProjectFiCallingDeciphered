package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

class fnj implements bhf, bhj, bhm {
    private static final int f13502a = ((int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));
    private static final int f13503b = ((int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));
    private static final int f13504c = ((int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS));
    private final int f13505d;
    private final bhr f13506e = new bhs().m5268a((long) f13504c).m5270b((long) f13502a).m5271c((long) f13503b).m5267a();

    fnj(int i) {
        this.f13505d = i;
    }

    private static boolean m15709a(Context context, fnh fnh) {
        try {
            long a = giw.m17752a();
            Object a2 = ((igb) jyn.m25426a(context, igb.class)).mo3193a("366187734148");
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            fnh.m15705a(a2, a);
            return true;
        } catch (Throwable e) {
            glk.m17978c("Babel_Registration", "Error registering for GCM", e);
            return false;
        }
    }

    public int mo539a(Context context, bhb bhb) {
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f13505d).mo1693b().mo1714c(3228);
        if (!fnj.m15709a(context, (fnh) jyn.m25426a(context, fnh.class))) {
            return bhn.f3349b;
        }
        ((fnq) jyn.m25426a(context, fnc.class)).m15758b();
        return bhn.f3348a;
    }

    public bhr mo540a() {
        return this.f13506e;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5279c(false).m5278b(false).m5277a(true).m5276a();
    }

    public String mo542b() {
        return "gcm_registration";
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }
}
