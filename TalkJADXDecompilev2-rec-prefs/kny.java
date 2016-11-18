package p000;

public final class kny extends nyx<kny> {
    public knv[] f22455a;
    public knv[] f22456b;
    public String f22457c;
    public String f22458d;
    public knz[] f22459e;
    public knx f22460f;
    public knw f22461g;
    public Boolean f22462h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26739b(nyt);
    }

    public kny() {
        m26740d();
    }

    private kny m26740d() {
        this.f22455a = knv.m26724d();
        this.f22456b = knv.m26724d();
        this.f22457c = null;
        this.f22458d = null;
        this.f22459e = knz.m26745d();
        this.f22460f = null;
        this.f22461g = null;
        this.f22462h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22455a != null && this.f22455a.length > 0) {
            for (nzf nzf : this.f22455a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22456b != null && this.f22456b.length > 0) {
            for (nzf nzf2 : this.f22456b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f22457c != null) {
            nyu.a(3, this.f22457c);
        }
        if (this.f22458d != null) {
            nyu.a(4, this.f22458d);
        }
        if (this.f22459e != null && this.f22459e.length > 0) {
            while (i < this.f22459e.length) {
                nzf nzf3 = this.f22459e[i];
                if (nzf3 != null) {
                    nyu.b(5, nzf3);
                }
                i++;
            }
        }
        if (this.f22460f != null) {
            nyu.b(6, this.f22460f);
        }
        if (this.f22461g != null) {
            nyu.b(7, this.f22461g);
        }
        if (this.f22462h != null) {
            nyu.a(8, this.f22462h.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f22455a != null && this.f22455a.length > 0) {
            i = b;
            for (nzf nzf : this.f22455a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f22456b != null && this.f22456b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f22456b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f22457c != null) {
            b += nyu.b(3, this.f22457c);
        }
        if (this.f22458d != null) {
            b += nyu.b(4, this.f22458d);
        }
        if (this.f22459e != null && this.f22459e.length > 0) {
            while (i2 < this.f22459e.length) {
                nzf nzf3 = this.f22459e[i2];
                if (nzf3 != null) {
                    b += nyu.d(5, nzf3);
                }
                i2++;
            }
        }
        if (this.f22460f != null) {
            b += nyu.d(6, this.f22460f);
        }
        if (this.f22461g != null) {
            b += nyu.d(7, this.f22461g);
        }
        if (this.f22462h == null) {
            return b;
        }
        this.f22462h.booleanValue();
        return b + (nyu.h(8) + 1);
    }

    private kny m26739b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f22455a == null) {
                        a = 0;
                    } else {
                        a = this.f22455a.length;
                    }
                    obj = new knv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22455a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new knv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new knv();
                    nyt.a(obj[a]);
                    this.f22455a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f22456b == null) {
                        a = 0;
                    } else {
                        a = this.f22456b.length;
                    }
                    obj = new knv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22456b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new knv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new knv();
                    nyt.a(obj[a]);
                    this.f22456b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f22457c = nyt.j();
                    continue;
                case 34:
                    this.f22458d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f22459e == null) {
                        a = 0;
                    } else {
                        a = this.f22459e.length;
                    }
                    obj = new knz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22459e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new knz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new knz();
                    nyt.a(obj[a]);
                    this.f22459e = obj;
                    continue;
                case 50:
                    if (this.f22460f == null) {
                        this.f22460f = new knx();
                    }
                    nyt.a(this.f22460f);
                    continue;
                case 58:
                    if (this.f22461g == null) {
                        this.f22461g = new knw();
                    }
                    nyt.a(this.f22461g);
                    continue;
                case 64:
                    this.f22462h = Boolean.valueOf(nyt.i());
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
