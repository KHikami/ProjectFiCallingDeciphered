package defpackage;

public final class nqe extends nyx<nqe> {
    public nst a;
    public String b;
    public nco c;
    public nco[] d;
    public nco[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nqe() {
        this.b = null;
        this.d = nco.d();
        this.e = nco.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private nqe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nst();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nco();
                    }
                    nyt.a(this.c);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new nco[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nco();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nco();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new nco[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nco();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nco();
                    nyt.a(obj[a]);
                    this.e = obj;
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
