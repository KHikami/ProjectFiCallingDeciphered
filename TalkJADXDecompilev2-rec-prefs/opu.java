package p000;

public final class opu extends nyx<opu> {
    public oox[] f33597a;
    public oox[] f33598b;
    public Integer f33599c;
    public Integer f33600d;
    public Integer f33601e;
    public oox[] f33602f;
    public opv[] f33603g;
    public oqa[] f33604h;

    public /* synthetic */ nzf m39102a(nyt nyt) {
        return m39100b(nyt);
    }

    public opu() {
        m39101d();
    }

    private opu m39101d() {
        this.f33597a = oox.m38979d();
        this.f33598b = oox.m38979d();
        this.f33599c = null;
        this.f33600d = null;
        this.f33601e = null;
        this.f33602f = oox.m38979d();
        this.f33603g = opv.m39106d();
        this.f33604h = oqa.m39133d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39103a(nyu nyu) {
        int i = 0;
        if (this.f33597a != null && this.f33597a.length > 0) {
            for (nzf nzf : this.f33597a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33598b != null && this.f33598b.length > 0) {
            for (nzf nzf2 : this.f33598b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f33599c != null) {
            nyu.m37168a(3, this.f33599c.intValue());
        }
        if (this.f33602f != null && this.f33602f.length > 0) {
            for (nzf nzf22 : this.f33602f) {
                if (nzf22 != null) {
                    nyu.m37182b(4, nzf22);
                }
            }
        }
        if (this.f33603g != null && this.f33603g.length > 0) {
            for (nzf nzf222 : this.f33603g) {
                if (nzf222 != null) {
                    nyu.m37182b(5, nzf222);
                }
            }
        }
        if (this.f33600d != null) {
            nyu.m37168a(6, this.f33600d.intValue());
        }
        if (this.f33604h != null && this.f33604h.length > 0) {
            while (i < this.f33604h.length) {
                nzf nzf3 = this.f33604h[i];
                if (nzf3 != null) {
                    nyu.m37182b(7, nzf3);
                }
                i++;
            }
        }
        if (this.f33601e != null) {
            nyu.m37168a(8, this.f33601e.intValue());
        }
        super.a(nyu);
    }

    protected int m39104b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f33597a != null && this.f33597a.length > 0) {
            i = b;
            for (nzf nzf : this.f33597a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f33598b != null && this.f33598b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f33598b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f33599c != null) {
            b += nyu.m37147f(3, this.f33599c.intValue());
        }
        if (this.f33602f != null && this.f33602f.length > 0) {
            i = b;
            for (nzf nzf22 : this.f33602f) {
                if (nzf22 != null) {
                    i += nyu.m37145d(4, nzf22);
                }
            }
            b = i;
        }
        if (this.f33603g != null && this.f33603g.length > 0) {
            i = b;
            for (nzf nzf222 : this.f33603g) {
                if (nzf222 != null) {
                    i += nyu.m37145d(5, nzf222);
                }
            }
            b = i;
        }
        if (this.f33600d != null) {
            b += nyu.m37147f(6, this.f33600d.intValue());
        }
        if (this.f33604h != null && this.f33604h.length > 0) {
            while (i2 < this.f33604h.length) {
                nzf nzf3 = this.f33604h[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.f33601e != null) {
            return b + nyu.m37147f(8, this.f33601e.intValue());
        }
        return b;
    }

    private opu m39100b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f33597a == null) {
                        a = 0;
                    } else {
                        a = this.f33597a.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33597a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.m37101a(obj[a]);
                    this.f33597a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33598b == null) {
                        a = 0;
                    } else {
                        a = this.f33598b.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33598b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.m37101a(obj[a]);
                    this.f33598b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f33599c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f33602f == null) {
                        a = 0;
                    } else {
                        a = this.f33602f.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33602f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.m37101a(obj[a]);
                    this.f33602f = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f33603g == null) {
                        a = 0;
                    } else {
                        a = this.f33603g.length;
                    }
                    obj = new opv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33603g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opv();
                    nyt.m37101a(obj[a]);
                    this.f33603g = obj;
                    continue;
                case 48:
                    this.f33600d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f33604h == null) {
                        a = 0;
                    } else {
                        a = this.f33604h.length;
                    }
                    obj = new oqa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33604h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqa();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqa();
                    nyt.m37101a(obj[a]);
                    this.f33604h = obj;
                    continue;
                case 64:
                    this.f33601e = Integer.valueOf(nyt.m37112f());
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
