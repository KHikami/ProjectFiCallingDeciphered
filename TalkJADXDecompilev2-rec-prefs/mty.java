package p000;

public final class mty extends nyx<mty> {
    public static final nyy<ozo, mty> f28311a = nyy.a(11, mty.class, 97670194);
    private static final mty[] f28312k = new mty[0];
    public mtz[] f28313b;
    public mua[] f28314c;
    public mua[] f28315d;
    public Boolean f28316e;
    public Boolean f28317f;
    public Boolean f28318g;
    public mtz[] f28319h;
    public ozo f28320i;
    public muf f28321j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32903b(nyt);
    }

    public mty() {
        m32904d();
    }

    private mty m32904d() {
        this.f28313b = mtz.m32909d();
        this.f28314c = mua.m32915d();
        this.f28315d = mua.m32915d();
        this.f28316e = null;
        this.f28317f = null;
        this.f28318g = null;
        this.f28319h = mtz.m32909d();
        this.f28320i = null;
        this.f28321j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28313b != null && this.f28313b.length > 0) {
            for (nzf nzf : this.f28313b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f28316e != null) {
            nyu.a(3, this.f28316e.booleanValue());
        }
        if (this.f28317f != null) {
            nyu.a(4, this.f28317f.booleanValue());
        }
        if (this.f28319h != null && this.f28319h.length > 0) {
            for (nzf nzf2 : this.f28319h) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.f28314c != null && this.f28314c.length > 0) {
            for (nzf nzf22 : this.f28314c) {
                if (nzf22 != null) {
                    nyu.b(6, nzf22);
                }
            }
        }
        if (this.f28318g != null) {
            nyu.a(7, this.f28318g.booleanValue());
        }
        if (this.f28320i != null) {
            nyu.b(8, this.f28320i);
        }
        if (this.f28315d != null && this.f28315d.length > 0) {
            while (i < this.f28315d.length) {
                nzf nzf3 = this.f28315d[i];
                if (nzf3 != null) {
                    nyu.b(9, nzf3);
                }
                i++;
            }
        }
        if (this.f28321j != null) {
            nyu.b(500, this.f28321j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f28313b != null && this.f28313b.length > 0) {
            i = b;
            for (nzf nzf : this.f28313b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f28316e != null) {
            this.f28316e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f28317f != null) {
            this.f28317f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f28319h != null && this.f28319h.length > 0) {
            i = b;
            for (nzf nzf2 : this.f28319h) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f28314c != null && this.f28314c.length > 0) {
            i = b;
            for (nzf nzf22 : this.f28314c) {
                if (nzf22 != null) {
                    i += nyu.d(6, nzf22);
                }
            }
            b = i;
        }
        if (this.f28318g != null) {
            this.f28318g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f28320i != null) {
            b += nyu.d(8, this.f28320i);
        }
        if (this.f28315d != null && this.f28315d.length > 0) {
            while (i2 < this.f28315d.length) {
                nzf nzf3 = this.f28315d[i2];
                if (nzf3 != null) {
                    b += nyu.d(9, nzf3);
                }
                i2++;
            }
        }
        if (this.f28321j != null) {
            return b + nyu.d(500, this.f28321j);
        }
        return b;
    }

    private mty m32903b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f28313b == null) {
                        a = 0;
                    } else {
                        a = this.f28313b.length;
                    }
                    obj = new mtz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28313b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mtz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mtz();
                    nyt.a(obj[a]);
                    this.f28313b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f28316e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f28317f = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f28319h == null) {
                        a = 0;
                    } else {
                        a = this.f28319h.length;
                    }
                    obj = new mtz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28319h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mtz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mtz();
                    nyt.a(obj[a]);
                    this.f28319h = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f28314c == null) {
                        a = 0;
                    } else {
                        a = this.f28314c.length;
                    }
                    obj = new mua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28314c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mua();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mua();
                    nyt.a(obj[a]);
                    this.f28314c = obj;
                    continue;
                case 56:
                    this.f28318g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f28320i == null) {
                        this.f28320i = new ozo();
                    }
                    nyt.a(this.f28320i);
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.f28315d == null) {
                        a = 0;
                    } else {
                        a = this.f28315d.length;
                    }
                    obj = new mua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28315d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mua();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mua();
                    nyt.a(obj[a]);
                    this.f28315d = obj;
                    continue;
                case 4002:
                    if (this.f28321j == null) {
                        this.f28321j = new muf();
                    }
                    nyt.a(this.f28321j);
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
