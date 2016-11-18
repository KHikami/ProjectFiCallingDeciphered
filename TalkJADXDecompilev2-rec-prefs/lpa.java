package p000;

public final class lpa extends nyx<lpa> {
    public Integer f25977a;
    public lom f25978b;
    public lsg[] f25979c;
    public Boolean f25980d;
    public Long f25981e;
    public String f25982f;
    public byte[][] f25983g;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29852b(nyt);
    }

    public lpa() {
        m29853d();
    }

    private lpa m29853d() {
        this.responseHeader = null;
        this.f25978b = null;
        this.f25979c = lsg.m30297d();
        this.f25980d = null;
        this.f25981e = null;
        this.f25982f = null;
        this.f25983g = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f25978b != null) {
            nyu.b(2, this.f25978b);
        }
        if (this.f25979c != null && this.f25979c.length > 0) {
            for (nzf nzf : this.f25979c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f25981e != null) {
            nyu.a(4, this.f25981e.longValue());
        }
        if (this.f25982f != null) {
            nyu.a(5, this.f25982f);
        }
        if (this.f25983g != null && this.f25983g.length > 0) {
            while (i < this.f25983g.length) {
                byte[] bArr = this.f25983g[i];
                if (bArr != null) {
                    nyu.a(6, bArr);
                }
                i++;
            }
        }
        if (this.f25980d != null) {
            nyu.a(7, this.f25980d.booleanValue());
        }
        if (this.f25977a != null) {
            nyu.a(8, this.f25977a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f25978b != null) {
            b += nyu.d(2, this.f25978b);
        }
        if (this.f25979c != null && this.f25979c.length > 0) {
            i = b;
            for (nzf nzf : this.f25979c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f25981e != null) {
            b += nyu.e(4, this.f25981e.longValue());
        }
        if (this.f25982f != null) {
            b += nyu.b(5, this.f25982f);
        }
        if (this.f25983g != null && this.f25983g.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f25983g.length) {
                byte[] bArr = this.f25983g[i2];
                if (bArr != null) {
                    i3++;
                    i += nyu.b(bArr);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f25980d != null) {
            this.f25980d.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25977a != null) {
            return b + nyu.f(8, this.f25977a.intValue());
        }
        return b;
    }

    private lpa m29852b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25978b == null) {
                        this.f25978b = new lom();
                    }
                    nyt.a(this.f25978b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f25979c == null) {
                        a = 0;
                    } else {
                        a = this.f25979c.length;
                    }
                    obj = new lsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25979c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsg();
                    nyt.a(obj[a]);
                    this.f25979c = obj;
                    continue;
                case 32:
                    this.f25981e = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    this.f25982f = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f25983g == null ? 0 : this.f25983g.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f25983g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f25983g = obj;
                    continue;
                case 56:
                    this.f25980d = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25977a = Integer.valueOf(a);
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
