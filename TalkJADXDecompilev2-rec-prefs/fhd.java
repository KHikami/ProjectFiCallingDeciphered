package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class fhd {
    private final bko f13046a;
    private final String f13047b = gld.m17941b();
    private final Set<fbt> f13048c = new HashSet();

    public fhd(bko bko) {
        this.f13046a = bko;
    }

    public boolean m15320a(Context context, blo blo, String str, List<edo> list) {
        boolean z = false;
        blo.m5958a();
        try {
            long b = glj.m17963b();
            long a = ((biw) jyn.m25426a(context, biw.class)).mo561a("babel_yieldtime", 2000);
            for (edo edo : list) {
                if (glj.m17963b() - b >= a) {
                    blo.m6039d();
                    b = glj.m17963b();
                }
                if (blo.m6003a(edo, this.f13047b, str)) {
                    fbt b2 = gwb.m1987b(edo);
                    if (b2.m14922a()) {
                        this.f13048c.add(b2);
                        z = true;
                    } else {
                        glk.m17982e("Babel_RTCOpState", "RealTimeChatOperationState: invalid spec", new Object[0]);
                    }
                }
            }
            blo.m6015b();
            return z;
        } finally {
            blo.m6028c();
        }
    }

    public void m15319a() {
        if (this.f13048c.size() > 0) {
            fqu.m16000a(this.f13046a).m12718c(new bjz(new ArrayList(this.f13048c), this.f13047b));
            this.f13048c.clear();
        }
    }
}
