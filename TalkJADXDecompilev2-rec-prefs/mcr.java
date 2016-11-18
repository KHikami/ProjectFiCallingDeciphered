package p000;

public final class mcr extends nyx<mcr> {
    public Long f27357a;
    public int[] f27358b;
    public Integer f27359c;
    public mcs[] f27360d;
    public Integer f27361e;
    public Integer f27362f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31753b(nyt);
    }

    public mcr() {
        m31754d();
    }

    private mcr m31754d() {
        this.f27357a = null;
        this.f27358b = nzl.a;
        this.f27359c = null;
        this.f27360d = mcs.m31759d();
        this.f27361e = null;
        this.f27362f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27357a != null) {
            nyu.a(1, this.f27357a.longValue());
        }
        if (this.f27358b != null && this.f27358b.length > 0) {
            for (int c : this.f27358b) {
                nyu.c(2, c);
            }
        }
        if (this.f27359c != null) {
            nyu.c(3, this.f27359c.intValue());
        }
        if (this.f27360d != null && this.f27360d.length > 0) {
            while (i < this.f27360d.length) {
                nzf nzf = this.f27360d[i];
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
                i++;
            }
        }
        if (this.f27361e != null) {
            nyu.c(5, this.f27361e.intValue());
        }
        if (this.f27362f != null) {
            nyu.c(6, this.f27362f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27357a != null) {
            b += nyu.e(1, this.f27357a.longValue());
        }
        if (this.f27358b != null && this.f27358b.length > 0) {
            int i2 = 0;
            for (int j : this.f27358b) {
                i2 += nyu.j(j);
            }
            b = (b + i2) + (this.f27358b.length * 1);
        }
        if (this.f27359c != null) {
            b += nyu.g(3, this.f27359c.intValue());
        }
        if (this.f27360d != null && this.f27360d.length > 0) {
            while (i < this.f27360d.length) {
                nzf nzf = this.f27360d[i];
                if (nzf != null) {
                    b += nyu.d(4, nzf);
                }
                i++;
            }
        }
        if (this.f27361e != null) {
            b += nyu.g(5, this.f27361e.intValue());
        }
        if (this.f27362f != null) {
            return b + nyu.g(6, this.f27362f.intValue());
        }
        return b;
    }

    private mcr m31753b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27357a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f27358b == null ? 0 : this.f27358b.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27358b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.f27358b = obj;
                    continue;
                case wi.dH /*18*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f27358b == null ? 0 : this.f27358b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f27358b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.f27358b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    this.f27359c = Integer.valueOf(nyt.l());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f27360d == null) {
                        a = 0;
                    } else {
                        a = this.f27360d.length;
                    }
                    obj = new mcs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27360d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mcs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mcs();
                    nyt.a(obj[a]);
                    this.f27360d = obj;
                    continue;
                case 40:
                    this.f27361e = Integer.valueOf(nyt.l());
                    continue;
                case 48:
                    this.f27362f = Integer.valueOf(nyt.l());
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
