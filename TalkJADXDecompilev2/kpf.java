package defpackage;

public final class kpf extends nyx<kpf> {
    public kqe a;
    public kqg b;
    public kpj c;
    public kqx d;
    public kqx e;
    public String f;
    public Boolean g;
    public kpx h;
    public kqq i;
    public kqo j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kpf() {
        d();
    }

    private kpf d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.h != null) {
            nyu.b(6, this.h);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.b(8, this.j);
        }
        if (this.a != null) {
            nyu.b(9, this.a);
        }
        if (this.g != null) {
            nyu.a(10, this.g.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.h != null) {
            b += nyu.d(6, this.h);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            b += nyu.d(8, this.j);
        }
        if (this.a != null) {
            b += nyu.d(9, this.a);
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private kpf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new kqg();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new kpj();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new kqx();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new kqx();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    if (this.h == null) {
                        this.h = new kpx();
                    }
                    nyt.a(this.h);
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new kqq();
                    }
                    nyt.a(this.i);
                    continue;
                case 66:
                    if (this.j == null) {
                        this.j = new kqo();
                    }
                    nyt.a(this.j);
                    continue;
                case 74:
                    if (this.a == null) {
                        this.a = new kqe();
                    }
                    nyt.a(this.a);
                    continue;
                case 80:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
