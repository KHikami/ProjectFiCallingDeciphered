package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Date;

/* renamed from: fqg */
public final class fqg extends fou {
    private static final boolean d;
    private static final long serialVersionUID = 1;
    private final int e;

    static {
        kae kae = glk.d;
        d = d;
    }

    public fqg(lvv lvv) {
        super(lvv.a.a, gwb.a(gwb.H(), lvv.b, null), gwb.a(lvv.c));
        this.e = gwb.a(lvv.d);
    }

    private int d() {
        return this.e;
    }

    protected void a(blo blo, fhc fhc) {
        if (d) {
            String valueOf = String.valueOf(b());
            String valueOf2 = String.valueOf(a());
            int d = d();
            long c = c();
            String valueOf3 = String.valueOf(new Date(c() / 1000));
            new StringBuilder(((String.valueOf(valueOf).length() + 94) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("processTyping senderId: ").append(valueOf).append(" conversationId: ").append(valueOf2).append(" type: ").append(d).append(" timestamp ").append(c).append("  (").append(valueOf3).append(")");
        }
        blo.a();
        try {
            bko g = blo.g();
            if (!g.b().equals(b())) {
                valueOf3 = a();
                if (valueOf3 == null) {
                    glk.d("Babel_ConversationsData", "attempt to process typing for a nonexistent conversation id [null]", new Object[0]);
                } else {
                    boolean z;
                    String a = blo.a(b());
                    edo b = b();
                    long c2 = c();
                    if (d() == 1) {
                        z = true;
                    } else {
                        z = d;
                    }
                    RealTimeChatService.i.post(new fhv(g, valueOf3, b, a, c2, z));
                    ((gid) jyn.a(blo.f(), gid.class)).a(new fql(b(), 1 == d() ? true : d), fql.a(valueOf3));
                }
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
