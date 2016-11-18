package p000;

public final class lel extends nyx<lel> {
    private static volatile lel[] f24835d;
    public String f24836a;
    public Integer f24837b;
    public String f24838c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28881b(nyt);
    }

    public static lel[] m28882d() {
        if (f24835d == null) {
            synchronized (nzc.c) {
                if (f24835d == null) {
                    f24835d = new lel[0];
                }
            }
        }
        return f24835d;
    }

    public lel() {
        m28883g();
    }

    private lel m28883g() {
        this.f24836a = null;
        this.f24837b = null;
        this.f24838c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24836a != null) {
            nyu.a(1, this.f24836a);
        }
        if (this.f24837b != null) {
            nyu.a(2, this.f24837b.intValue());
        }
        if (this.f24838c != null) {
            nyu.a(3, this.f24838c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24836a != null) {
            b += nyu.b(1, this.f24836a);
        }
        if (this.f24837b != null) {
            b += nyu.f(2, this.f24837b.intValue());
        }
        if (this.f24838c != null) {
            return b + nyu.b(3, this.f24838c);
        }
        return b;
    }

    private lel m28881b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24836a = nyt.j();
                    continue;
                case 16:
                    this.f24837b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    this.f24838c = nyt.j();
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
