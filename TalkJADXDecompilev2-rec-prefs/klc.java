package p000;

public final class klc extends nyx<klc> {
    private static volatile klc[] f22132d;
    public klk f22133a;
    public String f22134b;
    public Integer f22135c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26350b(nyt);
    }

    public static klc[] m26351d() {
        if (f22132d == null) {
            synchronized (nzc.c) {
                if (f22132d == null) {
                    f22132d = new klc[0];
                }
            }
        }
        return f22132d;
    }

    public klc() {
        m26352g();
    }

    private klc m26352g() {
        this.f22133a = null;
        this.f22134b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22133a != null) {
            nyu.b(1, this.f22133a);
        }
        if (this.f22134b != null) {
            nyu.a(2, this.f22134b);
        }
        if (this.f22135c != null) {
            nyu.a(3, this.f22135c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22133a != null) {
            b += nyu.d(1, this.f22133a);
        }
        if (this.f22134b != null) {
            b += nyu.b(2, this.f22134b);
        }
        if (this.f22135c != null) {
            return b + nyu.f(3, this.f22135c.intValue());
        }
        return b;
    }

    private klc m26350b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22133a == null) {
                        this.f22133a = new klk();
                    }
                    nyt.a(this.f22133a);
                    continue;
                case wi.dH /*18*/:
                    this.f22134b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22135c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
