package p000;

public final class mzg extends nyx<mzg> {
    public Integer f29235a;
    public myw[] f29236b;

    public /* synthetic */ nzf m33928a(nyt nyt) {
        return m33927b(nyt);
    }

    public mzg() {
        this.f29235a = null;
        this.f29236b = myw.m33874d();
        this.cachedSize = -1;
    }

    public void m33929a(nyu nyu) {
        if (this.f29235a != null) {
            nyu.m37186c(1, this.f29235a.intValue());
        }
        if (this.f29236b != null && this.f29236b.length > 0) {
            for (nzf nzf : this.f29236b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m33930b() {
        int b = super.b();
        if (this.f29235a != null) {
            b += nyu.m37151g(1, this.f29235a.intValue());
        }
        if (this.f29236b == null || this.f29236b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29236b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private mzg m33927b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29235a = Integer.valueOf(nyt.m37119l());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29236b == null) {
                        a = 0;
                    } else {
                        a = this.f29236b.length;
                    }
                    Object obj = new myw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29236b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myw();
                    nyt.m37101a(obj[a]);
                    this.f29236b = obj;
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
