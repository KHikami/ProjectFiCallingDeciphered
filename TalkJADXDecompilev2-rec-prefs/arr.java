package p000;

import android.graphics.Bitmap.Config;

final class arr implements aro {
    int f2238a;
    private final ars f2239b;
    private Config f2240c;

    public arr(ars ars) {
        this.f2239b = ars;
    }

    public void m3878a(int i, Config config) {
        this.f2238a = i;
        this.f2240c = config;
    }

    public void mo356a() {
        this.f2239b.m3821a(this);
    }

    public String toString() {
        return arp.m3868a(this.f2238a, this.f2240c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arr)) {
            return false;
        }
        arr arr = (arr) obj;
        if (this.f2238a == arr.f2238a && baq.m4687a(this.f2240c, arr.f2240c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2240c != null ? this.f2240c.hashCode() : 0) + (this.f2238a * 31);
    }
}
