package p000;

import android.content.Context;

public class ebl implements bhm {
    private static final boolean f11103a = false;
    private final int f11104b;
    private final boolean f11105c;
    private final boolean f11106d;

    static {
        kae kae = glk.f15568o;
    }

    public ebl(int i, boolean z, boolean z2) {
        this.f11104b = i;
        this.f11105c = z;
        this.f11106d = z2;
    }

    public int mo539a(Context context, bhb bhb) {
        if (f11103a) {
            new StringBuilder(70).append("ImportantMessageNotificationUpdaterTask runs for accountId ").append(this.f11104b);
        }
        ebm.m13459a(context, this.f11104b, this.f11105c, this.f11106d);
        return bhn.f3348a;
    }
}
