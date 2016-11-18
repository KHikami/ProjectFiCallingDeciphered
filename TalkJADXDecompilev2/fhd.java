package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class fhd {
    private final bko a;
    private final String b = gld.b();
    private final Set<fbt> c = new HashSet();

    public fhd(bko bko) {
        this.a = bko;
    }

    public boolean a(Context context, blo blo, String str, List<edo> list) {
        boolean z = false;
        blo.a();
        try {
            long b = glj.b();
            long a = ((biw) jyn.a(context, biw.class)).a("babel_yieldtime", 2000);
            for (edo edo : list) {
                if (glj.b() - b >= a) {
                    blo.d();
                    b = glj.b();
                }
                if (blo.a(edo, this.b, str)) {
                    fbt b2 = gwb.b(edo);
                    if (b2.a()) {
                        this.c.add(b2);
                        z = true;
                    } else {
                        glk.e("Babel_RTCOpState", "RealTimeChatOperationState: invalid spec", new Object[0]);
                    }
                }
            }
            blo.b();
            return z;
        } finally {
            blo.c();
        }
    }

    public void a() {
        if (this.c.size() > 0) {
            fqu.a(this.a).c(new bjz(new ArrayList(this.c), this.b));
            this.c.clear();
        }
    }
}
