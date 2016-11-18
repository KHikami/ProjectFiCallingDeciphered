package p000;

public final class ngc extends nyx<ngc> {
    private static volatile ngc[] f29757d;
    public String f29758a;
    public String f29759b;
    public ngd[] f29760c;

    public /* synthetic */ nzf m34784a(nyt nyt) {
        return m34781b(nyt);
    }

    public static ngc[] m34782d() {
        if (f29757d == null) {
            synchronized (nzc.f31309c) {
                if (f29757d == null) {
                    f29757d = new ngc[0];
                }
            }
        }
        return f29757d;
    }

    public ngc() {
        m34783g();
    }

    private ngc m34783g() {
        this.f29758a = null;
        this.f29759b = null;
        this.f29760c = ngd.m34788d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34785a(nyu nyu) {
        if (this.f29758a != null) {
            nyu.m37170a(1, this.f29758a);
        }
        if (this.f29760c != null && this.f29760c.length > 0) {
            for (nzf nzf : this.f29760c) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f29759b != null) {
            nyu.m37170a(3, this.f29759b);
        }
        super.a(nyu);
    }

    protected int m34786b() {
        int b = super.b();
        if (this.f29758a != null) {
            b += nyu.m37137b(1, this.f29758a);
        }
        if (this.f29760c != null && this.f29760c.length > 0) {
            int i = b;
            for (nzf nzf : this.f29760c) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f29759b != null) {
            return b + nyu.m37137b(3, this.f29759b);
        }
        return b;
    }

    private ngc m34781b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29758a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29760c == null) {
                        a = 0;
                    } else {
                        a = this.f29760c.length;
                    }
                    Object obj = new ngd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29760c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ngd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ngd();
                    nyt.m37101a(obj[a]);
                    this.f29760c = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f29759b = nyt.m37117j();
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
