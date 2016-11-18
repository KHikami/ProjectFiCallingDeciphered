package p000;

import android.content.Context;
import android.content.Intent;

public abstract class eat extends ebc {
    public static final String f11075a;
    static eax f11076b = new eax();
    private final long f11077c;

    static {
        String valueOf = String.valueOf("notified_for_failure!=1 AND conversation_pending_leave!=1 AND status!=");
        int ordinal = fwx.ON_SERVER.ordinal();
        String valueOf2 = String.valueOf("type");
        f11075a = new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf2).append("=").append(fwy.OUTGOING_USER_MESSAGE.ordinal()).toString();
    }

    public static void m13386a(Context context, int i) {
        String c = ecm.m13303c(context, i);
        gw a = gw.m18748a(context);
        ecm.m13301a(c, 7);
        a.m18751a(c, 7);
    }

    protected eat(Context context, int i, gjj gjj, long j) {
        super(context, i, gjj);
        this.f11077c = j;
    }

    protected void mo1807a(boolean z) {
        this.w.m16419a(this.f11077c);
        super.mo1807a(z);
    }

    protected int mo1810f() {
        return 7;
    }

    protected int mo1811g() {
        return gwb.m1492a(this.r, "babel_notify_chat_priority_level", 1);
    }

    protected Intent mo1812h() {
        return new eav().m13395a(this.r, this.s, this.t.m17808b());
    }

    protected void mo1809c() {
        gwb.m1823a(fde.m15018e(this.s), 1931);
    }
}
