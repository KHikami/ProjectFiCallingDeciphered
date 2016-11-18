package p000;

public final class klk extends nyx<klk> {
    public Boolean f22222a;
    public Integer f22223b;
    public Long f22224c;
    public String f22225d;
    public Boolean f22226e;
    public Boolean f22227f;
    public kjw[] f22228g;
    public Integer f22229h;
    public Boolean f22230i;
    public kjm[] f22231j;
    public Long f22232k;
    public kkd f22233l;
    public Boolean f22234m;
    public kky[] f22235n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26395b(nyt);
    }

    public klk() {
        m26396d();
    }

    private klk m26396d() {
        this.f22222a = null;
        this.f22224c = null;
        this.f22225d = null;
        this.f22226e = null;
        this.f22227f = null;
        this.f22228g = kjw.m26168d();
        this.f22230i = null;
        this.f22231j = kjm.m26109d();
        this.f22232k = null;
        this.f22233l = null;
        this.f22234m = null;
        this.f22235n = kky.m26326d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22222a != null) {
            nyu.a(1, this.f22222a.booleanValue());
        }
        if (this.f22223b != null) {
            nyu.a(2, this.f22223b.intValue());
        }
        if (this.f22226e != null) {
            nyu.a(3, this.f22226e.booleanValue());
        }
        if (this.f22227f != null) {
            nyu.a(4, this.f22227f.booleanValue());
        }
        if (this.f22232k != null) {
            nyu.b(5, this.f22232k.longValue());
        }
        if (this.f22229h != null) {
            nyu.a(6, this.f22229h.intValue());
        }
        if (this.f22230i != null) {
            nyu.a(7, this.f22230i.booleanValue());
        }
        if (this.f22224c != null) {
            nyu.b(8, this.f22224c.longValue());
        }
        if (this.f22225d != null) {
            nyu.a(9, this.f22225d);
        }
        if (this.f22231j != null && this.f22231j.length > 0) {
            for (nzf nzf : this.f22231j) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.f22233l != null) {
            nyu.b(11, this.f22233l);
        }
        if (this.f22234m != null) {
            nyu.a(12, this.f22234m.booleanValue());
        }
        if (this.f22228g != null && this.f22228g.length > 0) {
            for (nzf nzf2 : this.f22228g) {
                if (nzf2 != null) {
                    nyu.b(13, nzf2);
                }
            }
        }
        if (this.f22235n != null && this.f22235n.length > 0) {
            while (i < this.f22235n.length) {
                nzf nzf3 = this.f22235n[i];
                if (nzf3 != null) {
                    nyu.b(14, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f22222a != null) {
            this.f22222a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22223b != null) {
            b += nyu.f(2, this.f22223b.intValue());
        }
        if (this.f22226e != null) {
            this.f22226e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22227f != null) {
            this.f22227f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f22232k != null) {
            b += nyu.f(5, this.f22232k.longValue());
        }
        if (this.f22229h != null) {
            b += nyu.f(6, this.f22229h.intValue());
        }
        if (this.f22230i != null) {
            this.f22230i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f22224c != null) {
            b += nyu.f(8, this.f22224c.longValue());
        }
        if (this.f22225d != null) {
            b += nyu.b(9, this.f22225d);
        }
        if (this.f22231j != null && this.f22231j.length > 0) {
            i = b;
            for (nzf nzf : this.f22231j) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f22233l != null) {
            b += nyu.d(11, this.f22233l);
        }
        if (this.f22234m != null) {
            this.f22234m.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f22228g != null && this.f22228g.length > 0) {
            i = b;
            for (nzf nzf2 : this.f22228g) {
                if (nzf2 != null) {
                    i += nyu.d(13, nzf2);
                }
            }
            b = i;
        }
        if (this.f22235n != null && this.f22235n.length > 0) {
            while (i2 < this.f22235n.length) {
                nzf nzf3 = this.f22235n[i2];
                if (nzf3 != null) {
                    b += nyu.d(14, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private klk m26395b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22222a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
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
                            this.f22223b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f22226e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22227f = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f22232k = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22229h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.f22230i = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f22224c = Long.valueOf(nyt.e());
                    continue;
                case 74:
                    this.f22225d = nyt.j();
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f22231j == null) {
                        a = 0;
                    } else {
                        a = this.f22231j.length;
                    }
                    obj = new kjm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22231j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjm();
                    nyt.a(obj[a]);
                    this.f22231j = obj;
                    continue;
                case 90:
                    if (this.f22233l == null) {
                        this.f22233l = new kkd();
                    }
                    nyt.a(this.f22233l);
                    continue;
                case 96:
                    this.f22234m = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.f22228g == null) {
                        a = 0;
                    } else {
                        a = this.f22228g.length;
                    }
                    obj = new kjw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22228g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjw();
                    nyt.a(obj[a]);
                    this.f22228g = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.f22235n == null) {
                        a = 0;
                    } else {
                        a = this.f22235n.length;
                    }
                    obj = new kky[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22235n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kky();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kky();
                    nyt.a(obj[a]);
                    this.f22235n = obj;
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
