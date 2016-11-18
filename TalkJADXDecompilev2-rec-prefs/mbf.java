package p000;

public final class mbf extends nyx<mbf> {
    public lzj f27208a;
    public lym[] f27209b;
    public lzh[] f27210c;
    public Integer f27211d;
    public lzh f27212e;
    public Integer f27213f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31557b(nyt);
    }

    public mbf() {
        m31558d();
    }

    private mbf m31558d() {
        this.f27208a = null;
        this.f27209b = lym.m31158d();
        this.f27210c = lzh.m31267d();
        this.f27212e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27208a != null) {
            nyu.b(1, this.f27208a);
        }
        if (this.f27209b != null && this.f27209b.length > 0) {
            for (nzf nzf : this.f27209b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27210c != null && this.f27210c.length > 0) {
            while (i < this.f27210c.length) {
                nzf nzf2 = this.f27210c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27211d != null) {
            nyu.a(4, this.f27211d.intValue());
        }
        if (this.f27212e != null) {
            nyu.b(5, this.f27212e);
        }
        if (this.f27213f != null) {
            nyu.a(6, this.f27213f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27208a != null) {
            b += nyu.d(1, this.f27208a);
        }
        if (this.f27209b != null && this.f27209b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27209b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27210c != null && this.f27210c.length > 0) {
            while (i < this.f27210c.length) {
                nzf nzf2 = this.f27210c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27211d != null) {
            b += nyu.f(4, this.f27211d.intValue());
        }
        if (this.f27212e != null) {
            b += nyu.d(5, this.f27212e);
        }
        if (this.f27213f != null) {
            return b + nyu.f(6, this.f27213f.intValue());
        }
        return b;
    }

    private mbf m31557b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27208a == null) {
                        this.f27208a = new lzj();
                    }
                    nyt.a(this.f27208a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27209b == null) {
                        a = 0;
                    } else {
                        a = this.f27209b.length;
                    }
                    obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27209b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f27209b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27210c == null) {
                        a = 0;
                    } else {
                        a = this.f27210c.length;
                    }
                    obj = new lzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27210c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzh();
                    nyt.a(obj[a]);
                    this.f27210c = obj;
                    continue;
                case 32:
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
                            this.f27211d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f27212e == null) {
                        this.f27212e = new lzh();
                    }
                    nyt.a(this.f27212e);
                    continue;
                case 48:
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
                            this.f27213f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
