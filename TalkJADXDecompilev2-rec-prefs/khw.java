package p000;

public final class khw extends nyx<khw> {
    public Integer f21799a;
    public khx[] f21800b;
    public khr[] f21801c;
    public khy f21802d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25906b(nyt);
    }

    public khw() {
        m25907d();
    }

    private khw m25907d() {
        this.f21799a = null;
        this.f21800b = khx.m25912d();
        this.f21801c = khr.m25881d();
        this.f21802d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f21799a != null) {
            nyu.a(1, this.f21799a.intValue());
        }
        if (this.f21800b != null && this.f21800b.length > 0) {
            for (nzf nzf : this.f21800b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f21801c != null && this.f21801c.length > 0) {
            while (i < this.f21801c.length) {
                nzf nzf2 = this.f21801c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f21802d != null) {
            nyu.b(4, this.f21802d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f21799a != null) {
            b += nyu.f(1, this.f21799a.intValue());
        }
        if (this.f21800b != null && this.f21800b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f21800b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f21801c != null && this.f21801c.length > 0) {
            while (i < this.f21801c.length) {
                nzf nzf2 = this.f21801c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f21802d != null) {
            return b + nyu.d(4, this.f21802d);
        }
        return b;
    }

    private khw m25906b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21799a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f21800b == null) {
                        a = 0;
                    } else {
                        a = this.f21800b.length;
                    }
                    obj = new khx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21800b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new khx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new khx();
                    nyt.a(obj[a]);
                    this.f21800b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f21801c == null) {
                        a = 0;
                    } else {
                        a = this.f21801c.length;
                    }
                    obj = new khr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21801c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new khr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new khr();
                    nyt.a(obj[a]);
                    this.f21801c = obj;
                    continue;
                case 34:
                    if (this.f21802d == null) {
                        this.f21802d = new khy();
                    }
                    nyt.a(this.f21802d);
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
