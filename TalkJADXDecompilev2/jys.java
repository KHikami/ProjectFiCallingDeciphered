package defpackage;

import android.content.Context;

public final class jys {
    private volatile jyn a;
    private final Object b = new Object();
    private final jyt c;
    private final boolean d = false;

    jys(boolean z, jyt jyt) {
        this.c = jyt;
    }

    public jyn a(Context context) {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    jyn jyn = new jyn(context);
                    if (this.d) {
                        jyn.a(jyn.c(context));
                    }
                    if (this.c != null) {
                        this.c.a(context, jyn);
                    }
                    this.a = jyn;
                }
            }
        }
        return this.a;
    }
}
