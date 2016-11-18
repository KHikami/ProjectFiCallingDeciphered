package p000;

public final class kli extends nyx<kli> {
    private static volatile kli[] f22165e;
    public klk f22166a;
    public String f22167b;
    public String f22168c;
    public String f22169d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26384b(nyt);
    }

    public static kli[] m26385d() {
        if (f22165e == null) {
            synchronized (nzc.c) {
                if (f22165e == null) {
                    f22165e = new kli[0];
                }
            }
        }
        return f22165e;
    }

    public kli() {
        m26386g();
    }

    private kli m26386g() {
        this.f22166a = null;
        this.f22167b = null;
        this.f22168c = null;
        this.f22169d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22166a != null) {
            nyu.b(1, this.f22166a);
        }
        if (this.f22167b != null) {
            nyu.a(2, this.f22167b);
        }
        if (this.f22168c != null) {
            nyu.a(3, this.f22168c);
        }
        if (this.f22169d != null) {
            nyu.a(4, this.f22169d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22166a != null) {
            b += nyu.d(1, this.f22166a);
        }
        if (this.f22167b != null) {
            b += nyu.b(2, this.f22167b);
        }
        if (this.f22168c != null) {
            b += nyu.b(3, this.f22168c);
        }
        if (this.f22169d != null) {
            return b + nyu.b(4, this.f22169d);
        }
        return b;
    }

    private kli m26384b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22166a == null) {
                        this.f22166a = new klk();
                    }
                    nyt.a(this.f22166a);
                    continue;
                case wi.dH /*18*/:
                    this.f22167b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22168c = nyt.j();
                    continue;
                case 34:
                    this.f22169d = nyt.j();
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
