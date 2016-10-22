package defpackage;

import android.graphics.Bitmap.Config;

/* renamed from: ara */
final class ara implements aro {
    private final arb a;
    private int b;
    private int c;
    private Config d;

    public ara(arb arb) {
        this.a = arb;
    }

    public void a(int i, int i2, Config config) {
        this.b = i;
        this.c = i2;
        this.d = config;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ara)) {
            return false;
        }
        ara ara = (ara) obj;
        if (this.b == ara.b && this.c == ara.c && this.d == ara.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.d != null ? this.d.hashCode() : 0) + (((this.b * 31) + this.c) * 31);
    }

    public String toString() {
        return aqz.c(this.b, this.c, this.d);
    }

    public void a() {
        this.a.a(this);
    }
}
