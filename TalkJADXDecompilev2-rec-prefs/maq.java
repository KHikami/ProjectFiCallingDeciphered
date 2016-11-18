package p000;

public final class maq extends nyx<maq> {
    public Integer f27137a;
    public mar f27138b;
    public String[] f27139c;
    public String f27140d;
    public String f27141e;
    public lzv[] f27142f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31466b(nyt);
    }

    public maq() {
        m31467d();
    }

    private maq m31467d() {
        this.f27138b = null;
        this.f27139c = nzl.f;
        this.f27140d = null;
        this.f27141e = null;
        this.f27142f = lzv.m31345d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27137a != null) {
            nyu.a(1, this.f27137a.intValue());
        }
        if (this.f27138b != null) {
            nyu.b(2, this.f27138b);
        }
        if (this.f27139c != null && this.f27139c.length > 0) {
            for (String str : this.f27139c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f27140d != null) {
            nyu.a(4, this.f27140d);
        }
        if (this.f27141e != null) {
            nyu.a(5, this.f27141e);
        }
        if (this.f27142f != null && this.f27142f.length > 0) {
            while (i < this.f27142f.length) {
                nzf nzf = this.f27142f[i];
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
        if (this.f27137a != null) {
            b += nyu.f(1, this.f27137a.intValue());
        }
        if (this.f27138b != null) {
            b += nyu.d(2, this.f27138b);
        }
        if (this.f27139c != null && this.f27139c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f27139c) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f27140d != null) {
            b += nyu.b(4, this.f27140d);
        }
        if (this.f27141e != null) {
            b += nyu.b(5, this.f27141e);
        }
        if (this.f27142f != null && this.f27142f.length > 0) {
            while (i < this.f27142f.length) {
                nzf nzf = this.f27142f[i];
                if (nzf != null) {
                    b += nyu.d(6, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private maq m31466b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f27137a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f27138b == null) {
                        this.f27138b = new mar();
                    }
                    nyt.a(this.f27138b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f27139c == null ? 0 : this.f27139c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27139c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27139c = obj;
                    continue;
                case 34:
                    this.f27140d = nyt.j();
                    continue;
                case 42:
                    this.f27141e = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f27142f == null) {
                        a = 0;
                    } else {
                        a = this.f27142f.length;
                    }
                    obj = new lzv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27142f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzv();
                    nyt.a(obj[a]);
                    this.f27142f = obj;
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
