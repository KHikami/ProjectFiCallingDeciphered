package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fcz extends fhb {
    private final List<fda> a;
    private final boolean b;
    private final boolean g;

    public fcz(bko bko, List<fda> list, boolean z, boolean z2) {
        super(bko);
        this.a = list;
        this.b = z;
        this.g = z2;
    }

    public void w_() {
        int i = 1;
        blo blo = new blo(gwb.H(), this.c.a);
        for (fda fda : this.a) {
            long min;
            bls f = blo.f(fda.a);
            if (f != null) {
                min = Math.min(f.u, fda.b);
            } else {
                min = fda.b;
            }
            if (!blo.a(fda.a) && !this.g) {
                a(new eun(fda.a, min, this.b));
            } else if (j() != -1) {
                RealTimeChatService.a(j(), this.c.b, new fiu(j(), 1, new ewe()));
            }
        }
        if (this.b) {
            i = 2;
        }
        blo.a();
        try {
            for (fda fda2 : this.a) {
                if (glk.a("Babel", 3)) {
                    String str = "Babel";
                    String str2 = "updateConversationViewLocally conversationId: ";
                    String valueOf = String.valueOf(fda2.a);
                    glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                new fdb(new fqi(fda2.a, i)).a(blo);
            }
            blo.b();
            blf.d(blo);
        } finally {
            blo.c();
        }
    }
}
