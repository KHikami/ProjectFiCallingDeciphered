package p000;

public final class mzd extends nyx<mzd> {
    public Integer f29219a;
    public myt[] f29220b;

    public /* synthetic */ nzf m33914a(nyt nyt) {
        return m33912b(nyt);
    }

    public mzd() {
        m33913d();
    }

    private mzd m33913d() {
        this.f29219a = null;
        this.f29220b = myt.m33858d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33915a(nyu nyu) {
        if (this.f29219a != null) {
            nyu.m37186c(1, this.f29219a.intValue());
        }
        if (this.f29220b != null && this.f29220b.length > 0) {
            for (nzf nzf : this.f29220b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m33916b() {
        int b = super.b();
        if (this.f29219a != null) {
            b += nyu.m37151g(1, this.f29219a.intValue());
        }
        if (this.f29220b == null || this.f29220b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29220b) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private mzd m33912b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29219a = Integer.valueOf(nyt.m37119l());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29220b == null) {
                        a = 0;
                    } else {
                        a = this.f29220b.length;
                    }
                    Object obj = new myt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29220b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myt();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myt();
                    nyt.m37101a(obj[a]);
                    this.f29220b = obj;
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
