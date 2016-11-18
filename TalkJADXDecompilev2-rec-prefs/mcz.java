package p000;

public final class mcz extends nyx<mcz> {
    public Integer f27419a;
    public Integer f27420b;
    public Integer f27421c;
    public Integer f27422d;
    public Integer f27423e;
    public Integer f27424f;
    public Integer f27425g;
    public Integer f27426h;
    public Integer f27427i;
    public Integer f27428j;
    public Integer f27429k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31794b(nyt);
    }

    public mcz() {
        m31795d();
    }

    private mcz m31795d() {
        this.f27419a = null;
        this.f27420b = null;
        this.f27421c = null;
        this.f27422d = null;
        this.f27423e = null;
        this.f27424f = null;
        this.f27425g = null;
        this.f27426h = null;
        this.f27427i = null;
        this.f27428j = null;
        this.f27429k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27419a != null) {
            nyu.a(1, this.f27419a.intValue());
        }
        if (this.f27420b != null) {
            nyu.a(2, this.f27420b.intValue());
        }
        if (this.f27421c != null) {
            nyu.a(3, this.f27421c.intValue());
        }
        if (this.f27422d != null) {
            nyu.a(4, this.f27422d.intValue());
        }
        if (this.f27423e != null) {
            nyu.a(5, this.f27423e.intValue());
        }
        if (this.f27424f != null) {
            nyu.a(6, this.f27424f.intValue());
        }
        if (this.f27425g != null) {
            nyu.a(7, this.f27425g.intValue());
        }
        if (this.f27426h != null) {
            nyu.a(8, this.f27426h.intValue());
        }
        if (this.f27427i != null) {
            nyu.a(9, this.f27427i.intValue());
        }
        if (this.f27428j != null) {
            nyu.a(10, this.f27428j.intValue());
        }
        if (this.f27429k != null) {
            nyu.a(11, this.f27429k.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27419a != null) {
            b += nyu.f(1, this.f27419a.intValue());
        }
        if (this.f27420b != null) {
            b += nyu.f(2, this.f27420b.intValue());
        }
        if (this.f27421c != null) {
            b += nyu.f(3, this.f27421c.intValue());
        }
        if (this.f27422d != null) {
            b += nyu.f(4, this.f27422d.intValue());
        }
        if (this.f27423e != null) {
            b += nyu.f(5, this.f27423e.intValue());
        }
        if (this.f27424f != null) {
            b += nyu.f(6, this.f27424f.intValue());
        }
        if (this.f27425g != null) {
            b += nyu.f(7, this.f27425g.intValue());
        }
        if (this.f27426h != null) {
            b += nyu.f(8, this.f27426h.intValue());
        }
        if (this.f27427i != null) {
            b += nyu.f(9, this.f27427i.intValue());
        }
        if (this.f27428j != null) {
            b += nyu.f(10, this.f27428j.intValue());
        }
        if (this.f27429k != null) {
            return b + nyu.f(11, this.f27429k.intValue());
        }
        return b;
    }

    private mcz m31794b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27419a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27420b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27421c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f27422d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f27423e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f27424f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f27425g = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    this.f27426h = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    this.f27427i = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.f27428j = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.f27429k = Integer.valueOf(nyt.f());
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
