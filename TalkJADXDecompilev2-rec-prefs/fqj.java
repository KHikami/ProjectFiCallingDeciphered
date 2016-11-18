package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

public final class fqj extends fou {
    private static final boolean f13740d = false;
    private static final long serialVersionUID = 1;

    static {
        kae kae = glk.f15557d;
    }

    public fqj(lxg lxg) {
        super(lxg.f26755b.f25931a, gwb.m1604a(gwb.m1400H(), lxg.f26754a, null), gwb.m1523a(lxg.f26756c));
    }

    public fqj(String str, edo edo, long j) {
        super(str, edo, j);
    }

    protected void mo2061a(blo blo, fhc fhc) {
        if (f13740d) {
            String valueOf = String.valueOf(m15827a());
            new StringBuilder(String.valueOf(valueOf).length() + 77).append("processWatermarkNotification ConversationId: ").append(valueOf).append(" Timestamp: ").append(m15832c());
        }
        String a = m15827a();
        blo.m5958a();
        try {
            if (f13740d) {
                if (blo.m6056g().m5632b().equals(m15831b())) {
                    valueOf = "self";
                } else {
                    valueOf = m15831b().f11245b;
                }
                String valueOf2 = String.valueOf(m15827a());
                long c = m15832c();
                String valueOf3 = String.valueOf(new Date(m15832c() / 1000));
                new StringBuilder(((String.valueOf(valueOf2).length() + 104) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("processWatermarkNotificationInTransaction  conversationId: ").append(valueOf2).append(" chatId: ").append(valueOf).append(" timestamp: ").append(c).append("  (").append(valueOf3).append(")");
            }
            if (blo.m6056g().m5632b().equals(m15831b())) {
                blo.m5978a(m15827a(), m15832c(), false, "WatermarkNotification");
                if (!fdq.f12807w.m14370b(blo.m6056g().m5638g())) {
                    fhc.m15314c((long) blo.m6056g().m5638g());
                }
            } else {
                ((bor) jyn.m25426a(gwb.m1400H(), bor.class)).m6322a(this);
                RealTimeChatService.m9058a(this);
            }
            blo.m6015b();
            blf.m5821d(blo, a);
        } finally {
            blo.m6028c();
        }
    }
}
