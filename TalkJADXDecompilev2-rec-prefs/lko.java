package p000;

public final class lko extends nyx<lko> {
    public String f25158a;
    public String f25159b;
    public Integer f25160c;
    public Integer f25161d;
    public Long f25162e;
    public Long f25163f;
    public String f25164g;
    public String f25165h;
    public lkq[] f25166i;
    public Boolean f25167j;
    public Integer f25168k;
    public Integer f25169l;
    public String f25170m;
    public Integer f25171n;
    public String f25172o;
    public Integer f25173p;
    public lkp f25174q;
    public Long f25175r;
    public lkv[] f25176s;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29238b(nyt);
    }

    public lko() {
        m29239d();
    }

    private lko m29239d() {
        this.f25158a = null;
        this.f25159b = null;
        this.f25160c = null;
        this.f25162e = null;
        this.f25163f = null;
        this.f25164g = null;
        this.f25165h = null;
        this.f25166i = lkq.m29249d();
        this.f25167j = null;
        this.f25168k = null;
        this.f25169l = null;
        this.f25170m = null;
        this.f25171n = null;
        this.f25172o = null;
        this.f25173p = null;
        this.f25174q = null;
        this.f25175r = null;
        this.f25176s = lkv.m29278d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f25158a);
        nyu.a(2, this.f25159b);
        nyu.a(3, this.f25160c.intValue());
        if (this.f25164g != null) {
            nyu.a(4, this.f25164g);
        }
        if (this.f25166i != null && this.f25166i.length > 0) {
            for (nzf nzf : this.f25166i) {
                if (nzf != null) {
                    nyu.a(5, nzf);
                }
            }
        }
        if (this.f25167j != null) {
            nyu.a(28, this.f25167j.booleanValue());
        }
        if (this.f25168k != null) {
            nyu.a(29, this.f25168k.intValue());
        }
        if (this.f25169l != null) {
            nyu.a(30, this.f25169l.intValue());
        }
        if (this.f25175r != null) {
            nyu.b(42, this.f25175r.longValue());
        }
        if (this.f25165h != null) {
            nyu.a(43, this.f25165h);
        }
        if (this.f25176s != null && this.f25176s.length > 0) {
            while (i < this.f25176s.length) {
                nzf nzf2 = this.f25176s[i];
                if (nzf2 != null) {
                    nyu.b(52, nzf2);
                }
                i++;
            }
        }
        if (this.f25173p != null) {
            nyu.a(68, this.f25173p.intValue());
        }
        if (this.f25174q != null) {
            nyu.b(69, this.f25174q);
        }
        if (this.f25172o != null) {
            nyu.a(100, this.f25172o);
        }
        if (this.f25163f != null) {
            nyu.b(104, this.f25163f.longValue());
        }
        if (this.f25161d != null) {
            nyu.a(105, this.f25161d.intValue());
        }
        if (this.f25171n != null) {
            nyu.a(106, this.f25171n.intValue());
        }
        if (this.f25162e != null) {
            nyu.b(107, this.f25162e.longValue());
        }
        if (this.f25170m != null) {
            nyu.a(112, this.f25170m);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = ((super.mo147b() + nyu.b(1, this.f25158a)) + nyu.b(2, this.f25159b)) + nyu.f(3, this.f25160c.intValue());
        if (this.f25164g != null) {
            b += nyu.b(4, this.f25164g);
        }
        if (this.f25166i != null && this.f25166i.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f25166i) {
                if (nzf != null) {
                    i2 += nyu.c(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f25167j != null) {
            this.f25167j.booleanValue();
            b += nyu.h(28) + 1;
        }
        if (this.f25168k != null) {
            b += nyu.f(29, this.f25168k.intValue());
        }
        if (this.f25169l != null) {
            b += nyu.f(30, this.f25169l.intValue());
        }
        if (this.f25175r != null) {
            b += nyu.f(42, this.f25175r.longValue());
        }
        if (this.f25165h != null) {
            b += nyu.b(43, this.f25165h);
        }
        if (this.f25176s != null && this.f25176s.length > 0) {
            while (i < this.f25176s.length) {
                nzf nzf2 = this.f25176s[i];
                if (nzf2 != null) {
                    b += nyu.d(52, nzf2);
                }
                i++;
            }
        }
        if (this.f25173p != null) {
            b += nyu.f(68, this.f25173p.intValue());
        }
        if (this.f25174q != null) {
            b += nyu.d(69, this.f25174q);
        }
        if (this.f25172o != null) {
            b += nyu.b(100, this.f25172o);
        }
        if (this.f25163f != null) {
            b += nyu.f(104, this.f25163f.longValue());
        }
        if (this.f25161d != null) {
            b += nyu.f(105, this.f25161d.intValue());
        }
        if (this.f25171n != null) {
            b += nyu.f(106, this.f25171n.intValue());
        }
        if (this.f25162e != null) {
            b += nyu.f(107, this.f25162e.longValue());
        }
        if (this.f25170m != null) {
            return b + nyu.b(112, this.f25170m);
        }
        return b;
    }

    private lko m29238b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25158a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25159b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25160c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f25164g = nyt.j();
                    continue;
                case 43:
                    b = nzl.b(nyt, 43);
                    if (this.f25166i == null) {
                        a = 0;
                    } else {
                        a = this.f25166i.length;
                    }
                    obj = new lkq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25166i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkq();
                        nyt.a(obj[a], 5);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkq();
                    nyt.a(obj[a], 5);
                    this.f25166i = obj;
                    continue;
                case 224:
                    this.f25167j = Boolean.valueOf(nyt.i());
                    continue;
                case 232:
                    this.f25168k = Integer.valueOf(nyt.f());
                    continue;
                case 240:
                    this.f25169l = Integer.valueOf(nyt.f());
                    continue;
                case 336:
                    this.f25175r = Long.valueOf(nyt.e());
                    continue;
                case 346:
                    this.f25165h = nyt.j();
                    continue;
                case 418:
                    b = nzl.b(nyt, 418);
                    if (this.f25176s == null) {
                        a = 0;
                    } else {
                        a = this.f25176s.length;
                    }
                    obj = new lkv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25176s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkv();
                    nyt.a(obj[a]);
                    this.f25176s = obj;
                    continue;
                case 544:
                    this.f25173p = Integer.valueOf(nyt.f());
                    continue;
                case 554:
                    if (this.f25174q == null) {
                        this.f25174q = new lkp();
                    }
                    nyt.a(this.f25174q);
                    continue;
                case 802:
                    this.f25172o = nyt.j();
                    continue;
                case 832:
                    this.f25163f = Long.valueOf(nyt.e());
                    continue;
                case 840:
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
                            this.f25161d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 848:
                    this.f25171n = Integer.valueOf(nyt.f());
                    continue;
                case 856:
                    this.f25162e = Long.valueOf(nyt.e());
                    continue;
                case 898:
                    this.f25170m = nyt.j();
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
