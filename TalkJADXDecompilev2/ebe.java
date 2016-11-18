package defpackage;

import android.content.Context;

public class ebe implements bhm {
    private static final boolean a = false;
    private final int b;
    private final boolean c;

    static {
        kae kae = glk.o;
    }

    public ebe(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public int a(Context context, bhb bhb) {
        if (a) {
            new StringBuilder(64).append("HangoutNotifUpdaterConcurrentTask runs for accountId ").append(this.b);
        }
        ebj ebj = ebf.g;
        ebj.a(context, this.b, this.c);
        return bhn.a;
    }
}
