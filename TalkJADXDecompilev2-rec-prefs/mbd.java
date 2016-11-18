package p000;

public final class mbd extends nyx<mbd> {
    private static volatile mbd[] f27202d;
    public lwe f27203a;
    public mbp f27204b;
    public mbj f27205c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31545b(nyt);
    }

    public static mbd[] m31546d() {
        if (f27202d == null) {
            synchronized (nzc.c) {
                if (f27202d == null) {
                    f27202d = new mbd[0];
                }
            }
        }
        return f27202d;
    }

    public mbd() {
        m31547g();
    }

    private mbd m31547g() {
        this.f27203a = null;
        this.f27204b = null;
        this.f27205c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27203a != null) {
            nyu.b(1, this.f27203a);
        }
        if (this.f27204b != null) {
            nyu.b(2, this.f27204b);
        }
        if (this.f27205c != null) {
            nyu.b(3, this.f27205c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27203a != null) {
            b += nyu.d(1, this.f27203a);
        }
        if (this.f27204b != null) {
            b += nyu.d(2, this.f27204b);
        }
        if (this.f27205c != null) {
            return b + nyu.d(3, this.f27205c);
        }
        return b;
    }

    private mbd m31545b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27203a == null) {
                        this.f27203a = new lwe();
                    }
                    nyt.a(this.f27203a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27204b == null) {
                        this.f27204b = new mbp();
                    }
                    nyt.a(this.f27204b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27205c == null) {
                        this.f27205c = new mbj();
                    }
                    nyt.a(this.f27205c);
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
