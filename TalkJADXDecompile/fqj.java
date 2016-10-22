import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

public final class fqj extends fou {
    private static final boolean d;
    private static final long serialVersionUID = 1;

    static {
        kae kae = glk.d;
        d = d;
    }

    public fqj(lxg lxg) {
        super(lxg.b.a, gwb.a(gwb.H(), lxg.a, null), gwb.a(lxg.c));
    }

    public fqj(String str, edo edo, long j) {
        super(str, edo, j);
    }

    protected void a(blo blo, fhc fhc) {
        if (d) {
            String valueOf = String.valueOf(a());
            new StringBuilder(String.valueOf(valueOf).length() + 77).append("processWatermarkNotification ConversationId: ").append(valueOf).append(" Timestamp: ").append(c());
        }
        String a = a();
        blo.a();
        try {
            if (d) {
                if (blo.g().b().equals(b())) {
                    valueOf = "self";
                } else {
                    valueOf = b().b;
                }
                String valueOf2 = String.valueOf(a());
                long c = c();
                String valueOf3 = String.valueOf(new Date(c() / 1000));
                new StringBuilder(((String.valueOf(valueOf2).length() + 104) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("processWatermarkNotificationInTransaction  conversationId: ").append(valueOf2).append(" chatId: ").append(valueOf).append(" timestamp: ").append(c).append("  (").append(valueOf3).append(")");
            }
            if (blo.g().b().equals(b())) {
                blo.a(a(), c(), (boolean) d, "WatermarkNotification");
                if (!fdq.w.b(blo.g().g())) {
                    fhc.c((long) blo.g().g());
                }
            } else {
                ((bor) jyn.a(gwb.H(), bor.class)).a(this);
                RealTimeChatService.a(this);
            }
            blo.b();
            blf.d(blo, a);
        } finally {
            blo.c();
        }
    }
}
