package p000;

public final class klt extends nyx<klt> {
    private static volatile klt[] f22302d;
    public klk f22303a;
    public String f22304b;
    public String f22305c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26446b(nyt);
    }

    public static klt[] m26447d() {
        if (f22302d == null) {
            synchronized (nzc.c) {
                if (f22302d == null) {
                    f22302d = new klt[0];
                }
            }
        }
        return f22302d;
    }

    public klt() {
        m26448g();
    }

    private klt m26448g() {
        this.f22303a = null;
        this.f22304b = null;
        this.f22305c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22303a != null) {
            nyu.b(1, this.f22303a);
        }
        if (this.f22304b != null) {
            nyu.a(2, this.f22304b);
        }
        if (this.f22305c != null) {
            nyu.a(3, this.f22305c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22303a != null) {
            b += nyu.d(1, this.f22303a);
        }
        if (this.f22304b != null) {
            b += nyu.b(2, this.f22304b);
        }
        if (this.f22305c != null) {
            return b + nyu.b(3, this.f22305c);
        }
        return b;
    }

    private klt m26446b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22303a == null) {
                        this.f22303a = new klk();
                    }
                    nyt.a(this.f22303a);
                    continue;
                case wi.dH /*18*/:
                    this.f22304b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22305c = nyt.j();
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
