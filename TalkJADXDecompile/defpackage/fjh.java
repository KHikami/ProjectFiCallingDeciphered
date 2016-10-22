package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.Random;

/* renamed from: fjh */
public final class fjh implements bhf, bhi, bhj, bhm {
    private static final gma a;
    private static final Random b;
    private final boolean c;
    private final boolean d;
    private final flt e;
    private final int f;

    static {
        a = RealTimeChatService.b;
        b = mfo.a;
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
        return "WarmSync_Acct_" + this.f;
    }

    fjh(fji fji) {
        this.f = fji.a;
        this.c = fji.b;
        this.d = fji.c;
        this.e = fji.d;
    }

    public bhk c() {
        return bhk.USE_OLD;
    }

    private String e() {
        long a = glj.a() * 1000;
        String valueOf = String.valueOf(this.e.toString());
        String valueOf2 = String.valueOf(Long.toString(a + ((long) b.nextInt(1000))));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(":").append(valueOf2).toString();
    }

    public int a(Context context, bhb bhb) {
        if (fde.d(fde.e(this.f))) {
            return bhn.c;
        }
        String b = a.b("ReqWarmSyncTask");
        jci b2 = ((jcf) jyn.a(context, jcf.class)).b(this.f);
        long a = gwb.a(context, "babel_warm_sync_cooldown_threshold_ms", fls.d);
        long a2 = glj.a();
        long a3 = b2.a("last_warm_sync_execution_time_ms", 0);
        int i;
        if (a2 - a3 >= a || a2 < a3) {
            try {
                b2.b("last_warm_sync_execution_time_ms", a2).d();
                fhc fhc = new fhc();
                try {
                    ((bln) jyn.a(context, bln.class)).a(new blo(context, this.f), fhc, this.c, this.d, e());
                    i = this.f;
                    Collection b3 = fhc.b();
                    if (!b3.isEmpty()) {
                        fde.e(fde.e(i)).a(b3, -1, null);
                        fhc.c();
                    }
                    a.c(b);
                    return bhn.a;
                } catch (bmu e) {
                    i = bhn.c;
                    a.c(b);
                    return i;
                } catch (jcj e2) {
                    i = bhn.c;
                    a.c(b);
                    return i;
                }
            } finally {
                a.c(b);
            }
        } else {
            i = bhn.d;
            return i;
        }
    }
}
