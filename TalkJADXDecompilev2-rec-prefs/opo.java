package p000;

public final class opo extends nyx<opo> {
    public oso f33571a;
    public opl[] f33572b;
    public opp[] f33573c;

    public /* synthetic */ nzf m39071a(nyt nyt) {
        return m39069b(nyt);
    }

    public opo() {
        m39070d();
    }

    private opo m39070d() {
        this.f33571a = null;
        this.f33572b = opl.m39053d();
        this.f33573c = opp.m39075d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39072a(nyu nyu) {
        int i = 0;
        if (this.f33571a != null) {
            nyu.m37182b(1, this.f33571a);
        }
        if (this.f33572b != null && this.f33572b.length > 0) {
            for (nzf nzf : this.f33572b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33573c != null && this.f33573c.length > 0) {
            while (i < this.f33573c.length) {
                nzf nzf2 = this.f33573c[i];
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39073b() {
        int i = 0;
        int b = super.b();
        if (this.f33571a != null) {
            b += nyu.m37145d(1, this.f33571a);
        }
        if (this.f33572b != null && this.f33572b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33572b) {
                if (nzf != null) {
                    i2 += nyu.m37145d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f33573c != null && this.f33573c.length > 0) {
            while (i < this.f33573c.length) {
                nzf nzf2 = this.f33573c[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(3, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private opo m39069b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33571a == null) {
                        this.f33571a = new oso();
                    }
                    nyt.m37101a(this.f33571a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33572b == null) {
                        a = 0;
                    } else {
                        a = this.f33572b.length;
                    }
                    obj = new opl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33572b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opl();
                    nyt.m37101a(obj[a]);
                    this.f33572b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f33573c == null) {
                        a = 0;
                    } else {
                        a = this.f33573c.length;
                    }
                    obj = new opp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33573c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opp();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opp();
                    nyt.m37101a(obj[a]);
                    this.f33573c = obj;
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
