package p000;

import android.graphics.Bitmap.Config;

final class ara implements aro {
    private final arb f2205a;
    private int f2206b;
    private int f2207c;
    private Config f2208d;

    public ara(arb arb) {
        this.f2205a = arb;
    }

    public void m3819a(int i, int i2, Config config) {
        this.f2206b = i;
        this.f2207c = i2;
        this.f2208d = config;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ara)) {
            return false;
        }
        ara ara = (ara) obj;
        if (this.f2206b == ara.f2206b && this.f2207c == ara.f2207c && this.f2208d == ara.f2208d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2208d != null ? this.f2208d.hashCode() : 0) + (((this.f2206b * 31) + this.f2207c) * 31);
    }

    public String toString() {
        return aqz.m3799c(this.f2206b, this.f2207c, this.f2208d);
    }

    public void mo356a() {
        this.f2205a.m3821a(this);
    }
}
