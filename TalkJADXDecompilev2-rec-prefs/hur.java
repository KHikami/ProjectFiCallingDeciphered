package p000;

import com.google.android.gms.common.data.DataHolder;

public final class hur {
    public final DataHolder f17337a;
    private final int f17338b;
    private int f17339c = -1;

    public hur(DataHolder dataHolder) {
        this.f17337a = dataHolder;
        this.f17338b = dataHolder.m9684g();
    }

    public int m20890a() {
        return this.f17338b;
    }

    public String m20891a(String str) {
        return this.f17337a.m9678b(str, this.f17339c, this.f17337a.m9673a(this.f17339c));
    }

    public void m20892a(int i) {
        this.f17339c = i;
    }

    public int m20893b() {
        return this.f17339c;
    }

    public boolean m20894c() {
        this.f17339c++;
        return this.f17339c >= 0 && this.f17339c < this.f17338b;
    }

    public boolean m20895d() {
        return this.f17339c >= this.f17338b;
    }
}
