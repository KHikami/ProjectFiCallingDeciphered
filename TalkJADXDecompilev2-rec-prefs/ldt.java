package p000;

public final class ldt extends nyx<ldt> {
    private static volatile ldt[] f24720d;
    public Integer f24721a;
    public ldu f24722b;
    public ogh f24723c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28786b(nyt);
    }

    public static ldt[] m28787d() {
        if (f24720d == null) {
            synchronized (nzc.c) {
                if (f24720d == null) {
                    f24720d = new ldt[0];
                }
            }
        }
        return f24720d;
    }

    public ldt() {
        m28788g();
    }

    private ldt m28788g() {
        this.f24722b = null;
        this.f24723c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24721a != null) {
            nyu.a(1, this.f24721a.intValue());
        }
        if (this.f24723c != null) {
            nyu.b(3, this.f24723c);
        }
        if (this.f24722b != null) {
            nyu.b(6, this.f24722b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24721a != null) {
            b += nyu.f(1, this.f24721a.intValue());
        }
        if (this.f24723c != null) {
            b += nyu.d(3, this.f24723c);
        }
        if (this.f24722b != null) {
            return b + nyu.d(6, this.f24722b);
        }
        return b;
    }

    private ldt m28786b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                            this.f24721a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f24723c == null) {
                        this.f24723c = new ogh();
                    }
                    nyt.a(this.f24723c);
                    continue;
                case 50:
                    if (this.f24722b == null) {
                        this.f24722b = new ldu();
                    }
                    nyt.a(this.f24722b);
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
