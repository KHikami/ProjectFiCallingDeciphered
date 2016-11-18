package p000;

public final class nzt extends nyx<nzt> {
    public Long f31387a;
    public String f31388b;
    public oan[] f31389c;
    public String f31390d;

    public /* synthetic */ nzf m37299a(nyt nyt) {
        return m37298b(nyt);
    }

    public nzt() {
        this.f31387a = null;
        this.f31388b = null;
        this.f31389c = oan.m37436d();
        this.f31390d = null;
        this.cachedSize = -1;
    }

    public void m37300a(nyu nyu) {
        if (this.f31387a != null) {
            nyu.m37181b(1, this.f31387a.longValue());
        }
        if (this.f31388b != null) {
            nyu.m37170a(2, this.f31388b);
        }
        if (this.f31389c != null && this.f31389c.length > 0) {
            for (nzf nzf : this.f31389c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f31390d != null) {
            nyu.m37170a(4, this.f31390d);
        }
        super.a(nyu);
    }

    protected int m37301b() {
        int b = super.b();
        if (this.f31387a != null) {
            b += nyu.m37148f(1, this.f31387a.longValue());
        }
        if (this.f31388b != null) {
            b += nyu.m37137b(2, this.f31388b);
        }
        if (this.f31389c != null && this.f31389c.length > 0) {
            int i = b;
            for (nzf nzf : this.f31389c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f31390d != null) {
            return b + nyu.m37137b(4, this.f31390d);
        }
        return b;
    }

    private nzt m37298b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31387a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f31388b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f31389c == null) {
                        a = 0;
                    } else {
                        a = this.f31389c.length;
                    }
                    Object obj = new oan[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31389c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oan();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oan();
                    nyt.m37101a(obj[a]);
                    this.f31389c = obj;
                    continue;
                case 34:
                    this.f31390d = nyt.m37117j();
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
