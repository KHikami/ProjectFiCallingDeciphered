package p000;

import android.content.Context;

public class eaz implements bhm {
    private static final boolean f11081a = false;
    private final int f11082b;

    static {
        kae kae = glk.f15568o;
    }

    public eaz(int i) {
        this.f11082b = i;
    }

    public int mo539a(Context context, bhb bhb) {
        if (f11081a) {
            new StringBuilder(65).append("FailedMessageUpdaterConcurrentTask runs for accountId ").append(this.f11082b);
        }
        eax eax = eat.f11076b;
        eax.m13401a(context, this.f11082b);
        return bhn.f3348a;
    }
}
