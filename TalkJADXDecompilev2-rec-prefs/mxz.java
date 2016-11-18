package p000;

public final class mxz extends nyx<mxz> {
    public Integer f29111a;
    public Integer f29112b;
    public mya[] f29113c;
    public myb[] f29114d;

    public /* synthetic */ nzf m33757a(nyt nyt) {
        return m33755b(nyt);
    }

    public mxz() {
        m33756d();
    }

    private mxz m33756d() {
        this.f29112b = null;
        this.f29113c = mya.m33763d();
        this.f29114d = myb.m33769d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33758a(nyu nyu) {
        int i = 0;
        if (this.f29111a != null) {
            nyu.m37168a(1, this.f29111a.intValue());
        }
        if (this.f29112b != null) {
            nyu.m37168a(2, this.f29112b.intValue());
        }
        if (this.f29113c != null && this.f29113c.length > 0) {
            for (nzf nzf : this.f29113c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f29114d != null && this.f29114d.length > 0) {
            while (i < this.f29114d.length) {
                nzf nzf2 = this.f29114d[i];
                if (nzf2 != null) {
                    nyu.m37182b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33759b() {
        int i = 0;
        int b = super.b();
        if (this.f29111a != null) {
            b += nyu.m37147f(1, this.f29111a.intValue());
        }
        if (this.f29112b != null) {
            b += nyu.m37147f(2, this.f29112b.intValue());
        }
        if (this.f29113c != null && this.f29113c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f29113c) {
                if (nzf != null) {
                    i2 += nyu.m37145d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f29114d != null && this.f29114d.length > 0) {
            while (i < this.f29114d.length) {
                nzf nzf2 = this.f29114d[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private mxz m33755b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f29111a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29112b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f29113c == null) {
                        a = 0;
                    } else {
                        a = this.f29113c.length;
                    }
                    obj = new mya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29113c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mya();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mya();
                    nyt.m37101a(obj[a]);
                    this.f29113c = obj;
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f29114d == null) {
                        a = 0;
                    } else {
                        a = this.f29114d.length;
                    }
                    obj = new myb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29114d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myb();
                    nyt.m37101a(obj[a]);
                    this.f29114d = obj;
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
