package p000;

import java.util.Locale;

public final class gfo {
    public int f15167a;
    public int f15168b;
    public int f15169c;
    public int f15170d;
    public int f15171e;
    public long f15172f;
    public long f15173g;

    public String toString() {
        return String.format(Locale.US, "cell signal: %d%%, wifi signal: %d%%, wifi signal handoff: %d%%, wifi link speed: %dMbps, wifi link speed handoff: %dMbps", new Object[]{Integer.valueOf(this.f15167a), Integer.valueOf(this.f15168b), Integer.valueOf(this.f15169c), Integer.valueOf(this.f15170d), Integer.valueOf(this.f15171e)});
    }
}
