package defpackage;

import android.content.Context;
import android.content.Intent;

public abstract class ebf extends ecm {
    static final boolean a = false;
    static ebj g = new ebj();
    public String b;
    public CharSequence c = null;
    public final long d;
    public int e;
    public String f;

    static {
        kae kae = glk.o;
    }

    public static void a(Context context, int i) {
        ecs.a(context, i, null);
        ece.b(context, i);
    }

    ebf(Context context, int i, int i2, gjj gjj, long j) {
        super(context, i, gjj);
        this.e = i2;
        if (j <= 0) {
            j = glj.a();
        }
        this.d = j;
    }

    protected Intent h() {
        return new ebg().a(this.r, this.s, this.t.b());
    }
}
