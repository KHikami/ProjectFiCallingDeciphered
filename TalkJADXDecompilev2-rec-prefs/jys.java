package p000;

import android.content.Context;

public final class jys {
    private volatile jyn f21302a;
    private final Object f21303b = new Object();
    private final jyt f21304c;
    private final boolean f21305d = false;

    jys(boolean z, jyt jyt) {
        this.f21304c = jyt;
    }

    public jyn m25460a(Context context) {
        if (this.f21302a == null) {
            synchronized (this.f21303b) {
                if (this.f21302a == null) {
                    jyn jyn = new jyn(context);
                    if (this.f21305d) {
                        jyn.m25453a(jyn.m25439c(context));
                    }
                    if (this.f21304c != null) {
                        this.f21304c.m25461a(context, jyn);
                    }
                    this.f21302a = jyn;
                }
            }
        }
        return this.f21302a;
    }
}
