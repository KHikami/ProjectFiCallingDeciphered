package p000;

public final class kjy extends nyx<kjy> {
    private static volatile kjy[] f22015d;
    public klk f22016a;
    public kjz f22017b;
    public String f22018c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26179b(nyt);
    }

    public static kjy[] m26180d() {
        if (f22015d == null) {
            synchronized (nzc.c) {
                if (f22015d == null) {
                    f22015d = new kjy[0];
                }
            }
        }
        return f22015d;
    }

    public kjy() {
        m26181g();
    }

    private kjy m26181g() {
        this.f22016a = null;
        this.f22017b = null;
        this.f22018c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22016a != null) {
            nyu.b(1, this.f22016a);
        }
        if (this.f22017b != null) {
            nyu.b(2, this.f22017b);
        }
        if (this.f22018c != null) {
            nyu.a(3, this.f22018c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22016a != null) {
            b += nyu.d(1, this.f22016a);
        }
        if (this.f22017b != null) {
            b += nyu.d(2, this.f22017b);
        }
        if (this.f22018c != null) {
            return b + nyu.b(3, this.f22018c);
        }
        return b;
    }

    private kjy m26179b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22016a == null) {
                        this.f22016a = new klk();
                    }
                    nyt.a(this.f22016a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22017b == null) {
                        this.f22017b = new kjz();
                    }
                    nyt.a(this.f22017b);
                    continue;
                case wi.dx /*26*/:
                    this.f22018c = nyt.j();
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
