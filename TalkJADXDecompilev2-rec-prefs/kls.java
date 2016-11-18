package p000;

public final class kls extends nyx<kls> {
    private static volatile kls[] f22297e;
    public klk f22298a;
    public String f22299b;
    public String f22300c;
    public String f22301d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26440b(nyt);
    }

    public static kls[] m26441d() {
        if (f22297e == null) {
            synchronized (nzc.c) {
                if (f22297e == null) {
                    f22297e = new kls[0];
                }
            }
        }
        return f22297e;
    }

    public kls() {
        m26442g();
    }

    private kls m26442g() {
        this.f22298a = null;
        this.f22299b = null;
        this.f22300c = null;
        this.f22301d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22298a != null) {
            nyu.b(1, this.f22298a);
        }
        if (this.f22299b != null) {
            nyu.a(2, this.f22299b);
        }
        if (this.f22301d != null) {
            nyu.a(3, this.f22301d);
        }
        if (this.f22300c != null) {
            nyu.a(4, this.f22300c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22298a != null) {
            b += nyu.d(1, this.f22298a);
        }
        if (this.f22299b != null) {
            b += nyu.b(2, this.f22299b);
        }
        if (this.f22301d != null) {
            b += nyu.b(3, this.f22301d);
        }
        if (this.f22300c != null) {
            return b + nyu.b(4, this.f22300c);
        }
        return b;
    }

    private kls m26440b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22298a == null) {
                        this.f22298a = new klk();
                    }
                    nyt.a(this.f22298a);
                    continue;
                case wi.dH /*18*/:
                    this.f22299b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22301d = nyt.j();
                    continue;
                case 34:
                    this.f22300c = nyt.j();
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
