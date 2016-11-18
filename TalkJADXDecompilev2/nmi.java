package defpackage;

public final class nmi extends nyx<nmi> {
    public String a;
    public nlr[] b;
    public nge[] c;
    public niv[] d;
    public nme[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmi() {
        d();
    }

    private nmi d() {
        this.a = null;
        this.b = nlr.d();
        this.c = nge.d();
        this.d = niv.d();
        this.e = nme.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf22 : this.d) {
                if (nzf22 != null) {
                    nyu.b(4, nzf22);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf3 = this.e[i];
                if (nzf3 != null) {
                    nyu.b(5, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf22 : this.d) {
                if (nzf22 != null) {
                    i += nyu.d(4, nzf22);
                }
            }
            b = i;
        }
        if (this.e != null && this.e.length > 0) {
            while (i2 < this.e.length) {
                nzf nzf3 = this.e[i2];
                if (nzf3 != null) {
                    b += nyu.d(5, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nmi b(nyt nyt) {
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
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new nlr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nlr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nlr();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new nge[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nge();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nge();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new niv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new niv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new niv();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new nme[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nme();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nme();
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
