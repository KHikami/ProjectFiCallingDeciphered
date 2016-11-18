package p000;

import android.content.Context;

public final class cqo implements bhm {
    private final String f8838a;
    private final int f8839b;
    private final long f8840c;

    public cqo(String str, int i, long j) {
        this.f8838a = str;
        this.f8839b = i;
        this.f8840c = j;
    }

    public int mo539a(Context context, bhb bhb) {
        blo blo = new blo(context, this.f8839b);
        blo.m5958a();
        try {
            blo.m6053f(this.f8838a, this.f8840c);
            blo.m6015b();
            return bhn.f3348a;
        } finally {
            blo.m6028c();
        }
    }
}
