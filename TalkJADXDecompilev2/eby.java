package defpackage;

import android.content.Context;

public class eby implements bhm {
    private static final boolean a = false;
    private final int b;
    private final boolean c;
    private final boolean d;

    static {
        kae kae = glk.o;
    }

    public eby(int i, boolean z, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public int a(Context context, bhb bhb) {
        if (a) {
            new StringBuilder(64).append("MessageNotifUpdaterConcurrentTask runs for accountId ").append(this.b);
        }
        ecd ecd = ebz.o;
        ecd.a(context, this.b, this.c, this.d);
        return bhn.a;
    }
}
