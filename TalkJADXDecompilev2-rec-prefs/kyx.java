package p000;

public final class kyx extends nyx<kyx> {
    public kzh[] f24119a;
    public ldt[] f24120b;
    public String f24121c;
    public kza f24122d;
    public String f24123e;
    public kxu[] f24124f;
    public kyo f24125g;
    public Integer f24126h;
    public ldd f24127i;
    public byte[] f24128j;
    public ldj f24129k;
    public ldd[] f24130l;
    public kze f24131m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28144b(nyt);
    }

    public kyx() {
        m28145d();
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24119a != null && this.f24119a.length > 0) {
            for (nzf nzf : this.f24119a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24121c != null) {
            nyu.a(2, this.f24121c);
        }
        if (this.f24122d != null) {
            nyu.b(3, this.f24122d);
        }
        if (this.f24123e != null) {
            nyu.a(4, this.f24123e);
        }
        if (this.f24124f != null && this.f24124f.length > 0) {
            for (nzf nzf2 : this.f24124f) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.f24125g != null) {
            nyu.b(6, this.f24125g);
        }
        if (this.f24126h != null) {
            nyu.a(7, this.f24126h.intValue());
        }
        if (this.f24120b != null && this.f24120b.length > 0) {
            for (nzf nzf22 : this.f24120b) {
                if (nzf22 != null) {
                    nyu.b(8, nzf22);
                }
            }
        }
        if (this.f24127i != null) {
            nyu.b(9, this.f24127i);
        }
        if (this.f24128j != null) {
            nyu.a(10, this.f24128j);
        }
        if (this.f24129k != null) {
            nyu.b(11, this.f24129k);
        }
        if (this.f24130l != null && this.f24130l.length > 0) {
            while (i < this.f24130l.length) {
                nzf nzf3 = this.f24130l[i];
                if (nzf3 != null) {
                    nyu.b(12, nzf3);
                }
                i++;
            }
        }
        if (this.f24131m != null) {
            nyu.b(13, this.f24131m);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24119a != null && this.f24119a.length > 0) {
            i = b;
            for (nzf nzf : this.f24119a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f24121c != null) {
            b += nyu.b(2, this.f24121c);
        }
        if (this.f24122d != null) {
            b += nyu.d(3, this.f24122d);
        }
        if (this.f24123e != null) {
            b += nyu.b(4, this.f24123e);
        }
        if (this.f24124f != null && this.f24124f.length > 0) {
            i = b;
            for (nzf nzf2 : this.f24124f) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f24125g != null) {
            b += nyu.d(6, this.f24125g);
        }
        if (this.f24126h != null) {
            b += nyu.f(7, this.f24126h.intValue());
        }
        if (this.f24120b != null && this.f24120b.length > 0) {
            i = b;
            for (nzf nzf22 : this.f24120b) {
                if (nzf22 != null) {
                    i += nyu.d(8, nzf22);
                }
            }
            b = i;
        }
        if (this.f24127i != null) {
            b += nyu.d(9, this.f24127i);
        }
        if (this.f24128j != null) {
            b += nyu.b(10, this.f24128j);
        }
        if (this.f24129k != null) {
            b += nyu.d(11, this.f24129k);
        }
        if (this.f24130l != null && this.f24130l.length > 0) {
            while (i2 < this.f24130l.length) {
                nzf nzf3 = this.f24130l[i2];
                if (nzf3 != null) {
                    b += nyu.d(12, nzf3);
                }
                i2++;
            }
        }
        if (this.f24131m != null) {
            return b + nyu.d(13, this.f24131m);
        }
        return b;
    }

    private kyx m28144b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f24119a == null) {
                        a = 0;
                    } else {
                        a = this.f24119a.length;
                    }
                    obj = new kzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24119a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzh();
                    nyt.a(obj[a]);
                    this.f24119a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f24121c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24122d == null) {
                        this.f24122d = new kza();
                    }
                    nyt.a(this.f24122d);
                    continue;
                case 34:
                    this.f24123e = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f24124f == null) {
                        a = 0;
                    } else {
                        a = this.f24124f.length;
                    }
                    obj = new kxu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24124f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxu();
                    nyt.a(obj[a]);
                    this.f24124f = obj;
                    continue;
                case 50:
                    if (this.f24125g == null) {
                        this.f24125g = new kyo();
                    }
                    nyt.a(this.f24125g);
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f24126h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f24120b == null) {
                        a = 0;
                    } else {
                        a = this.f24120b.length;
                    }
                    obj = new ldt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24120b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldt();
                    nyt.a(obj[a]);
                    this.f24120b = obj;
                    continue;
                case 74:
                    if (this.f24127i == null) {
                        this.f24127i = new ldd();
                    }
                    nyt.a(this.f24127i);
                    continue;
                case 82:
                    this.f24128j = nyt.k();
                    continue;
                case 90:
                    if (this.f24129k == null) {
                        this.f24129k = new ldj();
                    }
                    nyt.a(this.f24129k);
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.f24130l == null) {
                        a = 0;
                    } else {
                        a = this.f24130l.length;
                    }
                    obj = new ldd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24130l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldd();
                    nyt.a(obj[a]);
                    this.f24130l = obj;
                    continue;
                case 106:
                    if (this.f24131m == null) {
                        this.f24131m = new kze();
                    }
                    nyt.a(this.f24131m);
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

    private kyx m28145d() {
        this.f24119a = kzh.f24195c;
        this.f24120b = ldt.m28787d();
        this.f24121c = null;
        this.f24122d = null;
        this.f24123e = null;
        this.f24124f = kxu.m27977d();
        this.f24125g = null;
        this.f24127i = null;
        this.f24128j = null;
        this.f24129k = null;
        this.f24130l = ldd.m28707d();
        this.f24131m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }
}
