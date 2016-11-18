package defpackage;

public final class kow extends nyx<kow> {
    public kse[] a;
    public kse[] b;
    public Integer c;
    public String d;
    public ksu e;
    public kuv[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kow() {
        d();
    }

    private kow d() {
        this.a = kse.d();
        this.b = kse.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = kuv.d();
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
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf3 = this.f[i];
                if (nzf3 != null) {
                    nyu.b(6, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            while (i2 < this.f.length) {
                nzf nzf3 = this.f[i2];
                if (nzf3 != null) {
                    b += nyu.d(6, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private kow b(nyt nyt) {
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
                    obj = new kse[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kse();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kse();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new kse[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kse();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kse();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new ksu();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new kuv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuv();
                    nyt.a(obj[a]);
                    this.f = obj;
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
