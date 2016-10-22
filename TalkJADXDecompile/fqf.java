import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

public final class fqf extends fou {
    private static final boolean d;
    private static final long serialVersionUID = 1;
    private final int e;
    private final int f;

    static {
        kae kae = glk.d;
        d = d;
    }

    public fqf(lvm lvm) {
        super(lvm.a.a, gwb.a(gwb.H(), lvm.b, null), gwb.a(lvm.c));
        this.e = gwb.a(lvm.d);
        this.f = gwb.a(lvm.e);
    }

    private int d() {
        return this.e;
    }

    protected void a(blo blo, fhc fhc) {
        boolean z = true;
        if (d) {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(b());
            int d = d();
            long c = c();
            String valueOf3 = String.valueOf(new Date(c() / 1000));
            new StringBuilder(((String.valueOf(valueOf).length() + 97) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processFocus conversationId: ").append(valueOf).append(" senderId: ").append(valueOf2).append(" type: ").append(d).append(" and timestamp ").append(c).append("  (").append(valueOf3).append(")");
        }
        blo.a();
        try {
            if (a() == null) {
                glk.e("Babel_ConversationsData", "Received a Presence message without conversation id", new Object[0]);
            } else {
                valueOf2 = a();
                if (!blo.g().b().equals(b())) {
                    boolean z2;
                    edo b = b();
                    if (1 == d()) {
                        z2 = true;
                    } else {
                        z2 = d;
                    }
                    RealTimeChatService.i.post(new fht(valueOf2, b, z2));
                    gid gid = (gid) jyn.a(blo.f(), gid.class);
                    edo b2 = b();
                    if (1 != d()) {
                        z = d;
                    }
                    gid.a(new fqk(b2, z), fqk.a(valueOf2));
                }
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
