package p000;

public final class kzb extends nyx<kzb> {
    private static volatile kzb[] f24179c;
    public String f24180a;
    public String f24181b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28190b(nyt);
    }

    public static kzb[] m28191d() {
        if (f24179c == null) {
            synchronized (nzc.c) {
                if (f24179c == null) {
                    f24179c = new kzb[0];
                }
            }
        }
        return f24179c;
    }

    public kzb() {
        m28192g();
    }

    private kzb m28192g() {
        this.f24180a = null;
        this.f24181b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24180a != null) {
            nyu.a(1, this.f24180a);
        }
        if (this.f24181b != null) {
            nyu.a(2, this.f24181b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24180a != null) {
            b += nyu.b(1, this.f24180a);
        }
        if (this.f24181b != null) {
            return b + nyu.b(2, this.f24181b);
        }
        return b;
    }

    private kzb m28190b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24180a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24181b = nyt.j();
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
