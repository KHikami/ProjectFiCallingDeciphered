package p000;

import java.util.Locale;

public final class gfv {
    public final boolean f15184a;
    public final int f15185b;
    public final int f15186c;

    gfv(boolean z, int i, int i2) {
        this.f15184a = z;
        this.f15185b = i;
        this.f15186c = i2;
    }

    public boolean m17574a(int i, int i2) {
        return this.f15184a && this.f15185b > i && this.f15186c > i2;
    }

    public String toString() {
        return String.format(Locale.US, "is connected: %b, signal level: %d%%, link speed: %dMbps", new Object[]{Boolean.valueOf(this.f15184a), Integer.valueOf(this.f15185b), Integer.valueOf(this.f15186c)});
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gfv gfv = (gfv) obj;
        if (this.f15184a == gfv.f15184a && this.f15185b == gfv.f15185b && this.f15186c == gfv.f15186c) {
            return true;
        }
        return false;
    }
}
