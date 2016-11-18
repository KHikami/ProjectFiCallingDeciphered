package p000;

public final class koy extends nyx<koy> {
    public kqd f22592a;
    public String f22593b;
    public Boolean f22594c;
    public Integer f22595d;
    public Integer f22596e;
    public Integer f22597f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26856b(nyt);
    }

    public koy() {
        m26857d();
    }

    private koy m26857d() {
        this.f22592a = null;
        this.f22593b = null;
        this.f22594c = null;
        this.f22595d = null;
        this.f22596e = null;
        this.f22597f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22592a != null) {
            nyu.b(1, this.f22592a);
        }
        if (this.f22593b != null) {
            nyu.a(2, this.f22593b);
        }
        if (this.f22594c != null) {
            nyu.a(3, this.f22594c.booleanValue());
        }
        if (this.f22595d != null) {
            nyu.a(4, this.f22595d.intValue());
        }
        if (this.f22596e != null) {
            nyu.a(5, this.f22596e.intValue());
        }
        if (this.f22597f != null) {
            nyu.a(6, this.f22597f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22592a != null) {
            b += nyu.d(1, this.f22592a);
        }
        if (this.f22593b != null) {
            b += nyu.b(2, this.f22593b);
        }
        if (this.f22594c != null) {
            this.f22594c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22595d != null) {
            b += nyu.f(4, this.f22595d.intValue());
        }
        if (this.f22596e != null) {
            b += nyu.f(5, this.f22596e.intValue());
        }
        if (this.f22597f != null) {
            return b + nyu.f(6, this.f22597f.intValue());
        }
        return b;
    }

    private koy m26856b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22592a == null) {
                        this.f22592a = new kqd();
                    }
                    nyt.a(this.f22592a);
                    continue;
                case wi.dH /*18*/:
                    this.f22593b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22594c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22595d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f22596e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f22597f = Integer.valueOf(nyt.f());
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
