package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fkt */
public class fkt implements bhd, bhf, bhj, bhm {
    private static final boolean a;
    private static AtomicInteger b;
    private final bhr c;
    private final int d;
    private final List<bhc> e;
    private final long f;
    private long g;

    static {
        kae kae = glk.o;
        a = false;
        b = new AtomicInteger(0);
    }

    public fkt(int i, Context context) {
        this.d = i;
        this.f = (long) gwb.a(context, "babel_tickle_gcm_renew_period_ms", 180000);
        this.g = ((jcf) jyn.a(context, jcf.class)).a(i).a("tickle_gcm_last_execution_time", 0);
        long j = this.g + this.f;
        long a = glj.a();
        if (this.g == 0 || a >= j || this.g > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.c = new bhs().d(j).a();
        this.e = new ArrayList();
        this.e.add(fkt.a(i));
    }

    public static bhc a(int i) {
        String valueOf = String.valueOf(fkt.class.getName());
        return new bhc(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString());
    }

    public int a(Context context, bhb bhb) {
        if (fde.e(this.d) == null) {
            return bhn.d;
        }
        if (!((bcr) jyn.a(context, bcr.class)).b()) {
            return bhn.b;
        }
        gzh a = gzh.a(context);
        try {
            if (fdq.B.b(this.d)) {
                ((iih) jyn.a(context, iih.class)).a(this.d).b().c(2801);
            }
            a.a("hangouts@google.com", Integer.toString(b.incrementAndGet()), 0, new Bundle());
        } catch (Throwable e) {
            glk.c("Babel", "Unable to tickle GCM.", e);
        }
        this.g = glj.a();
        ((jcf) jyn.a(context, jcf.class)).b(this.d).b("tickle_gcm_last_execution_time", this.g).d();
        this.c.a(this.f);
        return bhn.b;
    }

    public bhr a() {
        return this.c;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.d).toString();
    }

    public bhk c() {
        return bhk.USE_OLD;
    }

    public List<bhc> e() {
        return this.e;
    }

    public void b(Context context) {
    }

    public void c(Context context) {
    }
}
