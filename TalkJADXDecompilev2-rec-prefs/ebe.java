package p000;

import android.content.Context;

public class ebe implements bhm {
    private static final boolean f11088a = false;
    private final int f11089b;
    private final boolean f11090c;

    static {
        kae kae = glk.f15568o;
    }

    public ebe(int i, boolean z) {
        this.f11089b = i;
        this.f11090c = z;
    }

    public int mo539a(Context context, bhb bhb) {
        if (f11088a) {
            new StringBuilder(64).append("HangoutNotifUpdaterConcurrentTask runs for accountId ").append(this.f11089b);
        }
        ebj ebj = ebf.f11092g;
        ebj.m13453a(context, this.f11089b, this.f11090c);
        return bhn.f3348a;
    }
}
