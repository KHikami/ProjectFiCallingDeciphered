package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* renamed from: fpv */
public class fpv implements bhi, bhm {
    private static final boolean a;
    private final int b;
    private final String c;
    private final long d;
    private final long e;

    static {
        kae kae = glk.o;
        a = false;
    }

    public fpv(int i, String str, long j, long j2) {
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    public int a(Context context, bhb bhb) {
        if (a) {
            new StringBuilder(64).append("ReceiveServerUpdateConcurrentTask runs for accountId ").append(this.b);
        }
        List<fqd> a = fqe.a(this.c, this.d, this.e, SystemClock.elapsedRealtime() * 1000, this.b, true);
        if (a != null) {
            for (fqd fqd : a) {
                int i = this.b;
                bko e = fde.e(i);
                if (glk.a("Babel_RecSvrUpdateSvc", 3)) {
                    String valueOf = String.valueOf(fqd.getClass().getSimpleName());
                    String valueOf2 = String.valueOf(e.b());
                    glk.a("Babel_RecSvrUpdateSvc", new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("processServerUpdate: ").append(valueOf).append(", account: ").append(valueOf2).toString(), new Object[0]);
                }
                fqd.a(i, mdv.a);
            }
        } else {
            glk.e("Babel_RecSvrUpdateSvc", "could not parse ServerUpdate", new Object[0]);
        }
        return bhn.a;
    }
}
