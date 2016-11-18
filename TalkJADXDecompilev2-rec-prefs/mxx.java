package p000;

public final class mxx extends nyx<mxx> {
    public mxw f29103a;
    public mxt[] f29104b;

    public /* synthetic */ nzf m33746a(nyt nyt) {
        return m33745b(nyt);
    }

    public mxx() {
        this.f29104b = mxt.m33729d();
        this.cachedSize = -1;
    }

    public void m33747a(nyu nyu) {
        if (this.f29103a != null) {
            nyu.m37182b(2, this.f29103a);
        }
        if (this.f29104b != null && this.f29104b.length > 0) {
            for (nzf nzf : this.f29104b) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m33748b() {
        int b = super.b();
        if (this.f29103a != null) {
            b += nyu.m37145d(2, this.f29103a);
        }
        if (this.f29104b == null || this.f29104b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29104b) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private mxx m33745b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f29103a == null) {
                        this.f29103a = new mxw();
                    }
                    nyt.m37101a(this.f29103a);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29104b == null) {
                        a = 0;
                    } else {
                        a = this.f29104b.length;
                    }
                    Object obj = new mxt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29104b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxt();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mxt();
                    nyt.m37101a(obj[a]);
                    this.f29104b = obj;
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
