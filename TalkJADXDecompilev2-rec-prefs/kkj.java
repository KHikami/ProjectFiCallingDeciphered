package p000;

public final class kkj extends nyx<kkj> {
    public String f22050a;
    public String f22051b;
    public String f22052c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26240b(nyt);
    }

    public kkj() {
        m26241d();
    }

    private kkj m26241d() {
        this.f22050a = null;
        this.f22051b = null;
        this.f22052c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22050a != null) {
            nyu.a(1, this.f22050a);
        }
        if (this.f22051b != null) {
            nyu.a(2, this.f22051b);
        }
        if (this.f22052c != null) {
            nyu.a(3, this.f22052c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22050a != null) {
            b += nyu.b(1, this.f22050a);
        }
        if (this.f22051b != null) {
            b += nyu.b(2, this.f22051b);
        }
        if (this.f22052c != null) {
            return b + nyu.b(3, this.f22052c);
        }
        return b;
    }

    private kkj m26240b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22050a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22051b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22052c = nyt.j();
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
