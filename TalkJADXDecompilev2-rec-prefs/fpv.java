package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;

public class fpv implements bhi, bhm {
    private static final boolean f13718a = false;
    private final int f13719b;
    private final String f13720c;
    private final long f13721d;
    private final long f13722e;

    static {
        kae kae = glk.f15568o;
    }

    public fpv(int i, String str, long j, long j2) {
        this.f13719b = i;
        this.f13720c = str;
        this.f13721d = j;
        this.f13722e = j2;
    }

    public int mo539a(Context context, bhb bhb) {
        if (f13718a) {
            new StringBuilder(64).append("ReceiveServerUpdateConcurrentTask runs for accountId ").append(this.f13719b);
        }
        List<fqd> a = fqe.m15951a(this.f13720c, this.f13721d, this.f13722e, SystemClock.elapsedRealtime() * 1000, this.f13719b, true);
        if (a != null) {
            for (fqd fqd : a) {
                int i = this.f13719b;
                bko e = fde.m15018e(i);
                if (glk.m17973a("Babel_RecSvrUpdateSvc", 3)) {
                    String valueOf = String.valueOf(fqd.getClass().getSimpleName());
                    String valueOf2 = String.valueOf(e.m5632b());
                    glk.m17970a("Babel_RecSvrUpdateSvc", new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("processServerUpdate: ").append(valueOf).append(", account: ").append(valueOf2).toString(), new Object[0]);
                }
                fqd.mo2060a(i, mdv.f27537a);
            }
        } else {
            glk.m17982e("Babel_RecSvrUpdateSvc", "could not parse ServerUpdate", new Object[0]);
        }
        return bhn.f3348a;
    }
}
