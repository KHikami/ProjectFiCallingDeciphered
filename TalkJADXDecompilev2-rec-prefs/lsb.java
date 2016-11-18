package p000;

public final class lsb extends nyx<lsb> {
    public Integer f26298a;
    public Long f26299b;
    public lpf[] f26300c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30271b(nyt);
    }

    public lsb() {
        m30272d();
    }

    private lsb m30272d() {
        this.f26298a = null;
        this.f26299b = null;
        this.f26300c = lpf.m29879d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26298a != null) {
            nyu.c(1, this.f26298a.intValue());
        }
        if (this.f26299b != null) {
            nyu.a(2, this.f26299b.longValue());
        }
        if (this.f26300c != null && this.f26300c.length > 0) {
            for (nzf nzf : this.f26300c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26298a != null) {
            b += nyu.g(1, this.f26298a.intValue());
        }
        if (this.f26299b != null) {
            b += nyu.e(2, this.f26299b.longValue());
        }
        if (this.f26300c == null || this.f26300c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26300c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lsb m30271b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26298a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.f26299b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f26300c == null) {
                        a = 0;
                    } else {
                        a = this.f26300c.length;
                    }
                    Object obj = new lpf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26300c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lpf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lpf();
                    nyt.a(obj[a]);
                    this.f26300c = obj;
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
