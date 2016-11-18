package p000;

public final class kia extends nyx<kia> {
    public Integer f21810a;
    public kib[] f21811b;
    public khn[] f21812c;
    public kic f21813d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25927b(nyt);
    }

    public kia() {
        this.f21810a = null;
        this.f21811b = kib.m25932d();
        this.f21812c = khn.m25864d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f21810a != null) {
            nyu.a(1, this.f21810a.intValue());
        }
        if (this.f21811b != null && this.f21811b.length > 0) {
            for (nzf nzf : this.f21811b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f21812c != null && this.f21812c.length > 0) {
            while (i < this.f21812c.length) {
                nzf nzf2 = this.f21812c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f21813d != null) {
            nyu.b(4, this.f21813d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f21810a != null) {
            b += nyu.f(1, this.f21810a.intValue());
        }
        if (this.f21811b != null && this.f21811b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f21811b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f21812c != null && this.f21812c.length > 0) {
            while (i < this.f21812c.length) {
                nzf nzf2 = this.f21812c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f21813d != null) {
            return b + nyu.d(4, this.f21813d);
        }
        return b;
    }

    private kia m25927b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21810a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f21811b == null) {
                        a = 0;
                    } else {
                        a = this.f21811b.length;
                    }
                    obj = new kib[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21811b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kib();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kib();
                    nyt.a(obj[a]);
                    this.f21811b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f21812c == null) {
                        a = 0;
                    } else {
                        a = this.f21812c.length;
                    }
                    obj = new khn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21812c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new khn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new khn();
                    nyt.a(obj[a]);
                    this.f21812c = obj;
                    continue;
                case 34:
                    if (this.f21813d == null) {
                        this.f21813d = new kic();
                    }
                    nyt.a(this.f21813d);
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
