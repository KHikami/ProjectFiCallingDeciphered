package p000;

public final class kqc extends nyx<kqc> {
    public kqd f22737a;
    public String f22738b;
    public String[] f22739c;
    public String f22740d;
    public kpt f22741e;
    public kpt[] f22742f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27018b(nyt);
    }

    public kqc() {
        m27019d();
    }

    private kqc m27019d() {
        this.f22737a = null;
        this.f22738b = null;
        this.f22739c = nzl.f;
        this.f22740d = null;
        this.f22741e = null;
        this.f22742f = kpt.m26969d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22737a != null) {
            nyu.b(1, this.f22737a);
        }
        if (this.f22738b != null) {
            nyu.a(2, this.f22738b);
        }
        if (this.f22739c != null && this.f22739c.length > 0) {
            for (String str : this.f22739c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f22740d != null) {
            nyu.a(4, this.f22740d);
        }
        if (this.f22741e != null) {
            nyu.b(5, this.f22741e);
        }
        if (this.f22742f != null && this.f22742f.length > 0) {
            while (i < this.f22742f.length) {
                nzf nzf = this.f22742f[i];
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22737a != null) {
            b += nyu.d(1, this.f22737a);
        }
        if (this.f22738b != null) {
            b += nyu.b(2, this.f22738b);
        }
        if (this.f22739c != null && this.f22739c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f22739c) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22740d != null) {
            b += nyu.b(4, this.f22740d);
        }
        if (this.f22741e != null) {
            b += nyu.d(5, this.f22741e);
        }
        if (this.f22742f != null && this.f22742f.length > 0) {
            while (i < this.f22742f.length) {
                nzf nzf = this.f22742f[i];
                if (nzf != null) {
                    b += nyu.d(6, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private kqc m27018b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22737a == null) {
                        this.f22737a = new kqd();
                    }
                    nyt.a(this.f22737a);
                    continue;
                case wi.dH /*18*/:
                    this.f22738b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f22739c == null ? 0 : this.f22739c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22739c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22739c = obj;
                    continue;
                case 34:
                    this.f22740d = nyt.j();
                    continue;
                case 42:
                    if (this.f22741e == null) {
                        this.f22741e = new kpt();
                    }
                    nyt.a(this.f22741e);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f22742f == null) {
                        a = 0;
                    } else {
                        a = this.f22742f.length;
                    }
                    obj = new kpt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22742f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpt();
                    nyt.a(obj[a]);
                    this.f22742f = obj;
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
