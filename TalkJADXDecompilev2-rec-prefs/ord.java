package p000;

public final class ord extends nyx<ord> {
    public ore[] f33864a;
    public Boolean f33865b;
    public Boolean f33866c;
    public Integer f33867d;

    public /* synthetic */ nzf m39294a(nyt nyt) {
        return m39292b(nyt);
    }

    public ord() {
        m39293d();
    }

    private ord m39293d() {
        this.f33864a = ore.m39298d();
        this.f33865b = null;
        this.f33866c = null;
        this.f33867d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39295a(nyu nyu) {
        if (this.f33864a != null && this.f33864a.length > 0) {
            for (nzf nzf : this.f33864a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33865b != null) {
            nyu.m37172a(2, this.f33865b.booleanValue());
        }
        if (this.f33866c != null) {
            nyu.m37172a(3, this.f33866c.booleanValue());
        }
        if (this.f33867d != null) {
            nyu.m37168a(4, this.f33867d.intValue());
        }
        super.a(nyu);
    }

    protected int m39296b() {
        int b = super.b();
        if (this.f33864a != null && this.f33864a.length > 0) {
            for (nzf nzf : this.f33864a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f33865b != null) {
            this.f33865b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f33866c != null) {
            this.f33866c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f33867d != null) {
            return b + nyu.m37147f(4, this.f33867d.intValue());
        }
        return b;
    }

    private ord m39292b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33864a == null) {
                        a = 0;
                    } else {
                        a = this.f33864a.length;
                    }
                    Object obj = new ore[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33864a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ore();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ore();
                    nyt.m37101a(obj[a]);
                    this.f33864a = obj;
                    continue;
                case 16:
                    this.f33865b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f33866c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f33867d = Integer.valueOf(nyt.m37112f());
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
