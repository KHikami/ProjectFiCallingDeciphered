package p000;

public final class lbv extends nyx<lbv> {
    public Boolean f24517a;
    public laa f24518b;
    public laa f24519c;
    public laa f24520d;
    public lbp f24521e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28527b(nyt);
    }

    public lbv() {
        this.f24517a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24517a != null) {
            nyu.a(5, this.f24517a.booleanValue());
        }
        if (this.f24518b != null) {
            nyu.b(6, this.f24518b);
        }
        if (this.f24519c != null) {
            nyu.b(7, this.f24519c);
        }
        if (this.f24520d != null) {
            nyu.b(8, this.f24520d);
        }
        if (this.f24521e != null) {
            nyu.b(9, this.f24521e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24517a != null) {
            this.f24517a.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24518b != null) {
            b += nyu.d(6, this.f24518b);
        }
        if (this.f24519c != null) {
            b += nyu.d(7, this.f24519c);
        }
        if (this.f24520d != null) {
            b += nyu.d(8, this.f24520d);
        }
        if (this.f24521e != null) {
            return b + nyu.d(9, this.f24521e);
        }
        return b;
    }

    private lbv m28527b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f24517a = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f24518b == null) {
                        this.f24518b = new laa();
                    }
                    nyt.a(this.f24518b);
                    continue;
                case 58:
                    if (this.f24519c == null) {
                        this.f24519c = new laa();
                    }
                    nyt.a(this.f24519c);
                    continue;
                case 66:
                    if (this.f24520d == null) {
                        this.f24520d = new laa();
                    }
                    nyt.a(this.f24520d);
                    continue;
                case 74:
                    if (this.f24521e == null) {
                        this.f24521e = new lbp();
                    }
                    nyt.a(this.f24521e);
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
