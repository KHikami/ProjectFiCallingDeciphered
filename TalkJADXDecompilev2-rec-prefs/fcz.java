package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fcz extends fhb {
    private final List<fda> f12714a;
    private final boolean f12715b;
    private final boolean f12716g;

    public fcz(bko bko, List<fda> list, boolean z, boolean z2) {
        super(bko);
        this.f12714a = list;
        this.f12715b = z;
        this.f12716g = z2;
    }

    public void w_() {
        int i = 1;
        blo blo = new blo(gwb.m1400H(), this.f5736c.f12721a);
        for (fda fda : this.f12714a) {
            long min;
            bls f = blo.m6050f(fda.f12717a);
            if (f != null) {
                min = Math.min(f.f3775u, fda.f12718b);
            } else {
                min = fda.f12718b;
            }
            if (!blo.m5871a(fda.f12717a) && !this.f12716g) {
                m8039a(new eun(fda.f12717a, min, this.f12715b));
            } else if (m8044j() != -1) {
                RealTimeChatService.m8997a(m8044j(), this.f5736c.f12722b, new fiu(m8044j(), 1, new ewe()));
            }
        }
        if (this.f12715b) {
            i = 2;
        }
        blo.m5958a();
        try {
            for (fda fda2 : this.f12714a) {
                if (glk.m17973a("Babel", 3)) {
                    String str = "Babel";
                    String str2 = "updateConversationViewLocally conversationId: ";
                    String valueOf = String.valueOf(fda2.f12717a);
                    glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                new fdb(new fqi(fda2.f12717a, i)).m14989a(blo);
            }
            blo.m6015b();
            blf.m5820d(blo);
        } finally {
            blo.m6028c();
        }
    }
}
