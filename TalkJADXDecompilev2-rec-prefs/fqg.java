package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

public final class fqg extends fou {
    private static final boolean f13736d = false;
    private static final long serialVersionUID = 1;
    private final int f13737e;

    static {
        kae kae = glk.f15557d;
    }

    public fqg(lvv lvv) {
        super(lvv.f26621a.f25931a, gwb.m1604a(gwb.m1400H(), lvv.f26622b, null), gwb.m1523a(lvv.f26623c));
        this.f13737e = gwb.m1507a(lvv.f26624d);
    }

    private int m15957d() {
        return this.f13737e;
    }

    protected void mo2061a(blo blo, fhc fhc) {
        if (f13736d) {
            String valueOf = String.valueOf(m15831b());
            String valueOf2 = String.valueOf(m15827a());
            int d = m15957d();
            long c = m15832c();
            String valueOf3 = String.valueOf(new Date(m15832c() / 1000));
            new StringBuilder(((String.valueOf(valueOf).length() + 94) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processTyping senderId: ").append(valueOf).append(" conversationId: ").append(valueOf2).append(" type: ").append(d).append(" timestamp ").append(c).append("  (").append(valueOf3).append(")");
        }
        blo.m5958a();
        try {
            bko g = blo.m6056g();
            if (!g.m5632b().equals(m15831b())) {
                valueOf3 = m15827a();
                if (valueOf3 == null) {
                    glk.m17981d("Babel_ConversationsData", "attempt to process typing for a nonexistent conversation id [null]", new Object[0]);
                } else {
                    boolean z;
                    String a = blo.m5950a(m15831b());
                    edo b = m15831b();
                    long c2 = m15832c();
                    if (m15957d() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    RealTimeChatService.f6752i.post(new fhv(g, valueOf3, b, a, c2, z));
                    ((gid) jyn.m25426a(blo.m6049f(), gid.class)).mo2276a(new fql(m15831b(), 1 == m15957d()), fql.m15966a(valueOf3));
                }
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
