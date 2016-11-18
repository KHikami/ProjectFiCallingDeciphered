package p000;

public final class kks extends nyx<kks> {
    private static volatile kks[] f22088d;
    public klk f22089a;
    public Integer f22090b;
    public Boolean f22091c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26291b(nyt);
    }

    public static kks[] m26292d() {
        if (f22088d == null) {
            synchronized (nzc.c) {
                if (f22088d == null) {
                    f22088d = new kks[0];
                }
            }
        }
        return f22088d;
    }

    public kks() {
        m26293g();
    }

    private kks m26293g() {
        this.f22089a = null;
        this.f22091c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22089a != null) {
            nyu.b(1, this.f22089a);
        }
        if (this.f22090b != null) {
            nyu.a(4, this.f22090b.intValue());
        }
        if (this.f22091c != null) {
            nyu.a(5, this.f22091c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22089a != null) {
            b += nyu.d(1, this.f22089a);
        }
        if (this.f22090b != null) {
            b += nyu.f(4, this.f22090b.intValue());
        }
        if (this.f22091c == null) {
            return b;
        }
        this.f22091c.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private kks m26291b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22089a == null) {
                        this.f22089a = new klk();
                    }
                    nyt.a(this.f22089a);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22090b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f22091c = Boolean.valueOf(nyt.i());
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
