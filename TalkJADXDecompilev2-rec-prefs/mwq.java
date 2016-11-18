package p000;

public final class mwq extends nyx<mwq> {
    public int f28615a;
    public Integer f28616b;
    public mwr[] f28617c;
    public mws[] f28618d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33240b(nyt);
    }

    public mwq() {
        this.f28615a = nzf.UNSET_ENUM_VALUE;
        this.f28616b = null;
        this.f28617c = mwr.m33245d();
        this.f28618d = mws.m33250d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28615a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f28615a);
        }
        if (this.f28616b != null) {
            nyu.a(2, this.f28616b.intValue());
        }
        if (this.f28617c != null && this.f28617c.length > 0) {
            for (nzf nzf : this.f28617c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f28618d != null && this.f28618d.length > 0) {
            while (i < this.f28618d.length) {
                nzf nzf2 = this.f28618d[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f28615a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f28615a);
        }
        if (this.f28616b != null) {
            b += nyu.f(2, this.f28616b.intValue());
        }
        if (this.f28617c != null && this.f28617c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f28617c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f28618d != null && this.f28618d.length > 0) {
            while (i < this.f28618d.length) {
                nzf nzf2 = this.f28618d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private mwq m33240b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f28615a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f28616b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f28617c == null) {
                        a = 0;
                    } else {
                        a = this.f28617c.length;
                    }
                    obj = new mwr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28617c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwr();
                    nyt.a(obj[a]);
                    this.f28617c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f28618d == null) {
                        a = 0;
                    } else {
                        a = this.f28618d.length;
                    }
                    obj = new mws[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28618d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mws();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mws();
                    nyt.a(obj[a]);
                    this.f28618d = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
