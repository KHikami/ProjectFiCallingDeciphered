package p000;

import com.google.android.gms.common.data.DataHolder;

public class gve {
    public final DataHolder f16206a;
    public int f16207b;
    private int f16208c;

    public gve(DataHolder dataHolder, int i) {
        this.f16206a = (DataHolder) gwb.m1419L((Object) dataHolder);
        m18665a(i);
    }

    public int m18664a(String str) {
        return this.f16206a.m9674a(str, this.f16207b, this.f16208c);
    }

    protected void m18665a(int i) {
        boolean z = i >= 0 && i < this.f16206a.m9684g();
        gwb.m1885a(z);
        this.f16207b = i;
        this.f16208c = this.f16206a.m9673a(this.f16207b);
    }

    public String m18666b(String str) {
        return this.f16206a.m9678b(str, this.f16207b, this.f16208c);
    }

    public byte[] m18667c(String str) {
        return this.f16206a.m9679c(str, this.f16207b, this.f16208c);
    }

    public boolean mo1287e() {
        return !this.f16206a.m9685h();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gve)) {
            return false;
        }
        gve gve = (gve) obj;
        return gwb.m2186e(Integer.valueOf(gve.f16207b), Integer.valueOf(this.f16207b)) && gwb.m2186e(Integer.valueOf(gve.f16208c), Integer.valueOf(this.f16208c)) && gve.f16206a == this.f16206a;
    }

    public int hashCode() {
        return gwb.m1517a(Integer.valueOf(this.f16207b), Integer.valueOf(this.f16208c), this.f16206a);
    }
}
