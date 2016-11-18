package p000;

public final class lbw extends nyx<lbw> {
    public Boolean f24522a;
    public laa f24523b;
    public laa f24524c;
    public laa f24525d;
    public lbp f24526e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28531b(nyt);
    }

    public lbw() {
        this.f24522a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24522a != null) {
            nyu.a(5, this.f24522a.booleanValue());
        }
        if (this.f24523b != null) {
            nyu.b(6, this.f24523b);
        }
        if (this.f24524c != null) {
            nyu.b(7, this.f24524c);
        }
        if (this.f24525d != null) {
            nyu.b(8, this.f24525d);
        }
        if (this.f24526e != null) {
            nyu.b(9, this.f24526e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24522a != null) {
            this.f24522a.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24523b != null) {
            b += nyu.d(6, this.f24523b);
        }
        if (this.f24524c != null) {
            b += nyu.d(7, this.f24524c);
        }
        if (this.f24525d != null) {
            b += nyu.d(8, this.f24525d);
        }
        if (this.f24526e != null) {
            return b + nyu.d(9, this.f24526e);
        }
        return b;
    }

    private lbw m28531b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f24522a = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f24523b == null) {
                        this.f24523b = new laa();
                    }
                    nyt.a(this.f24523b);
                    continue;
                case 58:
                    if (this.f24524c == null) {
                        this.f24524c = new laa();
                    }
                    nyt.a(this.f24524c);
                    continue;
                case 66:
                    if (this.f24525d == null) {
                        this.f24525d = new laa();
                    }
                    nyt.a(this.f24525d);
                    continue;
                case 74:
                    if (this.f24526e == null) {
                        this.f24526e = new lbp();
                    }
                    nyt.a(this.f24526e);
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
