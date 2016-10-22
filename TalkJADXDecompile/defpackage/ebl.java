package defpackage;

import android.content.Context;

/* renamed from: ebl */
public class ebl implements bhm {
    private static final boolean a;
    private final int b;
    private final boolean c;
    private final boolean d;

    static {
        kae kae = glk.o;
        a = false;
    }

    public ebl(int i, boolean z, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public int a(Context context, bhb bhb) {
        if (a) {
            new StringBuilder(70).append("ImportantMessageNotificationUpdaterTask runs for accountId ").append(this.b);
        }
        ebm.a(context, this.b, this.c, this.d);
        return bhn.a;
    }
}
