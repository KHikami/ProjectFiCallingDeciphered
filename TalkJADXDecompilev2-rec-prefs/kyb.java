package p000;

public final class kyb extends nyx<kyb> {
    public Boolean f23990a;
    public Boolean f23991b;
    public Boolean f23992c;
    public Boolean f23993d;
    public Boolean f23994e;
    public Boolean f23995f;
    public Boolean f23996g;
    public Boolean f23997h;
    public Boolean f23998i;
    public Boolean f23999j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28028b(nyt);
    }

    public kyb() {
        m28029d();
    }

    private kyb m28029d() {
        this.f23990a = null;
        this.f23991b = null;
        this.f23992c = null;
        this.f23993d = null;
        this.f23994e = null;
        this.f23995f = null;
        this.f23996g = null;
        this.f23997h = null;
        this.f23998i = null;
        this.f23999j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23990a != null) {
            nyu.a(1, this.f23990a.booleanValue());
        }
        if (this.f23991b != null) {
            nyu.a(2, this.f23991b.booleanValue());
        }
        if (this.f23992c != null) {
            nyu.a(3, this.f23992c.booleanValue());
        }
        if (this.f23993d != null) {
            nyu.a(4, this.f23993d.booleanValue());
        }
        if (this.f23994e != null) {
            nyu.a(5, this.f23994e.booleanValue());
        }
        if (this.f23995f != null) {
            nyu.a(6, this.f23995f.booleanValue());
        }
        if (this.f23996g != null) {
            nyu.a(7, this.f23996g.booleanValue());
        }
        if (this.f23997h != null) {
            nyu.a(8, this.f23997h.booleanValue());
        }
        if (this.f23998i != null) {
            nyu.a(9, this.f23998i.booleanValue());
        }
        if (this.f23999j != null) {
            nyu.a(10, this.f23999j.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23990a != null) {
            this.f23990a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f23991b != null) {
            this.f23991b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23992c != null) {
            this.f23992c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f23993d != null) {
            this.f23993d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f23994e != null) {
            this.f23994e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f23995f != null) {
            this.f23995f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f23996g != null) {
            this.f23996g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f23997h != null) {
            this.f23997h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f23998i != null) {
            this.f23998i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f23999j == null) {
            return b;
        }
        this.f23999j.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private kyb m28028b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23990a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f23991b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f23992c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f23993d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f23994e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f23995f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f23996g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f23997h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.f23998i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f23999j = Boolean.valueOf(nyt.i());
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
