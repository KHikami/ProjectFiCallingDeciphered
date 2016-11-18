package p000;

public final class laq extends nyx<laq> {
    private static volatile laq[] f24407c;
    public String f24408a;
    public String f24409b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28390b(nyt);
    }

    public static laq[] m28391d() {
        if (f24407c == null) {
            synchronized (nzc.c) {
                if (f24407c == null) {
                    f24407c = new laq[0];
                }
            }
        }
        return f24407c;
    }

    public laq() {
        m28392g();
    }

    private laq m28392g() {
        this.f24408a = null;
        this.f24409b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24408a != null) {
            nyu.a(1, this.f24408a);
        }
        if (this.f24409b != null) {
            nyu.a(2, this.f24409b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24408a != null) {
            b += nyu.b(1, this.f24408a);
        }
        if (this.f24409b != null) {
            return b + nyu.b(2, this.f24409b);
        }
        return b;
    }

    private laq m28390b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24408a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24409b = nyt.j();
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
