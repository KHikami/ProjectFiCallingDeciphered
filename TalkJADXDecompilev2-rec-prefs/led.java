package p000;

public final class led extends nyx<led> {
    private static volatile led[] f24793f;
    public ldz f24794a;
    public ldz[] f24795b;
    public lea f24796c;
    public leo[] f24797d;
    public lef f24798e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28838b(nyt);
    }

    public static led[] m28839d() {
        if (f24793f == null) {
            synchronized (nzc.c) {
                if (f24793f == null) {
                    f24793f = new led[0];
                }
            }
        }
        return f24793f;
    }

    public led() {
        m28840g();
    }

    private led m28840g() {
        this.f24794a = null;
        this.f24795b = ldz.m28817d();
        this.f24796c = null;
        this.f24797d = leo.m28899d();
        this.f24798e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24794a != null) {
            nyu.b(1, this.f24794a);
        }
        if (this.f24795b != null && this.f24795b.length > 0) {
            for (nzf nzf : this.f24795b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f24796c != null) {
            nyu.b(3, this.f24796c);
        }
        if (this.f24797d != null && this.f24797d.length > 0) {
            while (i < this.f24797d.length) {
                nzf nzf2 = this.f24797d[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        if (this.f24798e != null) {
            nyu.b(5, this.f24798e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24794a != null) {
            b += nyu.d(1, this.f24794a);
        }
        if (this.f24795b != null && this.f24795b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f24795b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f24796c != null) {
            b += nyu.d(3, this.f24796c);
        }
        if (this.f24797d != null && this.f24797d.length > 0) {
            while (i < this.f24797d.length) {
                nzf nzf2 = this.f24797d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        if (this.f24798e != null) {
            return b + nyu.d(5, this.f24798e);
        }
        return b;
    }

    private led m28838b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24794a == null) {
                        this.f24794a = new ldz();
                    }
                    nyt.a(this.f24794a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f24795b == null) {
                        a = 0;
                    } else {
                        a = this.f24795b.length;
                    }
                    obj = new ldz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24795b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldz();
                    nyt.a(obj[a]);
                    this.f24795b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f24796c == null) {
                        this.f24796c = new lea();
                    }
                    nyt.a(this.f24796c);
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24797d == null) {
                        a = 0;
                    } else {
                        a = this.f24797d.length;
                    }
                    obj = new leo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24797d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new leo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new leo();
                    nyt.a(obj[a]);
                    this.f24797d = obj;
                    continue;
                case 42:
                    if (this.f24798e == null) {
                        this.f24798e = new lef();
                    }
                    nyt.a(this.f24798e);
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
