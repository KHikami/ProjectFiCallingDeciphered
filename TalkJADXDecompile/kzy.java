public final class kzy extends nyx<kzy> {
    public String a;
    public String b;
    public String c;
    public String d;
    public ldm[] e;
    public String[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kzy() {
        d();
    }

    private kzy d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = ldm.d();
        this.f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        nyu.a(3, this.c);
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                String str = this.f[i];
                if (str != null) {
                    nyu.a(5, str);
                }
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(6, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        b += nyu.b(3, this.c);
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f != null && this.f.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f.length) {
                String str = this.f[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.d != null) {
            return b + nyu.b(6, this.d);
        }
        return b;
    }

    private kzy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new ldm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldm();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 50:
                    this.d = nyt.j();
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
