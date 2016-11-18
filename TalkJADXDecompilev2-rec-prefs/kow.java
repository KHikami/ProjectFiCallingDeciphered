package p000;

public final class kow extends nyx<kow> {
    public kse[] f22585a;
    public kse[] f22586b;
    public Integer f22587c;
    public String f22588d;
    public ksu f22589e;
    public kuv[] f22590f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26846b(nyt);
    }

    public kow() {
        m26847d();
    }

    private kow m26847d() {
        this.f22585a = kse.m27286d();
        this.f22586b = kse.m27286d();
        this.f22587c = null;
        this.f22588d = null;
        this.f22589e = null;
        this.f22590f = kuv.m27628d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22585a != null && this.f22585a.length > 0) {
            for (nzf nzf : this.f22585a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22586b != null && this.f22586b.length > 0) {
            for (nzf nzf2 : this.f22586b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f22587c != null) {
            nyu.a(3, this.f22587c.intValue());
        }
        if (this.f22589e != null) {
            nyu.b(4, this.f22589e);
        }
        if (this.f22588d != null) {
            nyu.a(5, this.f22588d);
        }
        if (this.f22590f != null && this.f22590f.length > 0) {
            while (i < this.f22590f.length) {
                nzf nzf3 = this.f22590f[i];
                if (nzf3 != null) {
                    nyu.b(6, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f22585a != null && this.f22585a.length > 0) {
            i = b;
            for (nzf nzf : this.f22585a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f22586b != null && this.f22586b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f22586b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f22587c != null) {
            b += nyu.f(3, this.f22587c.intValue());
        }
        if (this.f22589e != null) {
            b += nyu.d(4, this.f22589e);
        }
        if (this.f22588d != null) {
            b += nyu.b(5, this.f22588d);
        }
        if (this.f22590f != null && this.f22590f.length > 0) {
            while (i2 < this.f22590f.length) {
                nzf nzf3 = this.f22590f[i2];
                if (nzf3 != null) {
                    b += nyu.d(6, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private kow m26846b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f22585a == null) {
                        a = 0;
                    } else {
                        a = this.f22585a.length;
                    }
                    obj = new kse[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22585a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kse();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kse();
                    nyt.a(obj[a]);
                    this.f22585a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f22586b == null) {
                        a = 0;
                    } else {
                        a = this.f22586b.length;
                    }
                    obj = new kse[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22586b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kse();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kse();
                    nyt.a(obj[a]);
                    this.f22586b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f22587c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    if (this.f22589e == null) {
                        this.f22589e = new ksu();
                    }
                    nyt.a(this.f22589e);
                    continue;
                case 42:
                    this.f22588d = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f22590f == null) {
                        a = 0;
                    } else {
                        a = this.f22590f.length;
                    }
                    obj = new kuv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22590f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuv();
                    nyt.a(obj[a]);
                    this.f22590f = obj;
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
