package p000;

public final class lxy extends nyx<lxy> {
    private static volatile lxy[] f26820k;
    public String f26821a;
    public Long f26822b;
    public Integer f26823c;
    public Long f26824d;
    public Long f26825e;
    public Long f26826f;
    public String f26827g;
    public String f26828h;
    public lxz[] f26829i;
    public String f26830j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31076b(nyt);
    }

    public static lxy[] m31077d() {
        if (f26820k == null) {
            synchronized (nzc.c) {
                if (f26820k == null) {
                    f26820k = new lxy[0];
                }
            }
        }
        return f26820k;
    }

    public lxy() {
        m31078g();
    }

    private lxy m31078g() {
        this.f26821a = null;
        this.f26822b = null;
        this.f26824d = null;
        this.f26825e = null;
        this.f26826f = null;
        this.f26827g = null;
        this.f26828h = null;
        this.f26829i = lxz.m31083d();
        this.f26830j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26821a != null) {
            nyu.a(1, this.f26821a);
        }
        if (this.f26822b != null) {
            nyu.b(2, this.f26822b.longValue());
        }
        if (this.f26823c != null) {
            nyu.a(4, this.f26823c.intValue());
        }
        if (this.f26824d != null) {
            nyu.b(5, this.f26824d.longValue());
        }
        if (this.f26825e != null) {
            nyu.b(6, this.f26825e.longValue());
        }
        if (this.f26826f != null) {
            nyu.b(7, this.f26826f.longValue());
        }
        if (this.f26827g != null) {
            nyu.a(8, this.f26827g);
        }
        if (this.f26828h != null) {
            nyu.a(9, this.f26828h);
        }
        if (this.f26829i != null && this.f26829i.length > 0) {
            for (nzf nzf : this.f26829i) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.f26830j != null) {
            nyu.a(11, this.f26830j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26821a != null) {
            b += nyu.b(1, this.f26821a);
        }
        if (this.f26822b != null) {
            b += nyu.f(2, this.f26822b.longValue());
        }
        if (this.f26823c != null) {
            b += nyu.f(4, this.f26823c.intValue());
        }
        if (this.f26824d != null) {
            b += nyu.f(5, this.f26824d.longValue());
        }
        if (this.f26825e != null) {
            b += nyu.f(6, this.f26825e.longValue());
        }
        if (this.f26826f != null) {
            b += nyu.f(7, this.f26826f.longValue());
        }
        if (this.f26827g != null) {
            b += nyu.b(8, this.f26827g);
        }
        if (this.f26828h != null) {
            b += nyu.b(9, this.f26828h);
        }
        if (this.f26829i != null && this.f26829i.length > 0) {
            int i = b;
            for (nzf nzf : this.f26829i) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f26830j != null) {
            return b + nyu.b(11, this.f26830j);
        }
        return b;
    }

    private lxy m31076b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26821a = nyt.j();
                    continue;
                case 16:
                    this.f26822b = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26823c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f26824d = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f26825e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f26826f = Long.valueOf(nyt.e());
                    continue;
                case 66:
                    this.f26827g = nyt.j();
                    continue;
                case 74:
                    this.f26828h = nyt.j();
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.f26829i == null) {
                        a = 0;
                    } else {
                        a = this.f26829i.length;
                    }
                    Object obj = new lxz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26829i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxz();
                    nyt.a(obj[a]);
                    this.f26829i = obj;
                    continue;
                case 90:
                    this.f26830j = nyt.j();
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
