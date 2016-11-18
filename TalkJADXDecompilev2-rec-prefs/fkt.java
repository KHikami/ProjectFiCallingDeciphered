package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class fkt implements bhd, bhf, bhj, bhm {
    private static final boolean f13335a = false;
    private static AtomicInteger f13336b = new AtomicInteger(0);
    private final bhr f13337c;
    private final int f13338d;
    private final List<bhc> f13339e;
    private final long f13340f;
    private long f13341g;

    static {
        kae kae = glk.f15568o;
    }

    public fkt(int i, Context context) {
        this.f13338d = i;
        this.f13340f = (long) gwb.m1492a(context, "babel_tickle_gcm_renew_period_ms", 180000);
        this.f13341g = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3434a("tickle_gcm_last_execution_time", 0);
        long j = this.f13341g + this.f13340f;
        long a = glj.m17956a();
        if (this.f13341g == 0 || a >= j || this.f13341g > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.f13337c = new bhs().m5272d(j).m5267a();
        this.f13339e = new ArrayList();
        this.f13339e.add(fkt.m15575a(i));
    }

    public static bhc m15575a(int i) {
        String valueOf = String.valueOf(fkt.class.getName());
        return new bhc(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
    }

    public int mo539a(Context context, bhb bhb) {
        if (fde.m15018e(this.f13338d) == null) {
            return bhn.f3351d;
        }
        if (!((bcr) jyn.m25426a(context, bcr.class)).mo468b()) {
            return bhn.f3349b;
        }
        gzh a = gzh.m19023a(context);
        try {
            if (fdq.f12760B.m14370b(this.f13338d)) {
                ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f13338d).mo1693b().mo1714c(2801);
            }
            a.m19031a("hangouts@google.com", Integer.toString(f13336b.incrementAndGet()), 0, new Bundle());
        } catch (Throwable e) {
            glk.m17978c("Babel", "Unable to tickle GCM.", e);
        }
        this.f13341g = glj.m17956a();
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(this.f13338d).m23878b("tickle_gcm_last_execution_time", this.f13341g).m23891d();
        this.f13337c.m5261a(this.f13340f);
        return bhn.f3349b;
    }

    public bhr mo540a() {
        return this.f13337c;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13338d).toString();
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }

    public List<bhc> mo1983e() {
        return this.f13339e;
    }

    public void mo1981b(Context context) {
    }

    public void mo1982c(Context context) {
    }
}
