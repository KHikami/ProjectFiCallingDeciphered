package p000;

public final class lzu extends nyx<lzu> {
    private static volatile lzu[] f27046e;
    public Integer f27047a;
    public String f27048b;
    public String f27049c;
    public Integer f27050d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31338b(nyt);
    }

    public static lzu[] m31339d() {
        if (f27046e == null) {
            synchronized (nzc.c) {
                if (f27046e == null) {
                    f27046e = new lzu[0];
                }
            }
        }
        return f27046e;
    }

    public lzu() {
        m31340g();
    }

    private lzu m31340g() {
        this.f27048b = null;
        this.f27049c = null;
        this.f27050d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27047a != null) {
            nyu.a(1, this.f27047a.intValue());
        }
        if (this.f27048b != null) {
            nyu.a(2, this.f27048b);
        }
        if (this.f27049c != null) {
            nyu.a(3, this.f27049c);
        }
        if (this.f27050d != null) {
            nyu.a(4, this.f27050d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27047a != null) {
            b += nyu.f(1, this.f27047a.intValue());
        }
        if (this.f27048b != null) {
            b += nyu.b(2, this.f27048b);
        }
        if (this.f27049c != null) {
            b += nyu.b(3, this.f27049c);
        }
        if (this.f27050d != null) {
            return b + nyu.f(4, this.f27050d.intValue());
        }
        return b;
    }

    private lzu m31338b(nyt nyt) {
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
                            this.f27047a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f27048b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27049c = nyt.j();
                    continue;
                case 32:
                    this.f27050d = Integer.valueOf(nyt.f());
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
