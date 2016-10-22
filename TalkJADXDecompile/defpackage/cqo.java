package defpackage;

import android.content.Context;

/* renamed from: cqo */
public final class cqo implements bhm {
    private final String a;
    private final int b;
    private final long c;

    public cqo(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public int a(Context context, bhb bhb) {
        blo blo = new blo(context, this.b);
        blo.a();
        try {
            blo.f(this.a, this.c);
            blo.b();
            return bhn.a;
        } finally {
            blo.c();
        }
    }
}
