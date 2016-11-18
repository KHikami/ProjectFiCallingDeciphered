package p000;

public final class lev extends nyx<lev> {
    private static volatile lev[] f24869c;
    public String f24870a;
    public String f24871b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28932b(nyt);
    }

    public static lev[] m28933d() {
        if (f24869c == null) {
            synchronized (nzc.c) {
                if (f24869c == null) {
                    f24869c = new lev[0];
                }
            }
        }
        return f24869c;
    }

    public lev() {
        this.f24870a = null;
        this.f24871b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24870a != null) {
            nyu.a(1, this.f24870a);
        }
        if (this.f24871b != null) {
            nyu.a(2, this.f24871b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24870a != null) {
            b += nyu.b(1, this.f24870a);
        }
        if (this.f24871b != null) {
            return b + nyu.b(2, this.f24871b);
        }
        return b;
    }

    private lev m28932b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24870a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24871b = nyt.j();
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
