package p000;

import android.content.Context;
import android.content.Intent;

public abstract class ebf extends ecm {
    static final boolean f11091a = false;
    static ebj f11092g = new ebj();
    public String f11093b;
    public CharSequence f11094c = null;
    public final long f11095d;
    public int f11096e;
    public String f11097f;

    static {
        kae kae = glk.f15568o;
    }

    public static void m13445a(Context context, int i) {
        ecs.m13519a(context, i, null);
        ece.m13495b(context, i);
    }

    ebf(Context context, int i, int i2, gjj gjj, long j) {
        super(context, i, gjj);
        this.f11096e = i2;
        if (j <= 0) {
            j = glj.m17956a();
        }
        this.f11095d = j;
    }

    protected Intent mo1812h() {
        return new ebg().m13447a(this.r, this.s, this.t.m17808b());
    }
}
