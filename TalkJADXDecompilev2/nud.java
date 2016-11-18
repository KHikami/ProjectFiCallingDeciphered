package defpackage;

public final class nud extends nyx<nud> {
    private static volatile nud[] d;
    public nua[] a;
    public nuf[] b;
    public nuc[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nud[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new nud[0];
                }
            }
        }
        return d;
    }

    public nud() {
        g();
    }

    private nud g() {
        this.a = nua.d();
        this.b = nuf.d();
        this.c = nuc.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf3 = this.c[i];
                if (nzf3 != null) {
                    nyu.b(3, nzf3);
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
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf3 = this.c[i2];
                if (nzf3 != null) {
                    b += nyu.d(3, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nud b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new nua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nua();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nua();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new nuf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nuf();
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
                    obj = new nuc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nuc();
                    nyt.a(obj[a]);
                    this.c = obj;
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
