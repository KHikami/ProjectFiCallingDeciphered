package p000;

public final class lue extends nyx<lue> {
    public lnq[] f26441a;
    public lrw[] f26442b;
    public Long f26443c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30577b(nyt);
    }

    public lue() {
        m30578d();
    }

    private lue m30578d() {
        this.requestHeader = null;
        this.f26441a = lnq.m29648d();
        this.f26442b = lrw.m30243d();
        this.f26443c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26441a != null && this.f26441a.length > 0) {
            for (nzf nzf : this.f26441a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26442b != null && this.f26442b.length > 0) {
            while (i < this.f26442b.length) {
                nzf nzf2 = this.f26442b[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f26443c != null) {
            nyu.a(4, this.f26443c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26441a != null && this.f26441a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26441a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f26442b != null && this.f26442b.length > 0) {
            while (i < this.f26442b.length) {
                nzf nzf2 = this.f26442b[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f26443c != null) {
            return b + nyu.e(4, this.f26443c.longValue());
        }
        return b;
    }

    private lue m30577b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f26441a == null) {
                        a = 0;
                    } else {
                        a = this.f26441a.length;
                    }
                    obj = new lnq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26441a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lnq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lnq();
                    nyt.a(obj[a]);
                    this.f26441a = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26442b == null) {
                        a = 0;
                    } else {
                        a = this.f26442b.length;
                    }
                    obj = new lrw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26442b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lrw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lrw();
                    nyt.a(obj[a]);
                    this.f26442b = obj;
                    continue;
                case 32:
                    this.f26443c = Long.valueOf(nyt.d());
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
