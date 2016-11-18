package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

final class dyd implements dwu {
    private static final long f10821b = TimeUnit.DAYS.toMillis(1);
    private final Context f10822a;

    dyd(Context context) {
        this.f10822a = context;
    }

    public void mo1751a(int i, boolean z) {
        jci b = ((jcf) jyn.m25426a(this.f10822a, jcf.class)).mo3464b(i);
        long a = glj.m17956a() - b.mo3434a("last_conversation_data_update_ts", 0);
        if (z || a > f10821b) {
            blo.m5861a(this.f10822a, i);
            b.m23878b("last_conversation_data_update_ts", glj.m17956a());
            b.m23891d();
        }
    }
}
