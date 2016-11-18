package defpackage;

import android.os.Bundle;

public final class gzr {
    public static final gzr a = new gzr(0, 30, 3600);
    public static final gzr b = new gzr(1, 30, 3600);
    private final int c;
    private final int d = 30;
    private final int e = 3600;

    private gzr(int i, int i2, int i3) {
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("retry_policy", this.c);
        bundle.putInt("initial_backoff_seconds", this.d);
        bundle.putInt("maximum_backoff_seconds", this.e);
        return bundle;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gzr)) {
            return false;
        }
        gzr gzr = (gzr) obj;
        return gzr.c == this.c && gzr.d == this.d && gzr.e == this.e;
    }

    public int hashCode() {
        return (((((this.c + 1) ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public String toString() {
        int i = this.c;
        int i2 = this.d;
        return "policy=" + i + " initial_backoff=" + i2 + " maximum_backoff=" + this.e;
    }
}
