package p000;

public final class opa extends nyx<opa> {
    public String f33513a;
    public opb[] f33514b;
    public opb[] f33515c;
    public Boolean f33516d;
    public ojg f33517e;

    public /* synthetic */ nzf m38997a(nyt nyt) {
        return m38995b(nyt);
    }

    public opa() {
        m38996d();
    }

    private opa m38996d() {
        this.f33513a = null;
        this.f33514b = opb.m39001d();
        this.f33515c = opb.m39001d();
        this.f33516d = null;
        this.f33517e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38998a(nyu nyu) {
        int i = 0;
        if (this.f33513a != null) {
            nyu.m37170a(1, this.f33513a);
        }
        if (this.f33514b != null && this.f33514b.length > 0) {
            for (nzf nzf : this.f33514b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33515c != null && this.f33515c.length > 0) {
            while (i < this.f33515c.length) {
                nzf nzf2 = this.f33515c[i];
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f33516d != null) {
            nyu.m37172a(4, this.f33516d.booleanValue());
        }
        if (this.f33517e != null) {
            nyu.m37182b(5, this.f33517e);
        }
        super.a(nyu);
    }

    protected int m38999b() {
        int i = 0;
        int b = super.b();
        if (this.f33513a != null) {
            b += nyu.m37137b(1, this.f33513a);
        }
        if (this.f33514b != null && this.f33514b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33514b) {
                if (nzf != null) {
                    i2 += nyu.m37145d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f33515c != null && this.f33515c.length > 0) {
            while (i < this.f33515c.length) {
                nzf nzf2 = this.f33515c[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f33516d != null) {
            this.f33516d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f33517e != null) {
            return b + nyu.m37145d(5, this.f33517e);
        }
        return b;
    }

    private opa m38995b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33513a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33514b == null) {
                        a = 0;
                    } else {
                        a = this.f33514b.length;
                    }
                    obj = new opb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33514b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opb();
                    nyt.m37101a(obj[a]);
                    this.f33514b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f33515c == null) {
                        a = 0;
                    } else {
                        a = this.f33515c.length;
                    }
                    obj = new opb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33515c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opb();
                    nyt.m37101a(obj[a]);
                    this.f33515c = obj;
                    continue;
                case 32:
                    this.f33516d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    if (this.f33517e == null) {
                        this.f33517e = new ojg();
                    }
                    nyt.m37101a(this.f33517e);
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
