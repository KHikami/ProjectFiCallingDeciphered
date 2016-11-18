package p000;

public final class lxv extends nyx<lxv> {
    public String f26813a;
    public String f26814b;
    public lzj f26815c;
    public String f26816d;
    public String[] f26817e;
    public lzg[] f26818f;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31063b(nyt);
    }

    public lxv() {
        m31064d();
    }

    private lxv m31064d() {
        this.requestHeader = null;
        this.f26813a = null;
        this.f26814b = null;
        this.f26815c = null;
        this.f26816d = null;
        this.f26817e = nzl.f;
        this.f26818f = lzg.m31261d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26813a != null) {
            nyu.a(2, this.f26813a);
        }
        if (this.f26814b != null) {
            nyu.a(3, this.f26814b);
        }
        if (this.f26815c != null) {
            nyu.b(4, this.f26815c);
        }
        if (this.f26816d != null) {
            nyu.a(5, this.f26816d);
        }
        if (this.f26817e != null && this.f26817e.length > 0) {
            for (String str : this.f26817e) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f26818f != null && this.f26818f.length > 0) {
            while (i < this.f26818f.length) {
                nzf nzf = this.f26818f[i];
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26813a != null) {
            b += nyu.b(2, this.f26813a);
        }
        if (this.f26814b != null) {
            b += nyu.b(3, this.f26814b);
        }
        if (this.f26815c != null) {
            b += nyu.d(4, this.f26815c);
        }
        if (this.f26816d != null) {
            b += nyu.b(5, this.f26816d);
        }
        if (this.f26817e != null && this.f26817e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f26817e) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f26818f != null && this.f26818f.length > 0) {
            while (i < this.f26818f.length) {
                nzf nzf = this.f26818f[i];
                if (nzf != null) {
                    b += nyu.d(7, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private lxv m31063b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.f26813a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26814b = nyt.j();
                    continue;
                case 34:
                    if (this.f26815c == null) {
                        this.f26815c = new lzj();
                    }
                    nyt.a(this.f26815c);
                    continue;
                case 42:
                    this.f26816d = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f26817e == null ? 0 : this.f26817e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26817e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26817e = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f26818f == null) {
                        a = 0;
                    } else {
                        a = this.f26818f.length;
                    }
                    obj = new lzg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26818f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzg();
                    nyt.a(obj[a]);
                    this.f26818f = obj;
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
