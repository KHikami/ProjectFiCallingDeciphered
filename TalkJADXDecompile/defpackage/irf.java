package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: irf */
final class irf implements guk, gul {
    final /* synthetic */ ire a;
    private final gui b;
    private final gti c;
    private final off d;

    irf(ire ire) {
        off d;
        this.a = ire;
        itf a = ire.b.o().a();
        this.b = new guj(ire.a).a(gti.c).a(a == null ? null : a.o()).a((guk) this).b();
        this.b.b();
        this.c = ire.a();
        Context context = ire.a;
        if (a != null) {
            d = a.d();
        } else {
            int i;
            off off = new off();
            off.b = Integer.valueOf(407);
            off.c = Integer.valueOf(2);
            if (gwb.az(context)) {
                i = 3;
            } else {
                i = 2;
            }
            off.a = Integer.valueOf(i);
            d = off;
        }
        this.d = d;
    }

    void a() {
        this.c.a(this.b);
    }

    private mdg a(String str) {
        mdg mdg = new mdg();
        mdg.e = this.d;
        mdg.a = new mcv();
        ith o = this.a.b.o();
        itf a = o.a();
        itk b = o.b();
        mdg.a.a = new mcu();
        if (b != null) {
            mdg.a.a.c = b.a();
            mdg.a.a.d = b.b();
        } else if (a != null) {
            mdg.a.a.c = a.f();
        }
        if (a != null) {
            mdg.a.a.a = a.q();
        }
        mdg.a.a.k = o.c();
        mcu mcu = mdg.a.a;
        if (str == null) {
            str = o.d();
        }
        mcu.b = str;
        mdg.a.a.e = o.f();
        return mdg;
    }

    void a(mdq mdq, long j) {
        nzf mdg = new mdg();
        mdg.e = this.d;
        mdg.d = new mdf();
        mdg.d.a = Long.valueOf(j);
        mdg.b = mdq;
        this.c.a(nzf.a(mdg)).b(this.b);
        itx.a(3, "vclib", "Logging transportEvent to clearcut: \n%s", mdg);
    }

    public void a(mdh mdh, String str) {
        nzf a = a(str);
        a.a.n = mdh;
        this.c.a(nzf.a(a)).b(this.b);
        itx.a(3, "vclib", "Logging timingLogEntry to clearcut: \n%s", a);
    }

    void a(int i, String str) {
        nzf a = a(str);
        a.a.j = new mcw();
        a.a.j.a = Integer.valueOf(i);
        this.c.a(nzf.a(a)).b(this.b);
        itx.a(3, "vclib", "Logging to clearcut: \n%s", a);
    }

    void a(long j, int i, int i2) {
        nzf a = a(null);
        a.a.j = new mcw();
        a.a.j.a = Integer.valueOf(3015);
        a.a.j.i = new mdc();
        a.a.j.i.a = Long.valueOf(j);
        a.a.j.i.b = Integer.valueOf(i);
        a.a.j.i.c = Integer.valueOf(i2);
        this.c.a(nzf.a(a)).b(this.b);
        itx.a(3, "vclib", "Logging UMA event to clearcut: \n%s", a);
    }

    public void a_(Bundle bundle) {
        itx.a(4, "vclib", "ImpressionReporter connected to GoogleApiClient.");
    }

    public void a(int i) {
        itx.a("vclib", "ImpressionReporter GoogleApiClient suspended: %d.", Integer.valueOf(i));
    }

    public void a(ConnectionResult connectionResult) {
        itx.c("vclib", "ImpressionReporter GoogleApiClient failed: %s", connectionResult);
    }
}
