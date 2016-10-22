package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: fnj */
class fnj implements bhf, bhj, bhm {
    private static final int a;
    private static final int b;
    private static final int c;
    private final int d;
    private final bhr e;

    static {
        a = (int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
        b = (int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
        c = (int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS);
    }

    fnj(int i) {
        this.d = i;
        this.e = new bhs().a((long) c).b((long) a).c((long) b).a();
    }

    private static boolean a(Context context, fnh fnh) {
        try {
            long a = giw.a();
            Object a2 = ((igb) jyn.a(context, igb.class)).a("366187734148");
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            fnh.a(a2, a);
            return true;
        } catch (Throwable e) {
            glk.c("Babel_Registration", "Error registering for GCM", e);
            return false;
        }
    }

    public int a(Context context, bhb bhb) {
        ((iih) jyn.a(context, iih.class)).a(this.d).b().c(3228);
        if (!fnj.a(context, (fnh) jyn.a(context, fnh.class))) {
            return bhn.b;
        }
        ((fnq) jyn.a(context, fnc.class)).b();
        return bhn.a;
    }

    public bhr a() {
        return this.e;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().c(false).b(false).a(true).a();
    }

    public String b() {
        return "gcm_registration";
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }
}
