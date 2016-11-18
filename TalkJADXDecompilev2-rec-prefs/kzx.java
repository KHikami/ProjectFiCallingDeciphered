package p000;

public final class kzx extends nyx<kzx> {
    public String f24307a;
    public String f24308b;
    public String f24309c;
    public String f24310d;
    public laa[] f24311e;
    public String[] f24312f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28297b(nyt);
    }

    public kzx() {
        this.f24307a = null;
        this.f24308b = null;
        this.f24309c = null;
        this.f24310d = null;
        this.f24311e = laa.m28320d();
        this.f24312f = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24307a != null) {
            nyu.a(1, this.f24307a);
        }
        if (this.f24308b != null) {
            nyu.a(2, this.f24308b);
        }
        nyu.a(3, this.f24309c);
        if (this.f24311e != null && this.f24311e.length > 0) {
            for (nzf nzf : this.f24311e) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f24312f != null && this.f24312f.length > 0) {
            while (i < this.f24312f.length) {
                String str = this.f24312f[i];
                if (str != null) {
                    nyu.a(5, str);
                }
                i++;
            }
        }
        if (this.f24310d != null) {
            nyu.a(6, this.f24310d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24307a != null) {
            b += nyu.b(1, this.f24307a);
        }
        if (this.f24308b != null) {
            b += nyu.b(2, this.f24308b);
        }
        b += nyu.b(3, this.f24309c);
        if (this.f24311e != null && this.f24311e.length > 0) {
            i = b;
            for (nzf nzf : this.f24311e) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f24312f != null && this.f24312f.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f24312f.length) {
                String str = this.f24312f[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f24310d != null) {
            return b + nyu.b(6, this.f24310d);
        }
        return b;
    }

    private kzx m28297b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24307a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24308b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24309c = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24311e == null) {
                        a = 0;
                    } else {
                        a = this.f24311e.length;
                    }
                    obj = new laa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24311e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laa();
                    nyt.a(obj[a]);
                    this.f24311e = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f24312f == null ? 0 : this.f24312f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24312f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24312f = obj;
                    continue;
                case 50:
                    this.f24310d = nyt.j();
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
