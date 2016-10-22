import android.content.Context;
import android.content.Intent;

public abstract class eat extends ebc {
    public static final String a;
    static eax b;
    private final long c;

    static {
        String valueOf = String.valueOf("notified_for_failure!=1 AND conversation_pending_leave!=1 AND status!=");
        int ordinal = fwx.ON_SERVER.ordinal();
        String valueOf2 = String.valueOf("type");
        a = new StringBuilder((String.valueOf(valueOf).length() + 28) + String.valueOf(valueOf2).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf2).append("=").append(fwy.OUTGOING_USER_MESSAGE.ordinal()).toString();
        b = new eax();
    }

    public static void a(Context context, int i) {
        String c = ecm.c(context, i);
        gw a = gw.a(context);
        ecm.a(c, 7);
        a.a(c, 7);
    }

    protected eat(Context context, int i, gjj gjj, long j) {
        super(context, i, gjj);
        this.c = j;
    }

    protected void a(boolean z) {
        this.w.a(this.c);
        super.a(z);
    }

    protected int f() {
        return 7;
    }

    protected int g() {
        return gwb.a(this.r, "babel_notify_chat_priority_level", 1);
    }

    protected Intent h() {
        return new eav().a(this.r, this.s, this.t.b());
    }

    protected void c() {
        gwb.a(fde.e(this.s), 1931);
    }
}
