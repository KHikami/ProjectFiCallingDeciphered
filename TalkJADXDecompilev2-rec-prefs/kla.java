package p000;

public final class kla extends nyx<kla> {
    private static volatile kla[] f22111e;
    public String f22112a;
    public String f22113b;
    public klk f22114c;
    public Integer f22115d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26338b(nyt);
    }

    public static kla[] m26339d() {
        if (f22111e == null) {
            synchronized (nzc.c) {
                if (f22111e == null) {
                    f22111e = new kla[0];
                }
            }
        }
        return f22111e;
    }

    public kla() {
        m26340g();
    }

    private kla m26340g() {
        this.f22112a = null;
        this.f22113b = null;
        this.f22114c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22114c != null) {
            nyu.b(1, this.f22114c);
        }
        if (this.f22112a != null) {
            nyu.a(2, this.f22112a);
        }
        if (this.f22113b != null) {
            nyu.a(3, this.f22113b);
        }
        if (this.f22115d != null) {
            nyu.a(4, this.f22115d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22114c != null) {
            b += nyu.d(1, this.f22114c);
        }
        if (this.f22112a != null) {
            b += nyu.b(2, this.f22112a);
        }
        if (this.f22113b != null) {
            b += nyu.b(3, this.f22113b);
        }
        if (this.f22115d != null) {
            return b + nyu.f(4, this.f22115d.intValue());
        }
        return b;
    }

    private kla m26338b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22114c == null) {
                        this.f22114c = new klk();
                    }
                    nyt.a(this.f22114c);
                    continue;
                case wi.dH /*18*/:
                    this.f22112a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22113b = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f22115d = Integer.valueOf(a);
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
