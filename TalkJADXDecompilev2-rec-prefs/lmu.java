package p000;

public final class lmu extends nyx<lmu> {
    public lna[] f25680a;
    public Integer f25681b;
    public String f25682c;
    public String[] f25683d;
    public String f25684e;
    public Integer f25685f;
    public Integer f25686g;
    public Integer f25687h;
    public Integer f25688i;
    public Integer f25689j;
    public Integer f25690k;
    public Integer f25691l;
    public Integer f25692m;
    public String f25693n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29539b(nyt);
    }

    public lmu() {
        this.f25680a = lna.m29570d();
        this.f25681b = null;
        this.f25682c = null;
        this.f25683d = nzl.f;
        this.f25684e = null;
        this.f25685f = null;
        this.f25686g = null;
        this.f25687h = null;
        this.f25688i = null;
        this.f25689j = null;
        this.f25690k = null;
        this.f25691l = null;
        this.f25692m = null;
        this.f25693n = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25680a != null && this.f25680a.length > 0) {
            for (nzf nzf : this.f25680a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25682c != null) {
            nyu.a(2, this.f25682c);
        }
        if (this.f25683d != null && this.f25683d.length > 0) {
            while (i < this.f25683d.length) {
                String str = this.f25683d[i];
                if (str != null) {
                    nyu.a(3, str);
                }
                i++;
            }
        }
        if (this.f25684e != null) {
            nyu.a(4, this.f25684e);
        }
        if (this.f25685f != null) {
            nyu.a(5, this.f25685f.intValue());
        }
        if (this.f25686g != null) {
            nyu.a(6, this.f25686g.intValue());
        }
        if (this.f25687h != null) {
            nyu.a(7, this.f25687h.intValue());
        }
        if (this.f25688i != null) {
            nyu.a(8, this.f25688i.intValue());
        }
        if (this.f25689j != null) {
            nyu.a(9, this.f25689j.intValue());
        }
        if (this.f25690k != null) {
            nyu.a(10, this.f25690k.intValue());
        }
        if (this.f25691l != null) {
            nyu.a(11, this.f25691l.intValue());
        }
        if (this.f25692m != null) {
            nyu.a(12, this.f25692m.intValue());
        }
        if (this.f25693n != null) {
            nyu.a(13, this.f25693n);
        }
        if (this.f25681b != null) {
            nyu.a(14, this.f25681b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f25680a != null && this.f25680a.length > 0) {
            i = b;
            for (nzf nzf : this.f25680a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f25682c != null) {
            b += nyu.b(2, this.f25682c);
        }
        if (this.f25683d != null && this.f25683d.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f25683d.length) {
                String str = this.f25683d[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f25684e != null) {
            b += nyu.b(4, this.f25684e);
        }
        if (this.f25685f != null) {
            b += nyu.f(5, this.f25685f.intValue());
        }
        if (this.f25686g != null) {
            b += nyu.f(6, this.f25686g.intValue());
        }
        if (this.f25687h != null) {
            b += nyu.f(7, this.f25687h.intValue());
        }
        if (this.f25688i != null) {
            b += nyu.f(8, this.f25688i.intValue());
        }
        if (this.f25689j != null) {
            b += nyu.f(9, this.f25689j.intValue());
        }
        if (this.f25690k != null) {
            b += nyu.f(10, this.f25690k.intValue());
        }
        if (this.f25691l != null) {
            b += nyu.f(11, this.f25691l.intValue());
        }
        if (this.f25692m != null) {
            b += nyu.f(12, this.f25692m.intValue());
        }
        if (this.f25693n != null) {
            b += nyu.b(13, this.f25693n);
        }
        if (this.f25681b != null) {
            return b + nyu.f(14, this.f25681b.intValue());
        }
        return b;
    }

    private lmu m29539b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f25680a == null) {
                        a = 0;
                    } else {
                        a = this.f25680a.length;
                    }
                    obj = new lna[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25680a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lna();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lna();
                    nyt.a(obj[a]);
                    this.f25680a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f25682c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f25683d == null ? 0 : this.f25683d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25683d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25683d = obj;
                    continue;
                case 34:
                    this.f25684e = nyt.j();
                    continue;
                case 40:
                    this.f25685f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25686g = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f25687h = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    this.f25688i = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    this.f25689j = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.f25690k = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.f25691l = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.f25692m = Integer.valueOf(nyt.f());
                    continue;
                case 106:
                    this.f25693n = nyt.j();
                    continue;
                case 112:
                    this.f25681b = Integer.valueOf(nyt.f());
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
