package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class irf implements guk, gul {
    final /* synthetic */ ire f18757a;
    private final gui f18758b;
    private final gti f18759c;
    private final off f18760d;

    irf(ire ire) {
        off d;
        this.f18757a = ire;
        itf a = ire.f18755b.mo3224o().m23201a();
        this.f18758b = new guj(ire.f18754a).m18639a(gti.f16101c).m18643a(a == null ? null : a.m23189o()).m18641a((guk) this).m18645b();
        this.f18758b.mo2518b();
        this.f18759c = ire.m23010a();
        Context context = ire.f18754a;
        if (a != null) {
            d = a.m23169d();
        } else {
            int i;
            off off = new off();
            off.f28728b = Integer.valueOf(407);
            off.f28729c = Integer.valueOf(2);
            if (gwb.az(context)) {
                i = 3;
            } else {
                i = 2;
            }
            off.f28727a = Integer.valueOf(i);
            d = off;
        }
        this.f18760d = d;
    }

    void m23018a() {
        this.f18759c.m18527a(this.f18758b);
    }

    private mdg m23017a(String str) {
        mdg mdg = new mdg();
        mdg.f27451e = this.f18760d;
        mdg.f27447a = new mcv();
        ith o = this.f18757a.f18755b.mo3224o();
        itf a = o.m23201a();
        itk b = o.m23209b();
        mdg.f27447a.f27386a = new mcu();
        if (b != null) {
            mdg.f27447a.f27386a.f27376c = b.m23222a();
            mdg.f27447a.f27386a.f27377d = b.m23223b();
        } else if (a != null) {
            mdg.f27447a.f27386a.f27376c = a.m23173f();
        }
        if (a != null) {
            mdg.f27447a.f27386a.f27374a = a.m23191q();
        }
        mdg.f27447a.f27386a.f27384k = o.m23211c();
        mcu mcu = mdg.f27447a.f27386a;
        if (str == null) {
            str = o.m23212d();
        }
        mcu.f27375b = str;
        mdg.f27447a.f27386a.f27378e = o.m23214f();
        return mdg;
    }

    void m23024a(mdq mdq, long j) {
        nzf mdg = new mdg();
        mdg.f27451e = this.f18760d;
        mdg.f27450d = new mdf();
        mdg.f27450d.f27446a = Long.valueOf(j);
        mdg.f27448b = mdq;
        this.f18759c.m18526a(nzf.m1029a(mdg)).m18536b(this.f18758b);
        itx.m23279a(3, "vclib", "Logging transportEvent to clearcut: \n%s", mdg);
    }

    public void m23023a(mdh mdh, String str) {
        nzf a = m23017a(str);
        a.f27447a.f27399n = mdh;
        this.f18759c.m18526a(nzf.m1029a(a)).m18536b(this.f18758b);
        itx.m23279a(3, "vclib", "Logging timingLogEntry to clearcut: \n%s", a);
    }

    void m23020a(int i, String str) {
        nzf a = m23017a(str);
        a.f27447a.f27395j = new mcw();
        a.f27447a.f27395j.f27400a = Integer.valueOf(i);
        this.f18759c.m18526a(nzf.m1029a(a)).m18536b(this.f18758b);
        itx.m23279a(3, "vclib", "Logging to clearcut: \n%s", a);
    }

    void m23021a(long j, int i, int i2) {
        nzf a = m23017a(null);
        a.f27447a.f27395j = new mcw();
        a.f27447a.f27395j.f27400a = Integer.valueOf(3015);
        a.f27447a.f27395j.f27408i = new mdc();
        a.f27447a.f27395j.f27408i.f27438a = Long.valueOf(j);
        a.f27447a.f27395j.f27408i.f27439b = Integer.valueOf(i);
        a.f27447a.f27395j.f27408i.f27440c = Integer.valueOf(i2);
        this.f18759c.m18526a(nzf.m1029a(a)).m18536b(this.f18758b);
        itx.m23279a(3, "vclib", "Logging UMA event to clearcut: \n%s", a);
    }

    public void a_(Bundle bundle) {
        itx.m23277a(4, "vclib", "ImpressionReporter connected to GoogleApiClient.");
    }

    public void mo1150a(int i) {
        itx.m23282a("vclib", "ImpressionReporter GoogleApiClient suspended: %d.", Integer.valueOf(i));
    }

    public void mo1151a(ConnectionResult connectionResult) {
        itx.m23288c("vclib", "ImpressionReporter GoogleApiClient failed: %s", connectionResult);
    }
}
