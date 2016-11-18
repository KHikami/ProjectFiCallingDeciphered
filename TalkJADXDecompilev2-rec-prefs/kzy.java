package p000;

public final class kzy extends nyx<kzy> {
    public String f24313a;
    public String f24314b;
    public String f24315c;
    public String f24316d;
    public ldm[] f24317e;
    public String[] f24318f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28301b(nyt);
    }

    public kzy() {
        m28302d();
    }

    private kzy m28302d() {
        this.f24313a = null;
        this.f24314b = null;
        this.f24315c = null;
        this.f24316d = null;
        this.f24317e = ldm.m28752d();
        this.f24318f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24313a != null) {
            nyu.a(1, this.f24313a);
        }
        if (this.f24314b != null) {
            nyu.a(2, this.f24314b);
        }
        nyu.a(3, this.f24315c);
        if (this.f24317e != null && this.f24317e.length > 0) {
            for (nzf nzf : this.f24317e) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f24318f != null && this.f24318f.length > 0) {
            while (i < this.f24318f.length) {
                String str = this.f24318f[i];
                if (str != null) {
                    nyu.a(5, str);
                }
                i++;
            }
        }
        if (this.f24316d != null) {
            nyu.a(6, this.f24316d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24313a != null) {
            b += nyu.b(1, this.f24313a);
        }
        if (this.f24314b != null) {
            b += nyu.b(2, this.f24314b);
        }
        b += nyu.b(3, this.f24315c);
        if (this.f24317e != null && this.f24317e.length > 0) {
            i = b;
            for (nzf nzf : this.f24317e) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f24318f != null && this.f24318f.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f24318f.length) {
                String str = this.f24318f[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f24316d != null) {
            return b + nyu.b(6, this.f24316d);
        }
        return b;
    }

    private kzy m28301b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24313a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24314b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24315c = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24317e == null) {
                        a = 0;
                    } else {
                        a = this.f24317e.length;
                    }
                    obj = new ldm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24317e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldm();
                    nyt.a(obj[a]);
                    this.f24317e = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f24318f == null ? 0 : this.f24318f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24318f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24318f = obj;
                    continue;
                case 50:
                    this.f24316d = nyt.j();
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
