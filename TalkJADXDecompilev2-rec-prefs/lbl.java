package p000;

public final class lbl extends nyx<lbl> {
    public Boolean f24483a;
    public ldm f24484b;
    public ldm f24485c;
    public ldm f24486d;
    public lbe f24487e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28486b(nyt);
    }

    public lbl() {
        m28487d();
    }

    private lbl m28487d() {
        this.f24483a = null;
        this.f24484b = null;
        this.f24485c = null;
        this.f24486d = null;
        this.f24487e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24483a != null) {
            nyu.a(5, this.f24483a.booleanValue());
        }
        if (this.f24484b != null) {
            nyu.b(6, this.f24484b);
        }
        if (this.f24485c != null) {
            nyu.b(7, this.f24485c);
        }
        if (this.f24486d != null) {
            nyu.b(8, this.f24486d);
        }
        if (this.f24487e != null) {
            nyu.b(9, this.f24487e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24483a != null) {
            this.f24483a.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24484b != null) {
            b += nyu.d(6, this.f24484b);
        }
        if (this.f24485c != null) {
            b += nyu.d(7, this.f24485c);
        }
        if (this.f24486d != null) {
            b += nyu.d(8, this.f24486d);
        }
        if (this.f24487e != null) {
            return b + nyu.d(9, this.f24487e);
        }
        return b;
    }

    private lbl m28486b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f24483a = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f24484b == null) {
                        this.f24484b = new ldm();
                    }
                    nyt.a(this.f24484b);
                    continue;
                case 58:
                    if (this.f24485c == null) {
                        this.f24485c = new ldm();
                    }
                    nyt.a(this.f24485c);
                    continue;
                case 66:
                    if (this.f24486d == null) {
                        this.f24486d = new ldm();
                    }
                    nyt.a(this.f24486d);
                    continue;
                case 74:
                    if (this.f24487e == null) {
                        this.f24487e = new lbe();
                    }
                    nyt.a(this.f24487e);
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
