package p000;

public final class mxb extends nyx<mxb> {
    public Integer f28651a;
    public mwl[] f28652b;
    public long[] f28653c;
    public boolean[] f28654d;
    public mwm[] f28655e;
    public String f28656f;
    public String f28657g;
    public mxs f28658h;
    public Integer f28659i;
    public Integer f28660j;
    public mzh f28661k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33289b(nyt);
    }

    public mxb() {
        this.f28651a = null;
        this.f28652b = mwl.m33218d();
        this.f28653c = nzl.b;
        this.f28654d = nzl.e;
        this.f28655e = mwm.m33223d();
        this.f28656f = null;
        this.f28657g = null;
        this.f28659i = null;
        this.f28660j = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28652b != null && this.f28652b.length > 0) {
            for (nzf nzf : this.f28652b) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28656f != null) {
            nyu.a(2, this.f28656f);
        }
        if (this.f28658h != null) {
            nyu.b(3, this.f28658h);
        }
        if (this.f28659i != null) {
            nyu.a(4, this.f28659i.intValue());
        }
        if (this.f28660j != null) {
            nyu.a(5, this.f28660j.intValue());
        }
        if (this.f28651a != null) {
            nyu.a(6, this.f28651a.intValue());
        }
        if (this.f28653c != null && this.f28653c.length > 0) {
            for (long b : this.f28653c) {
                nyu.b(7, b);
            }
        }
        if (this.f28654d != null && this.f28654d.length > 0) {
            for (boolean a : this.f28654d) {
                nyu.a(8, a);
            }
        }
        if (this.f28655e != null && this.f28655e.length > 0) {
            while (i < this.f28655e.length) {
                nzf nzf2 = this.f28655e[i];
                if (nzf2 != null) {
                    nyu.b(9, nzf2);
                }
                i++;
            }
        }
        if (this.f28657g != null) {
            nyu.a(10, this.f28657g);
        }
        if (this.f28661k != null) {
            nyu.b(11, this.f28661k);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f28652b != null && this.f28652b.length > 0) {
            i = b;
            for (nzf nzf : this.f28652b) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f28656f != null) {
            b += nyu.b(2, this.f28656f);
        }
        if (this.f28658h != null) {
            b += nyu.d(3, this.f28658h);
        }
        if (this.f28659i != null) {
            b += nyu.f(4, this.f28659i.intValue());
        }
        if (this.f28660j != null) {
            b += nyu.f(5, this.f28660j.intValue());
        }
        if (this.f28651a != null) {
            b += nyu.f(6, this.f28651a.intValue());
        }
        if (this.f28653c != null && this.f28653c.length > 0) {
            int i3 = 0;
            for (long f : this.f28653c) {
                i3 += nyu.f(f);
            }
            b = (b + i3) + (this.f28653c.length * 1);
        }
        if (this.f28654d != null && this.f28654d.length > 0) {
            b = (b + (this.f28654d.length * 1)) + (this.f28654d.length * 1);
        }
        if (this.f28655e != null && this.f28655e.length > 0) {
            while (i2 < this.f28655e.length) {
                nzf nzf2 = this.f28655e[i2];
                if (nzf2 != null) {
                    b += nyu.d(9, nzf2);
                }
                i2++;
            }
        }
        if (this.f28657g != null) {
            b += nyu.b(10, this.f28657g);
        }
        if (this.f28661k != null) {
            return b + nyu.d(11, this.f28661k);
        }
        return b;
    }

    private mxb m33289b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f28652b == null) {
                        a = 0;
                    } else {
                        a = this.f28652b.length;
                    }
                    obj = new mwl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28652b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwl();
                    nyt.a(obj[a]);
                    this.f28652b = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f28656f = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f28658h == null) {
                        this.f28658h = new mxs();
                    }
                    nyt.a(this.f28658h);
                    continue;
                case 32:
                    this.f28659i = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f28660j = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f28651a = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    b = nzl.b(nyt, 56);
                    a = this.f28653c == null ? 0 : this.f28653c.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28653c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f28653c = obj;
                    continue;
                case 58:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28653c == null ? 0 : this.f28653c.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28653c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f28653c = obj2;
                    nyt.e(d);
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.f28654d == null ? 0 : this.f28654d.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28654d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.i();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.i();
                    this.f28654d = obj;
                    continue;
                case 66:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.i();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f28654d == null ? 0 : this.f28654d.length;
                    obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f28654d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.i();
                        b++;
                    }
                    this.f28654d = obj2;
                    nyt.e(d);
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.f28655e == null) {
                        a = 0;
                    } else {
                        a = this.f28655e.length;
                    }
                    obj = new mwm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28655e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwm();
                    nyt.a(obj[a]);
                    this.f28655e = obj;
                    continue;
                case 82:
                    this.f28657g = nyt.j();
                    continue;
                case 90:
                    if (this.f28661k == null) {
                        this.f28661k = new mzh();
                    }
                    nyt.a(this.f28661k);
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
