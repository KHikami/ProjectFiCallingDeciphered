package p000;

import android.os.Bundle;

public final class gzr {
    public static final gzr f16451a = new gzr(0, 30, 3600);
    public static final gzr f16452b = new gzr(1, 30, 3600);
    private final int f16453c;
    private final int f16454d = 30;
    private final int f16455e = 3600;

    private gzr(int i, int i2, int i3) {
        this.f16453c = i;
    }

    public int m19046a() {
        return this.f16453c;
    }

    public Bundle m19047a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f16453c);
        bundle.putInt("initial_backoff_seconds", this.f16454d);
        bundle.putInt("maximum_backoff_seconds", this.f16455e);
        return bundle;
    }

    public int m19048b() {
        return this.f16454d;
    }

    public int m19049c() {
        return this.f16455e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gzr)) {
            return false;
        }
        gzr gzr = (gzr) obj;
        return gzr.f16453c == this.f16453c && gzr.f16454d == this.f16454d && gzr.f16455e == this.f16455e;
    }

    public int hashCode() {
        return (((((this.f16453c + 1) ^ 1000003) * 1000003) ^ this.f16454d) * 1000003) ^ this.f16455e;
    }

    public String toString() {
        int i = this.f16453c;
        int i2 = this.f16454d;
        return "policy=" + i + " initial_backoff=" + i2 + " maximum_backoff=" + this.f16455e;
    }
}
