package p000;

public final class niu extends nyx<niu> {
    public nlz f29918a;
    public nma f29919b;
    public nlw f29920c;
    public nlw[] f29921d;
    public Boolean f29922e;

    public /* synthetic */ nzf m35152a(nyt nyt) {
        return m35150b(nyt);
    }

    public niu() {
        m35151d();
    }

    private niu m35151d() {
        this.f29918a = null;
        this.f29919b = null;
        this.f29920c = null;
        this.f29921d = nlw.m35567d();
        this.f29922e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35153a(nyu nyu) {
        if (this.f29918a != null) {
            nyu.m37182b(1, this.f29918a);
        }
        if (this.f29919b != null) {
            nyu.m37182b(2, this.f29919b);
        }
        if (this.f29920c != null) {
            nyu.m37182b(3, this.f29920c);
        }
        if (this.f29922e != null) {
            nyu.m37172a(4, this.f29922e.booleanValue());
        }
        if (this.f29921d != null && this.f29921d.length > 0) {
            for (nzf nzf : this.f29921d) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35154b() {
        int b = super.b();
        if (this.f29918a != null) {
            b += nyu.m37145d(1, this.f29918a);
        }
        if (this.f29919b != null) {
            b += nyu.m37145d(2, this.f29919b);
        }
        if (this.f29920c != null) {
            b += nyu.m37145d(3, this.f29920c);
        }
        if (this.f29922e != null) {
            this.f29922e.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f29921d == null || this.f29921d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29921d) {
            if (nzf != null) {
                i += nyu.m37145d(5, nzf);
            }
        }
        return i;
    }

    private niu m35150b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29918a == null) {
                        this.f29918a = new nlz();
                    }
                    nyt.m37101a(this.f29918a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29919b == null) {
                        this.f29919b = new nma();
                    }
                    nyt.m37101a(this.f29919b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29920c == null) {
                        this.f29920c = new nlw();
                    }
                    nyt.m37101a(this.f29920c);
                    continue;
                case 32:
                    this.f29922e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f29921d == null) {
                        a = 0;
                    } else {
                        a = this.f29921d.length;
                    }
                    Object obj = new nlw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29921d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nlw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nlw();
                    nyt.m37101a(obj[a]);
                    this.f29921d = obj;
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
