package p000;

public final class kyn extends nyx<kyn> {
    private static volatile kyn[] f24089e;
    public String f24090a;
    public String f24091b;
    public Integer f24092c;
    public Integer f24093d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28092b(nyt);
    }

    public static kyn[] m28093d() {
        if (f24089e == null) {
            synchronized (nzc.c) {
                if (f24089e == null) {
                    f24089e = new kyn[0];
                }
            }
        }
        return f24089e;
    }

    public kyn() {
        m28094g();
    }

    private kyn m28094g() {
        this.f24090a = null;
        this.f24091b = null;
        this.f24092c = null;
        this.f24093d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24090a != null) {
            nyu.a(1, this.f24090a);
        }
        if (this.f24091b != null) {
            nyu.a(2, this.f24091b);
        }
        if (this.f24092c != null) {
            nyu.a(3, this.f24092c.intValue());
        }
        if (this.f24093d != null) {
            nyu.a(4, this.f24093d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24090a != null) {
            b += nyu.b(1, this.f24090a);
        }
        if (this.f24091b != null) {
            b += nyu.b(2, this.f24091b);
        }
        if (this.f24092c != null) {
            b += nyu.f(3, this.f24092c.intValue());
        }
        if (this.f24093d != null) {
            return b + nyu.f(4, this.f24093d.intValue());
        }
        return b;
    }

    private kyn m28092b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24090a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24091b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24092c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f24093d = Integer.valueOf(nyt.f());
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
