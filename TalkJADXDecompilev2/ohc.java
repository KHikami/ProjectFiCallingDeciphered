package defpackage;

public final class ohc extends nyx<ohc> {
    public String a;
    public String b;
    public String c;
    public ohm[] d;
    public ohm[] e;
    public String f;
    public ohd[] g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ohc() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = ohm.d();
        this.e = ohm.d();
        this.f = null;
        this.g = ohd.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
            }
        }
        if (this.c != null) {
            nyu.a(5, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf3 = this.e[i];
                if (nzf3 != null) {
                    nyu.b(7, nzf3);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.a(8, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.g != null && this.g.length > 0) {
            i = b;
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    i += nyu.d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.b(5, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            while (i2 < this.e.length) {
                nzf nzf3 = this.e[i2];
                if (nzf3 != null) {
                    b += nyu.d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.f != null) {
            return b + nyu.b(8, this.f);
        }
        return b;
    }

    private ohc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new ohd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohd();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 42:
                    this.c = nyt.j();
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 66:
                    this.f = nyt.j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
