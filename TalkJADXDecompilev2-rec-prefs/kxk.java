package p000;

public final class kxk extends nyx<kxk> {
    private static volatile kxk[] f23850c;
    public String f23851a;
    public String f23852b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27930b(nyt);
    }

    public static kxk[] m27931d() {
        if (f23850c == null) {
            synchronized (nzc.c) {
                if (f23850c == null) {
                    f23850c = new kxk[0];
                }
            }
        }
        return f23850c;
    }

    public kxk() {
        this.f23851a = null;
        this.f23852b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23851a != null) {
            nyu.a(1, this.f23851a);
        }
        if (this.f23852b != null) {
            nyu.a(2, this.f23852b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23851a != null) {
            b += nyu.b(1, this.f23851a);
        }
        if (this.f23852b != null) {
            return b + nyu.b(2, this.f23852b);
        }
        return b;
    }

    private kxk m27930b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23851a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23852b = nyt.j();
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
