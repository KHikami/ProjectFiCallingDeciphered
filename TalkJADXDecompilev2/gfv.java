package defpackage;

import java.util.Locale;

public final class gfv {
    public final boolean a;
    public final int b;
    public final int c;

    gfv(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        return this.a && this.b > i && this.c > i2;
    }

    public String toString() {
        return String.format(Locale.US, "is connected: %b, signal level: %d%%, link speed: %dMbps", new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gfv gfv = (gfv) obj;
        if (this.a == gfv.a && this.b == gfv.b && this.c == gfv.c) {
            return true;
        }
        return false;
    }
}
