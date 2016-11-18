package p000;

public final class osu extends nyx<osu> {
    private static volatile osu[] f34184f;
    public oqt f34185a;
    public String f34186b;
    public osw[] f34187c;
    public String f34188d;
    public oqu f34189e;

    public /* synthetic */ nzf m39624a(nyt nyt) {
        return m39621b(nyt);
    }

    public static osu[] m39622d() {
        if (f34184f == null) {
            synchronized (nzc.f31309c) {
                if (f34184f == null) {
                    f34184f = new osu[0];
                }
            }
        }
        return f34184f;
    }

    public osu() {
        m39623g();
    }

    private osu m39623g() {
        this.f34185a = null;
        this.f34186b = null;
        this.f34187c = osw.m39634d();
        this.f34188d = null;
        this.f34189e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39625a(nyu nyu) {
        if (this.f34185a != null) {
            nyu.m37182b(1, this.f34185a);
        }
        if (this.f34186b != null) {
            nyu.m37170a(2, this.f34186b);
        }
        if (this.f34187c != null && this.f34187c.length > 0) {
            for (nzf nzf : this.f34187c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f34188d != null) {
            nyu.m37170a(4, this.f34188d);
        }
        if (this.f34189e != null) {
            nyu.m37182b(5, this.f34189e);
        }
        super.a(nyu);
    }

    protected int m39626b() {
        int b = super.b();
        if (this.f34185a != null) {
            b += nyu.m37145d(1, this.f34185a);
        }
        if (this.f34186b != null) {
            b += nyu.m37137b(2, this.f34186b);
        }
        if (this.f34187c != null && this.f34187c.length > 0) {
            int i = b;
            for (nzf nzf : this.f34187c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f34188d != null) {
            b += nyu.m37137b(4, this.f34188d);
        }
        if (this.f34189e != null) {
            return b + nyu.m37145d(5, this.f34189e);
        }
        return b;
    }

    private osu m39621b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34185a == null) {
                        this.f34185a = new oqt();
                    }
                    nyt.m37101a(this.f34185a);
                    continue;
                case wi.dH /*18*/:
                    this.f34186b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f34187c == null) {
                        a = 0;
                    } else {
                        a = this.f34187c.length;
                    }
                    Object obj = new osw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34187c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osw();
                    nyt.m37101a(obj[a]);
                    this.f34187c = obj;
                    continue;
                case 34:
                    this.f34188d = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f34189e == null) {
                        this.f34189e = new oqu();
                    }
                    nyt.m37101a(this.f34189e);
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
