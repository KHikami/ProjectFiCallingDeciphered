package p000;

public final class lbb extends nyx<lbb> {
    public lbf f24449a;
    public lbl f24450b;
    public lbk f24451c;
    public lbi f24452d;
    public lbd f24453e;
    public lbc f24454f;
    public lbi f24455g;
    public lbh f24456h;
    public lbj f24457i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28436b(nyt);
    }

    public lbb() {
        m28437d();
    }

    private lbb m28437d() {
        this.f24449a = null;
        this.f24450b = null;
        this.f24451c = null;
        this.f24452d = null;
        this.f24453e = null;
        this.f24454f = null;
        this.f24455g = null;
        this.f24456h = null;
        this.f24457i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24449a != null) {
            nyu.b(1, this.f24449a);
        }
        if (this.f24450b != null) {
            nyu.b(2, this.f24450b);
        }
        if (this.f24451c != null) {
            nyu.b(3, this.f24451c);
        }
        if (this.f24452d != null) {
            nyu.b(4, this.f24452d);
        }
        if (this.f24453e != null) {
            nyu.b(5, this.f24453e);
        }
        if (this.f24455g != null) {
            nyu.b(6, this.f24455g);
        }
        if (this.f24456h != null) {
            nyu.b(7, this.f24456h);
        }
        if (this.f24457i != null) {
            nyu.b(9, this.f24457i);
        }
        if (this.f24454f != null) {
            nyu.b(10, this.f24454f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24449a != null) {
            b += nyu.d(1, this.f24449a);
        }
        if (this.f24450b != null) {
            b += nyu.d(2, this.f24450b);
        }
        if (this.f24451c != null) {
            b += nyu.d(3, this.f24451c);
        }
        if (this.f24452d != null) {
            b += nyu.d(4, this.f24452d);
        }
        if (this.f24453e != null) {
            b += nyu.d(5, this.f24453e);
        }
        if (this.f24455g != null) {
            b += nyu.d(6, this.f24455g);
        }
        if (this.f24456h != null) {
            b += nyu.d(7, this.f24456h);
        }
        if (this.f24457i != null) {
            b += nyu.d(9, this.f24457i);
        }
        if (this.f24454f != null) {
            return b + nyu.d(10, this.f24454f);
        }
        return b;
    }

    private lbb m28436b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24449a == null) {
                        this.f24449a = new lbf();
                    }
                    nyt.a(this.f24449a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24450b == null) {
                        this.f24450b = new lbl();
                    }
                    nyt.a(this.f24450b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f24451c == null) {
                        this.f24451c = new lbk();
                    }
                    nyt.a(this.f24451c);
                    continue;
                case 34:
                    if (this.f24452d == null) {
                        this.f24452d = new lbi();
                    }
                    nyt.a(this.f24452d);
                    continue;
                case 42:
                    if (this.f24453e == null) {
                        this.f24453e = new lbd();
                    }
                    nyt.a(this.f24453e);
                    continue;
                case 50:
                    if (this.f24455g == null) {
                        this.f24455g = new lbi();
                    }
                    nyt.a(this.f24455g);
                    continue;
                case 58:
                    if (this.f24456h == null) {
                        this.f24456h = new lbh();
                    }
                    nyt.a(this.f24456h);
                    continue;
                case 74:
                    if (this.f24457i == null) {
                        this.f24457i = new lbj();
                    }
                    nyt.a(this.f24457i);
                    continue;
                case 82:
                    if (this.f24454f == null) {
                        this.f24454f = new lbc();
                    }
                    nyt.a(this.f24454f);
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
