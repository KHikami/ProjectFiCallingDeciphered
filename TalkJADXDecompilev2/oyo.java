package defpackage;

public final class oyo extends nyx<oyo> {
    public nuy[] a;
    public Integer b;
    public Integer c;
    public oyd[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oyo() {
        d();
    }

    private oyo d() {
        this.a = nuy.d();
        this.b = null;
        this.c = null;
        this.d = oyd.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf2 = this.d[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i2 += nyu.d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf2 = this.d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private oyo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new nuy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nuy();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new oyd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oyd();
                    nyt.a(obj[a]);
                    this.d = obj;
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
