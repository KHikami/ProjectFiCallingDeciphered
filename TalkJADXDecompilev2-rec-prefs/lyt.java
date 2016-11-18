package p000;

public final class lyt extends nyx<lyt> {
    public String f26950a;
    public String f26951b;
    public Integer f26952c;
    public lzj f26953d;
    public String[] f26954e;
    public lzh[] f26955f;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31194b(nyt);
    }

    public lyt() {
        m31195d();
    }

    private lyt m31195d() {
        this.requestHeader = null;
        this.f26950a = null;
        this.f26951b = null;
        this.f26953d = null;
        this.f26954e = nzl.f;
        this.f26955f = lzh.m31267d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26950a != null) {
            nyu.a(2, this.f26950a);
        }
        if (this.f26951b != null) {
            nyu.a(3, this.f26951b);
        }
        if (this.f26953d != null) {
            nyu.b(4, this.f26953d);
        }
        if (this.f26952c != null) {
            nyu.a(5, this.f26952c.intValue());
        }
        if (this.f26954e != null && this.f26954e.length > 0) {
            for (String str : this.f26954e) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f26955f != null && this.f26955f.length > 0) {
            while (i < this.f26955f.length) {
                nzf nzf = this.f26955f[i];
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
        if (this.f26950a != null) {
            b += nyu.b(2, this.f26950a);
        }
        if (this.f26951b != null) {
            b += nyu.b(3, this.f26951b);
        }
        if (this.f26953d != null) {
            b += nyu.d(4, this.f26953d);
        }
        if (this.f26952c != null) {
            b += nyu.f(5, this.f26952c.intValue());
        }
        if (this.f26954e != null && this.f26954e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f26954e) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f26955f != null && this.f26955f.length > 0) {
            while (i < this.f26955f.length) {
                nzf nzf = this.f26955f[i];
                if (nzf != null) {
                    b += nyu.d(7, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private lyt m31194b(nyt nyt) {
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
                    this.f26950a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26951b = nyt.j();
                    continue;
                case 34:
                    if (this.f26953d == null) {
                        this.f26953d = new lzj();
                    }
                    nyt.a(this.f26953d);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 102:
                        case 103:
                            this.f26952c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f26954e == null ? 0 : this.f26954e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26954e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26954e = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f26955f == null) {
                        a = 0;
                    } else {
                        a = this.f26955f.length;
                    }
                    obj = new lzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26955f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzh();
                    nyt.a(obj[a]);
                    this.f26955f = obj;
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
