package defpackage;

import java.util.Locale;

/* renamed from: gfo */
public final class gfo {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;

    public String toString() {
        return String.format(Locale.US, "cell signal: %d%%, wifi signal: %d%%, wifi signal handoff: %d%%, wifi link speed: %dMbps, wifi link speed handoff: %dMbps", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }
}
