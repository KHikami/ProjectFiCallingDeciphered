package p000;

public class nwh<T extends nwh<T>> implements Comparable<T> {
    final nwx<?> f28712a;
    final int f28713b;
    final nyi f28714c;
    final boolean f28715d = false;
    final boolean f28716e = false;

    public int m33419a() {
        return this.f28713b;
    }

    public nyi m33422b() {
        return this.f28714c;
    }

    public nyn m33423c() {
        return this.f28714c.a();
    }

    public boolean m33424d() {
        return this.f28715d;
    }

    public boolean m33425e() {
        return this.f28716e;
    }

    public nxj m33421a(nxj nxj, nxi nxi) {
        return ((nwk) nxj).b((nwi) nxi);
    }

    public nxl m33426f() {
        throw new UnsupportedOperationException();
    }

    public nwh(nwx<?> nwx_, int i, nyi nyi, boolean z, boolean z2) {
        this.f28712a = nwx_;
        this.f28713b = i;
        this.f28714c = nyi;
    }

    public nwx<?> m33427g() {
        return this.f28712a;
    }

    public int m33420a(nwh nwh) {
        return this.f28713b - nwh.f28713b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m33420a((nwh) obj);
    }
}
