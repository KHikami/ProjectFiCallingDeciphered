package p000;

public final class kof extends nyx<kof> {
    private static volatile kof[] f22482c;
    public String f22483a;
    public odr f22484b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26774b(nyt);
    }

    public static kof[] m26775d() {
        if (f22482c == null) {
            synchronized (nzc.c) {
                if (f22482c == null) {
                    f22482c = new kof[0];
                }
            }
        }
        return f22482c;
    }

    public kof() {
        this.f22483a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22483a != null) {
            nyu.a(1, this.f22483a);
        }
        if (this.f22484b != null) {
            nyu.b(2, this.f22484b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22483a != null) {
            b += nyu.b(1, this.f22483a);
        }
        if (this.f22484b != null) {
            return b + nyu.d(2, this.f22484b);
        }
        return b;
    }

    private kof m26774b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22483a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22484b == null) {
                        this.f22484b = new odr();
                    }
                    nyt.a(this.f22484b);
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
