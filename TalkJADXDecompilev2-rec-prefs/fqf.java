package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

public final class fqf extends fou {
    private static final boolean f13733d = false;
    private static final long serialVersionUID = 1;
    private final int f13734e;
    private final int f13735f;

    static {
        kae kae = glk.f15557d;
    }

    public fqf(lvm lvm) {
        super(lvm.f26598a.f25931a, gwb.m1604a(gwb.m1400H(), lvm.f26599b, null), gwb.m1523a(lvm.f26600c));
        this.f13734e = gwb.m1507a(lvm.f26601d);
        this.f13735f = gwb.m1507a(lvm.f26602e);
    }

    private int m15955d() {
        return this.f13734e;
    }

    protected void mo2061a(blo blo, fhc fhc) {
        boolean z = true;
        if (f13733d) {
            String valueOf = String.valueOf(m15827a());
            String valueOf2 = String.valueOf(m15831b());
            int d = m15955d();
            long c = m15832c();
            String valueOf3 = String.valueOf(new Date(m15832c() / 1000));
            new StringBuilder(((String.valueOf(valueOf).length() + 97) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processFocus conversationId: ").append(valueOf).append(" senderId: ").append(valueOf2).append(" type: ").append(d).append(" and timestamp ").append(c).append("  (").append(valueOf3).append(")");
        }
        blo.m5958a();
        try {
            if (m15827a() == null) {
                glk.m17982e("Babel_ConversationsData", "Received a Presence message without conversation id", new Object[0]);
            } else {
                valueOf2 = m15827a();
                if (!blo.m6056g().m5632b().equals(m15831b())) {
                    boolean z2;
                    edo b = m15831b();
                    if (1 == m15955d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    RealTimeChatService.f6752i.post(new fht(valueOf2, b, z2));
                    gid gid = (gid) jyn.m25426a(blo.m6049f(), gid.class);
                    edo b2 = m15831b();
                    if (1 != m15955d()) {
                        z = false;
                    }
                    gid.mo2276a(new fqk(b2, z), fqk.m15965a(valueOf2));
                }
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
