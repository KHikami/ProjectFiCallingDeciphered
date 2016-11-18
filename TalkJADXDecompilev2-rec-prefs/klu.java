package p000;

public final class klu extends nyx<klu> {
    private static volatile klu[] f22306d;
    public klk f22307a;
    public String f22308b;
    public String f22309c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26452b(nyt);
    }

    public static klu[] m26453d() {
        if (f22306d == null) {
            synchronized (nzc.c) {
                if (f22306d == null) {
                    f22306d = new klu[0];
                }
            }
        }
        return f22306d;
    }

    public klu() {
        m26454g();
    }

    private klu m26454g() {
        this.f22307a = null;
        this.f22308b = null;
        this.f22309c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22307a != null) {
            nyu.b(1, this.f22307a);
        }
        if (this.f22308b != null) {
            nyu.a(2, this.f22308b);
        }
        if (this.f22309c != null) {
            nyu.a(3, this.f22309c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22307a != null) {
            b += nyu.d(1, this.f22307a);
        }
        if (this.f22308b != null) {
            b += nyu.b(2, this.f22308b);
        }
        if (this.f22309c != null) {
            return b + nyu.b(3, this.f22309c);
        }
        return b;
    }

    private klu m26452b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22307a == null) {
                        this.f22307a = new klk();
                    }
                    nyt.a(this.f22307a);
                    continue;
                case wi.dH /*18*/:
                    this.f22308b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22309c = nyt.j();
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
