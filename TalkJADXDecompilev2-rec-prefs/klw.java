package p000;

public final class klw extends nyx<klw> {
    private static volatile klw[] f22315c;
    public klk f22316a;
    public String f22317b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26464b(nyt);
    }

    public static klw[] m26465d() {
        if (f22315c == null) {
            synchronized (nzc.c) {
                if (f22315c == null) {
                    f22315c = new klw[0];
                }
            }
        }
        return f22315c;
    }

    public klw() {
        m26466g();
    }

    private klw m26466g() {
        this.f22316a = null;
        this.f22317b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22316a != null) {
            nyu.b(1, this.f22316a);
        }
        if (this.f22317b != null) {
            nyu.a(2, this.f22317b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22316a != null) {
            b += nyu.d(1, this.f22316a);
        }
        if (this.f22317b != null) {
            return b + nyu.b(2, this.f22317b);
        }
        return b;
    }

    private klw m26464b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22316a == null) {
                        this.f22316a = new klk();
                    }
                    nyt.a(this.f22316a);
                    continue;
                case wi.dH /*18*/:
                    this.f22317b = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
