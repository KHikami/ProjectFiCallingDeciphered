package p000;

public final class leo extends nyx<leo> {
    private static volatile leo[] f24844e;
    public ldx f24845a;
    public Integer f24846b;
    public String f24847c;
    public Boolean f24848d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28898b(nyt);
    }

    public static leo[] m28899d() {
        if (f24844e == null) {
            synchronized (nzc.c) {
                if (f24844e == null) {
                    f24844e = new leo[0];
                }
            }
        }
        return f24844e;
    }

    public leo() {
        m28900g();
    }

    private leo m28900g() {
        this.f24845a = null;
        this.f24847c = null;
        this.f24848d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24846b != null) {
            nyu.a(1, this.f24846b.intValue());
        }
        if (this.f24847c != null) {
            nyu.a(2, this.f24847c);
        }
        if (this.f24845a != null) {
            nyu.b(3, this.f24845a);
        }
        if (this.f24848d != null) {
            nyu.a(4, this.f24848d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24846b != null) {
            b += nyu.f(1, this.f24846b.intValue());
        }
        if (this.f24847c != null) {
            b += nyu.b(2, this.f24847c);
        }
        if (this.f24845a != null) {
            b += nyu.d(3, this.f24845a);
        }
        if (this.f24848d == null) {
            return b;
        }
        this.f24848d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private leo m28898b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f24846b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24847c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24845a == null) {
                        this.f24845a = new ldx();
                    }
                    nyt.a(this.f24845a);
                    continue;
                case 32:
                    this.f24848d = Boolean.valueOf(nyt.i());
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
