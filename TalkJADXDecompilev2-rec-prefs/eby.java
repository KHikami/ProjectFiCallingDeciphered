package p000;

import android.content.Context;

public class eby implements bhm {
    private static final boolean f11158a = false;
    private final int f11159b;
    private final boolean f11160c;
    private final boolean f11161d;

    static {
        kae kae = glk.f15568o;
    }

    public eby(int i, boolean z, boolean z2) {
        this.f11159b = i;
        this.f11160c = z;
        this.f11161d = z2;
    }

    public int mo539a(Context context, bhb bhb) {
        if (f11158a) {
            new StringBuilder(64).append("MessageNotifUpdaterConcurrentTask runs for accountId ").append(this.f11159b);
        }
        ecd ecd = ebz.f11038o;
        ecd.m13491a(context, this.f11159b, this.f11160c, this.f11161d);
        return bhn.f3348a;
    }
}
