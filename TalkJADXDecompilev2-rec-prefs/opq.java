package p000;

public final class opq extends nyx<opq> {
    public oso f33578a;
    public opl[] f33579b;
    public oqu[] f33580c;
    public oqu f33581d;

    public /* synthetic */ nzf m39082a(nyt nyt) {
        return m39080b(nyt);
    }

    public opq() {
        m39081d();
    }

    private opq m39081d() {
        this.f33578a = null;
        this.f33579b = opl.m39053d();
        this.f33580c = oqu.m39240d();
        this.f33581d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39083a(nyu nyu) {
        int i = 0;
        if (this.f33578a != null) {
            nyu.m37182b(1, this.f33578a);
        }
        if (this.f33579b != null && this.f33579b.length > 0) {
            for (nzf nzf : this.f33579b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33580c != null && this.f33580c.length > 0) {
            while (i < this.f33580c.length) {
                nzf nzf2 = this.f33580c[i];
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f33581d != null) {
            nyu.m37182b(4, this.f33581d);
        }
        super.a(nyu);
    }

    protected int m39084b() {
        int i = 0;
        int b = super.b();
        if (this.f33578a != null) {
            b += nyu.m37145d(1, this.f33578a);
        }
        if (this.f33579b != null && this.f33579b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33579b) {
                if (nzf != null) {
                    i2 += nyu.m37145d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f33580c != null && this.f33580c.length > 0) {
            while (i < this.f33580c.length) {
                nzf nzf2 = this.f33580c[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f33581d != null) {
            return b + nyu.m37145d(4, this.f33581d);
        }
        return b;
    }

    private opq m39080b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33578a == null) {
                        this.f33578a = new oso();
                    }
                    nyt.m37101a(this.f33578a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33579b == null) {
                        a = 0;
                    } else {
                        a = this.f33579b.length;
                    }
                    obj = new opl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33579b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opl();
                    nyt.m37101a(obj[a]);
                    this.f33579b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f33580c == null) {
                        a = 0;
                    } else {
                        a = this.f33580c.length;
                    }
                    obj = new oqu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33580c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqu();
                    nyt.m37101a(obj[a]);
                    this.f33580c = obj;
                    continue;
                case 34:
                    if (this.f33581d == null) {
                        this.f33581d = new oqu();
                    }
                    nyt.m37101a(this.f33581d);
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
